package com.vcubeprojects;

public class LibraryBook {
	
	static int avacopies = 5 ;
	
	int bookid;
	String bookTitle;
	String authorName;
	int availableCopies;
	
	static String libraryName;
	static String librarianName;
	


	
	void displayBookDetails() {
		System.out.println("bookid: "+bookid);
		System.out.println("bookTitle: "+bookTitle);
		System.out.println("AuthorName: "+authorName);
	}
	void issueBook() {
	   
		avacopies--;
			System.out.println("remaining books:" +avacopies);
	}

	public static void main(String[] args) {
		
		LibraryBook l1 = new LibraryBook();
		l1.bookid = 112;
		l1.bookTitle = "fairy tail";
		l1.authorName = "Robart";
	
		
		l1.issueBook();
		l1.displayBookDetails();
		
		LibraryBook l2 = new LibraryBook();
		l1.bookid = 124;
		l1.bookTitle = "fairy tail";
		l1.authorName = "Robart";

		l1.issueBook();
		l1.displayBookDetails();
		
		
		
		

	}

}
