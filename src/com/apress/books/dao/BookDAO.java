package com.apress.books.dao;
import com.apress.books.model.Book;
import com.apress.books.model.Author;
import com.apress.books.model.Category;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public interface BookDAO {
	public List<Book>findAllBooks();
	public List<Book>searchBooksByKeyword(String keyWord);
	public List<Category>findAllCategories();
	public void insert(Book book);
	public void update(Book book);
	public void delete(Long bookId);
}
