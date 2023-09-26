import java.util.Scanner;

public class TugasIndividu2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int username = 103;
        int password = 999;
        System.out.println("Masukkan Username dan Password");
        System.out.print("Username    : ");
        int user = input.nextInt();
        System.out.print("Password    : ");
        int pw = input.nextInt();
        if (user == username && pw == password){
            System.out.println("Selamat anda berhasil login!");
        }else{
            System.out.println("Harap cek kembali username dan password anda");
        }
    }
}
