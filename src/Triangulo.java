import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Definición de la clase Triangulo.
 */
public class Triangulo {

    /**
     * Declaramos el método main de la clase Triangulo.
     *
     * Un apunte personal:
     *      * main debe ser publico para que sea accesible desde cualquier parte del programa,
     *      si no fuese publico la JVM no podría acceder a ella y así ejecutar el programa.
     *      * static identifica que el método pertenece a la clase y no es una instancia especifica de la clase.
     *      Un método static se puede llamar sin necesidad de de crear un objeto de clase.
     *      * Void hace referencia al retorno del método, en este caso void identifica que el método no devuelve ningún valor.
     * @param args
     */
    public static void main(String[] args)
    {

        /**
         * Validamos si entran argumentos al ejecutar el programa,
         * en este caso deberían ser un 5 7 o 9 dependiendi del proceso ejecutado
         */
        if (args.length == 0)
        {
            System.out.println("Se requiere un argumento");
            return;
        }

        /**
         * En este bloque obtenemos y mostramos mostramos la fecha y hora
         *      * LocalDateTime.now() obtiene la fecha y hora actuales.
         *      * DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm") creamos un formato para la fecha y hora según el patrón que le pasemos.
         *      * fechaHora.format(formatter) convertirá la fecha y hora actual al formato que hemos creado anteriormente.
         */
        LocalDateTime fechaHora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        System.out.println("Fecha de inicio: " + fechaHora.format(formatter));
        System.out.println("-");

        /**
         * Convertimos el argumento que ha entrado al ejecutar Triangulo a un entero para definir el número total de filas que tendrá el triangulo.
         */
        int filas = Integer.parseInt(args[0]);

        /**
         * Generamos el triangulo númerico con el for loop.
         *      * El primer bucle controla las filas del triangulo yendo de más a menos, cada vez que se ejecuta resta 1 al total de filas.
         *      * El sergundo bucle imprime cada uno de los numeros que correspondan, en la primera interacción irá del 1 al entero definido por el total de filas.
         *
         */
        for (int i=filas; i>=1; i--)
        {
            for (int n=1; n<=i; n++)
            {
                System.out.print(n);
            }
            System.out.println();
        }
    }
}
