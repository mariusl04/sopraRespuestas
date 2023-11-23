public class ClasificacionPersonas {

    static class Persona {
        char sexo;
        int edad;
    }

    public static void main(String[] args) {
        Persona[] personas = new Persona[50];
        int mayoresDeEdad = 0;
        int menoresDeEdad = 0;
        int hombresMayoresDeEdad = 0;
        int mujeresMenoresDeEdad = 0;

        // entiendo que el enunciado se refiere a esto, si no sería un bucle for y a cada persona asignarle los valores
        personas[i] = leerPersonas();

        double porcentajeMayoresDeEdad = ((double) mayoresDeEdad / personas.length) * 100;
        double porcentajeMujeres = ((double) (personas.length - hombresMayoresEdad) / personas.length) * 100;

        System.out.println("Cantidad de personas mayores de edad: " + mayoresDeEdad);
        System.out.println("Cantidad de personas menores de edad: " + menoresDeEdad);
        System.out.println("Cantidad de personas masculinas mayores de edad: " + hombresMayoresDeEdad);
        System.out.println("Cantidad de personas femeninas menores de edad: " + mujeresMenoresDeEdad);
        System.out.println("Porcentaje que representan las personas mayores de edad respecto al total de personas: " + porcentajeMayoresDeEdad + "%");
        System.out.println("Porcentaje que representan las mujeres respecto al total de personas: " + porcentajeMujeres + "%");
    }
}