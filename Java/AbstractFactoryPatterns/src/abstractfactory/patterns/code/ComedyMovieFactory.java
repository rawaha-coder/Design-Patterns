package abstractfactory.patterns.code;

public class ComedyMovieFactory implements IMovieFactory{
    public IHollywoodMovie GetHollywoodMovie()
    {
        return new HollywoodComedyMovie();
    }
    public IBollywoodMovie GetBollywoodMovie()
    {
        return new BollywoodComedyMovie();
    }
}
