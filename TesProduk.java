/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uklpbo;
import java.util.Scanner;
/**
 *
 * @author SMK TELKOM 44
 */
public class TesProduk {
    public static void main(String[] args) {
        
        Scanner A = new Scanner(System.in);

        Produk produk1 = new Produk();
        Produk produk2 = new Produk();

        produk1.setNomor(1);
        produk1.setNama("Meja");
        produk1.setJumlah(5);
        produk1.setHarga(20000.00);

        produk2.setNomor(2);
        produk2.setNama("Kursi");
        produk2.setJumlah(10);
        produk2.setHarga(10000.00);

        Produk produk3 = new Produk(3, "Lemari", 3, 150000.00);
        Produk produk4 = new Produk(4, "Rak Buku", 7, 50000.00);
        Produk produk5 = new Produk(5, "Sofa", 2, 300000.00);
        Produk produk6 = new Produk(6, "Lampu", 15, 25000.00);
        Produk produk7 = new Produk(1,"Nasi",15,20000);
        DVD film1 = new DVD();
        DVD film2 = new DVD();
        
        film1.setnf(1);
        film1.setnamDVD("Daredevil");
        film1.setsctk(15);
        film1.sethrg(25000.00);
        film1.setmnt(99);
        film1.setru(15);
        film1.setstd("20th Century Fox");
        
        film2.setnf(2);
        film2.setnamDVD("Spiderman");
        film2.setsctk(40);
        film2.sethrg(30000.00);
        film2.setmnt(120);
        film2.setru(13);
        film2.setstd("Marvel Studios");
        
        DVD film3 = new DVD(3,"Avengers",143,12,"Marvel Studios",60,35000.00);
        DVD film4 = new DVD(4,"Inception",148,16,"Marvel Studios",30,40000.00);
        DVD film5 = new DVD(5,"The Matrix",136,18,"Marvel Studios", 20,28000.00);
        DVD film6 = new DVD(6,"Titanic",195,12,"Marvel Studios", 25, 32000.00);

        String nB;
        String n;
        int p;
        System.out.print("Masukkan jumlah produk yang ingin dibeli : ");
        p = A.nextInt();
        A.nextLine();
        for(int i = 0; i<p; i++){
        System.out.print("Silahkan memilih DVD/Produk(Ketikan DVD/Produk) : ");n = A.nextLine();  
        if(n.equalsIgnoreCase("Produk")){        
        System.out.println("==== NOMOR BARANG ====");
        System.out.println("[1] Meja");
        System.out.println("[2] Kursi");
        System.out.println("[3] Lemari");
        System.out.println("[4] Rak buku");
        System.out.println("[5] Sofa");
        System.out.println("[6] Lampu");
        System.out.print("Pilih nomor barang 1-6 = ");
        nB = A.nextLine();
        
        if(nB.equalsIgnoreCase("1")){produk1.tampilkanDeskripsi();System.out.println();}
        else if(nB.equalsIgnoreCase("2")){produk2.tampilkanDeskripsi();System.out.println();}
        else if(nB.equalsIgnoreCase("3")){produk3.tampilkanDeskripsi();System.out.println();}
        else if(nB.equalsIgnoreCase("4")){produk4.tampilkanDeskripsi();System.out.println();}
        else if(nB.equalsIgnoreCase("5")){produk5.tampilkanDeskripsi();System.out.println();}
        else if(nB.equalsIgnoreCase("6")){produk6.tampilkanDeskripsi();System.out.println();}
        else{System.out.println("false");}
        }
        
        
        
        else if(n.equalsIgnoreCase("DVD")){
        System.out.println("==== NOMOR Film ====");
        System.out.println("[1] Daredevil");
        System.out.println("[2] Spiderman");
        System.out.println("[3] Avengers");
        System.out.println("[4] Inception");
        System.out.println("[5] The Matrix");
        System.out.println("[6] Titanic");
        System.out.print("Pilih nomor film 1-6 = ");
        nB = A.nextLine();
        
        if(nB.equalsIgnoreCase("1")){film1.tampilkanDeskripsi();System.out.println();}
        else if(nB.equalsIgnoreCase("2")){film2.tampilkanDeskripsi();System.out.println();}
        else if(nB.equalsIgnoreCase("3")){film3.tampilkanDeskripsi();System.out.println();}
        else if(nB.equalsIgnoreCase("4")){film4.tampilkanDeskripsi();System.out.println();}
        else if(nB.equalsIgnoreCase("5")){film5.tampilkanDeskripsi();System.out.println();}
        else if(nB.equalsIgnoreCase("6")){film6.tampilkanDeskripsi();System.out.println();}
        else{System.out.println("false");}
        }
        else{System.out.println("false");}
        
        }
        }
    }
    

