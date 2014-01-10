package moviebase;

import static org.junit.Assert.assertEquals;
import moviebase.Movie;
import moviebase.MovieService;

import org.testng.annotations.Test;



public class MovieServiceTest {
	
	@Test
	public void addAMovieandGetTheTotal() {
		//subject under test
		MovieService movieService = new MovieService("VMware Movie Night");
		movieService.addMovie(new Movie("E.T- The Extra Terrestial"));
		movieService.addMovie(new Movie("Wall-E"));
		assertEquals(movieService.getCount(), 2);
	}
}
