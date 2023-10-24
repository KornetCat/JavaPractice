package lab4;

public class TimesOfYear {

    public static void love(Times i){
        switch(i){
            case Summer: System.out.println("Я люблю лето"); break;
            case Autumn: System.out.println("Я люблю осень"); break;
            case Winter: System.out.println("Я люблю зиму"); break;
            case Spring: System.out.println("Я люблю весну"); break;
        }
    }
    public static void main(String[] args) {
        Times favourite = Times.Summer;
        System.out.println(favourite+" "+favourite.GetTemperature()+" "+favourite.getDesc());
        love(favourite);
        System.out.println(favourite.GetDescription());
        for(Times i: Times.values()){
            System.out.println(i+" "+i.GetTemperature()+" "+i.getDesc());
        }
    }
}
