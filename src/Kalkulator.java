import java.util.Scanner;

public class Kalkulator {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите выражение");
        String inputSum = scanner.nextLine();
        if (inputSum.length() < 5) throw new Exception("Строка не является математической операцией");
        String[] words = inputSum.split(" ");
        if (words.length > 5) throw new Exception("Больше двух операндов");
        String a = words[0];
        String b = words[2];
        char c = words[1].charAt(0);
        Perevod perevod = new Perevod();
        perevod.sum(a, b, c);
    }
}
