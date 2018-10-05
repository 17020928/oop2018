package week4.task1;
import week4.task1.*;
public class main {
    public static void main(String[] argv){
        CamSanh camsanh = new CamSanh("Cam Sành Hải Phòng",17000);
        camsanh.setTaste("Tươi Ngon");
        camsanh.getInfo();
        System.out.println(camsanh.getInfo());
        CamThanhPhong camthanhphong = new CamThanhPhong();
        camthanhphong.setName("Cam Thanh Phong Hải Phòng");
        camthanhphong.setTaste("Tươi Ngon");
        camthanhphong.setCost(18000);
        System.out.println(camthanhphong.getInfo());
    }
}
