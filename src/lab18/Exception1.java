package lab18;

import java.util.Scanner;

public class Exception1 {
    public void exceptionDemo() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch (ArithmeticException e) {
            System.out.println("Попытка деления на ноль");
        }
        catch(Exception e){
            System.out.println("Ошибка ввода");
        }
        finally {
            System.out.println("Выполнение завершено");
        }
    }
}
