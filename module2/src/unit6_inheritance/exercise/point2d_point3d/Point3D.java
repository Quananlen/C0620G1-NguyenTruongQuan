package unit6_inheritance.exercise.point2d_point3d;

public class Point3D extends Point2D {
    private float z = 0.0f;
    public Point3D() {
    }
    public Point3D(float z) {
        this.z = z;
    }
    public Point3D(float z, float x, float y){
        super(x,y);
        this.z=z;
    };
    public float getZ() { return z; }
    public void setZ(float z) { this.z = z; }

    public float[] getXYZ() {
       return new float[] {getX(),getY(),this.z} ;
    }
    public void setXYZ(float x, float y, float z) {
        this.z = z;
        this.setX(x);
        this.setY(y);
    }
    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                '}'+super.toString();
    }
}
