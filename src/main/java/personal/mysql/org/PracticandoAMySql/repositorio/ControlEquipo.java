package personal.mysql.org.PracticandoAMySql.repositorio;

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
    public ArrayList<Equipo> guardar(@RequestBody final Equipo equipo){
        equipos.save(equipo);
        return (ArrayList<Equipo>)equipos.findAll();
    }
}
