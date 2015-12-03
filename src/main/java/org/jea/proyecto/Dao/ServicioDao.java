/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jea.proyecto.Dao;

import java.util.Collection;
import org.jea.proyecto.entities.Propietario;
import org.jea.proyecto.entities.Visitas;
import org.springframework.dao.DataAccessException;

/**
 *
 * @author Maico
 */
public interface ServicioDao {
    
     Propietario findOwnerById(int id) throws DataAccessException;
     
     void saveVisit(Visitas visitas) throws DataAccessException;
     
     void saveOwner(Propietario owner) throws DataAccessException;
     
     Collection<Propietario> findOwnerByLastName(String lastName) throws DataAccessException;
    
}
