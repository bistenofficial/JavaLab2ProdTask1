import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Romanization romainz = new Romanization();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = scanner.nextLine();
        romainz.CyrillicToLatin(str);
    }
}
