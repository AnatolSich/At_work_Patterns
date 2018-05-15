package MMediator;

abstract class Aircraft {
    String name;
    int currentAltitude;
    DispatcherMediator dispatcherMediator;

    public Aircraft(String name, int currentAltitude, DispatcherMediator dispatcherMediator) {
        this.name = name;
        this.currentAltitude = currentAltitude;
        this.dispatcherMediator = dispatcherMediator;
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "name='" + name + '\'' +
                ", currentAltitude=" + currentAltitude +
                '}';
    }

    void sendCurrentAltitude(Aircraft aircraft){
         dispatcherMediator.select(aircraft,currentAltitude);
     }

    public int getCurrentAltitude() {
        return currentAltitude;
    }

    public void setCurrentAltitude(int currentAltitude) {
        this.currentAltitude = currentAltitude;
        System.out.println(this);
    }
}


class LightAirplane extends Aircraft{

    public LightAirplane(String name, int currentAltitude, DispatcherMediator dispatcherMediator) {
        super(name, currentAltitude, dispatcherMediator);
    }


}

class CommercialAirplane extends Aircraft{
    public CommercialAirplane(String name, int currentAltitude, DispatcherMediator dispatcherMediator) {
        super(name, currentAltitude, dispatcherMediator);
    }

}

class PersonalJet extends Aircraft{

    public PersonalJet(String name, int currentAltitude, DispatcherMediator dispatcherMediator) {
        super(name, currentAltitude, dispatcherMediator);
    }

}