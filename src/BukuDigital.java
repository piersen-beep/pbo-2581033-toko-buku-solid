public class BukuDigital extends Buku {
    private double ukuranMB;
    private int diskon;

    public BukuDigital(String judul, String penulis, int harga,
                       double ukuranMB, int diskon) {
        super(judul, penulis, harga);
        this.ukuranMB = ukuranMB;
        this.diskon = diskon;
    }

    @Override
    public String getKeterangan() {
        return ukuranMB + " MB, diskon " + diskon + "%";
    }

    @Override
    public int getHargaAkhir() {
        return harga * (100 - diskon) / 100;
    }
}