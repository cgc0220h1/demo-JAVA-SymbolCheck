import java.util.Stack;

public class StringCheck {
    private Stack<Character> bracketStack;
    private char[] chars;
    private String input;

    public StringCheck(String input) {
        this.input = input;
        bracketStack = new Stack<>();
    }

    public boolean isValidString() {
        chars = input.toCharArray();
        for (char ch : chars) {
            if (ch == '(') {
                bracketStack.push(ch);
            } else if (ch == ')') {
                if (bracketStack.isEmpty()) {
                    return false;
                }
                bracketStack.pop();
            }
        }
        return bracketStack.isEmpty();
    }
}
