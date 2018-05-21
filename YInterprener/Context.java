package YInterprener;

public class Context {

    AbstractExpression evaluate(String s) {
        int position = s.length() - 1;
        while (position > 0) {
            if (Character.isDigit(s.charAt(position))) {
                position--;
            } else {
                AbstractExpression leftExpression = evaluate(s.substring(0, position));
                AbstractExpression rightExpression = new NumberTerminalExpression(
                        Integer.valueOf(s.substring(position + 1, s.length())));
                char operator = s.charAt(position);
                if (operator == '-') {
                    return new MinusNonterminalExpression(leftExpression, rightExpression);
                } else if (operator == '+') {
                    return new PlusNonterminalExpression(leftExpression, rightExpression);
                }
            }

        }

        int result = Integer.valueOf(s);
        return new NumberTerminalExpression(result);
    }
}
