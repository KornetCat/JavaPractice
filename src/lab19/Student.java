package lab19;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {
    public String FIO;
    public String INN;
    public static String regex = "\\d{4}-\\d{6}-\\d{2}";

    public Student(String FIO, String INN) {
        this.FIO = FIO;
        Pattern pattern = Pattern.compile(regex);
        try {
            Matcher mat = pattern.matcher(INN);
            if (mat.find()) {
                this.INN = INN;
            } else {
                throw new NumberFormatException("Wrong format");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
            this.INN = null;
        }
    }
    public static Student Students(String[] m) {
        String FIO = m[0];
        String INN;
        Pattern pattern = Pattern.compile(Student.regex);
        Matcher mat = pattern.matcher(m[1]);
        if (mat.find()) {
            INN = m[1];
        } else {
            throw new NumberFormatException("Wrong format");
        }
        return new Student(FIO, INN);
    }
}
