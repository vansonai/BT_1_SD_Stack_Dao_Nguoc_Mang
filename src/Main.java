import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int[] arrNumber = {2, 5, 7};
        Stack<Integer> stack1 = new Stack<>();
        for (int i : arrNumber) {
            stack1.push(i);
        }
        for (int i = 0; i < arrNumber.length; i++) {
            arrNumber[i] = stack1.pop();
        }

        System.out.println(stack1);
        for (int i : arrNumber) {
            System.out.println(" " + i);
        }
        System.out.println(arrNumber);
    }
}




