package testfixtures

class Book {
	Long id
	Long version
	String title
	String isbn10
	BigDecimal listPrice 
	Date dateCreated
	Date lastUpdated

	Author author
	
    static constraints = {
		author()
		title()
		isbn10(nullable: true)
		listPrice(nullable: true)
    }
}
