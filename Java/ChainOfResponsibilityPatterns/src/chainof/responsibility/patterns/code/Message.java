package chainof.responsibility.patterns.code;

public class Message {
    public String Text;
    public MessagePriority Priority;
    public Message(String msg, MessagePriority p){
        Text = msg;
        this.Priority = p;
    }
}

enum MessagePriority
{
    Normal,
    High
}
