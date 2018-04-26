package personal.mysql.org.PracticandoAMySql.repositorio;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = {"/rest/EQUIPO"})
public class ControlEquipo {

    @Autowired Equipos equipos;

    @GetMapping(value = {"/all"})
    public ArrayList<Equipo> todos(){
        return (ArrayList<Equipo>) equipos.findAll();
    }

    @PostMapping(value = {"/load"})
    public Estatus guardar(@RequestBody final Equipo equipo){
        equipos.save(equipo);
        return new Estatus(true,"Guardado con exito");
    }

    @PutMapping(value = {"/update"})
    public Estatus actualizar(@RequestBody Equipo equipo){
        try{
            equipos.findById(equipo.getIdEquipo());
            equipos.save(equipo);
        }catch (Exception e){
            return new Estatus(false,"Error: "+e);
        }
        return new Estatus(true,"Actualizado con exito");
    }
}
