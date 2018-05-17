package PTemplateMethod;

abstract class HouseBuildAbstract {

    public House templateMethod(int roomNumber, int windowNumber, Boolean garage) {
        //default step
        House house = createHouse();
        //default step
        defRoomNumber(house, roomNumber);
        //optional step
        defWindowNumber(house, windowNumber);
        //mandatory realization step
        if (house.getRoomNumber() >= 5) defDoorNumber(house);
        //mandatory realization step
        defRoofType(house);
        //optional step
        defHeatingType(house);
        //mandatory realization step
        defAttic(house);
        //optional step
        defGarage(house, garage);
        return house;
    }

    //default step
    public House createHouse() {
        return new House();
    }

    //default step
    public void defRoomNumber(House house, int roomNumber) {
        house.setRoomNumber(roomNumber);
        house.setWindowNumber(roomNumber);
    }

    //optional step (hook method)
    public void defWindowNumber(House house, int windowNumber) {
    }

    //mandatory realization step
    abstract void defDoorNumber(House house);

    //mandatory realization step
    abstract void defRoofType(House house);

    //optional step (hook method)
    public void defHeatingType(House house) {
    }

    //mandatory realization step
    abstract void defAttic(House house);

    //optional step (hook method)
    public void defGarage(House house, Boolean garage) {
    }
}

class HouseTypeA extends HouseBuildAbstract {

    @Override
    public void defRoomNumber(House house, int roomNumber) {
       super.defRoomNumber(house,3);
    }

    @Override
    void defDoorNumber(House house) {
        house.setDoorNumber(3);
    }

    @Override
    void defRoofType(House house) {
        house.setRoofType("single-pitch");
    }

    @Override
    void defAttic(House house) {
        house.setAttic(false);
    }
}

class HouseTypeB extends HouseBuildAbstract {

    @Override
    public void defRoomNumber(House house, int roomNumber) {
        if (roomNumber >= 4 & roomNumber <= 6) super.defRoomNumber(house, roomNumber);
        else super.defRoomNumber(house, 5);
    }

    @Override
    void defDoorNumber(House house) {
        house.setDoorNumber(2);
    }

    @Override
    void defRoofType(House house) {
        house.setRoofType("multiple-pitch");
    }

    @Override
    public void defHeatingType(House house) {
        house.setHeatingType("continuous heating");
    }

    @Override
    void defAttic(House house) {
        if (house.roomNumber >= 6) house.setAttic(true);
    }
}

class HouseTypeC extends HouseBuildAbstract {

    @Override
    public void defRoomNumber(House house, int roomNumber) {
        if (roomNumber >= 7) super.defRoomNumber(house, roomNumber);
        else super.defRoomNumber(house, 7);
    }


    @Override
    void defDoorNumber(House house) {
        house.setDoorNumber(4);
    }

    @Override
    void defRoofType(House house) {
        house.setRoofType("multiple-pitch");
    }

    @Override
    public void defHeatingType(House house) {
        house.setHeatingType("discontinuous heating");
    }

    @Override
    void defAttic(House house) {
        house.setAttic(true);
    }

    @Override
    public void defGarage(House house, Boolean garage) {
        house.setGarage(true);
    }
}
