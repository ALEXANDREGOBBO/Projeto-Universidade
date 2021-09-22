package trabalho.aps;

public class Nota {
    
    private double valor;

    public Nota(double valor) {
        this.setValor(valor);
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        if (valor > 10){
            this.valor = 10;
        }
        else if (valor < 0){
            this.valor = 0;
        }
        else {
            this.valor = valor;
        }
    }       
}package trabalho.aps;

public class Nota {
    
    private double valor;

    public Nota(double valor) {
        this.setValor(valor);
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        if (valor > 10){
            this.valor = 10;
        }
        else if (valor < 0){
            this.valor = 0;
        }
        else {
            this.valor = valor;
        }
    }       
}