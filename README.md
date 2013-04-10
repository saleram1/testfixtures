testfixtures
============

Using our BootStrap or Integration Tests for loading Test Data using Grails Fixtures plug-in.


How easy is it to use Grails fixtureLoader?
===========================================
I am glad you asked !

* Step 1 - 	Add both the fixtures and build-test-data plugins to BuildConfig

* Step 2 - 	Add the fixture data you need for your tests
Flexibility of fixtureLoader allows us to load using wildcard, example books/*

* Step 3 -    Add integration tests freely based on these data, comme ça :


Let's say we have some complex setup for the Book domain / persistence class: 
	
		import static org.junit.Assert.*
		import org.junit.*

		class BookIntegrationTests {
			def fixtureLoader


		    @Before
		    void setUp() {

		        // Setup logic here
				// create test data before running each test
				fixtureLoader.load("books/*")
		    }

	
What's in the fixture data?

	`cat fixtures/books/*`

		// each Book requires one or more co-authors
		import testfixtures.Author

		fixture { 
		  guillaume(Author, name: "Guillaume Laforge")
		  dierk(Author, name: "Dierk Koenig")
		}
		
		
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

