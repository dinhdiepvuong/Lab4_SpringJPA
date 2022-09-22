package iuh.fit.app.service;

import iuh.fit.app.respository.NhanVienRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class NhanVienService {

    @Autowired
    private NhanVienRepo nhanVienRepo;

    public void findLuongNho10000(){
        nhanVienRepo.findLuongNho10000().forEach(System.out::println);
    }

    public Long TongLuong(){
        return nhanVienRepo.tongLuong();
    }

    public void findNhanVienByBoeing(){
        nhanVienRepo.findNhanVienByBoeing().forEach(System.out::println);
    }
}
