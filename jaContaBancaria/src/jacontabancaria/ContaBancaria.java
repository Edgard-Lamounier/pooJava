/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jacontabancaria;

/**
 *
 * @author EDGARD LAMOUNIER 
 */
public class ContaBancaria {
// ATRIBUTOS    
    protected String cliente;
    protected int num_conta;
    protected float saldo; 

// MÉTODOS
    public ContaBancaria() {
        this.cliente = " ";
        this.num_conta = 0;
        this.saldo = (float) 0.0;
    }
    public ContaBancaria(String cliente, int num_conta, float saldo) {
        this.cliente = cliente;
        this.num_conta = num_conta;
        this.saldo = saldo;
    }
    
    public void depositar(float deposito) {
        this.saldo = this.saldo + deposito;
    }
    
    public void sacar(float saque) {
        float saldo_final;
        
        saldo_final = saldo - saque;
        
        if(saldo_final < 0)
            System.out.println("Saque indeferido: saldo final negatito");
        else
            saldo = saldo - saque;
    }
    
    
            
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNum_conta() {
        return num_conta;
    }

    public void setNum_conta(int num_conta) {
        this.num_conta = num_conta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
} // fim da classe ContaBancaria
