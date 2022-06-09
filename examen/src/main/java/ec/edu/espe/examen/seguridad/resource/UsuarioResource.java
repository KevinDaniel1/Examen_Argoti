
package ec.edu.espe.examen.seguridad.resource;

import ec.edu.espe.examen.seguridad.model.Usuario;
import ec.edu.espe.examen.seguridad.service.UsuarioService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/usuario")
public class UsuarioResource {
    
    private UsuarioService usuarioService;

    public UsuarioResource(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
    
    @GetMapping
    public ResponseEntity<Usuario> getSitiosUsuario(String usuario){
        return ResponseEntity.ok(this.usuarioService.buscarPorCodigo(usuario));
    }
}
