package trabalho.aps;

import java.util.Arrays;

public class Rendimento {
    private Aluno aluno;
    private Curso curso;
    private Notas notas;
    private Nota media;
    private boolean aprovado = false;

    public Rendimento(Aluno aluno, Curso curso, Notas notas) {
        this.aluno = aluno;
        this.curso = curso;
        this.notas = notas;
        this.CalcularMedia();
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Notas getNotas() {
        return notas;
    }

    public void setNotas(Notas notas) {
        this.notas = notas;
    }

    public double getMedia() {
        return media.getValor();
    }

    public void setMedia(double media) {
        this.media = new Nota(media);
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
    
    public final void CalcularMedia(){
        double[] valores = {this.notas.getNp1().getValor(),
                            this.notas.getNp2().getValor(),
                            this.notas.getSub().getValor()};
        Arrays.sort(valores);
        this.setMedia((valores[1] + valores[2])/2);
        
        if (this.curso.getNivel().equals("GRADUACAO")){
            if (this.getMedia() < 7){
                this.setMedia((this.getMedia() + this.notas.getExam().getValor())/2);
                if (this.getMedia() >= 5){
                    this.setAprovado(true);
                }
            }
            else {
                this.setAprovado(true);
            }
        }
        else if (this.curso.getNivel().equals("POS_GRADUACAO")){
            if (this.getMedia() < 5){
                this.setMedia((this.getMedia() + this.notas.getExam().getValor())/2);
                if (this.getMedia() >= 5){
                    this.setMedia(5);
                    this.setAprovado(true);
                }
            }
            else {
                this.setAprovado(true);
            }
        }
    }

    @Override
    public String toString() {
        String res = "";
        res += " --- Aluno: ---\n";
        res += this.aluno.toString();
        res += " --- Curso: ---\n";
        res += this.curso.toString();
        res += " --- Notas: ---\n";
        res += this.notas.toString();
        res += "Media: " + this.getMedia() + "\n";
        res += " --- Situação ---\n";
        res += "Aprovado: " + this.isAprovado();
        return  res;
    }

}
