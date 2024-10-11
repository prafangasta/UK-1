public class Nilai{
    private int nilai;

    public Nilai(int nilai){
        this.nilai = nilai; 
    }

    public int cetakNilai(){
        return nilai;
    }
    
    public void setNilai(int nilai){
        this.nilai = nilai; 
    }

    public String cetakIndeks(){
        if (nilai >= 90){
            return "A";
        } else if (nilai >= 70){
            return "B";
        } else if (nilai >= 50){
            return "C";
        } else if (nilai >= 330){
            return "D";
        } else {
            return "E";
        }
    }
}
