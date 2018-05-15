package MMediator;

import java.util.ArrayList;
import java.util.List;

public interface DispatcherMediator {
    void select(Aircraft aircraft, int currentAltitude);
}

class ConcreteDispatcherMediator implements DispatcherMediator {

    List<Aircraft> aircrafts = new ArrayList<>();

    @Override
    public void select(Aircraft aircraft, int currentAltitude) {
        if (aircraft.getClass().getSimpleName().equals(LightAirplane.class.getSimpleName())) {
            lightAirplaneReact(aircraft, currentAltitude);
        } else if (aircraft.getClass().getSimpleName().equals(CommercialAirplane.class.getSimpleName())) {
            commercialAirplaneReact(aircraft, currentAltitude);
        } else if (aircraft.getClass().getSimpleName().equals(PersonalJet.class.getSimpleName())) {
            personalJet(aircraft, currentAltitude);
        }
        aircrafts.add(aircraft);
        System.out.println("***");
    }

    public void lightAirplaneReact(Aircraft aircraft, int currentAltitude) {
        for (Aircraft aircraftTemp : aircrafts
                ) {
            if (aircraftTemp.getClass().getSimpleName().equals(LightAirplane.class.getSimpleName())) {
                int tempAltitude = aircraftTemp.getCurrentAltitude();
                aircraftTemp.setCurrentAltitude(tempAltitude - 100);
            }
        }
        aircraft.setCurrentAltitude(10000);
    }

    public void commercialAirplaneReact(Aircraft aircraft, int currentAltitude) {
        for (Aircraft aircraftTemp : aircrafts
                ) {
            if (aircraftTemp.getClass().getSimpleName().equals(CommercialAirplane.class.getSimpleName())) {
                int tempAltitude = aircraftTemp.getCurrentAltitude();
                aircraftTemp.setCurrentAltitude(tempAltitude - 300);
            }
        }
        aircraft.setCurrentAltitude(30000);
    }

    public void personalJet(Aircraft aircraft, int currentAltitude) {
        for (Aircraft aircraftTemp : aircrafts
                ) {
            if (aircraftTemp.getClass().getSimpleName().equals(PersonalJet.class.getSimpleName())) {
                int tempAltitude = aircraftTemp.getCurrentAltitude();
                aircraftTemp.setCurrentAltitude(tempAltitude - 500);
            }
        }
        aircraft.setCurrentAltitude(45000);
    }

    public void printAllAircrafts() {
        System.out.println("List:");
        for (int i = 0; i < aircrafts.size(); i++) {
            System.out.println(aircrafts.get(i));
        }
    }
}