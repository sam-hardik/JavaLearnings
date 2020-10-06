package learning;

import static org.junit.Assert.*;

import org.junit.Test;

public class MovieDetailsTest {

	@Test
	public void test() {
		Movie_Details movie1 = new Movie_Details("Dark","Jonas","Hannah","Fiction");
		Movie_Details movie2 = new Movie_Details("BreakingBad","Walter","Skyler","Crime");
		Movie_Details movie3 = new Movie_Details("Suits","Harvey","Donna","Drama");
		Movie_Details movie4 = new Movie_Details("Fast&Furious","Vin Diesel","Hannah","Action");
		Movie_Details movie5 = new Movie_Details("Alibaba","Jonas","Hannah","SciFi");
		
		Movie_DetailsList list = new Movie_DetailsList();
		list.add_movie(movie2);
		list.add_movie(movie1);
		list.add_movie(movie3);
		list.add_movie(movie4);
		list.add_movie(movie5);
		list.displayMovieList();
		list.sortMovieBasedOnString("name");
		list.displayMovieList();
	}

}
