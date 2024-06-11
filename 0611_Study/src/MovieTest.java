
public class MovieTest {
	public static void main(String[] args) {
		Movie m = new Movie();
		m.movieName = "기생충";
		m.Director = "봉준호";
		m.date = "2019.05.30";
		
		
		m.showMovieName();
		m.showMovieDirector();
		m.showMovieDate();
	}
}
