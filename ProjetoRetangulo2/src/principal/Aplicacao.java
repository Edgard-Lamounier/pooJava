/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import javax.swing.JOptionPane;
import matematica.Retangulo;

/**
 *
 * @author sdc-daniel
 */
public class Aplicacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//         São três conjuntos de códigos distintos, tire o comentário de cada conjunto por
//         vez, para perceber as particularidades de cada um.
//         Não se esqueçam de a partir do segundo e terceiro conjunto de código, observar
//         Os métodos da classe Retângulo e como as chamadas estão sendo realizadas.

//// Primeira sequencia de Código
//        // Realizando teste do sistema {Via CONSOLE, Via DIALOGBOX}
//        System.out.println("Hello world!!!"); // Via Console
//        JOptionPane.showMessageDialog(null, "Hello world!!!"); // Via DialogBox
        
//// Segunda sequencia de Código: Criar a Classe "Retangulo" sem CONSTRUTORES
//// Rodar o programa utilizando apenas métodos get and set, para atualizar os valores dos atributos
//        //Criando o objeto Retangulo;
//        Retangulo ret1;
//        // Instanciando o objeto
//        ret1 =  new Retangulo();
//
//        //Criando as variaveis locais
//        String slarg, scompr;
//        Double larg, compr;
//        
//        // Lendo os valores do teclado - Via DialogBox
//        slarg = JOptionPane.showInputDialog("Digite a largura do Retangulo:");
//        scompr = JOptionPane.showInputDialog("Digite o comprimento do Retangulo:");
//        
//        //Convertendo de String para Double
//        larg = Double.parseDouble(slarg);
//        compr = Double.parseDouble(scompr);
//        
//        //Atualizando os Valores dos Atributos da Classe Retangulo;
//        ret1.setLargura(larg); //Atualizando a largura do objeto ret1
//        ret1.setComprimento(compr); // Atualizando o comprimento do objeto ret1
//        
//        //Cálculando a área e exibindo os resultados - Via DialogBox
//        //Chamando o método obterArea do objeto ret1 para retornar o valor
//        JOptionPane.showMessageDialog(null, "A area do retangulo e :"+ret1.obterArea());

// Terceira sequencia de Código: Classe "Retangulo" com CONSTRUTORES
// Rodar sem utilização dos métodos get and set. Serão atribuidos valores automaticamente;
// O primeiro CONSTRUTOR(sem passagem de valores como atributos). 
//      Eles serão diretamente definidos via hard-code dentro do CONSTRUTOR
//// No Segundo CONSTRUTOR os valores serão passados como parâmetros
//        //Criando o objeto Retangulo;
//        Retangulo ret1 =  new Retangulo(); // Chamando o primeiro CONSTRUTOR
//        Retangulo ret2 =  new Retangulo(10.55,15.11); // Chamando o segundo CONSTRUTOR
//        
//        //Cálculando a área e exibindo os resultados - Via DialogBox
//        //Chamando o método obterArea do objeto ret1 para retornar o valor
//        JOptionPane.showMessageDialog(null, "A area do objeto retangulo(ret1) e :"+ret1.obterArea());  
//        //Chamando o método obterArea do objeto ret2 para retornar o valor
//        JOptionPane.showMessageDialog(null, "A area do objeto retangulo(ret2) e :"+ret2.obterArea());    
        
    }
    
}
