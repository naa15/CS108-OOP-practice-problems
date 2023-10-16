package interfaces;

public class Mobile extends Phone {
    @Override
    public void makeCall(String number) {
        System.out.println("Make call " + number);
    }

    @Override
    public void on() {
        System.out.println("on");
    }

    @Override
    public void off() {
        System.out.println("off");
    }

    @Override
    public void plugin() {
        System.out.println("plugin");
    }
}
