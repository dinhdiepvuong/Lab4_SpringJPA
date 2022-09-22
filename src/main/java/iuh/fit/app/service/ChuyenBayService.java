package iuh.fit.app.service;

import iuh.fit.app.respository.ChuyenBayRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ChuyenBayService {

    @Autowired
    private ChuyenBayRepo chuyenBayRepo;

//    Trả về 1 chuyến bay
    public ChuyenBayRepo getChuyenBayRepo() {
        return chuyenBayRepo;
    }

//    Trả về nhiều chuyến bay
    public void AllChuyenBay(){
        chuyenBayRepo.findAll().forEach(System.out::println);
    }

    public void ChuyenBayDenDAD(){
        chuyenBayRepo.findChuyenBaysByGaDiDAD().forEach(System.out::println);
    }

    public void DoDai8to10(){
        chuyenBayRepo.findDoDai8to10().forEach(System.out::println);
    }

    public void FrSGToBM(){
        chuyenBayRepo.findFrSGToBM();
    }

    public int CountChuyenBayFroSGN(){
        return chuyenBayRepo.countChuyenBayFroSGN();
    }
}
