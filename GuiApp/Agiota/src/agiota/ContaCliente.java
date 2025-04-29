package agiota;

public class ContaCliente {

    private String nome;
    private String sobrenome;
    private String cpf;
    private int conta;
    private Double saldo;

    public ContaCliente(String nome, String sobrenome, String cpf, int conta, Double saldo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.conta = conta;
        this.saldo = saldo;
    }

    public ContaCliente() {
    }
    
    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getConta() {
        return conta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void imprime() {
        System.out.println("CPF:"+cpf);
        System.out.println("Nome:"+nome);
        System.out.println("Sobrenome:"+sobrenome);
        System.out.println("Conta:"+conta);
        System.out.println("Saldo:"+saldo);
        
        
    }
}
