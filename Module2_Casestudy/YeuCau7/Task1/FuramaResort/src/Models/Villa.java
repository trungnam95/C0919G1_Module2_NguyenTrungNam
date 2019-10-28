package Models;

public class Villa extends House {
    private float poolArea;

    public Villa(String serviceName, double areaUsed, double rentCost, int amountPeople, TypeRent typeRent,
                 String standardRoom, String comfortDescription, String amountFloors, float poolArea) {
        super(serviceName, areaUsed, rentCost, amountPeople, typeRent, standardRoom, comfortDescription, amountFloors);
        this.poolArea = poolArea;
    }

    public Villa() {
    }

    public float getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(float poolArea) {
        this.poolArea = poolArea;
    }

    @Override
    public String toString() {
        return
                super.toString()+
                "\npoolArea=" + poolArea;

    }
}
