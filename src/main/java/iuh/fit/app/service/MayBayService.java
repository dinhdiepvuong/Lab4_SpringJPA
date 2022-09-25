package iuh.fit.app.service;

import iuh.fit.app.respository.MayBayRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MayBayService {

    @Autowired
    private MayBayRepo mayBayRepo;

    public void TamBay10000(){
        mayBayRepo.findTamBayHon10000().forEach(System.out::println);
    }

    public int FindMayBayBoeing(){
        return mayBayRepo.findMayBayByBoeing();

    }

    public void findLoaiMB13(){
        mayBayRepo.findLoaiBM13().forEach(System.out::println);
    }

    public void findMB14(){
        mayBayRepo.findMayBayBy14().forEach(System.out::println);
    }

}
