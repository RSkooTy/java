import java.lang.reflect.Array;

public class laba6 {
    private  int mSize;
    private int[] stackArr;
    private int last;

    public laba6(int size){
        mSize = size;
        stackArr = new int[mSize];
        last =-1;
    }

    public void newElem(int element){
        if(last < mSize - 1)
        {
            stackArr[++last] = element;
            System.out.println("new element");
        }else
        {
            System.out.println("stack is full");
        }
    }

    public boolean emptyStack(){
        return (last == -1 );
    }

    public boolean fullStack(){
        return (last == mSize - 1);
    }

    public int deleteElem(){
        if(last >= 0)
        {
            int deleteElemNew = stackArr[last--];
            System.out.println("extracted element: " + deleteElemNew);
            return deleteElemNew;
        }else
        {
            System.out.println("stack is empty");
            return  0;
        }
    }

    public int topElement(){
        if(last >= 0)
        {
            int takeElement = stackArr[last];
            System.out.println("top element in stack: " + takeElement);
            return takeElement;
        }else{
            System.out.println("stack is empty");
            return 0;
        }
    }

    public static void main(String[] args) {
        laba6 stack = new laba6(5);

        for(int i = 1; i <= 5; i++)
        {
            stack.newElem(i);
        }

        stack.topElement();

        while (!stack.emptyStack()) {
            stack.deleteElem();
        }

        stack.topElement();
    }


}
