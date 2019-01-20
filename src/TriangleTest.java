public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(1, 2, 4);
        Triangle triangle2 = new Triangle(3, 4, 5);

        TrianglesMethod triangleChecker = new TrianglesMethod();

        boolean isFirstTriangleRight = triangleChecker.isRightTriangle(triangle1);
        boolean isSecondTriangleRight = triangleChecker.isRightTriangle(triangle2);

        System.out.println("Is triangle (1,2,4) right? " + isFirstTriangleRight);
        System.out.println("Is triangle (3,4,5) right? " + isSecondTriangleRight);
    }


}
