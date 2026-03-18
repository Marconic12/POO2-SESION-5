import java.util.Scanner;

public class ValidadorContrasenas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== VALIDADOR DE CONTRASEÑAS ===");
        System.out.print("Ingresa tu contraseña: ");
        String contrasena = sc.nextLine();

        boolean tieneNumero = false;
        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;


        for (int i = 0; i < contrasena.length(); i++) {

            char caracterActual = contrasena.charAt(i);

            if (Character.isDigit(caracterActual)) {
                tieneNumero = true;
                System.out.println("✓ Encontré un número: " + caracterActual);
            }

            if (Character.isUpperCase(caracterActual)) {
                tieneMayuscula = true;
                System.out.println("✓ Encontré una mayúscula: " + caracterActual);
            }

            if (Character.isLowerCase(caracterActual)) {
                tieneMinuscula = true;
            }
        }


        System.out.println("\n=== ANÁLISIS DE TU CONTRASEÑA ===");
        System.out.println("Contraseña ingresada: " + contrasena);
        System.out.println("Longitud: " + contrasena.length() + " caracteres");
        System.out.println("¿Tiene números? " + (tieneNumero ? "Sí" : "No"));
        System.out.println("¿Tiene mayúsculas? " + (tieneMayuscula ? "Sí" : "No"));

        System.out.println("\n=== CLASIFICACIÓN ===");

        if (contrasena.length() < 8) {
            System.out.println("🔴 INSEGURA - Muy corta (menos de 8 caracteres)");
        }
        else if (contrasena.length() >= 8 && tieneNumero && tieneMayuscula) {
            System.out.println("🟢 Tu contraseña posee una seguridad fuerte");
        }
        else if (contrasena.length() >= 8 && tieneNumero) {
            System.out.println("🟡 Tu contraseña posee una seguridad moderada");
        }
        else {
            System.out.println("🔴 Tu contraseña es insegura");
        }

        System.out.println("\n=== RECOMENDACIONES ===");
        if (!tieneNumero) {
            System.out.println("• Agrega al menos un número");
        }
        if (!tieneMayuscula) {
            System.out.println("• Agrega al menos una mayúscula");
        }
        if (contrasena.length() < 8) {
            System.out.println("• Hazla más larga (mínimo 8 caracteres)");
        }

        sc.close();
    }
}