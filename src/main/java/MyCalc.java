

public class MyCalc {

    double sum;
    double product;
    double difference;
    double fraction;

    double product (double a, double b) {
        return a * b;
    }
    double difference (double a, double b) {
        return a - b;
    }
    double fraction (double a, double b) {
        return a / b;
    }

    double sum (double ... values) {
        double sum = 0;
        for (double i : values) {
            sum += i;
        }
        return sum;

    }

}
