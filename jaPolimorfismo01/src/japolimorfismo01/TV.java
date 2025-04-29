/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package japolimorfismo01;

/**
 *
 * @author Edgard Edgard
 */
public class TV {
    private String marca;
    private String modelo;
    private int tamanho;
    private int canal;
    private int volume;
    private boolean ligada;
    
    public TV(String marca, String modelo, int tamanho) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanho = tamanho;
        this.canal = 1;
        this.volume = 0;
        this.ligada = false;
   }
    
    
    @Override
    public String toString() {
        return "TV" +
               "\nMarca: " + this.marca +
               "\nModelo: " + this.modelo +
               "\nTamanho: " + this.tamanho;
}
    
    
}
