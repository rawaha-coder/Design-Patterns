package abstractfactory.patterns.code;

public class Main {

    public static void main(String[] args) {
        System.out.println("***Abstract Factory Pattern Code***");
        ActionMovieFactory actionMovies = new ActionMovieFactory();
        IHollywoodMovie hAction = actionMovies.GetHollywoodMovie();
        IBollywoodMovie bAction = actionMovies.GetBollywoodMovie();
        System.out.println("\nAction movies are:");
        System.out.println(hAction.MovieName());
        System.out.println(bAction.MovieName());
        ComedyMovieFactory comedyMovies = new ComedyMovieFactory();
        IHollywoodMovie hComedy = comedyMovies.GetHollywoodMovie();
        IBollywoodMovie bComedy = comedyMovies.GetBollywoodMovie();
        System.out.println("\nComedy movies are:");
        System.out.println(hComedy.MovieName());
        System.out.println(bComedy.MovieName());
    }
}
