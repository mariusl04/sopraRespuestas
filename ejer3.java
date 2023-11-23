public class CalculoSalario {
    public static void main(String[] args) {
        double horasTrabajadas;
        double tarifa;
        double sueldo;

        System.out.print("Ingrese la cantidad de horas trabajadas: ");
        horasTrabajadas = leerHorasTrabajadas();

        System.out.print("Ingrese la tarifa por hora: ");
        tarifa = leerTarifa();


        if (horasTrabajadas > 40) {

            double horasExtras = horasTrabajadas - 40;
            sueldo = 40 * tarifa + horasExtras * (tarifa * 1.5);
        } else {
            sueldo = horasTrabajadas * tarifa;
        }

        System.out.println("El sueldo es: $" + sueldo);
    }
}