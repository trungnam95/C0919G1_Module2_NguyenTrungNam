package Models;

public class Villa extends House {
    private float poolArea;

    public Villa(String serviceName, double areaUsed, double rentCost, int amountPeople, String typeRent, String ID,
                 String standardRoom, String comfortDescription, int amountFloors, float poolArea) {
        super(serviceName, areaUsed, rentCost, amountPeople, typeRent, ID, standardRoom, comfortDescription, amountFloors);
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
