public class Student {
    String studentName;
    String studentId = "000000000";
    int studentAge;
    char studentGender;
    String studentEmail;

    public Student() {
        System.out.println("Estudiante creado sin datos ");
    }

    public Student(String name, String id, int age, char gender) {
        studentName = name;
        studentId = id;
        studentAge = age;
        studentGender = gender;

        System.out.println("Estudiante \"" + studentName + "\" creado");

    }

    public Student(String name, String id, int age, char gender, String email) {
        studentName = name;
        studentId = id;
        studentAge = age;
        studentGender = gender;
        studentEmail = email;
        System.out.println("Estudiante \"" + studentName + "\" creado");

    }

    public void tellInfo() {
        System.out.println("Mi nombre es \"" + studentName + "\" mi ID es " + studentId);
        System.out.println("Tengo " + studentAge + " años y mi genero es " + studentGender);
    }

    public void repeatAfter(String message) {
        System.out.println("El mensaje es: " + message);
    }

    public void haveBirthday() {
        studentAge++;
    }

    public String getEmail() {
        return studentEmail;
    }

    public String toString() {
        return "Nombre del estudiante: " + studentName ;
    }

}
