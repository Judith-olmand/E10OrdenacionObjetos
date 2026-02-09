import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class E10OrdenacionObjetos {
    public static void main(String[] args) {
        List<Estudiante> estudiantes = new ArrayList<>();

        estudiantes.add(new Estudiante("Luisa","Lopez", 23));
            // USO DE GEMINI
            //generame diferentes datos en lineas como esta
            //estudiantes.add(new Estudiante("Luisa","Lopez", 23));
        estudiantes.add(new Estudiante("Carlos", "García", 21));
        estudiantes.add(new Estudiante("Ana", "Martínez", 19));
        estudiantes.add(new Estudiante("Diego", "Rodríguez", 25));
        estudiantes.add(new Estudiante("Sofía", "Hernández", 20));
        estudiantes.add(new Estudiante("Mateo", "Pérez", 22));
        estudiantes.add(new Estudiante("Valeria", "Sánchez", 24));
        estudiantes.add(new Estudiante("Julián", "Gómez", 18));
        estudiantes.add(new Estudiante("Elena", "Torres", 21));
        estudiantes.add(new Estudiante("Andrés", "Ramírez", 26));
        estudiantes.add(new Estudiante("Isabela", "Castro", 23));
        estudiantes.add(new Estudiante("Ricardo", "Morales", 22));
        estudiantes.add(new Estudiante("Camila", "Ruiz", 20));
        estudiantes.add(new Estudiante("Fernando", "Díaz", 24));
        estudiantes.add(new Estudiante("Gabriela", "Vega", 21));
        estudiantes.add(new Estudiante("Santiago", "Muñoz", 19));

        System.out.println("LISTA SIN ORDENAR");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.getNombre() + " " + estudiante.getApellido() + " " + estudiante.getEdad());
        }

        estudiantes.sort(Comparator.comparing(Estudiante::getApellido));

        System.out.println();
        System.out.println("LISTA ORDENADA POR APELLIDO");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.getApellido() + ", " +  estudiante.getNombre()  + " " + estudiante.getEdad());
        }

        estudiantes.sort(Comparator.comparing(Estudiante::getEdad).reversed());

        System.out.println();
        System.out.println("LISTA ORDENADA POR EDAD INVERSA");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.getEdad() + " " + estudiante.getNombre() + " " + estudiante.getApellido());
        }

        estudiantes.sort(Comparator.comparing(Estudiante::getEdad).thenComparing(Estudiante::getApellido).reversed());

        System.out.println();
        System.out.println("LISTA ORDENADA POR EDAD Y APELLIDO INVERSOS (SI SE REPITE LA EDAD)");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.getEdad() + " " + estudiante.getApellido() + " " + estudiante.getNombre());
        }
    }
}