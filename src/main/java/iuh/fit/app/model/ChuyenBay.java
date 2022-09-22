package iuh.fit.app.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

@Getter
@Setter
@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "chuyenbay")
public class ChuyenBay implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaCB")
    private String maCB;

    @Column(name = "GaDi")
    private String gaDi;

    @Column(name = "GaDen")
    private String gaDen;

    @Column(name = "DoDai")
    private Integer doDai;

    @Column(name = "GioDi")
    private Date gioDi;

    @Column(name = "GioDen")
    private Date gioDen;

    @Column(name = "ChiPhi")
    private Integer chiPhi;
}
