/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jea.proyecto.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 *
 * @author Maico
 */
@Controller
public class PrincipalController {
    
   @RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
    public String index() {
        return "index";
    }    
}
