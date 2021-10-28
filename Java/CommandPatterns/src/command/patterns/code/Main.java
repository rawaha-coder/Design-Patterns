package command.patterns.code;

public class Main {

    public static void main(String[] args) {
        System.out.println("***Command Pattern Code***\n");

        ISwitchable lamp = new Light();

        // Pass reference to the lamp instance to each command
        ICommand switchClose = new CloseSwitchCommand(lamp);
        ICommand switchOpen = new OpenSwitchCommand(lamp);

        /*Client holds Invoker and Command Objects*/
        Invoke invoke = new Invoke();
        invoke.ExecuteCommand(switchClose);
        invoke.ExecuteCommand(switchOpen);
    }
}
