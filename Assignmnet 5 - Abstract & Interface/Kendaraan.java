public abstract class Kendaraan {
    private String noPlat;
    private double tarifPerHari;

    public Kendaraan(String noPlat, double tarifPerHari) {
        this.noPlat = noPlat;
        this.tarifPerHari = tarifPerHari;
    }

    public String getNoPlat() {
        return noPlat;
    }

    public double getTarifPerHari() {
        return tarifPerHari;
    }

    public abstract double hitungBiayaSewa(int hari);
}