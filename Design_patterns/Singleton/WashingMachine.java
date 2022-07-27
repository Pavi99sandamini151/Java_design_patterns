package singleton;

public class WashingMachine {
    private WashingMachine(){}

    private static WashingMachine getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("i am the singleton object");
    }
}