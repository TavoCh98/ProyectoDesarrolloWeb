
package com.Proyecto_DesaWeb.service;

import com.Proyecto_DesaWeb.domain.Usuario;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.stereotype.Service;
import com.Proyecto_DesaWeb.dao.UsuarioDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author mariafernandamiranda
 */

@Service
public class UsuarioServicelmpl implements UsuarioService {

    @Autowired
    UsuarioDao usuarioDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Usuario> getUsuarios() {
        return (List<Usuario>) usuarioDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Usuario getUsuario(Usuario usuario) {
        return usuarioDao.findById(usuario.getIdUsuario()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Usuario usuario) {
        Usuario usuario = usuario.getUsuarios();
        usuario = usuarioDao.save(usuario);

        usuario.setUsuario(usuario);
        usuarioDao.save(usuario);
    }

    @Override
    @Transactional
    public void delete(Usuario usuario) {
        usuarioDao.deleteById(usuario.getIdUsuario());
    }  
}

    
