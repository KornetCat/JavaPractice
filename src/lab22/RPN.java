package lab22;

//Нужно дописать графику
public class RPN {
    public Stack posl=new Stack(20);

    public RPN(String a) {
        String[] b = a.split(" ");
        for(String i: b){
            posl.push(i);
        }
    }
    public Double rec(String a){
        if(a.equals("+")){
            return rec(posl.pop())+rec(posl.pop());
        }else if(a.equals("-")){
            return rec(posl.pop())-rec(posl.pop());
        }else if(a.equals("*")){
            return rec(posl.pop())*rec(posl.pop());
        }else if(a.equals("/")) {
            return rec(posl.pop())/rec(posl.pop());
        }else{
            return Double.parseDouble(a);
        }
    }
    public Double viv(){
        Double a = rec(posl.pop());
        if(posl.isEmpty()){
            return a;
        }else{
            throw new NullPointerException();
        }
    }
}
