package iuh.fit.app.respository;

import iuh.fit.app.model.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NhanVienRepo extends JpaRepository<NhanVien, String> {

//    3. Tìm các nhân viên có lương nhỏ hơn 10,000
    @Query(value = "select * from nhanvien where Luong < 10000", nativeQuery = true)
    public List<NhanVien> findLuongNho10000();

//    8. Cho biết tổng số lương phải trả cho các nhân viên.
    @Query(value = "select sum(Luong) from nhanvien ", nativeQuery = true)
    public Long tongLuong();

//    9. Cho biết mã số của các phi công lái máy báy Boeing.
    @Query(value = " select * from nhanvien n join chungnhan c \n" +
            "on n.MaNV = c.MaNV join maybay m on m.MaMB = c.MaMB\n" +
            "where m.Loai like '%Boeing%'\n" +
            "group by n.MaNV, n.Ten  ", nativeQuery = true)
    public List<NhanVien> findNhanVienByBoeing();

//    10. Cho biết các nhân viên có thể lái máy bay có mã số 747
    @Query(value = "select * from nhanvien n join chungnhan c on n.MaNV = c.MaNV\n" +
            "where c.MaMB = '747'\n" +
            "group by n.MaNV", nativeQuery = true)
    public List<NhanVien> findNhanVienByMaMB747();

//    11. Cho biết mã số của các loại máy bay mà nhân viên có họ Nguyễn có thể lái.
    @Query(value = "select * from nhanvien n join chungnhan c on n.MaNV = c.MaNV\n" +
            "where n.Ten like 'Nguyễn%'", nativeQuery = true)
    public List<NhanVien> findNVHoNguyen();

//    12. Cho biết mã số của các phi công vừa lái được Boeing vừa lái được Airbus
    @Query(value = "select * from nhanvien \n" +
            "where MaNV in \n" +
            "(\n" +
            "\tselect c.MaNV from chungnhan c inner join maybay m on c.MaMB = m.MaMB\n" +
            "\twhere m.Loai like '%Airbus%' or m.Loai like '%Boeing%'\n" +
            ")", nativeQuery = true)
    public List<NhanVien> findNhanViensBy12();

//    15. Cho biết tên của các phi công lái máy bay Boeing.
    @Query(value = "select n.Ten from nhanvien n join chungnhan c on n.MaNV = c.MaNV\n" +
            "join maybay m on m.MaMB = c.MaMB\n" +
            "where m.Loai like '%Boeing%'\n" +
            "group by n.Ten, n.MaNV", nativeQuery = true)
    public List<NhanVien> findNhanVienByBoeing15();


}
