public  class laba3 {
    public static void main(String[] args){
        boolean Trues = true;
        boolean Falses = false;

        // логические операции &&, ||,  ! 
        boolean trueAndFalse = Trues && Falses;
        boolean trueOrFalse = Trues || Falses;
        boolean notTrue = !Trues;
        boolean notFalse = !Falses;

        System.out.println("операция &&: " + trueAndFalse);
        System.out.println("операция ||: " + trueOrFalse);
        System.out.println("операция ! для TRUE: " + notTrue);
        System.out.println("операция ! для false: " + notFalse);
        System.out.println(" ");

        //тернарная операция x < y ? x : y

        boolean answer;
        int x = 0;
        int y = 10;
        while (y != 0) {
            answer = x < y ? true : false;
            if(answer == true){
                System.out.println("x < y: y: " + y + " >  x: " + x);
    
            }else{
                System.out.println("x > y: x: " + x + " >  y: " + y);

            }
            x++;
            y--;
        }
        System.out.println(" ");

        //поразрядных логических операций &, |, ^, ~

        int x1 = 5;
        int y1 = 3;

        System.out.println("Исходные данные: x = "+x1+" = " + Integer.toBinaryString(x1));
        System.out.println("Исходные данные: y = "+y1+" = " + Integer.toBinaryString(y1));

        int operAnd = x1 & y1;
        int operOr = x1 | y1;
        int operXor = x1 ^ y1;
        int operNotX = ~x1; 
        int operNotY = ~y1; 

        System.out.println("Операция &: " + operAnd);
        System.out.println("Операция |: " + operOr);
        System.out.println("Операция ^: " + operXor);
        System.out.println("Операция ~x: " + operNotX);
        System.out.println("Операция ~y: " + operNotY);
        System.out.println(" ");

        //операции сдвига >> << >>>
        int x3 = 10;
        System.out.println("Исходные данные: x = "+x3+" = " + Integer.toBinaryString(x3));

        int result1 = x3 >> 1;
        int result2 = x3 << 1;
        int result3 = x3 >>> 2;

        System.out.println("Операция >>: " + result1 + " = " + Integer.toBinaryString(result1));
        System.out.println("Операция <<: " + result2 + " = " + Integer.toBinaryString(result2));
        System.out.println("Операция >>>: " + result3 + " = " + Integer.toBinaryString(result3));

    }
}