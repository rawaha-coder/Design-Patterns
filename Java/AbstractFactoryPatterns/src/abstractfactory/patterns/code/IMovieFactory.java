package abstractfactory.patterns.code;

public interface IMovieFactory {
    IHollywoodMovie GetHollywoodMovie();
    IBollywoodMovie GetBollywoodMovie();
}
