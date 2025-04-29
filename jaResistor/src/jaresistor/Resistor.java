/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jaresistor;

/**
 *
 * @author Edgard Lamounier
 * @date 28/03/2012 com meus queridos alunos de POO
 */
public class Resistor {
  // Atributos da classe
  private double resistencia;
  private double potencia;
  
  // Métodos da classe
  public Resistor() {
      resistencia = 0.0;
      potencia = 0.0;
  }
  
  public Resistor(double r, double p) {
      resistencia = r;
      potencia = p; 
  }
          
  public double getResistencia() {
      return resistencia;
  }
    
  public double getPotencia() {
      return potencia;
  }
  
  public void setResistencia(double r) {
      resistencia = r;
  }
  
  public Resistor somaSerie(Resistor r) {
      Resistor  temp = new Resistor();
      
      temp.resistencia = resistencia + r.resistencia;
      
      if (potencia >= r.potencia)
         temp.potencia = potencia;
      else 
          temp.potencia = r.potencia;
      
      return temp;
  }
  
  public Resistor somaParalelo(Resistor r) {
      Resistor  temp = new Resistor();
      
      temp.resistencia = (resistencia * r.resistencia)/(resistencia + r.resistencia);
      
      if (potencia >= r.potencia)
         temp.potencia = potencia;
      else 
          temp.potencia = r.potencia;
      
      return temp;
  }
          
}
