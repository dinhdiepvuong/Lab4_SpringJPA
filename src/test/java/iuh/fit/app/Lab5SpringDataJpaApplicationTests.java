package iuh.fit.app;

import iuh.fit.app.service.ChuyenBayService;
import iuh.fit.app.service.MayBayService;
import iuh.fit.app.service.NhanVienService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Lab5SpringDataJpaApplicationTests {

    @Autowired
    ChuyenBayService chuyenBayService;
    @Autowired
    MayBayService mayBayService;
    @Autowired
    NhanVienService nhanVienService;

    @Test
    void CacChyenBayDiDAD() {
        System.out.println("1.Các chuyến bay đi Đà Lạt (DAD)");
        chuyenBayService.ChuyenBayDenDAD();
    }

    @Test
    void TamBay10000(){
        System.out.println("2. Cho biết các loại máy bay có tầm bay lớn hơn 10,000km.");
        mayBayService.TamBay10000();
    }

    @Test
    void LuongNho10000(){
        System.out.println("3. Tìm các nhân viên có lương nhỏ hơn 10,000");
        nhanVienService.findLuongNho10000();
    }

    @Test
    void DoDai8to10(){
        System.out.println("4. Cho biết các chuyến bay có độ dài đường bay nhỏ hơn 10.000km và lớn hơn 8.000km0");
        chuyenBayService.DoDai8to10();
    }

    @Test
    void FrSGNToBMV(){
        System.out.println("5. Cho biết các chuyến bay xuất phát từ Sài Gòn (SGN) đi Ban Mê Thuộc (BMV)");
        chuyenBayService.FrSGToBM();
    }

    @Test
    void CountFromSGN() {
        System.out.println("6. Có bao nhiêu chuyến bay xuất phát từ Sài Gòn (SGN): " + chuyenBayService.CountChuyenBayFroSGN() + " (chuyến bay)");

    }

    @Test
    void CountMayBayBoeing() {
        System.out.println("7. Có bao nhiêu loại máy báy Boeing: " + mayBayService.FindMayBayBoeing() + " (loại Boeings)");

    }

    @Test
    void TongLuong() {
        System.out.println("8. Cho biết tổng số lương phải trả cho các nhân viên: " + nhanVienService.TongLuong());

    }

    @Test
    void NhanVienByBoeing() {
        System.out.println("9. Cho biết mã số của các phi công lái máy báy Boeing: ");
        nhanVienService.findNhanVienByBoeing();

    }

    @Test
    void NhanVienByMaMB747() {
        System.out.println("10. Cho biết các nhân viên có thể lái máy bay có mã số 747: ");
        nhanVienService.findNVByMaMB747();

    }

    @Test
    void NhanVienHoNguyen() {
        System.out.println("11. Cho biết mã số của các loại máy bay mà nhân viên có họ Nguyễn có thể lái: ");
        nhanVienService.findNVHoNguyen();

    }

    @Test
    void NhanVien12() {
        System.out.println("12. Cho biết mã số của các phi công vừa lái được Boeing vừa lái được Airbus: ");
        nhanVienService.findNV12();
    }

    @Test
    void MayBay13(){
        System.out.println("13. Cho biết các loại máy bay có thể thực hiện chuyến bay VN280");
        mayBayService.getMayBay().findMayBayByVN320().forEach(s ->{
            System.out.println(s.getLoai());
        });
    }

    @Test
    void MayBay14(){
        System.out.println("14. Cho biết các chuyến bay có thể ñược thực hiện bởi máy bay Airbus A320.");
        chuyenBayService.getChuyenBay().findChuyenBayAirbusA320().forEach(System.out::println);
    }

//    @Test
//    void NhanVien15(){
//        System.out.println("15. Cho biết tên của các phi công lái máy bay Boeing.");
//        nhanVienService.getNhanVien().findNhanVienByBoeing15().forEach(
//                n -> System.out.println(n.getTen()));
//    }

}
