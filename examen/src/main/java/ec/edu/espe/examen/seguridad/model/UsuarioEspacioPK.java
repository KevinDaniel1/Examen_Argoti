package ec.edu.espe.examen.seguridad.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class UsuarioEspacioPK implements Serializable {

    @Column(name = "cod_usuario", nullable = false)
    private Integer codUsuario;
    @Column(name = "cod_espacio", nullable = false)
    private Integer codEspacio;

    public UsuarioEspacioPK() {
    }

    public UsuarioEspacioPK(Integer codUsuario, Integer codEspacio) {
        this.codUsuario = codUsuario;
        this.codEspacio = codEspacio;
    }

    public Integer getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Integer codUsuario) {
        this.codUsuario = codUsuario;
    }

    public Integer getCodEspacio() {
        return codEspacio;
    }

    public void setCodEspacio(Integer codEspacio) {
        this.codEspacio = codEspacio;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.codUsuario);
        hash = 83 * hash + Objects.hashCode(this.codEspacio);
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
        final UsuarioEspacioPK other = (UsuarioEspacioPK) obj;
        if (!Objects.equals(this.codUsuario, other.codUsuario)) {
            return false;
        }
        return Objects.equals(this.codEspacio, other.codEspacio);
    }

    @Override
    public String toString() {
        return "UsuarioPerfilPK{" + "codUsuario=" + codUsuario + ", codEspacio=" + codEspacio + '}';
    }

}
