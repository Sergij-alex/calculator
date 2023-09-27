
public class Perevod {
    public boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
    public int perevi(String a) {

        String[] rimskChisl = new String[10];
        rimskChisl[0] = "I";
        rimskChisl[1] = "II";
        rimskChisl[2] = "III";
        rimskChisl[3] = "IV";
        rimskChisl[4] = "V";
        rimskChisl[5] = "VI";
        rimskChisl[6] = "VII";
        rimskChisl[7] = "VIII";
        rimskChisl[8] = "IX";
        rimskChisl[9] = "X";

        int x = 0;
        for (int i = 0; i < rimskChisl.length; i++) {
            if (rimskChisl[i].equals(a)) {
                x = i + 1;
            }
        }
        return x;
    }

    public String convertResultToRoman(int summ) {
        String rezultat1 = null;
        String rezultat2 = null;
        String[] rimskRezult = new String[11];
        rimskRezult[0] = "O";
        rimskRezult[1] = "I";
        rimskRezult[2] = "II";
        rimskRezult[3] = "III";
        rimskRezult[4] = "IV";
        rimskRezult[5] = "V";
        rimskRezult[6] = "VI";
        rimskRezult[7] = "VII";
        rimskRezult[8] = "VIII";
        rimskRezult[9] = "IX";
        rimskRezult[10] = "X";
        if (summ<10){
            for(int i = 0; i < rimskRezult.length; i ++){
                if (i == summ) {
                    rezultat2 = rimskRezult[i];
                }
            }
        }

        if (summ > 10 || summ < 100) {
            int y = summ % 10;
            int x = summ - y;
            for(int i = 0; i < rimskRezult.length; i ++) {
                if (i == y) {
                    rezultat1 = rimskRezult[i];
                }
                if (x == 10) {
                    rezultat2 = "X"+rezultat1;
                }
                if (x == 20) {
                    rezultat2 = "XX"+rezultat1;
                }
                if (x == 30) {
                    rezultat2 = "XXX"+rezultat1;
                }
                if (x == 40) {
                    rezultat2 = "XL"+rezultat1;
                }
                if (x == 50) {
                    rezultat2 = "L"+rezultat1;
                }
                if (x == 60) {
                    rezultat2 = "LX"+rezultat1;
                }
                if (x == 70) {
                    rezultat2 = "LXX"+rezultat1;
                }
                if (x == 80) {
                    rezultat2 = "LXXX"+rezultat1;
                }
                if (x == 90) {
                    rezultat2 = "XC"+rezultat1;
                }
                if (x == 100) {
                    rezultat2 = "C";
                }
            }
        }
        return rezultat2;
    }


    public void sum(String a, String b, char c) throws Exception {

        if(isNumeric(a) & !isNumeric(b)) throw new Exception("Используются одновременно разные системы счисления");
        if(!isNumeric(a) & isNumeric(b)) throw new Exception("Используются одновременно разные системы счисления");

        int d = 0;
        int e = 0;
        if (!isNumeric(a) || !isNumeric(b)) {
            d = perevi(a);
            e = perevi(b);
            if (d < e & c == '-') throw new Exception("В римской системе нет отрицательных чисел");

            switch (c) {
                case ('+'):
                    System.out.println("Сумма чисел равна " + convertResultToRoman(d + e));
                    break;
                case ('-'):
                    System.out.println("Разность чисел равна " + convertResultToRoman(d - e));
                    break;
                case ('*'):
                    System.out.println("Произведение чисел равно " + convertResultToRoman(d * e));
                    break;
                case ('/'):
                    System.out.println("Частное чисел равно " + convertResultToRoman(d / e));
                    break;
            }
        }
        if (isNumeric(a) || isNumeric(b)) {
            int d1 = Integer.parseInt(a);
            int e1 = Integer.parseInt(b);
            switch (c) {
                case ('+'):
                    System.out.println("Сумма чисел равна " + (d1 + e1));
                    break;
                case ('-'):
                    System.out.println("Разность чисел равна " + (d1 - e1));
                    break;
                case ('*'):
                    System.out.println("Произведение чисел равно " + (d1 * e1));
                    break;
                case ('/'):
                    System.out.println("Частное чисел равно " + (d1 / e1));
                    break;
            }
        }
    }
}


