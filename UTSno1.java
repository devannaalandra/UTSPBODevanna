import java.util.Scanner;
public class UTSno1 {
    private int jamawal, menitawal, detikawal;
    private int jamakhir, menitakhir, detikakhir;
    private int lamapercakapan;

    public void inputwaktu(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Jam Awal : ");
        jamawal = sc.nextInt();
        System.out.print("Masukan Menit Awal : ");
        menitakhir = sc.nextInt();
        System.out.print("Masukan Detik Awal : ");
        detikakhir = sc.nextInt();
        System.out.print("Masukan Jam Akhir : ");
        jamakhir = sc.nextInt();
        System.out.print("Masukan Menit Akhir : ");
        menitakhir = sc.nextInt();
        System.out.print("Masukan Detik Akhir : ");
        detikakhir = sc.nextInt();
    }
    public void LamaPercakapan(){
        lamapercakapan = (jamakhir-jamawal)*3600 + (menitakhir-menitawal)*60 + (detikakhir-detikawal);
        int jumlahjam = lamapercakapan/3600;
        int jumlahmenit = (lamapercakapan % 3600)/60;
        int jumlahdetik = lamapercakapan % 3600 % 60;

        System.out.println("Lama Percakapan: " +jumlahjam +" Jam " +jumlahmenit +" Menit "  +jumlahdetik +" Detik");

    }

    public void BiayaPercakapan(){
        double biaya_percakapan = (lamapercakapan / 5) *150;
        System.out.println("Biaya Percakapan : " +biaya_percakapan);
    }

    public static void main(String[] args) {
        UTSno1 data = new UTSno1();
        data.inputwaktu();
        data.LamaPercakapan();
        data.BiayaPercakapan();
    }
}