
package ec.edu.espe.examen.seguridad.service;

import ec.edu.espe.examen.seguridad.dao.UsuarioEspacioRepository;
import ec.edu.espe.examen.seguridad.dao.UsuarioRepository;
import ec.edu.espe.examen.seguridad.model.Usuario;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    private UsuarioRepository usuarioRepository;
    private UsuarioEspacioRepository usuarioEspacioRepository;
    
      public Usuario buscarPorCodigo(String codigo) {
        Optional<Usuario> usuarioOpt = this.usuarioRepository.findById(codigo);
        if (usuarioOpt.isPresent()) {
            return usuarioOpt.get();
        } else {
            return null;
        }
    }
}
