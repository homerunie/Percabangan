import java.util.Scanner;

public class Percabangan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jenis member (GOLD/SILVER/BRONZE/REGULER): ");
        String member = input.nextLine();

        if (member.equalsIgnoreCase("GOLD")) {
            System.out.println("Selamat anda mendapatkan diskon 20%");
        } else if (member.equalsIgnoreCase("SILVER")) {
            System.out.println("Selamat anda mendapatkan diskon 15%");
        } else if (member.equalsIgnoreCase("BRONZE")) {
            System.out.println("Selamat anda mendapatkan diskon 10%");
        } else {
            System.out.println("Tidak ada diskon (0%)");
        }

        input.close();
    }
}