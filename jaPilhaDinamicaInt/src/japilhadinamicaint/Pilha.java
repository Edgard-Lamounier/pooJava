/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package japilhadinamicaint;

/**
 *
 * @author EDGARD LAMOUNIER 
 */
public class Pilha {
    private NohPilha topo;
    
    public Pilha() {
        topo = null; 
    }
    
    public void push(int insertItem) {
	if(topo == null) // Pilha vazia
            topo = new NohPilha(insertItem);
        else {
            NohPilha  next = new NohPilha(insertItem, topo);
            topo = next;
        }               
    }
    
    public int pop() {
	if(topo == null) {
		return 0;
	}    
    
        else {
		int tempData = topo.getData();
		NohPilha   tempNoh = topo;
		topo = topo.getNextNoh();
		tempNoh = null;
		return tempData;
        }
    }   

        
    public void print() {
	if(topo == null)
		System.out.println("Pilha Vazia");
        else {
                System.out.println("Status atual da Pilha:");
                NohPilha temp = topo;
          
                while(temp != null) {
                System.out.println(temp.getData());
			  temp = temp.getNextNoh();  
                } // fim do while 
        } // fim do else 
    } // fim do metodo print()
    
} // fim da classe Pilha
   

