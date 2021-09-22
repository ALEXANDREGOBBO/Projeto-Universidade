package trabalho.aps;

public final class Notas {
    private Nota np1, np2, sub, exam;

    public Notas(double np1, double np2, double sub, double exam) {
        this.np1 = new Nota(np1);
        this.np2 = new Nota(np2);
        this.sub = new Nota(sub);
        this.exam = new Nota(exam);
    }

    public Nota getNp1() {
        return np1;
    }

    public void setNp1(Nota np1) {
        this.np1 = np1;
    }

    public Nota getNp2() {
        return np2;
    }

    public void setNp2(Nota np2) {
        this.np2 = np2;
    }

    public Nota getSub() {
        return sub;
    }

    public void setSub(Nota sub) {
        this.sub = sub;
    }

    public Nota getExam() {
        return exam;
    }

    public void setExam(Nota exam) {
        this.exam = exam;
    }

    @Override
    public String toString() {
        String res = "";
        res += "Np1: " + this.np1.getValor() + "\n";
        res += "Np2: " + this.np2.getValor() + "\n";
        res += "Sub: " + this.sub.getValor() + "\n";
        res += "Exame: " + this.exam.getValor() + "\n";
        return res;
    }
  
}