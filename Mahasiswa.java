class Mahasiswa {
    private String nama;

    public Mahasiswa(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void cetakNama() {
        System.out.println("Nama: " + nama);
    }
}