import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Vector v2 = new Vector2D(2, 5);
        Vector v3 = new Vector3D(3, 7, 6);

        System.out.println(v2.getInfo());
        System.out.println(v3.getInfo());

        System.out.println("\nLength of 2D vector: " + v2.length());
        System.out.println("Length of 3D vector: " + v3.length());

        System.out.println("\nScalar product of two 2D vectors: " + v2.scalarProduct(new Vector2D(1, 1)));
        System.out.println("Scalar product of two 3D vectors: " + v3.scalarProduct(new Vector3D(2, 1, 1)));

        System.out.println("\nThe result of adding two 2D vectors: \n" + v2.add(new Vector2D(1, 3)));
        System.out.println("The result of adding two 3D vectors: \n" + v3.add(new Vector3D(4, 3, 5)));

        System.out.println("\nThe result of the difference of two 2D vectors: \n" +
                v2.subtract(new Vector2D(2, 7)));
        System.out.println("The result of the difference of two 3D vectors: \n" +
                v3.subtract(new Vector3D(8, 3, 5)));

        System.out.println("\nArray of random vectors 2D: \n" + Arrays.toString(Vector2D.arrayOfVectors(5)));
        System.out.println("Array of random vectors 3D: \n" + Arrays.toString(Vector3D.arrayOfVectors(4)));
    }
}