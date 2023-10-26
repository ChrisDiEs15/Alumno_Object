package alumnos;

import java.util.Scanner;

/**
 *
 * @author cdiaz
 */
public class Alumnos {

    public static void main(String[] args) {
        Scanner opcion = new Scanner(System.in);
        /*inicializacion del proghrama */
        System.out.println("\n Programa que captura las calificaciones de los alumnos");
        System.out.println("\n por favor indique la operacion a realizar");
        System.out.println("\n 1.-Capturar un nuevo grupo.");
        System.out.println("\n 2.-Leer grupo");
        System.out.println("\n 3.-Modificar un alumno");
        int opcionSel = opcion.nextInt();

        /*Switch Statement*/
        switch (opcionSel) {
            case 1 ->
                capturarNuevo();
            case 2 ->
                leerGrupo();
            case 3 ->
                modificarAlumno();
            default ->
                System.out.println("\n Ha elegido un numero incorrecto por favor reinicie el programa y elija adecuedamente");
        }

    }

    /*Write new Grupo*/
    public static void capturarNuevo() {
        Scanner seleccion = new Scanner(System.in);
        Scanner arrayDatos = new Scanner(System.in);
        Scanner datos = new Scanner(System.in);
        /*init datos temporales for bulk*/
        String nombreTemporal = "";
        int numeroDeListaTemporal = 0;
        String cuentaTemporal = "";

        System.out.println("\n Ha elegido capturar un nuevo grupo por favor siga las instrucciones en la siguiente linea");
        System.out.println("\nPor favor indique el tamano del grupo");
        int sizeGroup = seleccion.nextInt();
        float[] nuevo = new float[6];
        /*init nuevo_Alumno array for store an object array */
        AlumnoConstructor[] nuevoAlumno;
        nuevoAlumno = new AlumnoConstructor[sizeGroup];

        for (int w = 0; w < sizeGroup; w++) {
            /*init array for store nuevo alumno*/
            System.out.println("\n Por favor escriba el nombre:");
            nombreTemporal = datos.next();
            System.out.println("\n Por favor escriba el numero de lista:");
            numeroDeListaTemporal = datos.nextInt();
            System.out.println("\n Por favor escriba el numero de cuenta:");
            cuentaTemporal = datos.next();
            System.out.println("\n A continuacion escriba las 6 calificaciones");
            for (int i = 0; i < 6; i++) {
                nuevo[i] = arrayDatos.nextInt();
            }
            nuevoAlumno[w] = new AlumnoConstructor(nombreTemporal, numeroDeListaTemporal, cuentaTemporal, nuevo);
        }
        /*return unordered array after write the data*/
        returnArrayInfo(nuevoAlumno, sizeGroup);
        /*return ordered info by buuble sort */
        returnArrayOrdered(nuevoAlumno, sizeGroup);

    }

    public static void returnArrayInfo(AlumnoConstructor[] alumnos, int sizeSalon) {
        /*Use Methods for get the name, numero de lista, cuenta y calificaciones*/
        for (int w = 0; w < sizeSalon; w++) {
            String nombre = alumnos[w].getNombre();
            int numeroDeLista = alumnos[w].getNumeroDeLista();
            String cuenta = alumnos[w].getCuenta();
            float calificaciones[] = alumnos[w].getCalificaciones();
            /*store calf after get via getcalificaciones*/
            float[] calificacionesindv = new float[6];
            for (int i = 0; i < calificaciones.length && i < 6; i++) {
                calificacionesindv[i] = calificaciones[i];
            }

            System.out.println("El nombre del estudiante en el indice " + w + " es " + nombre + " su numero de lista es " + numeroDeLista + " su numero de cuenta es " + cuenta + " y sus calificaciones son" + calificacionesindv[0] + calificacionesindv[1] + calificacionesindv[2] + calificacionesindv[3] + calificacionesindv[4] + calificacionesindv[5]);

        }

    }

    public static AlumnoConstructor[] returnArrayOrdered(AlumnoConstructor[] alumnosUnordered, int sizeSalon) {
        /*sorted by numberlist*/
        for (int i = 0; i < sizeSalon - 1; i++) {
            for (int j = 0; j < sizeSalon - i - 1; j++) {
                if (alumnosUnordered[j].getNumeroDeLista() > alumnosUnordered[j + 1].getNumeroDeLista()) {
                    AlumnoConstructor temp = alumnosUnordered[j];
                    alumnosUnordered[j] = alumnosUnordered[j + 1];
                    alumnosUnordered[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.println("Estudiantes ordenados por numero de lista:");
        for (int i = 0; i < sizeSalon; i++) {
            System.out.println("Numero de lista " + alumnosUnordered[i].getNumeroDeLista() + " Nombre: " + alumnosUnordered[i].getNombre() + " cuenta " + alumnosUnordered[i].getCuenta());
        }
        return alumnosUnordered;
    }
//TODO
    /*read new group*/
    public static void leerGrupo() {
        System.out.println("Ha elegido leer un grupo por favor espere las instrucciones en la siguiente linea de comando");

    }

    public static void modificarAlumno() {
        System.out.println("Ha elegido modificar un alumno, espere instrucciones en la siguente linea de comando");

    }

}
