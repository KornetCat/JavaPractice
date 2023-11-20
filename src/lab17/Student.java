package lab17;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    public String Name;
    public Integer GroupNumber;

    public Student(String[] m) {
        Name = m[0];
        GroupNumber = Integer.parseInt(m[1]);
    }
    public String PrintOn() {
        return Name + ", " + GroupNumber;
    }
}
