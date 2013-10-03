package ubticket;

/**
 *
 * @author quispe
 */
public class Entrada {

    private Integer id_entrada;
    private Integer fila;
    private Integer seient;
    private double preu;
    
    
    // afegim l'objecte Sessio en cardinalitat 1
    private Sessio sessio;
    private Usuari user;
            
    /* atributos de la relacion compra */
    private double import_total;
    private Integer iva;
    
    
    public Entrada(){
        super();
    }
    
    public Entrada(Integer id_entrada, Integer fila, Integer seient, double preu, Integer iva, double import_total){
        super();
        this.id_entrada = id_entrada;
        this.fila = fila;
        this.seient = seient;
        this.preu = preu;
        this.import_total = import_total;
        this.iva = iva;
    }
    
    public Integer getIdEntrada(){
        return id_entrada;        
    }    
    public void setIdEntrada(Integer id_entrada){
        this.id_entrada = id_entrada;
    }
    
        
    public Integer getFila(){
        return this.fila;
    }
    public void setFila(Integer fila){
        this.fila = fila;
    }
    
    
    public Integer getSeient(){
        return this.seient;
    }
    public void setSeient(Integer seient){
        this.seient = seient;
    }
    
    
    public double getPreu(){
        return this.preu;
    }
    public void setPreu(double preu){
        this.preu = preu;
    }
    
    /* metodos de los atributos de la relacion compra*/
    public double getImportTotal() {
        return import_total;
    }

    public void setImportTotal(double import_total) {
        this.import_total = import_total;
    }

    

    public Integer getIva() {
        return iva;
    }

    public void setIva(Integer iva) {
        this.iva = iva;
    }
    
    
    
    
    //NOUS GETTERS I SETTERS
    
    public Sessio getSessio() {
        return sessio;
    }

    public void setSessio(Sessio sessio) {
        this.sessio = sessio;
    }

    public Usuari getUser() {
        return user;
    }

    public void setUser(Usuari user) {
        this.user = user;
    }
    
    
    
    
}
