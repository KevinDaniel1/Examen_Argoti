package ec.edu.espe.examen.gdc.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "gdc_contenido_version")
public class ContenidoVersion implements Serializable {

    private static final long serialVersionUID = 123423L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_contenido_version", nullable = false)
    private Integer codContenidoVersion;
    @Column(name = "hash_archivo", nullable = false, length = 64)
    private String hashArchivo;
    @Column(name = "nombre_archivo", nullable = false, length = 256)
    private String nombreArchivo;
    @Column(name = "tamanio", nullable = false)
    private int tamanio;
    @Column(name = "version", nullable = false)
    private Integer version;
    @Column(name = "comentario", length = 500)
    private String comentario;
    @Column(name = "fecha_creacion", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;
    @Column(name = "cod_usuario_creacion", nullable = false)
    private Integer codUsuarioCreacion;
    @JoinColumn(name = "cod_contenido", referencedColumnName = "cod_contenido", nullable = false)
    @ManyToOne(optional = false)
    private Contenido codContenido;

    public ContenidoVersion() {
    }

    public ContenidoVersion(Integer codContenidoVersion) {
        this.codContenidoVersion = codContenidoVersion;
    }

    public Integer getCodContenidoVersion() {
        return codContenidoVersion;
    }

    public void setCodContenidoVersion(Integer codContenidoVersion) {
        this.codContenidoVersion = codContenidoVersion;
    }

    public String getHashArchivo() {
        return hashArchivo;
    }

    public void setHashArchivo(String hashArchivo) {
        this.hashArchivo = hashArchivo;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getCodUsuarioCreacion() {
        return codUsuarioCreacion;
    }

    public void setCodUsuarioCreacion(Integer codUsuarioCreacion) {
        this.codUsuarioCreacion = codUsuarioCreacion;
    }

    public Contenido getCodContenido() {
        return codContenido;
    }

    public void setCodContenido(Contenido codContenido) {
        this.codContenido = codContenido;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final ContenidoVersion other = (ContenidoVersion) obj;
        if (this.tamanio != other.tamanio) {
            return false;
        }
        if (!Objects.equals(this.hashArchivo, other.hashArchivo)) {
            return false;
        }
        if (!Objects.equals(this.nombreArchivo, other.nombreArchivo)) {
            return false;
        }
        if (!Objects.equals(this.comentario, other.comentario)) {
            return false;
        }
        if (!Objects.equals(this.codContenidoVersion, other.codContenidoVersion)) {
            return false;
        }
        if (!Objects.equals(this.version, other.version)) {
            return false;
        }
        if (!Objects.equals(this.fechaCreacion, other.fechaCreacion)) {
            return false;
        }
        if (!Objects.equals(this.codUsuarioCreacion, other.codUsuarioCreacion)) {
            return false;
        }
        return Objects.equals(this.codContenido, other.codContenido);
    }

    @Override
    public String toString() {
        return "ContenidoVersion{" + "codContenidoVersion=" + codContenidoVersion + '}';
    }

}
