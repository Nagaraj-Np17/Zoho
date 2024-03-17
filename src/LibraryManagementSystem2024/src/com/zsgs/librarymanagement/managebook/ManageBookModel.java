package com.zsgs.librarymanagement.managebook;

import java.util.List;

import com.zsgs.librarymanagement.datalayer.LibraryDatabase;
import com.zsgs.librarymanagement.model.Book;

public class ManageBookModel {
	private ManageBookView manageBookView;

	ManageBookModel(ManageBookView manageBookView) {
		this.manageBookView = manageBookView;
	}
		public void addNewBook(Book book) {
			if (LibraryDatabase.getInstance().insertBook(book)) {
				manageBookView.onBookAdded(book);
			} else {
				manageBookView.onBookExist(book);
			}
		
	}
		public void getBookInfo () {
			List<Book>  bookInfo=LibraryDatabase.getInstance().getAllBooks();
	
			manageBookView.printBooks(bookInfo);
		}
}
