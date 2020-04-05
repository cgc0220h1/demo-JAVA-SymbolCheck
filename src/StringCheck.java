import java.util.Stack;

public class StringCheck {
    public static final char LEFT_SYMBOL = '(';
    public static final char RIGHT_SYMBOL = ')';
    private Stack<Character> bracketStack;
    private String input;

    public StringCheck(String input) {
        this.input = input;
        bracketStack = new Stack<>();
    }

    public boolean isValidString() {
        char[] chars = input.toCharArray();
        for (char ch : chars) {
            if (ch == LEFT_SYMBOL) {
                bracketStack.push(ch);
            } else if (ch == RIGHT_SYMBOL) {
                if (bracketStack.isEmpty()) {
                    return false;
                }
                bracketStack.pop();
            }
        }
        return bracketStack.isEmpty();
    }
}
