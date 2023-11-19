public class laba1 {

    public static void main(String[] args){
        // создание строки 
        String str1 = "Car Cars";
        String str2 = "Plane Planes";
        String str3 = "    Pooooops    ";
        String str4 = "STR1 STR2 STR3 STR4";

        System.out.println("Исходные строки: { " + str1 + " }  { " + str2 + " } { " + str3 + " } { " + str4 + " }");

        //длина строки 
        int lenghtStr = str1.length();
        System.out.println("Длина: " + lenghtStr);

        //сравнение строк 
        boolean comparison = str1.equals(str2);
        System.out.println("Равны: " + comparison);

        //объединение строк 
        String sumString = str1.concat(" " + str2);
        System.out.println("Новая строка: " + sumString);

        //проверка на пустоту 
        boolean emptyString = str1.isEmpty();
        System.out.println("Пуста ли строка: " + emptyString);

         //поиск и возвращение по индексу 
        int iter = 0;
        char indexStr = str1.charAt(iter);
        System.out.println("Cимвол по индексу " + iter + ": " + indexStr);

        // подстрока
        String subString = str2.substring(0, 3);
        System.out.println("Подстрока от 0 до 3: " + subString);

        //индекс вхождения подстроки 
        int indexSubString =  str2.indexOf("Plane");
        System.out.println("Индекс первого вхождения Plane в str2: " + indexSubString);

        //Верхний регистр 
        String upperCase = str1.toUpperCase();
        System.out.println("Верх: " + upperCase);

        //Нижний регистр
        String lowerCase  = str1.toLowerCase();
        System.out.println("Низ: " + lowerCase);

        //удаление рпобелов в начале и конце 
        String withoutSpace = str3.trim();
        System.out.println("Cтрока с пробелами: " + str3);
        System.out.println("Cтрока после удаление пробелов: {" + withoutSpace + "}");

        //замена символов 
        String replaceSymbol = str3.replace('o', 'U');
        System.out.println("Cтрока после замены: " + replaceSymbol);

        //замена подстрок на новую
        String replaceStringSup = str1.replace("Car", "POOP");
        System.out.println("Строка после замены: " + replaceStringSup);

        //начинается ли строка с подстроки
        boolean startsSub = str1.startsWith("Car");
        System.out.println("начинается с 'Car': " + startsSub);
 
        //заканчивается ли строка на определенную подстроку
        boolean endsSub = str1.endsWith("Cars");
        System.out.println("заканчивается на 'Cars': " + endsSub);

        //разделение строки на массив строк по указанному выражению
        String[] words = str4.split(" ");
        System.out.println("Cлова: ");
        for(String word : words){
            System.out.println(" " + word);
        }

        //преобразование типов в строку 
        int intVal = 23;
        int doubVal = 45;
        String intValString = String.valueOf(intVal);
        String doubValString = String.valueOf(doubVal);
        System.out.println("Значение в видестроки: " + intValString + " " + doubValString);

        //лексическое сравнение строк
        int compareToResult = str1.compareTo(str2);
        System.out.println("Сравнение: " + compareToResult);

    }
}