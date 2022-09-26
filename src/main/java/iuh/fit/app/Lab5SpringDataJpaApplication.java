package iuh.fit.app;

import iuh.fit.app.service.ChuyenBayService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Lab5SpringDataJpaApplication {

    final ChuyenBayService chuyenBayService;

    public Lab5SpringDataJpaApplication(ChuyenBayService chuyenBayService) {
        this.chuyenBayService = chuyenBayService;
    }

    public static void main(String[] args) {
        SpringApplication.run(Lab5SpringDataJpaApplication.class, args);
    }

//    @PostConstruct
//    int postConstruct(){
//
//        System.out.println("1.Các chuyến bay đi Đà Lạt: " + chuyenBayService.CountChuyenBayFroSGN());
//        return 0;
//    }

}
