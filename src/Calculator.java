public class Calculator {

    int add(int x , int y) {
        return ( x + y );
    }

    int subtract(int x , int y) {
        return ( x - y );
    }

    int multiply(int x , int y) {
        return ( x * y );
    }

    int factorial(int x) {
        return (x == 1) ? 1 : x * factorial(x - 1);
    }
}
