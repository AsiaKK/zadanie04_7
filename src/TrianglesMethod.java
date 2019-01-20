public class TrianglesMethod {

    public boolean isRightTriangle(Triangle triangle){
        double a = triangle.getA();
        double b = triangle.getB();
        double c = triangle.getC();

        boolean result = (a * a + b * b - c * c == 0);
        return result;
    }
}
