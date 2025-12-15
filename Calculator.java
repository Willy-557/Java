import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan operasi (+/-/:/*): ");
        String operation = scanner.nextLine();
        
        System.out.print("Masukkan angka pertama : ");
        int AngkaPertama = scanner.nextInt();
        
        System.out.print("Masukkan angka kedua: ");
        int AngkaKedua = scanner.nextInt();

        scanner.close();

        switch (operation) {
            case "+":
                int hasil1 = AngkaPertama + AngkaKedua;
                System.out.println("Hasilnya: " + hasil1);
                break;

            case "-":
                if (AngkaPertama > AngkaKedua) {
                    int hasil2 = AngkaPertama - AngkaKedua;
                    System.out.println("Hasilnya: " + hasil2);
                    break;
                }
                else {
                    int hasil2 = AngkaKedua - AngkaPertama;
                    System.out.println("Hasilnya: " + hasil2);
                    break;
                }

            case ":":
                if (AngkaKedua == 0 || AngkaPertama == 0) {
                    System.out.println("Pembagian tidak bisa dilakukan dengan angka nol!");
                    break;
                }
                else {
                    int hasil3 = AngkaPertama / AngkaKedua;
                    System.out.println("Hasilnya: " + hasil3);
                    break;      
                }
                

            case "*":
                if (AngkaKedua == 0 || AngkaPertama == 0) {
                    System.out.println("Perkalian tidak bisa dilakukan dengan angka nol!");
                    break;
                }
                else {
                    int hasil3 = AngkaPertama * AngkaKedua;
                    System.out.println("Hasilnya: " + hasil3);
                    break;      
                }
        
            default:
                System.out.println("Error");
                break;
        }


    }
}
