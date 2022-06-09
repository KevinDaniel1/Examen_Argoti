package ec.edu.espe.examen.gdc.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@Entity
@Table(name = "gdc_espacio")
public class Espacio implements Serializable {

    private static final long serialVersionUID = 5465481L;
    @Id
    @Column(name = "cod_espacio", nullable = false)
    private Integer codEspacio;
    @Column(name = "nombre", nullable = false, length = 128)
    private String nombre;
    @Column(name = "fecha_creacion", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gdcEspacio")
    private List<Contenido> contenidos;

    public Espacio() {
    }

    public Espacio(Integer codEspacio) {
        this.codEspacio = codEspacio;
    }

    public Integer getCodEspacio() {
        return codEspacio;
    }

    public void setCodEspacio(Integer codEspacio) {
        this.codEspacio = codEspacio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Espacio other = (Espacio) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.codEspacio, other.codEspacio)) {
            return false;
        }
        return Objects.equals(this.fechaCreacion, other.fechaCreacion);
    }

    @Override
    public String toString() {
        return "Espacio{" + "codEspacio=" + codEspacio + '}';
    }
    
    
    
}
