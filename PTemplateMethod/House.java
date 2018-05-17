package PTemplateMethod;

public class House {
    int roomNumber;
    int windowNumber;
    int doorNumber=1;
    String roofType;
    String heatingType;
    Boolean attic;
    Boolean garage;

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getWindowNumber() {
        return windowNumber;
    }

    public void setWindowNumber(int windowNumber) {
        this.windowNumber = windowNumber;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
    }

    public String getRoofType() {
        return roofType;
    }

    public void setRoofType(String roofType) {
        this.roofType = roofType;
    }

    public String getHeatingType() {
        return heatingType;
    }

    public void setHeatingType(String heatingType) {
        this.heatingType = heatingType;
    }

    public Boolean getAttic() {
        return attic;
    }

    public void setAttic(Boolean attic) {
        this.attic = attic;
    }

    public Boolean getGarage() {
        return garage;
    }

    public void setGarage(Boolean garage) {
        this.garage = garage;
    }

    @Override
    public String toString() {
        return "House{" +
                "roomNumber=" + roomNumber +
                ", windowNumber=" + windowNumber +
                ", doorNumber=" + doorNumber +
                ", roofType='" + roofType + '\'' +
                ", heatingType='" + heatingType + '\'' +
                ", attic=" + attic +
                ", garage=" + garage +
                '}';
    }
}
