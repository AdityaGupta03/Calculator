public class Calculator {

    int add( int x , int y ) {
        return ( x + y );
    }

    int subtract( int x , int y ) {
        return ( x - y );
    }

    int multiply( int x , int y ) {
        return ( x * y );
    }

    int factorial( int x ) {
        int result = x;
        for ( int i = x - 1; i > 0; i-- ) {
            result = this.multiply( i , result);
        }
        return result;
    }
}
