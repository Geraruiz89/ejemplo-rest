package com.example.helloworld.muebles;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.helloworld.muebles.Mueble;
import com.example.helloworld.muebles.MueblesService;

@RestController
@RequestMapping(value="/gus/tavo/arellano")
public class MueblesController {
    private MueblesService priImp;
    
    public MueblesController(MueblesService priImp) {
        this.priImp = priImp;
    }
    
    @GetMapping(
            value= "/muebles", 
            produces = "application/json; charset=utf-8")
    public List<Mueble> muebles() {
        return priImp.getAll();
    }
    
    @GetMapping(
            value= "/mueblesId", 
            produces = "application/json; charset=utf-8")
    public List<Mueble> muebles(@RequestParam int id) {
        return priImp.getEleById(id);
    }
    
    @GetMapping(
            value= "/mueblesInsert", 
            produces = "application/json; charset=utf-8")
    public List<Mueble> muebles(
    		@RequestParam int id,
    		@RequestParam String nombre,
    		@RequestParam String color,
    		@RequestParam float precio,
    		@RequestParam boolean agotado) {
    	Mueble mb = new Mueble(id, nombre, color, precio, agotado);
        return priImp.getInsert(mb);
    }
    
    @GetMapping(
            value= "/mueblesBorrar", 
            produces = "application/json; charset=utf-8")
    public String muebles2(@RequestParam int id) {
        return priImp.Borrar(id);
    }
    
    @GetMapping(
            value= "/mueblesActualizar", 
            produces = "application/json; charset=utf-8")
    public List<Mueble> muebles3(
    		@RequestParam int id,
    		@RequestParam String nombre,
    		@RequestParam String color,
    		@RequestParam float precio,
    		@RequestParam boolean agotado) {
    	Mueble mb = new Mueble(id, nombre, color, precio, agotado);
        return priImp.getUpdate(mb);
    }
}
