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
    static void ShowWorkString(){
        String defaultStr;
        MyString[] array_myStr = new MyString[3];
        array_myStr[0] = new MyString();
        array_myStr[1] = new MyString("HelloWorld_2");
        char[] data = {'a','b','c','d'};
        array_myStr[2]= new MyString(data);
        int i;
        for(i = 0; i<3; i++){
            defaultStr = "myStr" + (i + 1) + ": ";
            System.out.print((defaultStr));
            array_myStr[i].Print();
            System.out.print("\n");
        }
    }
}
