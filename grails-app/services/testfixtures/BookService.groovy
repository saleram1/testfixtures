package testfixtures

class BookService {
	
	static transactional = false
	
	def saveABook(Book book) {
		if (book?.validate()) {
			return book.save(flush: true)
		}
		else {
			throw new IllegalArgumentException("Book cannot be saved!")
		}
	}
	
	def searchForBooks(String aTitle) {
		Book.createCriteria().list() {
			ilike('title', '%' + aTitle + '%')
		}
	}
}