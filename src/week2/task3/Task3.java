package week2.task3;

import java.security.PrivateKey;

public class Task3 {
    Sv[] sinhvien = new Sv[100];
    Rau[] rau = new Rau[100];
    Thit[] thit = new Thit[100];
    public static void main(String[] argv){
        Task3 s = new Task3();
        s.sinhvien[0] = new Sv("Nghia",3,15000);
        s.sinhvien[1] = new Sv("Nhanh",2,42000);
        s.sinhvien[2] = new Sv("Thanh",1,39000);
        s.sinhvien[3] = new Sv("Quyet",4,22000);
        s.sinhvien[4] = new Sv("Quynh",3,18000);
        s.rau[0] = new Rau("Tuoi",12000,3);
        s.rau[1] = new Rau("Thiu",20000,4);
        s.thit[0] = new Thit("Thiu",40000,2);
        s.thit[1] = new Thit("Tuoi",35000,1);
        System.out.println("Thong tin sinh vien");
        for (int i=0;i<5;i++){
            System.out.println(s.sinhvien[i].thongtin());
        }
        System.out.println("============================================\nThong tin thuc pham: ");
        for(int i=0;i<2;i++){
            System.out.println(s.thit[i].thongtin());
        }
        for(int i=0;i<2;i++){
            System.out.println(s.rau[i].thongtin());
        }
        System.out.println("============================================\nXu ly:");
        System.out.println("Tim ban de choi :)) :");
        for(int i=0;i<4;i++){
                for(int j = i + 1; j < 5; j++) {
                    if (s.sinhvien[i].banthan(s.sinhvien[j])) {
                        System.out.println("Sinh vien " + (i + 1) + " va " + (j + 1) + " cung so thich ");
                        s.sinhvien[i].sosanh(s.sinhvien[j]);
                    }
                }
        }
        System.out.println("====================================");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++) {
                s.rau[i].sosanh(s.thit[j]);
            }
        }
        System.out.println("========================================\nChon thuc pham phu hop");
        for(int i=0;i<5;i++) {
            for (int z = 0; z < 2; z++) {
                s.rau[z].khuyen(s.sinhvien[i]);
            }
        }
        for(int i=0;i<5;i++) {
            System.out.println("==========================================");
            System.out.println(s.sinhvien[i].getName()+" : ");
            for (int k=0;k < 2;k++){
                if(s.thit[k].muaduoc(s.sinhvien[i])) System.out.println(s.thit[k].getName()+" Mua duoc!!!!");
                else System.out.println(s.thit[k].getName()+" khong mua duoc!!");
            }
        }

    }

}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
 class Sv{
    private String name;
    private int sothich;// 1. Thịt lợn, 2. Thịt bò, 3. Rau cải, 4. Rau muống
    private float tien;
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setsothich(int sothich){
        this.sothich = sothich;
    }
    public int getsothich(){
        return sothich;
    }
    public void settien(float tien){
        this.tien=tien;
    }
    public float gettien(){
        return tien;
    }
    public Sv(String name,int sothich,float tien){
        this.name=name;
        this.sothich=sothich;
        this.tien=tien;
    }
    public boolean banthan(Sv other){
        if(sothich==other.getsothich()) return true;
            return false;
    }
    public void sosanh(Sv other){
        System.out.println("So tien cua 2 sinh vien :"+tien+" va "+other.gettien());
        if(tien>=other.gettien()) System.out.println(name+" nhieu tien hon "+other.getName());
            else System.out.println(other.getName()+" nhieu tien hon "+name);
    }
    public boolean mua(int a){
        if(tien>a) return true;
        return false;
    }
    public String thongtin(){
        if(sothich==1) return name+"\tThit Lon\t"+tien;
        if(sothich==2) return name+"\tThit Bo\t"+tien;
        if(sothich==3) return name+"\tRau Cai\t"+tien;
        if(sothich==4) return name+"\tRau Muong\t"+tien;
        return"";
    }
}
 class Thit {
    private String trangthai;//Cu hay moi
    private int gia;
    private int name;// Thịt lợn thịt bò

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getGia() {
        return gia;
    }

    public void setName(int name) {
        this.name=name;
    }

    public String getName() {
        if(name==1) return"Thit Lon";
        if(name==2) return"Thit Bo";
        return "";
    }

    public Thit(String trangthai, int gia, int name) {
       this.name=name;
        this.trangthai = trangthai;
        this.gia = gia;
    }

    public boolean kt() {
        if (trangthai.equals("Tuoi")) {
            System.out.println("Oh shiet, Thit tuoi");
            return true;
        }
        else {
            System.out.println("Oh shiet, Thit thiu");
            return false;
        }
    }

    public boolean muaduoc(Sv other) {
        if (kt()) {
            if (other.gettien() >= gia) {
                return true;
            } else {
                System.out.println("Thit tuoi nhung k du tien");
                return false;
            }
        }else
            return false;
    }
    public void sosanh (Thit other){
            if (gia > other.getGia()) System.out.println(name + " dat hon " + other.getName());
            else System.out.println(other.getName() + "dat hon" + name);
        }
    public String thongtin(){
        if(name==1) return("Thit Lon\t"+gia+"\t"+trangthai);
        if(name==2) return("Thit Bo\t"+gia+"\t"+trangthai);
        return"";
    }

}
 class Rau{
    private String trangthai;//Cu hay moi
    private int gia;
    private int name;// Rau cải rau muống
    public void setTrangthai(String trangthai){
        this.trangthai=trangthai;
    }
    public String getTrangthai(){
        return trangthai;
    }
    public void setGia(int gia){
        this.gia=gia;
    }
    public int getGia(){
        return gia;
    }
    public void setName(int name){
        this.name=name;
    }
    public String getName(){
        if(name==3) return "Rau Cai";
        if(name==4) return "Rau Muong";
        return" ";
    }
    public Rau(String trangthai,int gia,int name){
        this.name=name;
        this.trangthai=trangthai;
        this.gia=gia;
    }
    public void sosanh(Thit other){
        if(gia>other.getGia()) System.out.println(getName()+" dat hon "+other.getName());
        else System.out.println(other.getName()+" dat hon "+getName());
    }
    public boolean kiemtra(int tien){
        if(trangthai.equals("Tuoi")){
            System.out.println("Oh shiet, Rau tuoi");
            if(gia<tien) return true;
            return false;
        }else{
            System.out.println("Oh shiet, Rau thiu");
            return false;
        }
    }
    public void khuyen(Sv other){
        if(name==other.getsothich() && other.mua(gia)) System.out.println(other.getName()+" nen mua "+getName());
        //else System.out.println(other.getName()+" khong nen mua "+getName());
    }
     public String thongtin(){
         if(name==3) return("Rau Cai\t"+gia+"\t"+trangthai);
         if(name==4) return("Rau Muong\t"+gia+"\t"+trangthai);
         return"";
     }
}

