//inhertianc class atau child yang mewarisi dari parenrt atau superclass
public class Mobil extends Kendaraan {
    private double biayaAsuransi;

    public Mobil(String noPlat, double tarifPerHari, double biayaAsuransi) {
        super(noPlat, tarifPerHari);
        this.biayaAsuransi = biayaAsuransi;
    }

    public double getBiayaAsuransi() {
        return biayaAsuransi;
    }
    //implementasi abstract method dari kelas parent kendaraan
    @Override
    public double hitungBiayaSewa(int hari) {
        return (getTarifPerHari() * hari) + biayaAsuransi;
    }
}