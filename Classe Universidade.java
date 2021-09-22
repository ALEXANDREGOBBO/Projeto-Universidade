package trabalho.aps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Universidade implements Sistema {
    
    private List<Rendimento> rendimentos = new ArrayList<Rendimento>();
    private List<Curso> cursos = new ArrayList<Curso>();
    private List<Aluno> alunos = new ArrayList<Aluno>(); 

    public List<Rendimento> getRendimentos() {
        return rendimentos;
    }

    public void setRendimentos(List<Rendimento> rendimentos) {
        this.rendimentos = rendimentos;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
    
    @Override
    public void CadastrarAluno(){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o RA:");
        String ra = input.nextLine();
        for (Aluno a: this.alunos){
            if (a.getRa().equals(ra)){
                System.out.println("RA ja cadastrado!");
                return;
            }
        }
        System.out.println("Digite o NOME:");
        String nome = input.nextLine();

        this.alunos.add(new Aluno(ra, nome));
        Arquivo.EscreverAluno(this.alunos, "src/arquivos/alunos.txt");
        System.out.println("\nAluno cadastrado com sucesso!\n");
    }
    
    @Override
    public void ListarAlunos(){
        System.out.println("\n--- Alunos Cadastrados: ---");
        for (Aluno a: this.alunos){
            System.out.println("RA: " + a.getRa() + ", Nome: " + a.getNome());
        }
        System.out.println("---------------------------");
    }
    
    @Override
    public void CadastrarCurso(){
        Scanner input = new Scanner(System.in);

        System.out.println("\nDigite o Nome do Curso:");
        String nome = input.nextLine();
        System.out.println("Escolha o Nivel:\n 1 - GRADUAÇÃO\n 2 - POS GRADUAÇÃO");
        String nivel = input.nextLine();
        System.out.println("Digite o Ano do que o Curso foi dado:");
        int ano = input.nextInt();

        if (nivel.equals("1")){
            nivel = "GRADUACAO";
        }
        else if (nivel.equals("2")){
            nivel = "POS_GRADUACAO";
        }
        else {
            System.out.println("\nOpção invalida, tente novamente!\n");
            return;
        }

        for (Curso c: this.cursos) {
            if (c.getNome().equals(nome) & c.getNivel().equals(nivel) & c.getAno() == ano){
                System.out.println("\nCurso ja cadastrado!\n");
                return;
            }
        }

        this.cursos.add(new Curso(nome.toUpperCase(), nivel, ano));
        Arquivo.EscreverCurso(this.cursos, "src/arquivos/cursos.txt");
        System.out.println("\nCurso cadastrado com sucesso!\n");
    }
    
    @Override
    public void ListarCursos(){
        System.out.println("\n--- Cursos Cadastrados: ---");
        for (Curso c: this.cursos){
            System.out.println("Nome: " + c.getNome() +
                    ", Nivel: " + c.getNivel() + 
                    ", Ano: " + c.getAno());
        }
        System.out.println("---------------------------");
    }
    
    @Override
    public void CadastrarRendimento(){
        Scanner input = new Scanner(System.in);
        int i = 1;
        int j = 1;
        
        System.out.println("\nCurso cadastrados: ");
        for (Curso c: this.cursos){
            System.out.println(i + " - Nome: " + c.getNome() + 
            " Nivel: " + c.getNivel() + " Ano: " + c.getAno());
            i++;
        }
        System.out.println("Escolha um curso da cadastrado pra começar: ");
        int opcaoCurso = input.nextInt();
        Curso curso = this.cursos.get(opcaoCurso-1);

        System.out.println("\nAlunos cadastrados: ");
        for (Aluno aluno: this.alunos){
            System.out.println(j + " - RA: " + aluno.getRa() +
            " Nome: " + aluno.getNome());
            j++;
        }
        System.out.println("Agora escolha um Aluno: ");
        int opcaoAluno = input.nextInt();
        Aluno aluno = this.alunos.get(opcaoAluno-1);

        System.out.println("\nDigite a nota da NP1:");
        double np1 = input.nextDouble();
        System.out.println("Digite a nota da NP2:");
        double np2 = input.nextDouble();
        System.out.println("Digite a nota da SUB:");
        double sub = input.nextDouble();
        System.out.println("Digite a nota do EXAME:");
        double exam = input.nextDouble();

        rendimentos.add(new Rendimento(aluno, curso, new Notas(np1, np2, sub, exam)));
        Arquivo.EscreverRendimento(curso, this.rendimentos,"src/arquivos/" +
        curso.getNome() + "_" + curso.getNivel() + "_" + curso.getAno() + ".txt");
        System.out.println("\nRendimento cadastrado com sucesso!");
    }
    
    @Override
    public void MostrarRendimentoAluno(){
        Scanner input = new Scanner(System.in);
        int i = 1;
        int j = 1;
        
        System.out.println("Alunos cadastrados:");
        for (Aluno aluno: this.alunos){
            System.out.println(i + " - RA: " + aluno.getRa() +
            ", Nome: " + aluno.getNome());
            i++;
        }
        System.out.println("Escolha um Aluno:");
        int index = input.nextInt();
        Aluno aluno = this.alunos.get(index - 1);

        System.out.println("\nCursos e notas do Aluno: ");
        for (Rendimento rend: this.rendimentos){
            if (rend.getAluno().getRa().equals(aluno.getRa())){
                System.out.println(j + "º Rendimento: ");
                System.out.println(rend);
                System.out.println(" ");
                j++;
            }
        }
    }
    
    @Override
    public void MostrarAlunosDoCurso(){
        Scanner input = new Scanner(System.in);       
        int i = 1;
        
        System.out.println("\nCursos cadastrados:");
        for (Curso c: this.cursos){
            System.out.println(i + " - Nome: " + c.getNome() +
            ", Nivel: " + c.getNivel() + ", Ano: " + c.getAno());
            i++;
        }
        System.out.println("Escolha um Curso (Exemplo: 1):");
        int index = input.nextInt();        
        Curso curso = this.cursos.get(index - 1);

        System.out.println("\nTodos os alunos matriculados no Curso escolhido: ");
        for (Rendimento rend: this.rendimentos){
            if (rend.getCurso().getNome().equals(curso.getNome()) &
                rend.getCurso().getNivel().equals(curso.getNivel()) &
                rend.getCurso().getAno() == curso.getAno()){
                System.out.println("RA: " + rend.getAluno().getRa()+ ", Nome: " + rend.getAluno().getNome());
            }
        }
    }
}