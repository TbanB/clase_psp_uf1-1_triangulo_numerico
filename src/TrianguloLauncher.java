import java.io.File;

/**
 * Definición de la clase triangulo.
 */
public class TrianguloLauncher {

    /**
     * Definición del método main. Este método es el que se ejecuta cada vez que se inicia el programa.
     * Cada una de la partes de la definición del método esta explicado en el fichero de Triangulo.java
     * @param args
     */
    public static void main(String[] args) {

        /**
         * El bloque de try catch para manejar la excepciones que puedan surgir al ejecutar el programa
         */
        try {

            /**
             * Creamos un nuevo objeto de clase ProcessBuilder para cada uno de los casos.
             *      * La clase ProcessBuilder inicia y gestiona un proceso externo desde la aplicación de Java en la que se esta iniciando.
             *      * La clase ProcessBuilder necesita al menos un argumento, en este caso utilizamos dos el primero es "Java" indica que ejecutaremos un comando con JVM.
             *      el segundo es la ruta del archivo de java que queremos utilizar. El tercer argumento corresponde con el valor que espera la clase Tringulo para ser ejecutado.
             *
             *      * pt1.redirectOutput(new File("triangulo5.txt")) redirecciona la salida de los valores que se mostrarían en consola para que se escriban en el archivo definido.
             */
            ProcessBuilder pt1 = new ProcessBuilder("java", "src/Triangulo.java", "5");
            pt1.redirectOutput(new File("triangulo5.txt"));

            ProcessBuilder pt2 = new ProcessBuilder("java", "src/Triangulo.java", "7");
            pt2.redirectOutput(new File("triangulo7.txt"));

            ProcessBuilder pt3 = new ProcessBuilder("java", "src/Triangulo.java", "9");
            pt3.redirectOutput(new File("triangulo9.txt"));

            /**
             *  .start() ejecuta el proceso creado con ProcessBuilder.
             *  .waitFor() obliga al programa a esperar hasta que termine el proceso.
             */
            pt1.start().waitFor();
            pt2.start().waitFor();
            pt3.start().waitFor();

            System.out.println("Proceso lanzado con éxito");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
