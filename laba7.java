public class laba7<T> {
    private T element;

    public laba7(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public static <T> void tradeElement(laba7<T> firstContainer, laba7<T> secondContainer) {
        T temp = firstContainer.getElement();
        firstContainer.setElement(secondContainer.getElement());
        secondContainer.setElement(temp);
    }

    public static void main(String[] args) {
        laba7<Integer> firstContainer = new laba7<>(1);
        laba7<Integer> secondContainer = new laba7<>(2);

        System.out.println("Before trade: " + "First: " + firstContainer.getElement() + " Second: " + secondContainer.getElement());
        tradeElement(firstContainer, secondContainer);
        System.out.println("After trade: " + "First: " + firstContainer.getElement() + " Second: " + secondContainer.getElement());
    }
}
