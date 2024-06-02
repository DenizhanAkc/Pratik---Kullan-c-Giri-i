import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, passWord, newPassword, answer;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanici Adiniz : ");
        userName = inp.nextLine();

        System.out.print("Sifreniz : ");
        passWord = inp.nextLine();

        if (userName.equals("LuciLilith") && passWord.equals("Uykucu123")) {
            System.out.println("Giris Yaptiniz!");
        }else{
            System.out.println("Kullanici Adi veya Sifre Hatali!");
            System.out.print("Sifrenizi Sifirlamak Ister Misiniz? " );
            answer = inp.nextLine();

        if(answer.equals("evet")) {
            System.out.print("Yeni Sifreniz : ");
            newPassword = inp.nextLine();

        if (newPassword.equals("Uykucu123")) {
            System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
        }else{
            System.out.println("Sifreniz Sifirlanmistir");

        }
        }
        }
    }
}