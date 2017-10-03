/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo012.pkg10116515.tugas3;

/**
 *
 * @author JARVIS PC
 * Nama : Ridwan Maulana
 * NIM : 10116515
 * Kelas : PBO012
 */
class Mahasiswa{
    public String nama;
    public String nim;
    private double uts;
    private double uas;
    private double quis;
    private double na;
    private char index;
    
    public double getQuis(){
        return quis;
        
    }
    public void setQuis(double quis){
        this.quis = quis;
    }
     public double getUts(){
        return uts;
        
    }
    public void setUts(double uts){
        this.uts = uts;
    }
     public void setUas(double uas){
        this.uas = uas;
    }
     public double getUas(){
        return uas;
        
    }
     public double nNilai(double nQuis,double nUts,double nUas) {
        return (0.2 * nQuis) + (0.3 * nUts) + (0.5 * nUas);
}
 public void nIndex(double nNilai){
   char indeks;
   String keterangan;
          if (nNilai> 80 && nNilai <= 100) {
           indeks = 'A';
           keterangan = "Sangat Baik";
       } else if (nNilai > 68) {
           indeks = 'B';
           keterangan = "Baik";
       } else if (nNilai > 56 ) {
           indeks = 'C';
           keterangan = "Cukup";
       } else if (nNilai > 45) {
           indeks = 'D';
           keterangan = "Kurang";
       } else {
           indeks = 'E';
           keterangan = "Sangat Kurang";
}
         System.out.println("Index = "+indeks);
         System.out.println("Keterangan = "+keterangan);
}
    
    
    
    
    }
    

public class PBO01210116515Tugas3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhs = new Mahasiswa();
        mhs.nama ="Ridwan Maulana";
        mhs.nim ="1.011.65.15";
        mhs.setQuis(75);
        mhs.setUts(45);
        mhs.setUas(34);
        int i = 1;
                
        while (i<=4 ){
            System.out.println("Nama ke-"+i+"\t = "+mhs.nama);
            i++;
        }
        System.out.println("\n");
        
        i = 8;
        while (i >= 1) {
            System.out.println("NIM ke- "+i+"\t ="+mhs.nim+"."+i);
            i--;
        }
        System.out.println("\n");
        System.out.println("QUIZ \t = "+mhs.getQuis());
        System.out.println("UTS \t = "+mhs.getUts());
        System.out.println("UAS \t ="+mhs.getUas());
        System.out.println("\n");
        System.out.println("Nilai Akhir \t ="+mhs.nNilai(mhs.getQuis(),mhs.getUts(),mhs.getUas()));
        mhs.nIndex(mhs.nNilai(mhs.getQuis(), mhs.getUts(), mhs.getUas()));
    }
    
}
