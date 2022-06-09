
package ec.edu.espe.examen.seguridad.dao;

import ec.edu.espe.examen.seguridad.model.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
    
 
}
