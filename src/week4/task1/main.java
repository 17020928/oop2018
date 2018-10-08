package week4.task1;
import week4.task1.*;
public class main {
    public static void main(String[] argv){
        CamSanh camsanh = new CamSanh("Cam Sành Hải Phòng",17000);
        camsanh.setTaste("Tươi Ngon");
        System.out.println(camsanh);
        CamThanhPhong camthanhphong = new CamThanhPhong();
        camthanhphong.setName("Cam Thanh Phong Hải Phòng");
        camthanhphong.setTaste("Tươi Ngon");
        camthanhphong.setCost(18000);
        System.out.println(camthanhphong);
        System.out.println(camthanhphong.sameType(camthanhphong.getType(),camsanh.getType()));
        Tao tao = new Tao("Táo","Thối");
        tao.setName("Táo Vô Danh Trung Quốc");
        tao.setCost(1000);
        System.out.println(tao);
        System.out.println(camsanh.sameType(camsanh.getType(),tao.getType()));
    }
}
