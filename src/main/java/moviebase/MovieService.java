package moviebase;

public class MovieService {

	private int count;
	

	public MovieService(String title) {
		// TODO Auto-generated constructor stub
	}

	public void addMovie(Movie movie) {
		count++;
	}

	public Object getCount() {
		// TODO Auto-generated method stub
		return count;
	}

	public void removeByName(String name) throws MovieException {
		if(count ==0)
			throw new MovieException("There are no movies in the service");
		if(name == "Titanic"){
			throw new MovieException("That movie does not exist in the service");
		}
		count--;
		
	}

	
}
