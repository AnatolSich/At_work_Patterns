package OState;

public interface State {
    void setContext(SmartphoneContext context);

    void action();
}

class ShutDown implements State {

    SmartphoneContext context;

    @Override
    public void setContext(SmartphoneContext context) {
        this.context = context;
    }

    //state-object logic
    @Override
    public void action() {
        State state = new TurnedOn();
        state.setContext(context);
        context.setState(state);
        System.out.println("Smart was turned on!");
    }
}

class TurnedOn implements State {

    SmartphoneContext context;


    @Override
    public void setContext(SmartphoneContext context) {
        this.context = context;
    }

    //state-object logic
    @Override
    public void action() {
        State state = new Locked();
        state.setContext(context);
        context.setState(state);
        System.out.println("Smart was locked!");
    }
}

class Locked implements State {

    SmartphoneContext context;


    @Override
    public void setContext(SmartphoneContext context) {
        this.context = context;
    }

    //state-object logic
    @Override
    public void action() {
        State state = new ShutDown();
        state.setContext(context);
        context.setState(state);
        System.out.println("Smart was shut down!");
    }
}



