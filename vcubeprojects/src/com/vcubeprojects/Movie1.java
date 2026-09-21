package com.vcubeprojects;

public class Movie1 {
	int movieid;
	String movieName;
	String heroName;
	static int availableSeats = 22;
	static String theaterName = "sree ramulu";
	static String managerName = "Ramulu";
	
	void displayMovieDetails() {
		System.out.println("movieid: "+movieid);
		System.out.println("movieName: "+movieName);
		System.out.println("heroname: "+heroName);
		
	}
	
	void bookSeat() {
		availableSeats--;
		System.out.println("availableSeats: "+availableSeats);
	}
	
	static void displayTheaterDetails() {
		System.out.println("theaterName: "+theaterName);
		System.out.println("ManagerName: "+ managerName);
	}
	
	static void changeManager() {
		String managerName = "Dinesh";
		System.out.println("theaterNmae: "+theaterName);
		System.out.println("managerName: "+managerName);
	}
	
	

	public static void main(String[] args) {
		Movie1 m1 = new Movie1();
		m1.movieid = 1021;
		m1.movieName = "Toxic";
		m1.heroName = "Yash";
		m1.displayMovieDetails();
		m1.bookSeat();
		displayTheaterDetails();
		System.out.println();
		
		Movie1 m2 = new Movie1();
		m2.movieid = 1045;
		m2.movieName = "irumudhi";
		m2.heroName = "Ravi Teja";
		m2.displayMovieDetails();
		m2.bookSeat();
		changeManager();
		
		

	}

}
