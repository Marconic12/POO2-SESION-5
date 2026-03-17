package run;
import javax.swing.JOptionPane;

public class Ejercicio4
{
    public static void main(String[] args)
    {
        /*

        el conjunto de ifs donde el codigo no es tan legible

        double descuento;
        String tipoCliente = "VIP";

        if (tipoCliente.equals("REGULAR")) {
            descuento = 0.05;
        } else if (tipoCliente.equals("VIP")) {
            descuento = 0.15;
        } else if (tipoCliente.equals("ESTUDIANTE")) {
            descuento = 0.10;
        } else if (tipoCliente.equals("JUBILADO")) {
            descuento = 0.12;
        } else if (tipoCliente.equals("NUEVO")) {
            descuento = 0.08;
        } else if (tipoCliente.equals("FRECUENTE")) {
            descuento = 0.09;
        } else if (tipoCliente.equals("EMPRESA")) {
            descuento = 0.20;
        } else if (tipoCliente.equals("SOCIO")) {
            descuento = 0.25;
        } else if (tipoCliente.equals("PREMIUM")) {
            descuento = 0.30;
        } else if (tipoCliente.equals("INVITADO")) {
            descuento = 0.02;
        } else {
            descuento = 0.0;
        } */


        double precioBase = 100.0;

        String tipoCliente = JOptionPane.showInputDialog(null,"Ingrese el su estado: ");

        double descuento = switch (tipoCliente) {
            case "REGULAR"   -> 0.05;
            case "VIP"       -> 0.15;
            case "ESTUDIANTE"-> 0.10;
            case "JUBILADO"  -> 0.12;
            case "NUEVO"     -> 0.08;
            case "FRECUENTE" -> 0.09;
            case "EMPRESA"   -> 0.20;
            case "SOCIO"     -> 0.25;
            case "PREMIUM"   -> 0.30;
            case "INVITADO"  -> 0.02;
            default          -> 0.0;
        };

        double precioFinal = precioBase - (precioBase * descuento);
        JOptionPane.showMessageDialog(null,"El precio final es: " + precioFinal); ;

    }
}
