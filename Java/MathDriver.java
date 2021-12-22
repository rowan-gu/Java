public class MathDriver{
    public static void main(String[] args){

        // both an assignment and a declaration
        MathClass tester = new MathClass();

        boolean result = tester.rightTriangleTest(5, 3, 4); // True

        System.out.println(result);

        result = tester.rightTriangleTest(5.3, 3.0, 4.0); // false

        System.out.println(result);
    }
}
