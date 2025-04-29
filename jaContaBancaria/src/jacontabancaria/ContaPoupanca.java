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
public class ContaPoupanca extends ContaBancaria {
    // ATRIBUTOS
    
    private float taxa_de_rendimento;
   
    // METODOS

    public ContaPoupanca(float taxa_de_rendimento) {
        this.taxa_de_rendimento = taxa_de_rendimento;
    }

    public ContaPoupanca(float taxa_de_rendimento, String cliente, 
                                                 int num_conta, float saldo) {
        super(cliente, num_conta, saldo);
        this.taxa_de_rendimento = taxa_de_rendimento;
    }
    
    
} // fim da classe ContaPoupanca
