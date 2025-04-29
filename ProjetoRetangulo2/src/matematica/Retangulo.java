/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematica;

/**
 *
 * @author sdc-daniel
 */
public class Retangulo {
    // Atributos da Classe
    private double largura;
    private double comprimento;
    
    
    
    //Métodos da Classe
    // Primeiro Construtor;
    public Retangulo(){
        largura = 10.10;
        comprimento = 99.99;
    }
    
    // Segundo Construtor;
    public Retangulo(double a, double b){
        largura = a;
        comprimento = b;
    }
    
    
    public double getLargura(){
        return largura;
    }
    
    public void setLargura(double largura){
        this.largura = largura;
    }
    
    public double getComprimento(){
        return comprimento;
    }
    
    public void setComprimento(double comprimento){
        this.comprimento = comprimento;
    }
    
    public double obterArea(){
        return largura*comprimento;
    }
}
