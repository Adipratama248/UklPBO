/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uklpbo;

/**
 *
 * @author SMK TELKOM 44
 */
public class Produk {

    private int nomor;
    private String nama;
    private int jumlah;
    private double harga;
    

    public Produk() {
        this.nomor = 0;
        this.nama = "";
        this.jumlah = 0;
        this.harga = 0.0;
    }
    
    // Konstruktor dengan parameter untuk keempat variabel class
    public Produk(int nomor, String nama, int jumlah, double harga) {
        this.nomor = nomor;
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
    }
    

    public int getNomor() {return nomor;}
    public void setNomor(int nomor) {this.nomor = nomor;}
    

    public String getNama() {return nama;}
    public void setNama(String nama) {this.nama = nama;}
    

    public int getJumlah() {return jumlah;}
    public void setJumlah(int jumlah) {this.jumlah = jumlah;}
    

    public double getHarga() {return harga;}
    public void setHarga(double harga) {this.harga = harga;}
    

    public void tampilkanDeskripsi() {
        System.out.println("");
        System.out.println("Nomor : " + nomor);
        System.out.println("Nama Produk : " + nama);
        System.out.println("Jumlah Stok : " + jumlah);
        System.out.println("Harga: Rp. " + String.format("%.2f", harga));
        System.out.println("----------------------------------------------");}
     
    
    
//    public class DVD{
//        
//    private int nf;    
//    private String namDVD;    
//    private int mnt;
//    private int ru;
//    private String std;
//    private int stck;
//    private int hrg;
//    
//    public DVD(){
//    this.nf = 0;
//    this.namDVD = "";
//    this.mnt = 0;
//    this.ru = 0;
//    this.std="";
//    this.stck=0;
//    this.hrg=0;}
//    
//    public DVD(int nf,String namDVD,int mnt, int ru, String std,int stck,int hrg) {
//    this.nf = nf;
//    this.namDVD = namDVD;
//    this.mnt = mnt;
//    this.ru = ru;
//    this.std = std;
//    this.stck = stck;
//    this.hrg=hrg;}
//    
//    public int getnf() {return nf;}
//    public void setnf(int nf) {this.nf = nf;}
//    
//    public String getnamDVD() {return namDVD;}
//    public void setnamDVD(String namDVD) {this.namDVD = namDVD;}
//    
//    public int getmnt() {return mnt;}
//    public void setmnt(int mnt) {this.mnt = mnt;}
//    
//    public int getru() {return ru;}
//    public void setru(int mnt) {this.ru = ru;}
//    
//    public String getstd() {return std;}
//    public void setstd(String std) {this.std = std;}    
//    
//    public int getstck() {return stck;}
//    public void setsctk(int sctk) {this.stck = sctk;}
//        
//    public int gethrg() {return hrg;}
//    public void sethrg(int hrg) {this.hrg = hrg;}
//    
//    public void tampilkanDeskripsi() {
//        System.out.println("Nomor Film : " + nf);
//        System.out.println("Nama Film : " + namDVD);
//        System.out.println("Durasi Film : " + mnt);
//        System.out.println("Rating Usia : " + ru);
//        System.out.println("Studio Film : " + std);
//        System.out.println("Jumlah Stok : " + stck);
//        System.out.println("Harga: Rp. " + String.format("%.2f", hrg));
//    }
//    
//    }
}
    
