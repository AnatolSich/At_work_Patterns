package OState;

/*Mixed structure of pattern (buisness logic is in context-object and in state-objects)*/

public class StateTest {
    public static void main(String[] args) {

        //init smartphon with initial state
        State initState = new TurnedOn();
        SmartphoneContext smartphone = new SmartphoneContext(100, initState);
        initState.setContext(smartphone);

        smartphone.pushButton();

        //turn logic to smartphon-object
        smartphone.setCharge(0);

        smartphone.pushButton();

        //turn logic to state-objects again
        smartphone.setCharge(80);
        smartphone.pushButton();
        smartphone.pushButton();
        smartphone.pushButton();
    }
}
