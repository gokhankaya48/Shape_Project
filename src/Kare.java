public class Kare implements IIslem {

    // TODO Bu class doldurunuz
    private double kenar;

    public Kare(double kenar) {
        this.kenar = kenar;
    }

    @Override
    public double alanHesapla() {
        return kenar * kenar;
    }

    @Override
    public double cevreHesapla() {
        return 4 * kenar;
    }
}
