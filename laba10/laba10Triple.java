public class laba10Triple<T extends Comparable<T>> {
    private T first;
    private T second;
    private T third;

    public laba10Triple(T firstArg, T secondArg, T thirdArg){
        this.first = firstArg;
        this.second = secondArg;
        this.third = thirdArg;
    }

    public T firstArgument(){return first;}
    public T secondArguemnt(){return second;}
    public T thirdArgument(){return third;}

    public T searchMin(){
        if(first.compareTo(second) <= 0 && first.compareTo(third) <= 0){
            return first;
        }else if(second.compareTo(first) <= 0 && second.compareTo(third) <= 0){
            return second;
        }else if(third.compareTo(first) <= 0 && third.compareTo(second) <= 0){
            return third;
        }else{throw new RuntimeException("ERROR");}
    }

    public T searchMax(){
        if(first.compareTo(second) >=0 && first.compareTo(third) >= 0){
            return first;
        }else if(second.compareTo(first) >= 0 && second.compareTo(third) >= 0){
            return second;
        }else if(third.compareTo(first) >= 0 && third.compareTo(second) >= 0){
            return third;
        }else{throw new RuntimeException("ERROR");}
    }

    public double searchMean(){
        if (first instanceof Number) {
             return (((Number)first).doubleValue() + ((Number)second).doubleValue() + ((Number)third).doubleValue())/3;
        }else{throw new RuntimeException("ERROR");}
    }
}
