/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jalivrodenotas;

/**
 *
 * @author Edgard Lamounier
 */
public class LivroDeNotas {
    
    private String   nome_curso;
    private int[ ]   notas = new int[8];
    
    public LivroDeNotas() 
    {
        nome_curso = " ";
        for(int i =0; i < 8; i++)
            notas[ i ] = 0;
    }
    
    public LivroDeNotas(String  nome, int[ ] copiaNotas) 
    {
        nome_curso = nome;
        notas = copiaNotas;
        
    }
    
   public int getNotaMinima()
   { 
      int menor = notas[0];
    
        for (int i = 0; i < notas.length; i++) {
            
            if (notas[ i ] < menor) {
                menor = notas[ i ];            
            }
        }
      return menor;
   } // fim do metodo getNotaMinima()
   
   public int getNotaMaxima()
   { 
      int maior = notas[0];
    
        for (int i = 0; i < notas.length; i++) {
            
            if (notas[ i ] > maior) {
                maior = notas[ i ];            
            }
        }
      return maior;
   } // fim do metodo getNotaMaxima()
   
   public double getMediaNotas()
   { 
       int totalNotas = 0;
       double media;
    
       for( int i = 0; i < notas.length; i++ )
            totalNotas += notas[ i ]; 
       
       media = (double) totalNotas/notas.length;
       
       return(media); 
        
   } // fim do metodo getMediaNotas()


    public String getNome_curso() {
        return nome_curso;
    }

    public void setNome_curso(String nome_curso) {
        this.nome_curso = nome_curso;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }
    
} // fim da classe LivroDeNotas
