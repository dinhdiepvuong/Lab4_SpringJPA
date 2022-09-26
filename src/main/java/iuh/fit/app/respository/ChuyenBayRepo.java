package iuh.fit.app.respository;

import iuh.fit.app.model.ChuyenBay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChuyenBayRepo extends JpaRepository<ChuyenBay, String> {

//    1. Cho biết các chuyến bay đi Đà Lạt (DAD)
    @Query(value = "select *  from chuyenbay where GaDen = 'DAD'", nativeQuery = true)
    public List<ChuyenBay> findChuyenBaysByGaDiDAD();

//    4. Cho biết các chuyến bay có độ dài đường bay nhỏ hơn 10.000km và lớn hơn 8.000km
    @Query(value = "select * from chuyenbay where DoDai > 8000 and DoDai < 10000", nativeQuery = true)
    public List<ChuyenBay> findDoDai8to10();

//    5. Cho biết các chuyến bay xuất phát từ Sài Gòn (SGN) đi Ban Mê Thuộc (BMV).
    @Query(value = "select * from chuyenbay where (GaDi = 'SGN' and GaDen = 'BMV')", nativeQuery = true)
    public List<ChuyenBay> findFrSGToBM();

//    6. Có bao nhiêu chuyến bay xuất phát từ Sài Gòn (SGN).
    @Query(value = "select count(MaCB) as Total from chuyenbay where GaDi = 'SGN' ", nativeQuery = true)
    public int countChuyenBayFroSGN();

//    14. Cho biết các chuyến bay có thể ñược thực hiện bởi máy bay Airbus A320.
    @Query(value = "select * from chuyenbay where DoDai >=\n" +
            "(\n" +
            "\tselect TamBay from maybay where Loai = 'Airbus A320'\n" +
            ")", nativeQuery = true)
    public List<ChuyenBay> findChuyenBayAirbusA320();
}
