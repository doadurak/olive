import java.util.InputMismatchException;
// Exception
public class verilenYag extends ZeytinAgaci {
    // Kalıtım
    public verilenYag() {
        super();
    }

    public verilenYag(int yas) {
        super(yas);
    }

    // Overloading örneği
    public verilenYag(int yas, double digerParametre) {
        super(yas);
    }

    // metod
    @Override
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
}