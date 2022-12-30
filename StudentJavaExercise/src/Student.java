import java.util.ArrayList;

public class Student{

    private final String name;
    private final int age;
    private ArrayList<Integer> grades;

    public Student(String name,int age){
        this.name = name;
        this.age = age;
        this.grades = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public ArrayList<Integer> getGrades(){
        return this.grades;
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
