package moviebase;

import static org.junit.Assert.assertEquals;
import moviebase.Movie;
import moviebase.MovieService;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MovieServiceTest {

	private MovieService movieService;

	@BeforeMethod
	public void setUp() {
		movieService = new MovieService("VMware Movie Night");
	}

	@Test
	public void addAMovieandGetTheTotal() {
		// subject under test
		movieService.addMovie(new Movie("E.T- The Extra Terrestial"));
		movieService.addMovie(new Movie("Wall-E"));
		assertEquals(movieService.getCount(), 2);
	}

	@Test
	public void addOneMovieAndGetTheTotal() {
		// subject under test
		movieService.addMovie(new Movie("Wall-E"));
		assertEquals(movieService.getCount(), 1);

	}

	@Test
	public void getTheTotalWithNoMovies() {
		// subject under test
		assertEquals(movieService.getCount(), 0);

	}
	
	@Test
	public void removeAMovieAndGettheTotal() {
		movieService.addMovie(new Movie("ABC"));
		movieService.addMovie(new Movie("Wall-E"));
		movieService.removeByName("Wall-E");
		assertEquals(movieService.getCount(), 1);		
	}
	
	@Test
	public void removeAMovieFromAnEmptyService() {
		
	}
	
	@Test
	public void removeAMovieThatDosentExist() {
		
	}
	
}
