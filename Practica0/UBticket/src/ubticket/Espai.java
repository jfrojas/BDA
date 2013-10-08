package ubticket;

import java.util.Set;

/**
 *
 * @author quispe, jrojas
 */
public class Espai {
    
    private Integer id_espai;
    private String nom;
    private String dades_contacte;
    private String ubicacio;
    
    //afegim l'objecte Organitzacio amb cardinalitat N
    private Set<Organitzacio> organitzacions;

    
    public Espai(){
        super();
    }
    
    public Espai(Integer id_espai, String nom, String dades_contacte, String ubicacio){
        super();
        this.id_espai = id_espai;
        this.nom = nom;
        this.dades_contacte = dades_contacte;
        this.ubicacio = ubicacio;
    }
    
    public Integer getIdEspai(){
        return id_espai;        
    }    
    public void setIdEspai(Integer id_espai){
        this.id_espai = id_espai;
    }
    
        
    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    
    
    public String getDadesContacte(){
        return this.dades_contacte;
    }
    public void setDadesContacte(String dades_contacte){
        this.dades_contacte = dades_contacte;
    }
    
    
    public String getUbicacio(){
        return this.ubicacio;
    }
    public void setUbicacio(String ubicacio){
        this.ubicacio = ubicacio;
    }
    
    
    //NOUS GETTERS I SETTERS
    public Set<Organitzacio> getOrganitzacions() {
        return organitzacions;
    }
    public void setOrganitzacions(Set<Organitzacio> organitzacions) {
        this.organitzacions = organitzacions;
    }

    
}
