
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class Main {
    
    public static void islemleri_bastir(){
        
        System.out.println("0 - İşlemleri görüntüle..");
        System.out.println("1 - Bir sonraki sehre git..");
        System.out.println("2 - Bir önceki sehre git..");
        System.out.println("3 - Uygulamadan çıkış yap..");
    }
    
    public static void sehirleri_turla(LinkedList<String> sehirler){
        
            ListIterator<String> iterator = sehirler.listIterator();
            int islem;
            islemleri_bastir();
            
            Scanner scan = new Scanner(System.in);
            
            if(!iterator.hasNext()){
                System.out.println("Herhangi bir sehir bulunmuyor..");
            }
            
            boolean cikis = false;
            boolean ileri = true;
            
            while(!cikis){
                System.out.println("Bir işlem seçiniz: ");
                
                islem = scan.nextInt();
                
                switch(islem){
                    
                    case 0:
                        islemleri_bastir();
                        break;
                        
                    case 1:
                        if(!ileri){
                            if(iterator.hasNext()){
                                iterator.next();
                            }
                            ileri = true;
                        }
                        if(iterator.hasNext()){
                            System.out.println("Şehre gidiliyor: " + iterator.next());
                        }
                        else{
                            System.out.println("Gidilecek sehir kalmadı...");
                            ileri = true;
                        }
                        break;
                    
                    case 2:
                        if(ileri){
                            if(iterator.hasPrevious()){
                                iterator.previous();
                            }
                            ileri = false;
                        }
                        if(iterator.hasPrevious()){
                            System.out.println("Şehre gidiliyor : " + iterator.previous());
                        }
                        else{
                            System.out.println("Şehir Turu başladı...");
                        }
                        break;
                        
                    case 3:
                        cikis = true;
                        System.out.println("Uygulamadan çıkılıyor..");
                        break;
                    
                }
            }
    }
    public static void main(String[] args) {
        
        LinkedList<String> sehirler = new LinkedList<String>();
        
        sehirler.add("Ankara");
        sehirler.add("İstanbul");
        sehirler.add("Trabzon");
        
        sehirleri_turla(sehirler);
    }
}
