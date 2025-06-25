import java.util.Scanner;

public class trycatch {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
       
        
        try{
           System.out.print("Sayı girin:");
           int sayi=input.nextInt();
           int sonuc=sayi/0; 
           System.out.println("Sonuç:" + sonuc);
        }

        catch(ArithmeticException e){
            System.out.println(e);
        }

        finally{
            System.out.println("Her türlü çalışır");
        }
    }
}
