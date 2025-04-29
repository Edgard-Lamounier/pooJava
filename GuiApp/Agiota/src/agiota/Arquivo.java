package agiota;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Arquivo {

    private FileReader in = null;
    private FileWriter out = null;
    private ArrayList<ContaCliente> contas;
    private ContaCliente contaAtual;

    public ArrayList<ContaCliente> getContas() {
        return contas;
    }

    public void setContas(ArrayList<ContaCliente> contas) {
        this.contas = contas;
    }

    public ContaCliente getContaAtual() {
        return contaAtual;
    }

    public void setContaAtual(ContaCliente contaAtual) {
        this.contaAtual = contaAtual;
    }

    public void abrirArquivoGravar() {
        try {
            out = new FileWriter("D:\\dados.txt", true);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void abrirArquivoAtualizar() {
        try {
            out = new FileWriter("D:\\dados.txt", false);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void abrirArquivoLer() {
        try {
            in = new FileReader("D:\\dados.txt");

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Arquivo.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    void fecharArquivo() {
        try {
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void adicionaRegistro(ContaCliente cliente) {
        abrirArquivoGravar();
        gravaRegistro(cliente);
        fecharArquivo();
    }

    public void gravaRegistro(ContaCliente cliente) {

        try {
            out.write(cliente.getNome() + ";" + cliente.getSobrenome() + ";" + cliente.getCpf() + ";" + cliente.getConta() + ";" + cliente.getSaldo());
            out.write(System.lineSeparator());

        } catch (IOException ex) {
            Logger.getLogger(Arquivo.class
                    .getName()).log(Level.SEVERE, null, ex);
        } 
    }

    public ArrayList<ContaCliente> lerTodos() {
        ArrayList<ContaCliente> listaClientes = new ArrayList<ContaCliente>();
        ContaCliente c = new ContaCliente();
        abrirArquivoLer();
        int car, cont = 0;
        StringBuffer elemento = new StringBuffer();
        try {
            while ((car = in.read()) != -1) {
                switch (car) {
                    case 10:
                        break;
                    case 13:
                        c.setSaldo(Double.parseDouble(elemento.toString()));
                        cont = 0;
                        elemento.delete(0, elemento.length());
                        listaClientes.add(new ContaCliente(c.getNome(), c.getSobrenome(), c.getCpf(), c.getConta(), c.getSaldo()));
                        break;
                    case 59:
                        cont++;
                        switch (cont) {
                            case 1:
                                c.setNome(elemento.toString());
                                elemento.delete(0, elemento.length());
                                break;
                            case 2:
                                c.setSobrenome(elemento.toString());
                                elemento.delete(0, elemento.length());
                                break;
                            case 3:
                                c.setCpf(elemento.toString());
                                elemento.delete(0, elemento.length());
                                break;
                            case 4:
                                c.setConta(Integer.parseInt(elemento.toString()));
                                elemento.delete(0, elemento.length());
                                break;
                        }
                        break;
                    default:
                        elemento.append((char) car);
                        break;
                }

            }//fim while
        } catch (IOException ex) {
            Logger.getLogger(Arquivo.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return listaClientes;
    }

    public ContaCliente buscaConta(int conta) {
        ArrayList<ContaCliente> contas = lerTodos();
        for (ContaCliente conta1 : contas) {
            if (conta1.getConta() == conta) {
                return conta1;
            }
        }
        return null;
    }

    public void carregaArquivo() {
        ArrayList<ContaCliente> listaClientes = new ArrayList<ContaCliente>();
        ContaCliente c = new ContaCliente();
        abrirArquivoLer();
        int car, cont = 0;
        StringBuffer elemento = new StringBuffer();
        try {
            while ((car = in.read()) != -1) {
                switch (car) {
                    case 10:
                        break;
                    case 13:
                        c.setSaldo(Double.parseDouble(elemento.toString()));
                        cont = 0;
                        elemento.delete(0, elemento.length());
                        listaClientes.add(new ContaCliente(c.getNome(), c.getSobrenome(), c.getCpf(), c.getConta(), c.getSaldo()));
                        break;
                    case 59:
                        cont++;
                        switch (cont) {
                            case 1:
                                c.setNome(elemento.toString());
                                elemento.delete(0, elemento.length());
                                break;
                            case 2:
                                c.setSobrenome(elemento.toString());
                                elemento.delete(0, elemento.length());
                                break;
                            case 3:
                                c.setCpf(elemento.toString());
                                elemento.delete(0, elemento.length());
                                break;
                            case 4:
                                c.setConta(Integer.parseInt(elemento.toString()));
                                elemento.delete(0, elemento.length());
                                break;
                        }
                        break;
                    default:
                        elemento.append((char) car);
                        break;
                }

            }//fim while
        } catch (IOException ex) {
            Logger.getLogger(Arquivo.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        contas = listaClientes;
    }

    public void sincronizaArquivo() {
        abrirArquivoAtualizar();
        for (ContaCliente conta1 : contas) {
            gravaRegistro(conta1);
        }
        fecharArquivo();
    }

    public void carregaConta(int conta) {
        contas = lerTodos();
        contaAtual = null;
        for (ContaCliente conta1 : contas) {
            if (conta1.getConta() == conta) {
                contaAtual = conta1;
            }
        }
    }
}
