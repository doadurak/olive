import java.util.InputMismatchException;

public class ZeytinAgaciIslemleri {

    public ZeytinAgaciIslemleri() {
    }

    // overloading kullanabiliriz 
    public void hesaplaEldeEdilenYag() {
        // parametre kullanarak hesap
    }

    public void hesaplaEldeEdilenYag(double yeniParametre) {
        // Farklı parametreyle hesap
    }


    // hocanın istediği exception örneklerinden biri de burada kullanılabilir.
    public void girdiKontrol(int girdi) throws InputMismatchException {
        if (girdi < 0) {
            throw new InputMismatchException("Negatif sayı girişi hatası.");
        }
       
    }
}