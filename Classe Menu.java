package trabalho.aps;

import java.util.Scanner;
import java.io.*;

public class Menu {
    
    public static void Iniciar(){
        Scanner inputNum = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);
        Universidade sistema = new Universidade();
        String opcao = "0";
        sistema.setAlunos(Arquivo.LerAluno("src/arquivos/alunos.txt"));
        sistema.setCursos(Arquivo.LerCurso("src/arquivos/cursos.txt"));
        Arquivo.LerRendimento(sistema.getAlunos(), sistema.getCursos(),
                sistema.getRendimentos(),"src/arquivos/ALPOO_GRADUACAO_2018.txt");
        Arquivo.LerRendimento(sistema.getAlunos(), sistema.getCursos(),
                sistema.getRendimentos(),"src/arquivos/ALPOO_POS_GRADUACAO_2019.txt");
        Arquivo.LerRendimento(sistema.getAlunos(), sistema.getCursos(),
                sistema.getRendimentos(),"src/arquivos/LPOO_GRADUACAO_2019.txt");
        while (!opcao.equals("8")){
            System.out.println("");
            System.out.println("Escolha uma funcionalidade");
            System.out.println(" 1 - Listar todos os alunos.");
            System.out.println(" 2 - Listar todos os cursos.");
            System.out.println(" 3 - Listar o histórico de um determinado aluno.");
            System.out.println(" 4 - Listar o relatorio de rendimento de um curso.");
            System.out.println(" 5 - Cadastrar Curso.");
            System.out.println(" 6 - Cadastrar Aluno.");
            System.out.println(" 7 - Cadastrar Rendimento.");
            System.out.println(" 8 - Sair do sistema.");
            System.out.println("Digite a opção desejada: ");
            opcao = inputString.nextLine();
            
            switch (opcao) {
                case "1":
                    try{
                        sistema.ListarAlunos();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                case "2":
                    try {
                        sistema.ListarCursos();
                    } catch (Exception e){
                        System.out.println(e);
                    }
                    break;
                case "3":
                    try {
                        System.out.println(" ");
                        sistema.MostrarRendimentoAluno();
                    } catch (Exception e){
                        System.out.println("\nValor inserido invalido! Tente novamente.");
                    }
                    
                    break;
                case "4":
                    try {
                        sistema.MostrarAlunosDoCurso();
                    } catch (Exception e){
                        System.out.println("\nValor inserido invalido! Tente novamente.");
                    }
                    break;
                case "5":
                    try {
                        sistema.CadastrarCurso();
                    } catch (Exception e){
                        System.out.println("\nO ano inserido é invalido! Tente Novamente.");
                    }
                    break;
                case "6":
                    try {
                        sistema.CadastrarAluno();
                    } catch (Exception e){
                        System.out.println(e);
                    }
                    break;
                case "7":
                    try {
                        sistema.CadastrarRendimento();
                    } catch (Exception e){
                        System.out.println("\nO valor do indice de curso/"
                                + "aluno ou os valores das notas são"
                                + " invalidos! Tente Novamente");
                    }
                    break;
                case "8":
                    System.out.println("\nEncerrando o sistema...");
                    break;
                default:
                    System.out.println("\nOpção inválida! Tente novamente.");
                    break;
            }
        }
    } 
}