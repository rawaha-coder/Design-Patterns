package decorator.patterns.code;

public class AbstractDecorator extends Component{
    protected Component component ;
    public void SetTheComponent(Component component)
    {
       this.component = component;
    }
    @Override
    public void doJob() {
        if (component != null)
        {
            component.doJob();
        }
    }
}
