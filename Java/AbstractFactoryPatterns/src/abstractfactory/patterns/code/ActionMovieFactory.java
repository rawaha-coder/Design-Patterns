package abstractfactory.patterns.code;

public class ActionMovieFactory implements IMovieFactory{
    public IHollywoodMovie GetHollywoodMovie() {
        return new HollywoodActionMovie();
    }

    public IBollywoodMovie GetBollywoodMovie() {
        return new BollywoodActionMovie();
    }
}
