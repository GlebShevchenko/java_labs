
public class Main {
    public static void main(String[] args) {
        try {
            Triple<String> triple1 = new Triple<>("A", "B", "C");
            System.out.println("Triple<>(\"A\", \"B\", \"C\")");
            System.out.println("Min: " + triple1.min());
            System.out.println("Max: " + triple1.max());
            System.out.println("Mean: " + triple1.mean());
        } catch (RuntimeException e) {
            System.out.println("Exeption: " + e.getMessage());
        }
        try {
            Triple<Integer> triple1 = new Triple<>(1, 2, 3);
            System.out.println("Triple<>(1, 2, 3)");
            System.out.println("Min: " + triple1.min());
            System.out.println("Max: " + triple1.max());
            System.out.println("Mean: " + triple1.mean());
        } catch (RuntimeException e) {
            System.out.println("Exeption: " + e.getMessage());
        }

        try {
            Triple<Double> triple2 = new Triple<>(1.1, 1.2, 1.3);
            System.out.println("Triple<>(1.1, 1.2, 1.3)");
            System.out.println("Min: " + triple2.min());
            System.out.println("Max: " + triple2.max());
            System.out.println("Mean: " + triple2.mean());
        } catch (RuntimeException e) {
            System.out.println("Exeption: " + e.getMessage());
        }
    }
}