import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayi,basamak,toplam=0;
        Scanner input=new Scanner(System.in);
        sayi= input.nextInt();

        while(sayi!=0){
            basamak=sayi%10;
            toplam=toplam+basamak;
            sayi=sayi/10;
        }
        System.out.print("Toplam:"+toplam);




    }
}