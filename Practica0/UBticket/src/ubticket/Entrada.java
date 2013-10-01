/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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
    
    public Entrada(){
        super();
    }
    
    public Entrada(Integer id_entrada, Integer fila, Integer seient, double preu){
        super();
        this.id_entrada = id_entrada;
        this.fila = fila;
        this.seient = seient;
        this.preu = preu;
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
    
    
    
    
    
}
