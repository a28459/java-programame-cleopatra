import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int casos = scanner.nextInt();

            for (int i = 0; i < casos; i++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int c = scanner.nextInt();

                String resultado = resolverCaso(a, b, c);
                System.out.println(resultado);
            }
        }
        scanner.close();
    }

    public static String resolverCaso(int a, int b, int c) {
        int distanciaAB = calcularDistancia(a, b);
        int distanciaBC = calcularDistancia(b, c);

        if (distanciaAB < distanciaBC) {
            return String.valueOf(a);
        } else if (distanciaBC < distanciaAB) {
            return String.valueOf(c);
        } else {
            return "EMPATE";
        }
    }


    public static int calcularDistancia(int x, int y) {
        int distancia = y - x;

        if (x < 0 && y > 0) {
            distancia--;
        }

        return distancia;
    }
}
