import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan operasi (+/-/:/*): ");
        String operation = scanner.nextLine();
        
        System.out.print("Masukkan angka pertama : ");
        double AngkaPertama = scanner.nextInt();
        
        System.out.print("Masukkan angka kedua: ");
        double AngkaKedua = scanner.nextInt();

        double hasil = 0;

        switch (operation) {
            case "+":
                hasil = AngkaPertama + AngkaKedua;
                System.out.println("Hasilnya: " + hasil);
                break;

            case "-":
                if (AngkaPertama > AngkaKedua) {
                    hasil = AngkaPertama - AngkaKedua;
                    System.out.println("Hasilnya: " + hasil);
                }
                else {
                    hasil = AngkaKedua - AngkaPertama;
                    System.out.println("Hasilnya: " + hasil);
                }
                break;

            case ":":
                if (AngkaKedua == 0 || AngkaPertama == 0) {
                    System.out.println("Pembagian tidak bisa dilakukan dengan angka nol!");
                }
                else {
                    hasil = AngkaPertama / AngkaKedua;
                    System.out.println("Hasilnya: " + hasil);      
                }
                break;
                

            case "*":
                hasil = AngkaPertama * AngkaKedua;
                System.out.println("Hasilnya: " + hasil);      
                break;
        
            default:
                System.out.println("Error");
                break;
        }
        scanner.close();

    }
}
