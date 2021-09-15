package aula02;
import Instrutor.Instrutor;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Aula02 {


    public static void main(String[] args) {
     
        Instrutor instrutor = new Instrutor();
        instrutor.setNome(JOptionPane.showInputDialog("Nome:"));
        instrutor.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Código:")));
        instrutor.setCargaHoraria(Double.parseDouble(JOptionPane.showInputDialog("Carga Horaria:")));       
        instrutor.calcularSalario();
            JOptionPane.showMessageDialog(null, "Nome: " + instrutor.getNome() + " \n Código: " + instrutor.getCodigo() +
                    "\n Carga horaria: " + instrutor.getCargaHoraria() + " \n Salario: " + instrutor.getSalario ());
    }
    
}
