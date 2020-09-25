package tugasinterface;

public class Interface implements Arsipku{
    
    public static void main(String[] args) {
        Interface a = new Interface();
        a.tampilBiodata();
        a.tampilNilai();
    }
    
    @Override
    public void tampilBiodata() {
        System.out.println("Namaku : Yayuk");
        System.out.println("TTL : Jember,28 februari 2003");
        System.out.println("Hobi : Bermain Musik");
        
    }
 
    @Override
    public void tampilNilai() {
        System.out.println("Agama : 87");
        System.out.println("Bahasa Indonesia : 85");
        System.out.println("Matematika : 75");
    }
}
