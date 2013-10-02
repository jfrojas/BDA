package ubticket;

import java.util.Set;

/**
 *
 * @author quispe
 */
public class Categoria {
    private Integer id_categoria;
    private String nom;
    
    //afegim l'objecte Espectacle amb cardinalitat N
    private Set<Espectacle> espectacles;

    
    public Categoria(){
        super();
    }
    
    public Categoria(Integer id_categoria, String nom){
        super();
        this.id_categoria = id_categoria;
        this.nom = nom;
    }
    
    public Integer getIdCategoria(){
        return this.id_categoria;
    }
    public void setIdCategoria(Integer id_categoria){
        this.id_categoria = id_categoria;
    }
    
        
    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    
    //NOUS GETTERS I SETTERS
    public Set<Espectacle> getEspectacles() {
        return espectacles;
    }
    public void setEspectacles(Set<Espectacle> espectacles) {
        this.espectacles = espectacles;
    }

    public boolean setEspectacle(Espectacle esp) {
        return espectacles.add(esp);
        
    }
}