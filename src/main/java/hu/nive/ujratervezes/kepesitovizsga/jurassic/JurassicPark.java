package hu.nive.ujratervezes.kepesitovizsga.jurassic;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JurassicPark {

    private DataSource dataSource;

    public JurassicPark(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<String> checkOverpopulation() {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement pst = conn.prepareStatement("SELECT breed FROM dinosaur WHERE actual > expected ORDER BY breed"))
        {

            return selectByPreparedStatement(pst);

        }catch (SQLException se){
            throw new IllegalStateException("Cannot select", se);
        }
    }

    private List<String> selectByPreparedStatement(PreparedStatement pst) {

        List<String> breeds = new ArrayList<>();
        try (ResultSet rs = pst.executeQuery())
        {
            while (rs.next()){
                String breed = rs.getString("breed");
                breeds.add(breed);
            }

            Collections.sort(breeds, Collator.getInstance());
            return breeds;

        }catch (SQLException sqle){
            throw new IllegalStateException("Cannot query", sqle);
        }
    }
}
