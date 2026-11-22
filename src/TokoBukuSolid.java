public class TokoBukuSolid {

    public static void main(String[] args) {

        Buku[] daftarBuku = {
                new BukuCetak(
                        "Pemrograman Java",
                        "John Doe",
                        120000,
                        750,
                        10000
                ),

                new BukuCetak(
                        "Algoritma Dasar",
                        "Jane Smith",
                        95000,
                        400,
                        5000
                ),

                new BukuDigital(
                        "Belajar OOP",
                        "Ani Wijaya",
                        80000,
                        12.5,
                        20
                ),

                new BukuAudio(
                        "Kisah Programmer",
                        "Budi Santoso",
                        60000,
                        240,
                        10
                )
        };

        Keranjang keranjangPertama = new Keranjang();

        for (Buku buku : daftarBuku) {
            keranjangPertama.tambah(buku);
        }

        Keranjang keranjangKedua = new Keranjang();

        keranjangKedua.tambah(daftarBuku[2]);

        MetodeBayar[] pilihan = {
                new Tunai(),
                new Transfer(),
                new EWallet(),
                new Voucher(100000)
        };

        StrukPrinter printer = new StrukPrinter();

        printer.cetakKeranjang("KERANJANG PERTAMA", keranjangPertama);

        printer.cetakPembayaran(
                keranjangPertama.hitungTotal(),
                pilihan
        );

        System.out.println();

        printer.cetakKeranjang("KERANJANG KEDUA", keranjangKedua);

        printer.cetakPembayaran(
                keranjangKedua.hitungTotal(),
                pilihan
        );
    }
}