import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Stack_Array<T> {
    private List<T> stack;

    public Stack_Array() {
        this.stack = new ArrayList<>();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void push(T item) {
        stack.add(item);
        System.out.println("Добавлен элемент: " + item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T item = stack.remove(stack.size() - 1);
        System.out.println("Удален элемент: " + item);
        return item;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.get(stack.size() - 1);
    }

    public static void main(String[] args) {
        Stack_Array<Integer> stack = new Stack_Array<>();

        stack.push(4);
        stack.push(6);
        stack.push(9);

        System.out.println("Верхний элемент: " + stack.peek());

        stack.pop();
        stack.pop();
        stack.pop();

        try {
            System.out.println("Верхний элемент: " + stack.peek()); // Возникнет исключение
        } catch (EmptyStackException e) {
            System.out.println("Стек пуст.");
        }
    }
}

