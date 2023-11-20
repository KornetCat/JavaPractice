package lab17;

import java.util.ArrayList;

public class StudentList extends ArrayList<Student> {
    public StudentList() {
        super();
    }
    @Override
    public void add(int index, Student element) {
        super.add(index, element);
    }

    @Override
    public Student remove(int index) {
        return super.remove(index);
    }
    public void PrintEl(int index){
        this.get(index).PrintOn();
    }

    @Override
    public void clear() {
        super.clear();
    }
    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }
}
