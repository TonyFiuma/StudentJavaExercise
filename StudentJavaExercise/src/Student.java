import java.util.ArrayList;

public class Student{

    private String name;
    private int age;
    private ArrayList<Integer> grades;

    public Student(String name,int age){
        this.name = name;
        this.age = age;
        grades = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public ArrayList<Integer> getGrades(){
        return grades;
    }

    public void addGrades(int grade){
        grades.add(grade);
    }

    public int getAverageGrade(){
        if(this.grades.size() == 0){
            System.out.println("There aren't grades");
            return 0;
        }
        int sum = 0;
        int count = 0;
        for(int single : grades){
            sum += single;
            count++;
        }
        return sum / count;
    }
}
