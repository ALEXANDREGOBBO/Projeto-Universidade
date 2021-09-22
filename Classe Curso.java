package trabalho.aps;

public class Curso {
    private String nome, nivel;
    private int ano;

    public Curso(String nome, String nivel, int ano) {
        this.nome = nome;
        this.nivel = nivel;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        String res = "";
        res += "Nome: " + this.nome + "\n";
        res += "Nivel: " + this.nivel + "\n";
        res += "Ano: " + this.ano + "\n";
        return res;
    }

}
package trabalho.aps;

public class Curso {
    private String nome, nivel;
    private int ano;

    public Curso(String nome, String nivel, int ano) {
        this.nome = nome;
        this.nivel = nivel;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        String res = "";
        res += "Nome: " + this.nome + "\n";
        res += "Nivel: " + this.nivel + "\n";
        res += "Ano: " + this.ano + "\n";
        return res;
    }

}
