import java.io.File;

public class TrianguloLauncher {
    public static void main(String[] args) {
        try {
            ProcessBuilder pt1 = new ProcessBuilder("java", "src/Triangulo.java", "5");
            pt1.redirectOutput(new File("triangulo5.txt"));

            ProcessBuilder pt2 = new ProcessBuilder("java", "src/Triangulo.java", "7");
            pt2.redirectOutput(new File("triangulo7.txt"));

            ProcessBuilder pt3 = new ProcessBuilder("java", "src/Triangulo.java", "9");
            pt3.redirectOutput(new File("triangulo9.txt"));

            pt1.start().waitFor();
            pt2.start().waitFor();
            pt3.start().waitFor();

            System.out.println("Proceso lanzado con éxito");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
