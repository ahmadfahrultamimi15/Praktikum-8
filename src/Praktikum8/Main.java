package Praktikum8;

public class Main {
    public static void main (String[] args) {
        Customer ahmad = new Customer();
        ahmad.nama = "Ahmad Fahrul Tamimi" ;
        ahmad.alamat = "Pebayuran-Kab Bekasi";

        Order handphone = new Order();

        handphone.date = 16;
        handphone.status = "Baru";

        Payment baru = new Payment();

        baru.jumlah = 4500000;

    }
}
