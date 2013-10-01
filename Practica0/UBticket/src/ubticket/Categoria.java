package ubticket;

/**
 *
 * @author quispe
 */
public class Categoria {
    private Integer id_categoria;
    private String nom;
    
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
    
}