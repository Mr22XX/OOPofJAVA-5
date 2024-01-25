class Buku{
    String judul;
    String penulis;

    Buku(String judul, String penulis){
        this.judul = judul;
        this.penulis = penulis;
    }
    void show(){
        System.out.println("\nJudul buku :\t " + this.judul);
        System.out.println("Penulis buku :\t " + this.penulis);
    }
}

public class main{
    public static void main(String[] args) {
        Buku Buku1 = new Buku("Laut Bercerita", "Leila S. Chudori");
        Buku1.show();

        String refbuku = Integer.toHexString(Buku1.hashCode());
        System.out.println(refbuku);

        Buku Buku2 = new Buku("Bumi Manusia", "Pramoedya Ananta");
        Buku2.show();

        String refbuku2 = Integer.toHexString(Buku2.hashCode());
        System.out.println(refbuku2);
    }
}