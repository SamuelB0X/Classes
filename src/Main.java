public class Main {
    public static void main(String[] args) {
        Student samuel = new Student("Samuel",  "000565856", 17, 'M');
        Student laura = new Student();
        System.out.println(samuel);
        System.out.println(laura);
        System.out.println(samuel.studentId);
        System.out.println(laura.studentId);
    }
}
