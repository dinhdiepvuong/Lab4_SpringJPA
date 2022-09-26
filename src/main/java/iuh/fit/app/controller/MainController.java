package iuh.fit.app.controller;

import iuh.fit.app.model.ChuyenBay;
import iuh.fit.app.model.NhanVien;
import iuh.fit.app.service.ChuyenBayService;
import iuh.fit.app.service.MayBayService;
import iuh.fit.app.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    private MayBayService mayBayService;

    @Autowired
    private ChuyenBayService chuyenBayService;

    @Autowired
    private NhanVienService nhanVienService;








}
