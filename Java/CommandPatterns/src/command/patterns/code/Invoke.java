package command.patterns.code;

public class Invoke {
    ICommand cmd;
    public void ExecuteCommand(ICommand cmd)
    {
        this.cmd = cmd;
        cmd.Execute();
    }
}
