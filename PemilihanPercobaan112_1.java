import java.util.Scanner;
public class PemilihanPercobaan112_1 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = input12.nextInt();
        if (nilai < 75) {
            System.out.println("Maaf anda harus remidi");
        }       
         else if (nilai > 75 ) {
            System.out.println("Selamat anda lulus !!!");
        }
    }
}