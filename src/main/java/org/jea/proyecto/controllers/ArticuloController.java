/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jea.proyecto.controllers;

import java.util.List;
import org.jea.proyecto.Dao.ArticuloDao;
import org.jea.proyecto.Dao.CategoriaDao;
import org.jea.proyecto.entities.Articulo;
import org.jea.proyecto.entities.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



/**
 *
 * @author Maico
 */
public class ArticuloController {
    
    @Autowired
    ArticuloDao articuloDao;
    @Autowired
    CategoriaDao categoriaDao;
    
    @RequestMapping(value = "/articulos/listado", method = RequestMethod.GET)
    public String listado(){
        return "articulos/listado";
    }
    
    @RequestMapping(path = "/api/articulos", method = RequestMethod.POST)
    @ResponseBody
    public void guardar(@ModelAttribute Articulo articulo, @ModelAttribute("categoria_id") Long categoriaId) {
        Categoria categoria = categoriaDao.obtener(categoriaId);
        articulo.setCategoria(categoria);
        articuloDao.agregar(articulo);
    }
    
    @RequestMapping(path = "/api/articulos/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public void editar(@PathVariable Long id, @ModelAttribute Articulo articulo, @ModelAttribute("categoria_id") Long categoriaId) {
        Categoria categoria = categoriaDao.obtener(categoriaId);
        articulo.setCategoria(categoria);
        articulo.setId(id);
        articuloDao.editar(articulo);
    }
    
    @RequestMapping(path = "/api/articulos/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void borrar(@PathVariable Long id) {
        articuloDao.borrar(id);
    }
    
    @RequestMapping(path = "/api/articulos", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List<Articulo> listar() {
        return articuloDao.listar();
    }
    
    @RequestMapping(path = "/api/articulos/{id}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public Articulo obtener(@PathVariable("id") Long id) {
        return articuloDao.obtener(id);
    }

    
}
