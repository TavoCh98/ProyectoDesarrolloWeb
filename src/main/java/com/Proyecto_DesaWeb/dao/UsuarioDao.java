
package com.Proyecto_DesaWeb.dao;

import com.Proyecto_DesaWeb.domain.Usuario;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author mariafernandamiranda
 */
public interface UsuarioDao extends CrudRepository<Usuario, Long>{
    
}
