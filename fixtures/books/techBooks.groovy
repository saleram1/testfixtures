import testfixtures.Author
import testfixtures.Book

fixture {

  // now we can define instances of Book
  gina(Book) {
	author = guillaume
    title = "Groovy In Action, Second Edition"
    isbn10 = "0123456789"
    listPrice = 36.99
    //authors = [guillaume, dierk]
  }
}