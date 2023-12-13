import java.util.Scanner;

public class Main {
    //Login method created.
    static void login(){
        //New scanner created.
        Scanner inp = new Scanner(System.in);

        //Variables defined
        String userName, answer;
        int password;

        //Data retrieved from user.
        System.out.print("Kullanici Adiniz: ");
        userName = inp.nextLine().toLowerCase();
        System.out.print("Sifreniz: ");
        password = inp.nextInt();
        inp.nextLine();

        //If the user enters the correct data, he can login. Else program is asking do you want to change your password.
        if ((userName.equals("emre")) && (password == 1234)) {
            System.out.print("Basariyla giris yaptiniz.");
        } else if (!userName.equals("emre")) {
            System.out.print("Kullanici adiniz hatali\n");
            System.out.println("Lütfen tekrar deneyin.");
            login();
        }else {
            System.out.print("Sifre yanlis.\nSifrenizi degistirmek ister misiniz?\nEvet ya da hayir yaziniz: ");
            answer = inp.nextLine().toLowerCase();

            if (answer.equals("evet")) {//If answer is "Evet" pwChange method will be executed.
                pwChange();
            }else if (answer.equals("hayir")) {//If answer is "Hayır" login method will be executed.
                login();
            }
        }
    }

    static void pwChange(){

        Scanner inp = new Scanner(System.in);
        int newPassword;
        System.out.print("Yeni sifrenizi giriniz : ");
        newPassword = inp.nextInt();
        if (newPassword != 1234) {
            System.out.print("Sifre degistirildi!");
        } else {
            System.out.println("Sifre degistirilemedi");
            System.out.print("Yeni sifren eski sifrenden farkli olmak zorunda.\n");
            pwChange();
        }
    }

    public static void main(String[] args) {
        //Login method is called there.
        login();

    }

}
