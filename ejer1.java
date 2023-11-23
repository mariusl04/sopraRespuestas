public class ParImparDescendente {
    public static void main(String[] args) {
        int numero;

        System.out.print("Ingrese un número entero: ");
        numero = leerNumero();

        
        if (numero % 2 == 0) { //par
            System.out.println("Pares descendentes desde " + numero + " hasta 0:");

            for (int i = numero; i >= 0; i -= 2) {
                System.out.println(i);
            }
        } else { // impar
            
            System.out.println("Impares descendentes desde " + numero + " hasta 1:");

            for (int i = numero; i >= 1; i -= 2) {
                System.out.println(i);
            }
        }
    }
}