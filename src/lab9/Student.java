package lab9;

public class Student implements Comparable<Student> {
    public Integer GPA;

    public Student(int GPA) {
        this.GPA = GPA;
    }

    @Override
    public int compareTo(Student o) {
        int result = -this.GPA.compareTo(o.GPA);
        return result;
    }

    @Override
    public String toString() {
        return "Student(GPA="+GPA+")";
    }
}
