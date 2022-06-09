package ec.edu.espe.examen.seguridad.dao;

import ec.edu.espe.examen.seguridad.model.Usuario;
import ec.edu.espe.examen.seguridad.model.UsuarioEspacio;
import ec.edu.espe.examen.seguridad.model.UsuarioEspacioPK;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioEspacioRepository extends JpaRepository<UsuarioEspacio, UsuarioEspacioPK> {

}
