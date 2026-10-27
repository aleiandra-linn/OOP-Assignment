public class Mobil extends Kendaraan {
    private double biayaAsuransi;

    public Mobil(String noPlat, double tarifPerHari, double biayaAsuransi) {
        super(noPlat, tarifPerHari);
        this.biayaAsuransi = biayaAsuransi;
    }

    public double getBiayaAsuransi() {
        return biayaAsuransi;
    }

    @Override
    public double hitungBiayaSewa(int hari) {
        return (getTarifPerHari() * hari) + biayaAsuransi;
    }
}