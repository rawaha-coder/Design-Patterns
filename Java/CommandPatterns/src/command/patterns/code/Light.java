package command.patterns.code;

public class Light implements ISwitchable{
    @Override
    public void PowerOn() {
        System.out.println("The light is on");
    }

    @Override
    public void PowerOff() {
        System.out.println("The light is off");
    }
}
