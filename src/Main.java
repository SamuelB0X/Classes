import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student samuel = new Student("Samuel", "000565856", 17, 'M');
        Student laura = new Student();

        System.out.println(samuel);
        System.out.println(laura);
        System.out.println(samuel.studentId);
        System.out.println(laura.studentId);

        samuel.haveBirthday();

        String userEmail = samuel.getEmail();
        System.out.println(userEmail);


        System.out.println("Información de Samuel:");
        samuel.tellInfo();
        System.out.println("ID de Samuel: " + samuel.studentId);

        samuel.repeatAfter("Penas de Antaño");


        System.out.print("¿Has cumplido años? (si/no): ");
        String respuesta = scanner.nextLine();

        if (respuesta.equalsIgnoreCase("si")) {
            samuel.haveBirthday();
            System.out.println("¡Feliz cumpleaños, " + samuel.studentName + "! Ahora tienes " + samuel.studentAge + " años.");
        } else {
            System.out.println("No se realizaron cambios en la edad.");
        }

        scanner.close();
    }
}
