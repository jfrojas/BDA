package ubticket;

import java.util.Set;

/**
 *
 * @author quispe, jrojas
 */
public class Sessio {
    
    private Integer id_sessio;
    private String data;
    private String hora;
    private Integer aforament;
    
    //afegim l'objecte Entrada amb cardinalitat N
    private Set<Entrada> entrades;

    
    //afegim l'objecte organitzacio amb cardinalitat N
    private Set<Organitzacio> organitzacions;

    
        
    public Sessio(){
        super();
    }
    
    public Sessio(Integer id_sessio, String data, String hora, Integer aforament){        
        super();
        this.id_sessio = id_sessio;
        this.data = data;
        this.hora = hora;                
        this.aforament = aforament;
    }

    public Integer getAforament() {
        return aforament;
    }

    public void setAforament(Integer aforament) {
        this.aforament = aforament;
    }
    
    
    
    public Integer getIdSessio(){
        return this.id_sessio;
    }    
    public void setIdSessio(Integer id_sessio){
        this.id_sessio = id_sessio;
    }
    
    
    public String getData(){
        return this.data;
    }    
    public void setData(String data){
        this.data = data;
    }
    
    
    public String getHora(){
        return this.hora;
    }  
    public void setHora(String hora){
        this.hora = hora;
    }
    
    //NOUS GETTERS I SETTERS    
    public Set<Entrada> getEntrades() {
        return entrades;
    }
    public void setEntrades(Set<Entrada> entrades) {
        this.entrades = entrades;
    }
    
    //NOUS GETTERS I SETTERS
    public Set<Organitzacio> getOrganitzacions() {
        return organitzacions;
    }
    public void setOrganitzacions(Set<Organitzacio> organitzacions) {
        this.organitzacions = organitzacions;
    }
    
}
