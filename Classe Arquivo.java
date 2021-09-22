package trabalho.aps;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Arquivo {
    
    public static void EscreverRendimento(Curso curso,
    List<Rendimento> rendimentos, String caminho){
        try (PrintWriter gravarArq = new PrintWriter(new FileWriter(caminho));) {
            for (Rendimento rend: rendimentos){
                if (
                        rend.getCurso().getNome().equals(curso.getNome())
                        & rend.getCurso().getNivel().equals(curso.getNivel())
                        & rend.getCurso().getAno() == curso.getAno()
                ) {
                    gravarArq.println(rend.getAluno().getRa() + ";" +
                    rend.getNotas().getNp1().getValor() + ";" + 
                    rend.getNotas().getNp2().getValor() + ";" + 
                    rend.getNotas().getSub().getValor() + ";" + 
                    rend.getNotas().getExam().getValor());
                }
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void LerRendimento(List<Aluno> alunos, List<Curso> cursos,
    List<Rendimento> rendimentos, String caminho){
        try (BufferedReader lerArq = new BufferedReader(new FileReader(caminho));) {
            List<String> palavrasChaves = new ArrayList<String>();
            String[] palavrasCaminho = caminho.split("_");
            if (palavrasCaminho.length < 4){
                palavrasChaves.add(palavrasCaminho[0].substring(13));
                palavrasChaves.add(palavrasCaminho[1]);
                palavrasChaves.add(palavrasCaminho[2].substring(0, 4));
            }
            else{
                palavrasChaves.add(palavrasCaminho[0].substring(13));
                palavrasChaves.add(palavrasCaminho[1] + "_" + palavrasCaminho[2]);
                palavrasChaves.add(palavrasCaminho[3].substring(0, 4));
            }
            Aluno aluno = null;
            Curso curso = null;
            String linha = lerArq.readLine();
            while (linha != null){
                String[] palavras = linha.split(";");
                for (Aluno a: alunos) {
                    if (palavras[0].equals(a.getRa())) {
                        aluno = a;
                    }
                }
                for (Curso c: cursos){
                    if (
                        palavrasChaves.get(0).equals(c.getNome()) &
                        palavrasChaves.get(1).equals(c.getNivel()) &
                        Integer.parseInt(palavrasChaves.get(2)) == c.getAno()
                    )
                    {
                        curso = c;
                    }
                }
                rendimentos.add(new Rendimento(aluno, curso, new Notas(
                        Double.parseDouble(palavras[1]),
                        Double.parseDouble(palavras[2]),
                        Double.parseDouble(palavras[3]),
                        Double.parseDouble(palavras[4]))));
                linha = lerArq.readLine();
            }
        }
        catch (IOException e) {
            System.out.println("\n----- AVISO DE ATENÇÃO -----\n"
            + "Um ou mais arquivos CSV de rendimento inicial e essencial\n"
            + "não foi encontrado e o programa não vai funcionar corretamente sem ele."
            + "\nIsso pode ter acontecido pois você mexeu e alterou os arquivos."
            + "\nPor favor desfaça a alteração e não mude/remova nenhum outro\n"
            + "arquivo novamente. Att: Equipe da APS.");
        }
    }
    
    public static List<Aluno> LerAluno (String caminho) {
        List<Aluno> alunos = new ArrayList<Aluno>();
        try (BufferedReader lerArq = new BufferedReader(new FileReader(caminho));) {
            String linha = lerArq.readLine();
            while (linha != null){
                String[] palavras = linha.split(";");
//                for (String p: palavras){
//                    System.out.println("- " + p);
//                }
                String ra = palavras[0];
                String nome = palavras[1];
                alunos.add(new Aluno(ra, nome));
                linha = lerArq.readLine();
            }
        }
        catch (IOException e) {
            System.out.println("\n----- AVISO DE ATENÇÃO -----\n"
            + "O arquivo CSV de alunos iniciail e essencial\n"
            + "não foi encontrado e o programa não vai funcionar corretamente sem ele."
            + "\nIsso pode ter acontecido pois você mexeu e alterou os arquivos."
            + "\nPor favor desfaça a alteração e não mude/remova nenhum outro\n"
            + "arquivo novamente. Att: Equipe da APS.");
        }
        return alunos;
    }
    
    public static void EscreverAluno(List<Aluno> alunos, String caminho){
        try (PrintWriter gravarArq = new PrintWriter(new FileWriter(caminho));) {
            for (Aluno aluno: alunos){
                gravarArq.println(aluno.getRa() + ";" + aluno.getNome());
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
    public static List<Curso> LerCurso (String caminho) {
        List<Curso> cursos = new ArrayList<Curso>();
        try (BufferedReader lerArq = new BufferedReader(new FileReader(caminho));) {
            String linha = lerArq.readLine();
            while (linha != null){
                String[] palavras = linha.split(";");
                String nome = palavras[0];
                String nivel = palavras[1];
                int ano = Integer.parseInt(palavras[2]);
                cursos.add(new Curso(nome, nivel, ano));
                linha = lerArq.readLine();
            }
        }
        catch (IOException e) {
            System.out.println("\n----- AVISO DE ATENÇÃO -----\n"
            + "O arquivo CSV de cursos iniciail e essencial\n"
            + "não foi encontrado e o programa não vai funcionar corretamente sem ele."
            + "\nIsso pode ter acontecido pois você mexeu e alterou os arquivos."
            + "\nPor favor desfaça a alteração e não mude/remova nenhum outro\n"
            + "arquivo novamente. Att: Equipe da APS.");
        }
        return cursos;
    }
    
    public static void EscreverCurso(List<Curso> cursos, String caminho){
        try (PrintWriter gravarArq = new PrintWriter(new FileWriter(caminho));) {
            for (Curso curso: cursos){
                gravarArq.println(curso.getNome() +
                ";"+curso.getNivel() +
                ";" + curso.getAno());
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
}