package ubticket;

import java.util.Set;

/**
 *
 * @author quispe, jrojas
 */
public class Espectacle {
    
    private Integer id_espectacle;
    private String titol;
    private String descripcio;
    
    // afegim l'objecte categoria en cardinalitat 1
    private Categoria categoria;

    
    //afegim l'objecte Organitzacio amb cardinalitat N
    private Set<Organitzacio> organitzacions;


    /**
     *  Constructor de Espectacle
     * /
    public Espectacle(){
        super();
    }
    
    /**
     *  @param id_espectacle
     *  @param titol
     *  @param descripcio
     * 
     * /
    public Espectacle(Integer id_espectacle, String titol, String descripcio){        
        super();
        this.id_espectacle = id_espectacle;
        this.titol = titol;
        this.descripcio = descripcio;                
    }
    
    /**
     *  Retorna el identificador del espectacle
     *  @return id_espectacle de tipo Integer
     * /
    public Integer getIdEspectacle(){
        return this.id_espectacle;
    }
    
    /**
     *  Modifica el identificador del espectacle
     *  @param id_espectacle es el nuevo valor del identificador de espectacle
     * 
     * /
    public void setIdEspectacle(Integer id_espectacle){
        this.id_espectacle = id_espectacle;
    }
    
    /**
     *  Retorna el titulo del espectacle
     *  @return titol de tipo string
     * /
    
    public String getTitol(){
        return this.titol;
    }
    
    /**
     *  Modifica el titol del espectacle
     *  @param titol es el nuevo valor del titol de espectacle
     * 
     * /
    public void setTitol(String titol){
        this.titol = titol;
    }
    
    /**
     *  Retorna la descripcio del espectacle
     *  @return descripcio de tipo string
     * /
    public String getDescripcio(){
        return this.descripcio;
    }
    
    /**
     *  Modifica la descripcio del espectacle
     *  @param descripcio es el nuevo valor de descripcio de espectacle
     * /
    public void setDescripcio(String descripcio){
        this.descripcio = descripcio;
    }
    
    //NOUS GETTERS I SETTERS    
    /**
     *  Retorna la categoria
     *  @return categoria de tipo Categoria
     * /
    public Categoria getCategoria() {
        return categoria;
    }
    
    /**
     * 
     * 
     * /
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
