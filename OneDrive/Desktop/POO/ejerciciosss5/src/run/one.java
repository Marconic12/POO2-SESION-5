package run;

import javax.swing.JOptionPane;

public class one {
    public static void main(String[] args) {
        double peso;
        int distancia;
        String esFragil;
        String msn ="";

        peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso del paquete (kg):"));
        distancia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la distancia del envío (km):"));
        esFragil = JOptionPane.showInputDialog("El producto es frágil? (si/no):");

        msn = "Descripcion de envio:\n";
        msn += "Peso: " + peso + " kg\n";
        msn += "Distancia: " + distancia + " km\n";


        if (peso > 50 && distancia > 100) {
            msn += "Su envio sera: 'Transporte pesado'.";
        }
        else if (peso < 50 && esFragil.equalsIgnoreCase("si")) {
            msn += "Su envio sera: 'Envío Premium'.";
        }
        else if (peso < 10 && distancia < 20) {
            msn += "Su envio sera: 'Dron'.";
        }
        else {
            msn += "Su envio sera: 'Envío Estándar'.";
        }

        JOptionPane.showMessageDialog(null, msn);
    }
}