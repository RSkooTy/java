public class laba5 {
    public static void main(String[] arg){

        if(arg.length == 0){
            System.out.println("nothing");
        }else{
            for(int i = 0; i < arg.length; i++)
            {
                System.out.println("arg: " + (i + 1) + " - " + arg[i]);
            }
        }
    }
}
