package Pewarisan_dan_Polimorfisme;

public class Main {
    public static void main(String[] args) {
        Bentuk bentuk1 = new Bentuk("Merah");
        Bentuk bentuk2 = new BujurSangkar(5.0, "Biru");
        Bentuk bentuk3 = new Lingkaran(7.0, "Kuning");
        Bentuk bentuk4 = new Silinder(10.0, 7.0, "Hijau");

        bentuk1.printInfo();
        bentuk2.printInfo();
        bentuk3.printInfo();
        bentuk4.printInfo();
    }
}
