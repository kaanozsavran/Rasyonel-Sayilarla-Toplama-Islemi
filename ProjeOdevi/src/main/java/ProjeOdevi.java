
import java.util.Scanner;


public class ProjeOdevi {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("İlk sayınızın payını giriniz.");
        int a= scan.nextInt();
        
        
        System.out.println("İlk sayınızın paydasını giriniz.");
        int b = scan.nextInt();
        if (b==0){
        System.out.println("Payda sıfır olamaz programa tekrardan giriniz.");
        return;
        }
        
        
        System.out.println("İkinci sayınızın payını giriniz.");
        int c= scan.nextInt();
        System.out.println("İkinci sayınızın paydasını giriniz.");
        int d= scan.nextInt();
        if (d==0){
        System.out.println("Payda sıfır olamaz programa tekrardan giriniz.");
        return;
        }
        
        
        Rasyonel sayi1 = new Rasyonel();
        sayi1.getPay();
        sayi1.getPayda();
        sayi1.setPay(a);
        sayi1.setPayda(b);
        
        Rasyonel sayi2 = new Rasyonel ();
        sayi2.getPay();
        sayi2.getPayda();
        sayi2.setPay(c);
        sayi2.setPayda(d);
        
        sayi2.Topla(sayi1, sayi2);
        
    }
}
