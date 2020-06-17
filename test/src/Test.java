import javax.jws.soap.SOAPBinding;

public class Test {
    public static void main(String[] args) {
        // 泛型方法 printArray
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
        User user=new User(1);
        int a=1;
        printArray(intArray,a);
    }

    public static < E , G > void printArray( E[] inputArray ,G str){
        // 输出数组元素
        for ( E element : inputArray ){
            System.out.printf( "%s ", str.toString() );
        }
        System.out.println();
    }
}

class User {
        private int num;
        User(int num){
            this.num=num;
        }

    @Override
    public String toString() {
        return "User{" +
                "num=" + num +
                '}';
    }
}
