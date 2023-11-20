package lab20;

import java.io.Serializable;
import java.util.Collection;

public class MinMax<E extends Comparable> {
    public E[] serie;

    public MinMax(E[] serie) {
        this.serie = serie;
    }
    public E min(){
         E a = serie[0];
         for(E i: serie){
             if(i.compareTo(a)<0){
                 a=i;
             }
         }
         return a;
    }

    public E max(){
        E a = serie[0];
        for(E i: serie){
            if(i.compareTo(a)>0){
                a=i;
            }
        }
        return a;
    }
}
