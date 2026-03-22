package run;
import javax.swing.JOptionPane;

public class Ejercicio3
{
    public static void main(String[] args)
    {
        // Ese se considera un switch tradicional

            /*
              int dia  = Integer.parseInt(
                JOptionPane.showInputDialog("Digite un numero del 1 al 7"));

            switch (dia)
            String diaSemana= "";
        {
            case 1:
                diaSemana  = "Domingo";
                break;
            case 2:
                diaSemana  = "Lunes";
                break;
            case 3:
                diaSemana  = "Martes";
                break;
            case 4:
                diaSemana  = "Miercoles";
                break;
            case 5:
                diaSemana  = "Jueves";
                break;
            case 6:
                diaSemana  = "Viernes";
                break;
            case 7:
                diaSemana  = "Sabado";
                break;

            default:
                JOptionPane.showMessageDialog(null,"Dia no valido" ,"Error",
                        JOptionPane.ERROR_MESSAGE);

             */
        //A continuacion un Switch Expression

        String input = JOptionPane.showInputDialog("Digite un número del 1 al 7");

        if (input == null || input.trim().isEmpty()) {
            input = "0";
        }

        int dia = Integer.parseInt(input);

        String diaSemana = switch (dia) {
            case 1 -> "Domingo";
            case 2 -> "Lunes";
            case 3 -> "Martes";
            case 4 -> "Miércoles";
            case 5 -> "Jueves";
            case 6 -> "Viernes";
            case 7 -> "Sábado";
            default -> {
                JOptionPane.showMessageDialog(
                        null,
                        "Numero invalido",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );
                yield "invalido";
            }
        };

        JOptionPane.showMessageDialog(null, "El día es " + diaSemana);

    }
}
