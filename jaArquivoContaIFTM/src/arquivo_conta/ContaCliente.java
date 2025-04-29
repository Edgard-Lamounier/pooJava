/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arquivo_conta;

/**
 *
 * @author EDGARD LAMOUNIER
 */
public class ContaCliente {
    // atributos
    private String          cpf;
    private int             numero_conta;
    private String          primeiro_nome;
    private String          segundo_nome;
    private double          saldo;

    // metodos
    ContaCliente()
    {
        cpf = "";
        numero_conta = 0;
        primeiro_nome = "";
        segundo_nome = "";
        saldo = 0.0;
    }
    
    ContaCliente(String  _cpf, int _numero_conta, String  _primeiro_nome,
                 String  _segundo_nome, double  _saldo)
    {
        cpf = _cpf;
        numero_conta = _numero_conta;
        primeiro_nome = _primeiro_nome;
        segundo_nome = _segundo_nome;
        saldo = _saldo;
    }
    
    String          getCPF() 
    {
       return cpf;
    }
    
    void            setCPF(String  newCPF)
    {
        cpf = newCPF; 
    }
    
    
    public int getNumero_conta() {
        return numero_conta;
    }

    public void setNumero_conta(int numero_conta) {
        this.numero_conta = numero_conta;
    }

    public String getPrimeiro_nome() {
        return primeiro_nome;
    }

    public void setPrimeiro_nome(String primeiro_nome) {
        this.primeiro_nome = primeiro_nome;
    }

    public String getSegundo_nome() {
        return segundo_nome;
    }

    public void setSegundo_nome(String segundo_nome) {
        this.segundo_nome = segundo_nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    void imprime()
    {
        System.out.println(cpf + " " + numero_conta + " " + primeiro_nome +
                            " " + segundo_nome + " " + saldo);
    }
    
} // fim da classe ContaCliente
