package hu.nive.ujratervezes.kepesitovizsga.adddigits;

public class AddDigits {


    public int addDigits(String input) {

        int digitSum = 0;

        if (!(input.equals("")) || !(input.equals(null)) || !(input.isEmpty())){

            for (char c: input.toCharArray()) {
                if (Character.isDigit(c)){

                    int i = c - '0';
                    digitSum = digitSum + i;

                }
            }
            return digitSum;

        }else {
            return -1;
        }

    }


}
