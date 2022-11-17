//classe principal dos exercicios de Métodos

public class main {

    public static void main(String[] args) {

        // calculadora
        System.out.println("Executar calculadora");
        Calculadora.soma(5, 8);
        Calculadora.subtração(10, 8);
        Calculadora.divisao(10, 2);
        Calculadora.multiplicação(5, 3);

        // Mensagem
        System.out.println("Exercicio Mensagem");
        Mensagem.obterMensagem(8);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(23);

        // Emprestimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000, 2);
        Emprestimo.calcular(1000, 3);
        Emprestimo.calcular(1000, 5);

    }
}
