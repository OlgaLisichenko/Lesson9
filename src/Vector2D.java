public class Vector2D extends Vector {

    private static final String INFO_V2 = "Это вектор для двумерной системы координат";

    public Vector2D(int x, int y) {
        super(x, y);
    }

    @Override
    public double length() {
        return Math.sqrt(getX() * getX() + getY() * getY());
    }

    @Override
    public double scalarProduct(Vector vector) {
        return getX() * vector.getX() + getY() * vector.getY();
    }

    @Override
    public Vector2D add(Vector vector) {
        return new Vector2D(getX() + vector.getX(), getY() + vector.getY());
    }

    @Override
    public Vector2D subtract(Vector vector) {
        return new Vector2D(getX() - vector.getX(), getY() - vector.getY());
    }

    public static Vector2D[] arrayOfVectors(int n) {
        Vector2D[] vectors2D = new Vector2D[n];
        for (int i = 0; i < vectors2D.length; i++) {
            vectors2D[i] = new Vector2D((int) (Math.random() * 10),
                                        (int) (Math.random() * 10));
        }
        return vectors2D;
    }

    @Override
    public String getInfo() {
        return "Vector2D: " +
                "x = " + getX() +
                ", y = " + getY() +
                "  " + INFO_V2;
    }

    @Override
    public String toString() {
        return "Vector2D:" +
                " x = " + getX() +
                ", y = " + getY();
    }
}
