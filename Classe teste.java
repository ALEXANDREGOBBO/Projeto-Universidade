package trabalho.aps;

public class Teste {
    
    public static void main(String[] args) {

        //VERSÃO 01 = com 10 e 0 inteiro
        Nota nota1 = new Nota(8);
        System.out.println("Teste1");
        System.out.println(nota1.getValor()); //Valor esperado 8, valor recebido 8
        System.out.println("Teste2");
        Nota nota2 = new Nota(100);
        System.out.println(nota2.getValor()); //valor esperado 10, valor recebido 10
        System.out.println("Teste3");
        Nota nota3 = new Nota(-13);
        System.out.println(nota3.getValor()); //valor esperado 0, valor recebido 0
    }

}
