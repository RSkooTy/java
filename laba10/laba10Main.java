public class laba10Main {
    public static void main(String[] args) {
        try{
            System.out.println("INteger\n");
            laba10Triple<Integer> triple = new laba10Triple<>(1, 2, 3);
            System.out.println("Min: " + triple.searchMin());
            System.out.println("Max: " + triple.searchMax());
            System.out.println("Mean: " + triple.searchMean());
        }catch(RuntimeException e){System.out.println(e.getMessage());}
        System.out.println();
        try{
            System.out.println("String\n");
            laba10Triple<String> tripleString = new laba10Triple<>("adsf","dfs", "gsd");
            System.out.println("Min: " + tripleString.searchMin());
            System.out.println("Max: " + tripleString.searchMax());
            System.out.println("Mean: " + tripleString.searchMean());
        }catch(RuntimeException e){System.out.println(e.getMessage());}
        System.out.println();
        try{
            System.out.println("Double\n");
            laba10Triple<Double> tripleDouble= new laba10Triple<>(1.1,2.2, 3.3);
            System.out.println("Min: " + tripleDouble.searchMin());
            System.out.println("Max: " + tripleDouble.searchMax());
            System.out.println("Mean: " + tripleDouble.searchMean());
        }catch(RuntimeException e){System.out.println(e.getMessage());}
        System.out.println();

    }
}
