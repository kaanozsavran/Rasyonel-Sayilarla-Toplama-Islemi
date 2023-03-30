
public class Rasyonel {
    public Rasyonel(){
    
    }
    private int pay;
    private int payda;

    
    public int getPay() {
        return pay;
    }

    
    public void setPay(int pay) {
        this.pay = pay;
    }

   
    public int getPayda() {
        return payda;
    }

    
    public void setPayda(int payda) {
        this.payda = payda;
    }
    
    public  Rasyonel Topla(Rasyonel sayi1,Rasyonel sayi2)
        {
            Rasyonel rsy = new Rasyonel();
            pay = sayi1.pay * sayi2.payda + sayi2.pay * sayi1.payda;
            payda = sayi1.payda * sayi2.payda;
            rsy.pay = this.pay;
            rsy.payda = this.payda;
            
            
            double sonuc =(double) rsy.pay / (double) rsy.payda;
            System.out.println("Toplama sonucunuz:" + sonuc);
            return rsy;    
        }
    
    
    
    
    
    
}
