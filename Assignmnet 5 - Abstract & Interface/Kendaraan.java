//abstract class sebagai parent atau blueprint
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
    //absstract method agar di override oleh child
    public abstract double hitungBiayaSewa(int hari);
}