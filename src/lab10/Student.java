package lab10;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    public String Name;
    public String Surname;
    public String Speciality;
    public Integer CurseNum;
    public Integer GroupNum;
    public Integer GPA;

    public Student(String name, String surname, String speciality, Integer curseNum, Integer groupNum, Integer gpa) {
        Name = name;
        Surname = surname;
        Speciality = speciality;
        CurseNum = curseNum;
        GroupNum = groupNum;
        GPA = gpa;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public String getSpeciality() {
        return Speciality;
    }

    public Integer getCurseNum() {
        return CurseNum;
    }

    public Integer getGroupNum() {
        return GroupNum;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public void setSpeciality(String speciality) {
        Speciality = speciality;
    }

    public void setCurseNum(Integer curseNum) {
        CurseNum = curseNum;
    }

    public void setGroupNum(Integer groupNum) {
        GroupNum = groupNum;
    }

    public Integer getGPA() {
        return GPA;
    }

    public void setGPA(Integer GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student(Name="+Name+",Surname="+Surname+",GPA="+GPA+")";
    }

    @Override
    public int compareTo(Student o) {
        return this.getGPA()-o.getGPA();
    }
}
