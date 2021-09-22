package trabalho.aps;

public class Aluno {
    private String ra, nome;

    public Aluno(String ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        String res = "";
        res += "RA: " + this.ra + "\n";
        res += "Nome: " + this.nome + "\n";
        return res;
    }
 
}
