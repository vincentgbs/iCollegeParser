import java.io.File;

public class TriangleTest {

    public static void main(String[] args) throws Exception {
        boolean correct = true;
        TriangleClient test = new TriangleClient();
        Triangle triangle = new Triangle(2, 3, 4);
        if (!triangle.toString().equals("side1: 2, side2: 3, side3: 4")) {
            // correct = false;
        }
        if (triangle.isEquilateral()) {
            correct = false;
        }
        if (triangle.isIsoceles()) {
            correct = false;
        }
        if (triangle.isScalene() != true) {
            correct = false;
        }
        if (triangle.getSide1() != 2) {
            correct = false;
        }
        if (triangle.getSide2() != 3) {
            correct = false;
        }
        if (triangle.getSide3() != 4) {
            correct = false;
        }

        triangle = new Triangle(4, 3, 2);
        if (triangle.isEquilateral()) {
            correct = false;
        }
        if (triangle.isIsoceles()) {
            correct = false;
        }
        if (triangle.isScalene() != true) {
            correct = false;
        }
        if (triangle.getSide1() != 4) {
            correct = false;
        }
        if (triangle.getSide2() != 3) {
            correct = false;
        }
        if (triangle.getSide3() != 2) {
            correct = false;
        }

        triangle = new Triangle(2, 4, 3);
        if (triangle.isEquilateral()) {
            correct = false;
        }
        if (triangle.isIsoceles()) {
            correct = false;
        }
        if (triangle.isScalene() != true) {
            correct = false;
        }
        if (triangle.getSide1() != 2) {
            correct = false;
        }
        if (triangle.getSide2() != 4) {
            correct = false;
        }
        if (triangle.getSide3() != 3) {
            correct = false;
        }

        triangle = new Triangle(3, 2, 3);
        if (triangle.isEquilateral()) {
            correct = false;
        }
        if (triangle.isScalene()) {
            correct = false;
        }
        if (triangle.isIsoceles() != true) {
            correct = false;
        }
        if (triangle.getSide1() != 3) {
            correct = false;
        }
        if (triangle.getSide2() != 2) {
            correct = false;
        }
        if (triangle.getSide3() != 3) {
            correct = false;
        }

        triangle = new Triangle(3, 3, 2);
        if (triangle.isEquilateral()) {
            correct = false;
        }
        if (triangle.isScalene()) {
            correct = false;
        }
        if (triangle.isIsoceles() != true) {
            correct = false;
        }
        if (triangle.getSide1() != 3) {
            correct = false;
        }
        if (triangle.getSide2() != 3) {
            correct = false;
        }
        if (triangle.getSide3() != 2) {
            correct = false;
        }

        triangle = new Triangle(3, 3, 3);
        if (triangle.isIsoceles()) {
            // correct = false;
        }
        if (triangle.isScalene()) {
            correct = false;
        }
        if (triangle.isEquilateral() != true) {
            correct = false;
        }
        if (triangle.getSide1() != 3) {
            correct = false;
        }
        if (triangle.getSide2() != 3) {
            correct = false;
        }
        if (triangle.getSide3() != 3) {
            correct = false;
        }

        if (correct) {
            // Triangle class is correct
            // Triangle and TriangleClient both compile correctly
            File dir = new File(".");
            File tmp = new File(dir, "Triangle correct " + args[0]);
            tmp.createNewFile();
        }
        /* else: Requires individual analysis of code */

    }

}
