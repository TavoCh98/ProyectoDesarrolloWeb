
package com.Proyecto_DesaWeb.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author mariafernandamiranda
 */

@Data
@Entity
@Table(name="usuario")
public class Usuario implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;
    String nombre;
    String apellidos;
    String email;
    String climaPreferido;
    
    
    @JoinColumn(name="id_usuario", referencedColumnName = "id_usuario")
    @ManyToOne
    private Usuario usuario;

    public Usuario() {
    }

    public Usuario(String nombre, String apellidos, String correo, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.climaPreferido = climaPreferido;
    }
    
}
