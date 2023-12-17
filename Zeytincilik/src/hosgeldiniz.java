import java.util.Scanner;

public class hosgeldiniz{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Hoşgeldiniz!");
        System.out.println("1. Zeytin ağacınızın ortalama kaç kilo yağ verdiğini öğrenmek için 1'e tıklayınız.");
        System.out.println("2. Zeytin ağacınızın yağ verimini etkileyen faktörleri öğrenmek için 2'ye tıklayınız.");
        System.out.println("3. Elinizdeki zeytinin kilosunu girerek elde edeceğiniz ortalama yağı öğrenmek için 3'e tıklayınız.");
        System.out.println("4. Zeytin ağacı cinslerini öğrenmek için 4'e tıklayınız.");
        System.out.println("5. Zeytin ve ya zeytin yağı satımından elde edeceğiniz kazancı hesaplamak için 5'e tıklayınız.");
            int secim = scanner.nextInt();

        switch (secim) {
            case 1:
                ortalamaVerilenYag();
                break;
            case 2:
                gosterFaktorler();
                break;
            case 3:
                hesaplaEldeEdilenYag();
                break;
            case 4:
                gosterCinsBilgileri();
                break;
            case 5:
            	hesaplaKazanc();
            default:
                System.out.println("Geçersiz seçim. Programdan çıkılıyor.");
                break;
        }

        scanner.close();
    }

    private static void ortalamaVerilenYag() {
    	
        verilenYag zeytinAgaci = new verilenYag();
        zeytinAgaci.girilenYas();
        zeytinAgaci.ortalamaVerilenYag();

	    	
	    }
    
    private static void gosterFaktorler() {
    }

    private static void hesaplaEldeEdilenYag() {
    	 ZeytinAgaciIslemleri zeytinAgaciIslemleri = new ZeytinAgaciIslemleri();
         zeytinAgaciIslemleri.hesaplaEldeEdilenYag();
    }

    private static void gosterCinsBilgileri() {
       
    }
    private static void hesaplaKazanc() {
      
    }
}