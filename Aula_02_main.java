public class Main
{
    public static void main(String[] args) {
    //Declaração das variaveis:
    
    String nome = "Maria";
    int idade = 31;
    double renda = 4000.0;
    
    //saida utilizando marcadores
    //%f =  ponto flutuante
    //%d = inteiro
    //%s = texto
    //%n = quebra de linha
    
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
    }
}
