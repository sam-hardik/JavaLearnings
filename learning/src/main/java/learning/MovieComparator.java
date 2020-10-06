package learning;

import java.util.Comparator;

public class MovieComparator implements Comparator<Movie_Details> {

	public int compare(Movie_Details m1, Movie_Details m2) {
		// TODO Auto-generated method stub
		int l = m1.getMov_Name().compareTo(m2.getMov_Name());
	    return l == 0 ? m2.getMov_Name().compareTo(m2.getMov_Name()) : l;
	}
	
}