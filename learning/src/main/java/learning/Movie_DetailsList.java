package learning;

import java.util.Set;
import java.util.TreeSet;

public class Movie_DetailsList {
	
	Set<Movie_Details> movies = new TreeSet<Movie_Details>();
	
	public void add_movie(Movie_Details m) {
		movies.add(m);
	}
	public void remove_movie(Movie_Details m) {
		movies.remove(m);
	}
	
	public void remove_AllMovies(Movie_Details m) {
		movies.clear();
	}
	public void find_movie_By_mov_Name(String name) {
		for(Movie_Details m: movies) {
			if(m.getMov_Name().equalsIgnoreCase(name)) {
				System.out.println(m.getMov_Name() + " "  + m.getLead_Actor() +  " " + m.getLead_Actress() + " " + 
			m.getGenre());
			}
		}
	}
	public void find_movie_By_Genre(String genre) {
		for(Movie_Details m: movies) {
			if(m.getGenre().equalsIgnoreCase(genre)) {
				System.out.println(m.getMov_Name() + " "  + m.getLead_Actor() +  " " + m.getLead_Actress() + " " + 
			m.getGenre());
			}
		}
	}
	public void sortMovieBasedOnString(String s) {
		Set<Movie_Details> newMovies = new TreeSet<Movie_Details>();
		if(s.equalsIgnoreCase("Name")) {
			newMovies = new TreeSet<Movie_Details>(new MovieComparator());
		}
		movies.addAll(newMovies);
	}
	public void displayMovieList() {
		for( Movie_Details m : movies) {
			System.out.println(m.getMov_Name() + " " + m.getLead_Actor() + " " + m.getLead_Actress() + m.getGenre());
		}
	}
	
}