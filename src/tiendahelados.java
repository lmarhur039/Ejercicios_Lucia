import java.util.Scanner;
public class tiendahelados {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Elige tamaño del helado pequeño(P), mediano(M), grande(G): ");
        char tamano = s.nextLine().charAt(0);

        System.out.println("Topping, Sin topping(S), Kitkat(K), Brownie(B), Lacasitos(L): ");
        char topping = s.nextLine().charAt(0);

        float precio = 0;

        if (tamano == 'P') {
            precio = 1;
        } else if (tamano == 'M') {
            precio = 2;
        } else if (tamano == 'G')
            precio = 3;


        if (topping != 'S') {
            if (topping == 'K') {
                precio = precio + 1;
            } else if(topping == 'B'){
                    precio = precio + 1.5f;
            } else {
                    precio = precio + 0.8f;

            }

        }
    }

}