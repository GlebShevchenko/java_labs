import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void validateInput(String input) throws InvalidInputException {
        if (input == null || input.isEmpty() || input == "\n") {
            throw new InvalidInputException("");
        }
    }
    public static void ShoHowWorkScanner(){
        Scanner scanner = new Scanner(System.in);
        String input;
        try{
            System.out.println("\nВведите символы и нажмите enter");
            for (;scanner.hasNext();) {
                input = scanner.next();
                System.out.print(input + " ");
            }
        }
        catch(Exception e){
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        MyString.ShowHowWorkString();
        ShoHowWorkScanner();
    }
}