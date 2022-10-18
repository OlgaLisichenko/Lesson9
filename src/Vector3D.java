public class Vector3D extends Vector {

    private static final String INFO_V3 = "Это вектор для трёхмерной системы координат";

    public Vector3D(int x, int y, int z) {
        super(x, y, z);
    }

    @Override
    public double length() {
        return Math.sqrt(getX() * getX() + getY() * getY() + getZ() * getZ());
    }

    @Override
    public double scalarProduct(Vector vector) {
        return getX() * vector.getX() + getY() * vector.getY() + getZ() * vector.getZ();
    }

    @Override
    public Vector3D add(Vector vector) {
        return new Vector3D(getX() + vector.getX(), getY() + vector.getY(), getZ() + vector.getZ());
    }

    @Override
    public Vector3D subtract(Vector vector) {
        return new Vector3D(getX() - vector.getX(), getY() - vector.getY(), getZ() - vector.getZ());
    }

    public static Vector[] arrayOfVectors(int n) {
        Vector3D[] vectors3D = new Vector3D[n];
        for (int i = 0; i < vectors3D.length; i++) {
            vectors3D[i] = new Vector3D((int) (Math.random() * 10),
                                        (int) (Math.random() * 10),
                                        (int) (Math.random() * 10));
        }
        return vectors3D;
    }

    @Override
    public String getInfo() {
        return "Vector3D: " +
                "x = " + getX() +
                ", y = " + getY() +
                ", z = " + getZ() +
                "  " + INFO_V3;
    }

    @Override
    public String toString() {
        return "Vector3D:" +
                " x = " + getX() +
                ", y = " + getY() +
                ", z = " + getZ();
    }
}
