package run;
import java.util.Scanner;
public class Ejercicio5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Decime tu contraseña: ");
        String pass = sc.nextLine();

        boolean tieneNumero = false;
        boolean tieneMayuscula = false;

        for (int i = 0; i < pass.length(); i++)
        {
            char c = pass.charAt(i);
            if (Character.isDigit(c)) tieneNumero = true;
            if (Character.isUpperCase(c)) tieneMayuscula = true;
        }

        if (pass.length() < 8)
        {
            System.out.println("Tu contraseña es muy corta.");
        }
        else if (tieneNumero && tieneMayuscula)
        {
            System.out.println("Tu contraseña es fuerte");
        }
        else if (tieneNumero)
        {
            System.out.println("Tu contraseña es aceptable.");
        }
        else
        {
            System.out.println("Tu contraseña no tiene seguridad alguna, deberías cambiarla.");
        }

        sc.close();

    }
}

