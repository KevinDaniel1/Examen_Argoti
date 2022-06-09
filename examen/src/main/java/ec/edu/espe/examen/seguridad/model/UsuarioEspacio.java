package ec.edu.espe.examen.seguridad.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "seg_usuario_espacio")
public class UsuarioEspacio implements Serializable {

    private static final long serialVersionUID = 8564651L;
    @EmbeddedId
    private UsuarioEspacioPK pk;
    @Column(name = "estado", nullable = false, length = 3)
    private String estado;

    public UsuarioEspacio() {
    }

    public UsuarioEspacio(UsuarioEspacioPK pk, String estado) {
        this.pk = pk;
        this.estado = estado;
    }

    public UsuarioEspacioPK getPk() {
        return pk;
    }

    public void setPk(UsuarioEspacioPK pk) {
        this.pk = pk;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.pk);
        hash = 83 * hash + Objects.hashCode(this.estado);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UsuarioEspacio other = (UsuarioEspacio) obj;
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        return Objects.equals(this.pk, other.pk);
    }

    @Override
    public String toString() {
        return "UsuarioEspacio{" + "pk=" + pk + '}';
    }

}
