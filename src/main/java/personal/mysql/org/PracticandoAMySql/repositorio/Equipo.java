package personal.mysql.org.PracticandoAMySql.repositorio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Equipo {

    @Id
    @GeneratedValue
    @Column(name = "idEquipo")
    private Integer idEquipo;
    @Column(name = "nombre")
    private String nombreEquipo;

    public Equipo(){

    }

    public Integer getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(Integer idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }
}
