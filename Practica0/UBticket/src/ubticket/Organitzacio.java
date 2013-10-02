/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ubticket;

import java.util.Set;

/**
 *
 * @author quispe
 */
public class Organitzacio {
    
    
    private Integer id_espectacle;
    private Integer id_espai;
    private Integer id_sessio;
    
    
    // afegim l'objecte Espectacle en cardinalitat 1
    private Espectacle espectacle;

    // afegim l'objecte Espai en cardinalitat 1
    private Espai espai;

    //afegim l'objecte sessio amb cardinalitat N
    private Set<Sessio> sessions;

    public Organitzacio(){
        super();
    }

    public Integer getId_espectacle() {
        return id_espectacle;
    }

    public void setId_espectacle(Integer id_espectacle) {
        this.id_espectacle = id_espectacle;
    }

    public Integer getId_espai() {
        return id_espai;
    }

    public void setId_espai(Integer id_espai) {
        this.id_espai = id_espai;
    }

    public Integer getId_sessio() {
        return id_sessio;
    }

    public void setId_sessio(Integer id_sessio) {
        this.id_sessio = id_sessio;
    }
    
    
    //NOUS GETTERS I SETTERS     
    public Espectacle getEspectacle() {
        return espectacle;
    }
    public void setEspectacle(Espectacle espectacle) {
        this.espectacle = espectacle;
    }

    //NOUS GETTERS I SETTERS 
    public Espai getEspai() {
        return espai;
    }
    public void setEspai(Espai espai) {
        this.espai = espai;
    }
    
    //NOUS GETTERS I SETTERS 
    public Set<Sessio> getSessions() {
        return sessions;
    }
    public void setSessions(Set<Sessio> sessions) {
        this.sessions = sessions;
    }
    
    
}
