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
@Table(name = "chungnhan")
public class ChungNhan implements Serializable {

    @Id
    @ManyToOne(optional = false)
    @JoinColumn(name = "MaNV", referencedColumnName = "MaNV", insertable = false, updatable = false)
    private NhanVien nhanVien;

    @Id
    @ManyToOne(optional = false)
    @JoinColumn(name = "MaMB", referencedColumnName = "MaMB", insertable = false, updatable = false)
    private MayBay mayBay;
}
