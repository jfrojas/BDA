package ubticket;

import java.util.Set;

/**
 *
 * @author quispe
 */
public class Organitzacio {
    
    // afegim l'objecte Espectacle en cardinalitat 1
    private Espectacle espectacle;

    // afegim l'objecte Espai en cardinalitat 1
    private Espai espai;

    //afegim l'objecte sessio amb cardinalitat N
    private Set<Sessio> sessions;

    public Organitzacio(){
        super();
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
