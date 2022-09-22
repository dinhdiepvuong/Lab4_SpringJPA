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
@Table(name = "maybay")
public class MayBay implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaMB")
    private Integer maMB;

    @Column(name = "Loai")
    private String loai;

    @Column(name = "TamBay")
    private Integer tamBay;
}
