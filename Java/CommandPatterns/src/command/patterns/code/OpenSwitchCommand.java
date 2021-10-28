package command.patterns.code;

public class OpenSwitchCommand implements ICommand {
    private ISwitchable switchable;

    public OpenSwitchCommand(ISwitchable switchable)
    {
        this.switchable = switchable;
    }

    @Override
    public void Execute()
    {
        switchable.PowerOff();
    }
}
