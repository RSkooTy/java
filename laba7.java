public class laba7 {
    private int element;

    public laba7(int element){
        this.element = element;
    }

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public static void tradeElement(laba7 firstElement, laba7 secondElement) {
        int trd = firstElement.getElement();
        firstElement.setElement(secondElement.getElement());
        secondElement.setElement(trd);
    }

    public static void main(String[] args) {
        laba7 firstElements = new laba7(1);
        laba7 secondElements = new laba7(2);

        System.out.println("Before trade: " + "First: " + firstElements.getElement() + " Second: " + secondElements.getElement());
        tradeElement(firstElements, secondElements);
        System.out.println("After trade: " + "First: " + firstElements.getElement() + " Second: " + secondElements.getElement());
    }
}
