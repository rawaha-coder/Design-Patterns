package command.patterns.code;

public class CloseSwitchCommand implements ICommand{
    private ISwitchable switchable;

    public CloseSwitchCommand(ISwitchable switchable)
    {
        this.switchable = switchable;
    }
    @Override
    public void Execute() {
        switchable.PowerOn();
    }
}
