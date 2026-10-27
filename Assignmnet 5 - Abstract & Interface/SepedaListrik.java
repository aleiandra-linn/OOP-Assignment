public class SepedaListrik extends Kendaraan implements Chargable {
    private double kapasitasBaterai;

    public SepedaListrik(String noPlat, double tarifPerHari, double kapasitasBaterai) {
        super(noPlat, tarifPerHari);
        this.kapasitasBaterai = kapasitasBaterai;
    }

    public double getKapasitasBaterai() {
        return kapasitasBaterai;
    }

    @Override
    public double hitungBiayaSewa(int hari) {
        double total = getTarifPerHari() * hari;
        if (hari > 3) {
            total -= 20000;
        }
        return total;
    }

    @Override
    public void isiBaterai() {
        System.out.println("Pengisian daya sepeda listrik (" + getNoPlat() + ") sebesar " + kapasitasBaterai + " kWh selesai.");
    }
}