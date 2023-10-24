package lab11.S;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student implements Comparable<Student> {
    public String Name;
    public String Surname;
    public String Speciality;
    public Integer CurseNum;
    public Integer GroupNum;
    public Integer GPA;
    public Date Birth;
    public SimpleDateFormat Form;

    public Student(String name, String surname, String speciality, Integer curseNum,
                   Integer groupNum, Integer gpa, Date birth, String DateForm) {
        Name = name;
        Surname = surname;
        Speciality = speciality;
        CurseNum = curseNum;
        GroupNum = groupNum;
        GPA = gpa;
        Birth = birth;
        Form = new SimpleDateFormat(DateForm);
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

    public Date getBirth() {
        return Birth;
    }

    public void setBirth(Date birth) {
        Birth = birth;
    }

    @Override
    public String toString() {
        return "Student(Name="+Name+",Surname="+Surname+",GPA="+GPA+",Date of birth: "+Form.format(Birth)+")";
    }

    @Override
    public int compareTo(Student o) {
        return this.getGPA()-o.getGPA();
    }
}
