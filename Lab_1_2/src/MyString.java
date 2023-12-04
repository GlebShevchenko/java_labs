public class MyString {
    private final
    String myString;
    MyString() {
        myString = "HelloWorld";
    }
    MyString(String MyString) {
        myString = MyString;
    }
    MyString(char[] data){
        myString = new String(data);
    }
    void Print(){
        System.out.print(myString);
    }
    public
    static void ShowHowWorkString(){
        System.out.print("1. Написать программу, демонстрирующую методы для работы с объектами String\n");
        String informationStroke;
        MyString[] array_myString = new MyString[5];//массив строк
        array_myString[0] = new MyString();
        array_myString[1] = new MyString("helloWorld");//создание строки из строки
        array_myString[2] = new MyString();
        array_myString[3] = new MyString("World");//создание строки из строки
        char[] data = {'a','b','c','d'};
        array_myString[4]= new MyString(data);//создание строки из массива char
        int i;
        for(i = 0; i<5; i++){
            informationStroke = "myString[" + (i + 1) + "]: ";//сложение строк
            System.out.print((informationStroke));
            array_myString[i].Print();
            System.out.print("\n");
        }
        System.out.print("Функция charAt - вовзращает char по указанному индексу, функция codePointAt возвращает Юникод этого символа:\n");
        for(i = 0; i<5; i++){
            informationStroke = "myString[" + (i + 1) + "] index 3: " + array_myString[i].myString.charAt(3)+" Юникод "  + array_myString[i].myString.codePointAt(3)+ "\n";//сложение строк
            System.out.print((informationStroke));
        }
        System.out.print("Результат сравнения 1 и 2 строки методом compareTo - лексикографически сравнивает две строки: " + array_myString[0].myString.compareTo(array_myString[1].myString)+"\n");
        System.out.print("Результат сравнения 1 и 3 строки методом compareTo - лексикографически сравнивает две строки: " + array_myString[0].myString.compareTo(array_myString[2].myString)+"\n");
        System.out.print("Результат сравнения 1 и 2 строки методом compareToIgnoreCase - лексикографически сравнивает две строки, игнорируя регистр Различия: " + array_myString[0].myString.compareToIgnoreCase(array_myString[1].myString)+"\n");
        System.out.print("Результат сравнения 1 и 3 строки методом compareToIgnoreCase - лексикографически сравнивает две строки, игнорируя регистр Различия: " + array_myString[0].myString.compareToIgnoreCase(array_myString[2].myString)+"\n");
        System.out.print("Результат contains(Возвращает true тогда и только тогда, когда эта строка содержит указанное значение последовательность значений char) 4 строки в 1: " +  array_myString[0].myString.contains(array_myString[3].myString)+"\n");
        System.out.print("Результат сравнения 1 и 2 строки методом equals - Сравнивает эту строку с указанным объектом: " + array_myString[0].myString.equals(array_myString[1].myString)+"\n");
        System.out.print("Результат сравнения 1 и 3 строки методом equals - Сравнивает эту строку с указанным объектом: " + array_myString[0].myString.equals(array_myString[2].myString)+"\n");
        System.out.print("Результат сравнения 1 и 2 строки методом equalsIgnoreCase - Сравнивает это с другим , игнорируя случай Соображения.StringString: " + array_myString[0].myString.compareToIgnoreCase(array_myString[1].myString)+"\n");
        for(i = 0; i<5; i++){
            informationStroke = "myString[" + (i + 1) + "]: ";//сложение строк
            System.out.print((informationStroke));
            System.out.print("результат hashCode(Возвращает хэш-код для строки): " +  array_myString[i].myString.hashCode()+"\n");
        }
        System.out.print("Функция split(String regex) разбивает эту строку вокруг совпадений с заданным регулярным выражением"+"\n");
        informationStroke = "boo:and:foo";
        String[] arrOfStr = informationStroke.split(":");
        System.out.print("Дана строка" + informationStroke+"\n");
        System.out.print("regex = :" +"\n");
        for (String a : arrOfStr){
            System.out.print(a+" ");
        }
        arrOfStr = informationStroke.split("o");
        System.out.print("\nregex = o" +"\n");
        for (String a : arrOfStr){
            System.out.print(a+" ");
        }
    }
}
