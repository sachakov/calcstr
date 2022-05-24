package Calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

    public int calculate(String expression) {

        Pattern pattern = Pattern.compile("-*\\d+", Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(expression);

        int sum = 0;

        while (matcher.find()) {
            sum += Integer.parseInt(matcher.group(0));
        }
        return sum;
    }
}

