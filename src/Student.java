public class Student {
    String studentName;
    String studentId = "000000000";
    int studentAge;
    char studentGender;

    public Student() {
        System.out.println("Estudiante creado sin datos!");
    }

    public Student (String name, String id, int age, char gender) {
        studentName = name;
        studentId = id;
        studentAge = age;
        studentGender = gender;
        System.out.println("Estudiante \"" + studentName + "\" creado!");
    }
}
