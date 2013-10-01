/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ubticket;

/**
 *
 * @author quispe
 */
public class Espectacle {
    
    private Integer id_espectacle;
    private String titol;
    private String descripcio;
    
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
    
    
    
}
