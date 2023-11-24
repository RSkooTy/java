import java.util.ArrayList;

public class laba6 { 
    private ArrayList<Integer> stackArr;
    private int last;

    public laba6() {
        stackArr = new ArrayList<>();
        last = -1;
    }

    public void newElem(int element) {
        stackArr.add(element);
        last++;
        System.out.println("New element added: " + element);
    }

    public boolean emptyStack() {
        return (last == -1);
    }

    public int deleteElem() {
        if (last >= 0) {
            int deleteElemNew = stackArr.remove(last);
            last--;
            System.out.println("Extracted element: " + deleteElemNew);
            return deleteElemNew;
        } else {
            System.out.println("Stack is empty");
            return 0;
        }
    }

    public int topElement() {
        if (last >= 0) {
            int takeElement = stackArr.get(last);
            System.out.println("Top element in stack: " + takeElement);
            return takeElement;
        } else {
            System.out.println("Stack is empty");
            return 0;
        }
    }

    public static void main(String[] args) {
        laba6 stack = new laba6();

        for (int i = 1; i <= 5; i++) {
            stack.newElem(i);
        }

        stack.topElement();

        while (!stack.emptyStack()) {
            stack.deleteElem();
        }

       if (!stack.emptyStack()) {
            stack.topElement();
        }
    }
}
