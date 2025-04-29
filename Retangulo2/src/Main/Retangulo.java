/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;


/**
 *
 * @author EDGARD
 */
public class Retangulo {
    
    //Atributos
     private int base;
     private int altura;
     
     //Definicao do Construtor com parâmetros:
    //Usado para criar objetos da classe
    Retangulo(int b, int a){ //Construtor de aridade(numero de argumentos) 2
        base = b;
        altura = a;
    }

    Retangulo() { // Construtor de aridade 0 ou nula - Construtor default
        base = 10;
        altura = 20;
    }
    
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }   
    
    //Metodo que retorna area
    public int area(){
        return (base*altura);
    }
    
    //Metodo que retorna o perimetro
    public int perimetro(){
        return (2*(base+altura));
    }
    
} // fim da classe Retangulo

