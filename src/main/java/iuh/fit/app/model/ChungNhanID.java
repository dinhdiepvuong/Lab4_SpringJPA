package iuh.fit.app.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import java.io.Serializable;

public class ChungNhanID implements Serializable {

    @Basic
    @Column(name = "MaNV")
    private String maNV;

    @Basic(optional = false)
    @Column(name = "MaMB")
    private Integer maMB;
}
