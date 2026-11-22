public class BukuAudio extends Buku {
    private int durasiMenit;
    private int diskon;

    public BukuAudio(String judul, String penulis, int harga,
                     int durasiMenit, int diskon) {
        super(judul, penulis, harga);
        this.durasiMenit = durasiMenit;
        this.diskon = diskon;
    }

    @Override
    public String getKeterangan() {
        return durasiMenit + " menit, diskon " + diskon + "%";
    }

    @Override
    public int getHargaAkhir() {
        return harga * (100 - diskon) / 100;
    }
}