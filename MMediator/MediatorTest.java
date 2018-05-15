package MMediator;

public class MediatorTest {
    public static void main(String[] args) {
        DispatcherMediator dispatcher = new ConcreteDispatcherMediator();

        Aircraft lightA = new LightAirplane("Sesna", 4000, dispatcher);
        Aircraft lightB = new LightAirplane("An-2", 8000, dispatcher);
        Aircraft lightC = new LightAirplane("An-3", 13000, dispatcher);

        Aircraft commersA = new CommercialAirplane("An-148", 20000, dispatcher);
        Aircraft commersB = new CommercialAirplane("An-158", 80000, dispatcher);
        Aircraft commersC = new CommercialAirplane("An-178", 15000, dispatcher);

        Aircraft personA = new PersonalJet("An-77", 34000, dispatcher);
        Aircraft personB = new PersonalJet("A-300", 34000, dispatcher);
        Aircraft personC = new PersonalJet("Boeing-737", 28000, dispatcher);


        lightB.sendCurrentAltitude(lightB);
        commersA.sendCurrentAltitude(commersA);
        personC.sendCurrentAltitude(personC);
        lightC.sendCurrentAltitude(lightC);
        lightA.sendCurrentAltitude(lightA);
        personB.sendCurrentAltitude(personB);
        commersC.sendCurrentAltitude(commersC);
        personA.sendCurrentAltitude(personA);
        commersB.sendCurrentAltitude(commersB);

        ((ConcreteDispatcherMediator) dispatcher).printAllAircrafts();
    }
}
