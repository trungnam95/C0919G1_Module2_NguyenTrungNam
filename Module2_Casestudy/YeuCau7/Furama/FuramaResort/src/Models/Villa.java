package Models;

public class Villa extends House {
    private float poolArea;

    public Villa(String serviceName, double areaUsed, double rentCost, int amountPeople,
                 String standardRoom, String comfortDescription, String amountFloors, float poolArea) {
        super(serviceName, areaUsed, rentCost, amountPeople, standardRoom, comfortDescription, amountFloors);
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


    public String showInfor() {
        return
                        super.showInfor()+
                        "\npoolarea:" + this.poolArea;

    }
}
