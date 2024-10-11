public class Main {
    public static void main(String[] args) {
        MahasiswaIpk m1 = new MahasiswaIpk("Putro", 95);
        MahasiswaBeasiswa m2 = new MahasiswaBeasiswa("Putra", 85);
        MahasiswaTf m3 = new MahasiswaTf("Farhan", 80);

        m1.tampilkanInfo();
        m2.tampilkanInfo();
        m3.tampilkanInfo();
    }
}