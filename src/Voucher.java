public class Voucher implements MetodeBayar {
    private int nilai;

    public Voucher(int nilai) {
        this.nilai = nilai;
    }

    @Override
    public String nama() {
        return "Voucher Rp" + String.format("%,d", nilai)
                .replace(',', '.');
    }

    @Override
    public int totalBayar(int totalBelanja) {
        return Math.max(0, totalBelanja - nilai);
    }
}