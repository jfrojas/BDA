package ubticket;

import java.util.Set;

/**
 *
 * @author quispe
 */
public class Espectacle {
    
    private Integer id_espectacle;
    private String titol;
    private String descripcio;
    
    // afegim l'objecte categoria en cardinalitat 1
    private Categoria categoria;

    
    //afegim l'objecte Organitzacio amb cardinalitat N
    private Set<Organitzacio> organitzacions;


    
    public Espectacle(){
        super();
    }
    
    public Espectacle(Integer id_espectacle, String titol, String descripcio){        
        super();
        this.id_espectacle = id_espectacle;
        this.titol = titol;
        this.descripcio = descripcio;                
    }
    
    public Integer getIdEspectacle(){
        return this.id_espectacle;
    }
    
    public void setIdEspectacle(Integer id_espectacle){
        this.id_espectacle = id_espectacle;
    }
    
    public String getTitol(){
        return this.titol;
    }
    
    public void setTitol(String titol){
        this.titol = titol;
    }
    
    public String getDescripcio(){
        return this.descripcio;
    }
    
    public void setDescripcio(String descripcio){
        this.descripcio = descripcio;
    }
    
    //NOUS GETTERS I SETTERS    
    public Categoria getCategoria() {
        return categoria;
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    
    //NOUS GETTERS I SETTERS   
    public Set<Organitzacio> getOrganitzacions() {
        return organitzacions;
    }
    public void setOrganitzacions(Set<Organitzacio> organitzacions) {
        this.organitzacions = organitzacions;
    }
    
}
