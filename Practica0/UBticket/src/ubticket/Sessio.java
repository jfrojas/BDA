/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ubticket;

/**
 *
 * @author quispe
 */
public class Sessio {
    
    private Integer id_sessio;
    private String data;
    private String hora;
    
    public Sessio(){
        super();
    }
    
    public Sessio(Integer id_sessio, String data, String hora){        
        super();
        this.id_sessio = id_sessio;
        this.data = data;
        this.hora = hora;                
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
    
    
}
