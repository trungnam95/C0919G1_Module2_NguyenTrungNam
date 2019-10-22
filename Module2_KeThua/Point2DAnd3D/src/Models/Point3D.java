package Models;

public class Point3D extends Point2D {
    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y,float z){
        this.z=z;
    }
    public float[] getXYZ(){
        return new float[]{super.getX(),super.getY(),z};
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "Array:{" + super.getX() +","+super.getY()+","+z+"}"+
                '}';
    }
}
