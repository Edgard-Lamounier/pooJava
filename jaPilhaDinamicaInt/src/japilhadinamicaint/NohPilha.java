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
public class NohPilha {
    private int		  data;
    private NohPilha       nextNoh;
    
    public NohPilha() {
	data = 0;
	nextNoh = null;
}
    
    public NohPilha(int   valor) {
	data = valor;
	nextNoh = null;
}
    
    public NohPilha(int  valor, NohPilha  next) {
	data = valor;
	nextNoh = next;
}

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public NohPilha getNextNoh() {
        return nextNoh;
    }

    public void setNextNoh(NohPilha nextNoh) {
        this.nextNoh = nextNoh;
    }
    
}
