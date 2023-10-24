package lab10;

import java.util.Arrays;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student>{
    public Student[] iDNumber = new Student[]{};

    public void setArray(Student... a){
        iDNumber = a;
    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getGPA()-o2.getGPA();
    }
    public void quicksort(int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        Student pivot = iDNumber[(leftMarker + rightMarker) / 2];
        do {
            // Двигаем левый маркер слева направо пока элемент меньше, чем pivot
            while (compare(iDNumber[leftMarker],pivot)>0) {
                leftMarker++;
            }
            // Двигаем правый маркер, пока элемент больше, чем pivot
            while (compare(iDNumber[rightMarker],pivot)<0) {
                rightMarker--;
            }
            // Проверим, не нужно обменять местами элементы, на которые указывают маркеры
            if (leftMarker <= rightMarker) {
                // Левый маркер будет меньше правого только если мы должны выполнить swap
                if (leftMarker < rightMarker) {
                    Student tmp = iDNumber[leftMarker];
                    iDNumber[leftMarker] = iDNumber[rightMarker];
                    iDNumber[rightMarker] = tmp;
                }
                // Сдвигаем маркеры, чтобы получить новые границы
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);
        // Выполняем рекурсивно для частей
        if (leftMarker < rightBorder) {
            quicksort(leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quicksort(leftBorder, rightMarker);
        }
    }
    public void mergeSort(int left, int right){
        // Выберем разделитель, т.е. разделим пополам входной массив
        int delimiter = left + ((right - left) / 2) + 1;
        // Выполним рекурсивно данную функцию для двух половинок (если сможем разбить(
        if (delimiter > 0 && right > (left + 1)) {
            mergeSort(left, delimiter - 1);
            mergeSort(delimiter, right);
        }
        // Создаём временный массив с нужным размером
        Student[] buffer = new Student[right - left + 1];
        // Начиная от указанной левой границы идём по каждому элементу
        int cursor = left;
        for (int i = 0; i < buffer.length; i++) {
            // Мы используем delimeter чтобы указывать на элемент из правой части
            // Если delimeter > right, значит в правой части не осталось недобавленных элементов
            if (delimiter > right || compare(iDNumber[cursor], iDNumber[delimiter])>0) {
                buffer[i] = iDNumber[cursor];
                cursor++;
            } else {
                buffer[i] = iDNumber[delimiter];
                delimiter++;
            }
        }
        System.arraycopy(buffer, 0, iDNumber, left, buffer.length);
    }
    public void outArray(){
        for(Student i: iDNumber){
            System.out.println(i);
        }
    }

    public static void main(String args[]){
        SortingStudentsByGPA a = new SortingStudentsByGPA();
        a.setArray(new Student("Alex", "Smith","09.03.01",1,4,50),
                new Student("Mary","Carlstone","01.03.04",3,2,70),
                new Student("Carl", "Long","04.01.02",2,1,35),
                new Student("Carl", "Long","04.01.02",2,1,40),
                new Student("Carl", "Long","04.01.02",2,1,90),
                new Student("Carl", "Long","04.01.02",2,1,55));
        a.outArray();
        System.out.println("\n\n\n\n");
        a.mergeSort(0, a.iDNumber.length-1);
        a.outArray();
    }
}
