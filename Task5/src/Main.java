import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner untuk input
        Scanner scanner = new Scanner(System.in);
        
        // ArrayList untuk 10 Mahasiswa
        ArrayList<Mahasiswa> mahasiswaList = new ArrayList<>();
        mahasiswaList.add(new Mahasiswa("Ahmad", "Jakarta", "123456", "Informatika"));
        mahasiswaList.add(new Mahasiswa("Budi", "Bandung", "123457", "Informatika"));
        mahasiswaList.add(new Mahasiswa("Citra", "Bogor", "123458", "Sistem Informasi"));
        mahasiswaList.add(new Mahasiswa("Deni", "Surabaya", "123459", "Teknik Komputer"));
        mahasiswaList.add(new Mahasiswa("Eva", "Yogyakarta", "123460", "Informatika"));
        mahasiswaList.add(new Mahasiswa("Fikri", "Medan", "123461", "Sistem Informasi"));
        mahasiswaList.add(new Mahasiswa("Gita", "Semarang", "123462", "Informatika"));
        mahasiswaList.add(new Mahasiswa("Hana", "Malang", "123463", "Teknik Komputer"));
        mahasiswaList.add(new Mahasiswa("Indra", "Makassar", "123464", "Informatika"));
        mahasiswaList.add(new Mahasiswa("Joko", "Bali", "123465", "Sistem Informasi"));

        // ArrayList untuk 10 Dosen
        ArrayList<MataKuliah> mataKuliahList = new ArrayList<>();
        mataKuliahList.add(new MataKuliah("21IF1003", "Proyek 1: Pemanfaatan Aplikasi Perkantoran", 3));
        mataKuliahList.add(new MataKuliah("21IF1001", "Dasar-Dasar Pemrograman", 3));
        mataKuliahList.add(new MataKuliah("21IF1002", "Pengantar Teknologi Informasi dan Komunikasi", 3));
        mataKuliahList.add(new MataKuliah("21KU1007", "Matematika Terapan A", 3));
        mataKuliahList.add(new MataKuliah("21IF2015", "Komputer Grafik", 3));

        ArrayList<Dosen> dosenList = new ArrayList<>();
        dosenList.add(new Dosen("Jonner Hutahaean", "Jakarta", "KO018N", mataKuliahList.get(0)));
        dosenList.add(new Dosen("Santi Sundari", "Bandung", "KO009N", mataKuliahList.get(1)));
        dosenList.add(new Dosen("Djoko Cahyo U. L", "Surabaya", "KO070N", mataKuliahList.get(2)));
        dosenList.add(new Dosen("Siti Dwi Setiarini", "Bogor", "KO075N", mataKuliahList.get(3)));
        dosenList.add(new Dosen("Yudi Widhiyasana", "Semarang", "KO013N", mataKuliahList.get(4)));
        dosenList.add(new Dosen("Asri Maspupah", "Makassar", "KO067N", mataKuliahList.get(0)));
        dosenList.add(new Dosen("Ade Hodijah", "Bali", "KO060N", mataKuliahList.get(0)));
        dosenList.add(new Dosen("Trisna Gelar A", "Malang", "KO078N", mataKuliahList.get(4)));
        dosenList.add(new Dosen("Muhammad Rizqi S", "Yogyakarta", "KO074N", mataKuliahList.get(3)));
        dosenList.add(new Dosen("N.S. Junaedi", "Medan", "DU153P", mataKuliahList.get(3)));


        // ArrayList untuk Ruangan
        ArrayList<Ruangan> ruanganList = new ArrayList<>();
        ruanganList.add(new Ruangan("D102", "Lab. MT"));
        ruanganList.add(new Ruangan("D101", "Kelas"));
        ruanganList.add(new Ruangan("H504", "Kelas"));
        ruanganList.add(new Ruangan("D106", "Lab. SDB"));
        ruanganList.add(new Ruangan("D105", "Lab. RPL"));

        // ArrayList untuk Jadwal Senin - Jumat dengan ruangan dan dosen yang sesuai
        ArrayList<Jadwal> jadwalList = new ArrayList<>();
        jadwalList.add(new Jadwal("Senin", "08:00 - 10:00", ruanganList.get(0), dosenList.get(0))); // Lab. MT - Jonner Hutahaean
        jadwalList.add(new Jadwal("Selasa", "10:00 - 12:00", ruanganList.get(1), dosenList.get(1))); // Kelas - Santi Sundari
        jadwalList.add(new Jadwal("Rabu", "08:00 - 10:00", ruanganList.get(2), dosenList.get(2)));   // Kelas H504 - Djoko Cahyo U. L
        jadwalList.add(new Jadwal("Kamis", "10:00 - 12:00", ruanganList.get(3), dosenList.get(3)));  // Lab. SDB - Siti Dwi Setiarini
        jadwalList.add(new Jadwal("Jumat", "08:00 - 10:00", ruanganList.get(4), dosenList.get(4)));  // Lab. RPL - Yudi Widhiyasana


        // Menu pilihan menggunakan switch-case
        boolean running = true;
        while (running) {
            // Tampilkan menu
            System.out.println("Menu:");
            System.out.println("1. Tampilkan Data Mahasiswa");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Tampilkan Jadwal Perkuliahan");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    // Tampilkan Data Mahasiswa dalam bentuk tabel
                    System.out.println("\nData Mahasiswa:");
                    System.out.printf("%-10s %-15s %-20s\n", "NIM", "Nama", "Jurusan");
                    for (Mahasiswa m : mahasiswaList) {
                        System.out.printf("%-10s %-15s %-20s\n", m.getNIM(), m.getNama(), m.getJurusan());
                    }
                    System.out.println();
                    break;

                case 2:
                    // Tampilkan Data Dosen dalam bentuk tabel
                    System.out.println("\nData Dosen:");
                    System.out.printf("%-10s %-20s %-20s\n", "Kode Dosen", "Nama", "Mata Kuliah");
                    for (Dosen d : dosenList) {
                        System.out.printf("%-10s %-20s %-20s\n", d.getkodeDosen(), d.getNama(), d.getMataKuliah().getNamaMataKuliah());
                    }
                    System.out.println();
                    break;

                case 3: 
                    // Tampilkan Jadwal Perkuliahan dalam bentuk tabel
                    System.out.println("\nJadwal Perkuliahan:");
                    System.out.printf("%-10s %-20s %-15s %-15s\n", "Hari", "Jam", "Ruangan", "Dosen Pengampu");
                    for (Jadwal j : jadwalList) {
                        System.out.printf("%-10s %-20s %-15s %-15s\n", j.getHari(), j.getJam(), j.getRuangan().getNamaRuangan(), j.getDosen().getNama());
                    }
                    System.out.println();
                    break;

                case 0:
                    // Keluar dari program
                    System.out.println("Terima kasih!");
                    running = false;
                    break;

                default:
                    // Jika pilihan tidak valid
                    System.out.println("Pilihan tidak valid, coba lagi.");
            }
        }

        scanner.close();
    }
}
