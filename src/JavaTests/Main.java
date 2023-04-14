package JavaTests;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String str1 = input.nextLine();
        System.out.println("Введите вторую строку: ");
        String str2 = input.nextLine();

        int count = Javakol.countMatches(str1, str2);

        System.out.println("Результат = " + count);
    }

}
