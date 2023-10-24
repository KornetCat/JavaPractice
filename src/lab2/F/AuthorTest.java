package lab2.F;

public class AuthorTest {
    public static void main(String[] args){
        Author r = new Author("Alex", "all@mail.ru", 'm');
        r.setEmail("alll@mail.ru");
        System.out.println(r.getEmail());
        System.out.println(r.getName());
        System.out.println(r.getGender());
        System.out.println(r.toString());
    }
}
