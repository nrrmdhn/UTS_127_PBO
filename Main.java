public class Main {
    public static void main(String[] args) throws Exception {
        Tenagadidik karyawan1 = new Tenagadidik(127,"Ken", "London","01-Nopember-2003","Laki-Laki", 2022);
        karyawan1.display();
        karyawan1.waktuLembur(20);
        karyawan1.setUangLembur(0);
        karyawan1.displaygaji();
        System.out.println();
        System.out.println();

        Dosen dosen1 = new Dosen(128, "Ren", "Sydney","17-Agustus-1990" , "Laki-Laki", 2005);
        dosen1.setNomorIndukDosen(6310060);
        dosen1.setJurusan("INFORMATIKA");
        dosen1.display();
        dosen1.displayDosen_Jurusan();
        dosen1.waktuLembur(6);
        dosen1.displaygaji();
    }
}