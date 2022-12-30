public class Test{
    public static void main(String[] args){
        Student student = new Student("Matteo",23);
        student.addGrades(55);
        student.addGrades(70);
        student.addGrades(80);
        student.addGrades(75);
        System.out.println(student.getGrades());
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getName()+"'s average is: "+student.getAverageGrade());
    }
}
