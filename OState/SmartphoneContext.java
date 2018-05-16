package OState;

public class SmartphoneContext {

    int charge;
    State state;

    public SmartphoneContext(int charge, State state) {
        this.charge = charge;
        this.state = state;
        this.state.setContext(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }

    // context-object logic
    public void pushButton() {
        if (this.charge == 0) {
            this.state = new ShutDown();
            this.state.setContext(this);
            action();
        } else
            action();
    }

    public void action(){
        state.action();
    }
}
