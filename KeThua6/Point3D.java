package KeThua;

public class Point3D extends Point2D {
    private float z;

    public Point3D() {

    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        float[] XYZ = {getX(), getY(), this.z};
        return XYZ;
    }

    @Override
    public String toString() {
        return
                super.toString() +
                        ", z=" + z;
    }
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);
    }
}
