
package ec.edu.espe.examen.gdc.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "gdc_contenido")
public class Contenido {
    
    private static final long serialVersionUID = 1585458L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_contenido", nullable = false)
    private Integer codContenido; 
    @Column(name = "tipo_contenido", nullable = false)
    private Integer tipoContenido;
    @Column(name = "nombre", nullable = false, length = 256)
    private String nombre;
    @Column(name = "nombre_archivo", length = 256)
    private String nombreArchivo;
    @Column(name = "version")
    private Integer version;
    @Column(name = "estado")
    private Integer estado;
    @JoinColumn(name = "cod_contenido_padre", referencedColumnName = "cod_contenido")
    @ManyToOne
    private Contenido codContenidoPadre;
    @JoinColumn(name = "cod_espacio", referencedColumnName = "cod_espacio", nullable = false)
    @ManyToOne(optional = false)
    private Espacio codEspacio;

    public Contenido() {
    }

    public Contenido(Integer codContenido) {
        this.codContenido = codContenido;
    }

    public Integer getCodContenido() {
        return codContenido;
    }

    public void setCodContenido(Integer codContenido) {
        this.codContenido = codContenido;
    }

    public Integer getTipoContenido() {
        return tipoContenido;
    }

    public void setTipoContenido(Integer tipoContenido) {
        this.tipoContenido = tipoContenido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Contenido getCodContenidoPadre() {
        return codContenidoPadre;
    }

    public void setCodContenidoPadre(Contenido codContenidoPadre) {
        this.codContenidoPadre = codContenidoPadre;
    }

    public Espacio getCodEspacio() {
        return codEspacio;
    }

    public void setCodEspacio(Espacio codEspacio) {
        this.codEspacio = codEspacio;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Contenido other = (Contenido) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.nombreArchivo, other.nombreArchivo)) {
            return false;
        }
        if (!Objects.equals(this.codContenido, other.codContenido)) {
            return false;
        }
        if (!Objects.equals(this.tipoContenido, other.tipoContenido)) {
            return false;
        }
        if (!Objects.equals(this.version, other.version)) {
            return false;
        }
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        if (!Objects.equals(this.codContenidoPadre, other.codContenidoPadre)) {
            return false;
        }
        return Objects.equals(this.codEspacio, other.codEspacio);
    }

    @Override
    public String toString() {
        return "Contenido{" + "codContenido=" + codContenido + '}';
    }
    
    
    
   
}
