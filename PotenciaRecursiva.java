public class PotenciaRecursiva {

    public static int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1; // Caso base: cualquier número elevado a 0 es 1
        } else {
            return base * potencia(base, exponente - 1); // Llamada recursiva
        }
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        int resultado = potencia(2, 3); // 2^3 = 8
        System.out.println("Resultado: " + resultado);
    }
}