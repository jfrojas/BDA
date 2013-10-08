package ubticket;

import java.util.Set;

/**
 *
 * @author quispe, jrojas
 */
public class Usuari {
    
    private String dni;
    private String nom;
    private String direccio;
    private String municipi;
        
    private String provincia;
    private String telefon;
    
    
    private String data_alta;
    private String data_darrera_compra;
    
    //afegim l'objecte Entrada amb cardinalitat N
    private Set<Entrada> entrades;
    
    public Usuari(){
        super();
    }
    
    public Usuari(String dni, String nom, String direccio, String municipi, String provincia, String telefon, String data_alta, String data_darrera_compra){
        super();
        
        this.dni = dni;
        this.nom = nom;
        this.direccio = direccio;
        this.municipi = municipi;
        
        this.provincia = provincia;
        this.telefon = telefon;    
        this.data_alta = data_alta;
        this.data_darrera_compra = data_darrera_compra;
    }
    
    public String getDni(){
        return dni;        
    }    
    public void setDni(String dni){
        this.dni = dni;
    }
    
        
    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    
    
    public String getDireccio(){
        return this.direccio;
    }
    public void setDireccio(String direccio){
        this.direccio = direccio;
    }
    
    
    public String getMunicipi(){
        return this.municipi;
    }
    public void setMunicipi(String municipi){
        this.municipi = municipi;
    }
    
    
    public String getProvincia(){
        return this.provincia;        
    }    
    public void setProvincia(String provincia){
        this.provincia = provincia;
    }
    
        
    public String getTelefon(){
        return this.telefon;
    }
    public void setTelefon(String telefon){
        this.telefon = telefon;
    }
    
    public String getDataAlta(){
        return this.data_alta;
    }
    public void setDataAlta(String data_alta){
        this.data_alta = data_alta;
    }
    
    
    public String getDataDarreraCompra(){
        return this.data_darrera_compra;
    }
    public void setDataDarreraCompra(String data_darrera_compra){
        this.data_darrera_compra = data_darrera_compra;
    }
    
    //NOUS GETTERS I SETTERS
    
    public Set<Entrada> getEntrades() {
        return entrades;
    }

    public void setEntrades(Set<Entrada> entrades) {
        this.entrades = entrades;
    }
}
