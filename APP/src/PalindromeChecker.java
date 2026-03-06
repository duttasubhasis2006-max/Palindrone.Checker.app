import java.util.*;

interface PalindromeStrategy {
    boolean isPalindrome(String str);
}

class StackStrategy implements PalindromeStrategy {
    public boolean isPalindrome(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            stack.push(c);
        }
        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

class DequeStrategy implements PalindromeStrategy {
    public boolean isPalindrome(String str) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : str.toCharArray()) {
            deque.add(c);
        }
        while (deque.size() > 1) {
            if (deque.pollFirst() != deque.pollLast()) {
                return false;
            }
        }
        return true;
    }
}

public class PalindromeChecker {

    static PalindromeStrategy strategy;

    public static void setStrategy(PalindromeStrategy strategy) {
        PalindromeChecker.strategy = strategy;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int choice = sc.nextInt();

        if (choice == 1) {
            setStrategy(new StackStrategy());
        } else {
            setStrategy(new DequeStrategy());
        }

        if (strategy.isPalindrome(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}