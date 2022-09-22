package iuh.fit.app.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "nhanvien")
public class NhanVien implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaNV")
    private String maNV;

    @Column(name = "Ten")
    private String ten;

    @Column(name = "Luong")
    private Integer luong;

}
