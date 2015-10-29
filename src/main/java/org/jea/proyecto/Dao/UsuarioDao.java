/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jea.proyecto.Dao;

import java.util.List;
import org.jea.proyecto.entities.Usuario;

/**
 *
 * @author sala403e15
 */
public interface UsuarioDao {
    
    public void agregar(Usuario usuario);
    public List<Usuario> listar();
}
