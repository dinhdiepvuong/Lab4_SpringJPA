package iuh.fit.app.respository;

import iuh.fit.app.model.MayBay;
import iuh.fit.app.model.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MayBayRepo extends JpaRepository<MayBay, Integer> {

//    2. Cho biết các loại máy bay có tầm bay lớn hơn 10,000km.
    @Query(value = "select * from maybay where TamBay > 10000", nativeQuery = true)
    public List<MayBay> findTamBayHon10000();

//    7. Có bao nhiêu loại máy báy Boeing.
    @Query(value = "select count(MaMB) from maybay where Loai like '%Boeing%'", nativeQuery = true)
    public int findMayBayByBoeing();

//    13. Cho biết các loại máy bay có thể thực hiện chuyến bay VN280
    @Query(value = "select * from maybay m where m.TamBay > (select c.DoDai from chuyenbay c where MaCB = 'VN280')", nativeQuery = true)
    public List<NhanVien> findLoaiBM13();

//    14. Cho biết các chuyến bay có thể ñược thực hiện bởi máy bay Airbus A320.
    @Query(value = "select * FROM chuyenbay \n" +
            "WHERE chuyenbay.DoDai < (SELECT maybay.TamBay FROM maybay WHERE maybay.Loai='Airbus A320')", nativeQuery = true)
    public List<NhanVien> findMayBayBy14();
}
