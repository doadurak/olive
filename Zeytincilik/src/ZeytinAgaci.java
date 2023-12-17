import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class ZeytinAgaci {
    protected int yas;

    // Soyut sınıf ve constructor örneği
    public ZeytinAgaci(int yas) {
        this.yas = yas;
    }

    // Overloading örneği
    public ZeytinAgaci() {
        this.yas = 0;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    // Erişim belirleme ve İç içe class
    private class YasKontrol {
        public void kontrolEt() {
            if (yas < 0) {
                throw new InputMismatchException("Ağacın yaşı sıfırdan küçük olamaz.");
            }
        }
    }

    public void girilenYas() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Lütfen zeytin ağacının yaşını giriniz: ");
            yas = scanner.nextInt();

            YasKontrol yasKontrol = new YasKontrol();
            yasKontrol.kontrolEt();
        } catch (InputMismatchException e) {
            System.out.println("Hata: Lütfen geçerli bir sayı girin.");
        }
    }

    // Exception
    public abstract void ortalamaVerilenYag();
}



   





/*import java.util.InputMismatchException;
import java.util.Scanner;

public class verilenYag {
	public void ortalamaVerilenYag() {
	try (Scanner scanner = new Scanner(System.in)) {
		try {
		    System.out.println("Lütfen zeytin ağacının yaşını giriniz: ");
		    int yas = scanner.nextInt();

		    double ortalamaYag = 0.0;

		    if (yas >5 && yas < 35) { // 0-5 yas arasında zeytin yağı veren ağaclar ihmal edilmiştir.
		        ortalamaYag = 4.0;
		    } else if (yas >= 35 && yas <= 100) {
		        ortalamaYag = 6.0;
		    } else {
		        throw new InputMismatchException("Belirtilen yaş aralıklarında değil.");
		    }

		    System.out.println("Zeytin ağacınızın " + yas + " yaşında olduğunda ortalama yağ verimi: " + ortalamaYag + " kilo");
		} catch (InputMismatchException e) {
		    System.out.println("Hata: Lütfen geçerli bir sayı girin.");
		}
	}
	}
}

   /* private int yas;

    public void girilenYas() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Lütfen zeytin ağacının yaşını giriniz: ");
            yas = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Hata: Lütfen geçerli bir sayı girin.");
        }
    }

    public int getYas() {
        return yas;
    }

    public void ortalamaVerilenYag() {
        double ortalamaYag = 0.0;

        if (yas > 5 && yas < 35) {
            ortalamaYag = 4.0;
        } else if (yas >= 35 && yas <= 100) {
            ortalamaYag = 6.0;
        } else {
            throw new InputMismatchException("Belirtilen yaş aralıklarında değil.");
        }

        System.out.println("Zeytin ağacınızın " + yas + " yaşında olduğunda ortalama yağ verimi: " + ortalamaYag + " kilo");
    }

    public static void main(String[] args) {
        verilenYag yag = new verilenYag();
        yag.girilenYas();
        yag.ortalamaVerilenYag();
    }*/

	