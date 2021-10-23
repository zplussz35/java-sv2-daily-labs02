package day05;

public class MovieMain {
    public static void main(String[] args) {
        Movie movie = new Movie("Farkas",2006);
        Viewer viewer = new Viewer();
        viewer.watchMovie(movie,5);
        System.out.println(movie.getGyartasEv()+"-os "+movie.getCim()+" című film értékelése: "+
                movie.getAtlagErtekeles());
    }
}
