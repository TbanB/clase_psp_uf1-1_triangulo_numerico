import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Triangulo {
    public static void main(String[] args)
    {
        if (args.length == 0)
        {
            System.out.println("Se requiere un argumento");
            return;
        }

        LocalDateTime fechaHora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        System.out.println("Fecha de inicio: " + fechaHora.format(formatter));
        System.out.println("-");

        int filas = Integer.parseInt(args[0]);
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
