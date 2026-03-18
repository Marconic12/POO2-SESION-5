package run;

import javax.swing.*;

public class EJ2 {
    public static void main(String[] args) {
        int dia, mes, anio;
        String resultado = "";

        // Leer datos
        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el DÍA (1-31): "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el MES (1-12): "));
        anio = Integer.parseInt(JOptionPane.showInputDialog("Digite el AÑO: "));

        // Validacion del mes primero
        int diasMaximos = 0;
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                diasMaximos = 31;
                break;
            case 4: case 6: case 9: case 11:
                diasMaximos = 30;
                break;
            case 2:
                // Verificar si es bisiesto
                if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {
                    diasMaximos = 29;
                } else {
                    diasMaximos = 28;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "MES inválido (debe ser 1-12)", "ERROR", JOptionPane.ERROR_MESSAGE);
                return; // Salir del programa
        }

        // Validar DÍA según días máximos del mes
        switch (dia) {
            case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8:
            case 9: case 10: case 11: case 12: case 13: case 14: case 15:
            case 16: case 17: case 18: case 19: case 20: case 21: case 22:
            case 23: case 24: case 25: case 26: case 27: case 28:
                if (dia <= diasMaximos) {
                    resultado = "FECHA VÁLIDA";
                } else {
                    resultado = "DÍA inválido para este mes";
                }
                break;
            case 29:
                if (diasMaximos >= 29) {
                    resultado = "FECHA VÁLIDA";
                } else {
                    resultado = "DÍA inválido para este mes";
                }
                break;
            case 30:
                if (diasMaximos >= 30) {
                    resultado = "FECHA VÁLIDA";
                } else {
                    resultado = "DÍA inválido para este mes";
                }
                break;
            case 31:
                if (diasMaximos >= 31) {
                    resultado = "FECHA VÁLIDA";
                } else {
                    resultado = "DÍA inválido para este mes";
                }
                break;
            default:
                resultado = "DÍA inválido (debe ser 1-31)";
        }

        // Mostrar resultado (igual que tu código)
        if (!resultado.isBlank() && !resultado.isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "Fecha: " + dia + "/" + mes + "/" + anio + "\n" + resultado,
                    "VALIDACIÓN",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
}