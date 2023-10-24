package lab9;

import java.util.Arrays;

public class Tester {
    public static void main(String args[]){
        Student a = new Student(50);
        Student b = new Student(55);
        Student c = new Student(40);
        Student d = new Student(56);
        Student e = new Student(70);
        Student f = new Student(34);
        Student[] allSt = new Student[]{a, b, c, d, e, f};
        for(Student i: allSt){
            System.out.println(i);
        }
        System.out.println("\nСОРТИРОВКА!!!\n");
        //Начало сортировки
        for (int left = 0; left < allSt.length; left++) {
            // Вытаскиваем значение элемента
            Student value = allSt[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value.compareTo(allSt[i])>0) {
                    allSt[i + 1] = allSt[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            allSt[i + 1] = value;
        }
        for(Student i: allSt){
            System.out.println(i);
        }
    }
}
