class MahasiswaTf extends Mahasiswa{
    private Nilai nilai;

    public MahasiswaTf(String nama, int nilai){
        super(nama);
        this.nilai = new Nilai(nilai);
    }

    public void tampilkanInfo(){
        cetakNama();
        System.out.println("Nilai: " + nilai.cetakNilai() + ", Indeks: " + nilai.cetakIndeks() + " (Tf)");
    }
}