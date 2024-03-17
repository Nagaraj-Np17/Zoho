package com.zsgs.librarymanagement.managebook;

import java.util.List;
import java.util.Scanner;

import com.zsgs.librarymanagement.model.Book;

public class ManageBookView {
private ManageBookModel manageBookModel;
	
	public ManageBookView() {
		manageBookModel = new ManageBookModel(this);
	}

	public void initAdd() {
		Scanner sc = new Scanner(System.in);
		Book book = new Book();
		
		System.out.println("Enter the Book Name:");
		book.setName(sc.nextLine());
		System.out.println("Enter The Book Id");
		book.setId(sc.nextInt());
		System.out.println("Enter the Book Author:");
		book.setAuthor(sc.nextLine());
		System.out.println("Enter the publication:");
		book.setAuthor(sc.nextLine());
		book.setPublication(sc.nextLine());
		System.out.println("Enter the Book edition:");
		book.setEdition(sc.nextLine());
		System.out.println("Enter the Book Journer:");
		book.setJourner(sc.nextLine());
		System.out.println("Enter the availableCount of  Book:");
		book.setAvailableCount(sc.nextInt());
		System.out.println("Enter the volume of  Book:");
		book.setVolume(sc.nextInt());
		manageBookModel.addNewBook(book);
	
	}
	public void showLibraryName(String libraryName) {
		System.out.println("Current Library Name - " + libraryName);
	}

	public void onBookExist(Book book) {
		System.out.println("\n------- Book '" + book.getName() + "' already exist -------\n");
		checkForAddNewBook();

		
	}

	public void onBookAdded(Book book) {
		System.out.println("\n------- Book '" + book.getName() + "' added successfully ------- \n");
		checkForAddNewBook();
		
	}
	private void checkForAddNewBook() {
		System.out.println("\nDo you want to add more books? \nType Yes/No");
		Scanner scanner = new Scanner(System.in);
		String choice = scanner.next();
		if (choice.equalsIgnoreCase("yes")) {
			initAdd();
		} else if (choice.equalsIgnoreCase("no")) {
			System.out.println("\n Thanks for adding books");
		} else {
			System.out.println("\nInvalid choice, Please enter valid choice.\n");
			checkForAddNewBook();
		}
	}


	public void viewBook() {
		manageBookModel.getBookInfo();
		
	}

	public void printBooks(List<Book> bookInfo) {
		if  (bookInfo.size()==0){
			System.out.println("Empty");
		}
		  for(Book model : bookInfo) {
	            System.out.println(model.getName()+" "+model.getId()+" "+model.getAuthor()+" "
	            		+model.getPublication()+" "+model.getJourner()+" "+model.getEdition()+
	            		model.getVolume()+" "+model.getAvailableCount());
	        }

		
	}
	
	
	
	
	
	
	

}
