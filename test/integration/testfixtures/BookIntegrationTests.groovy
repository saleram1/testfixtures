package testfixtures

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

    @After
    void tearDown() {
        // Tear down logic here
    }

    @Test
    void testBooksShouldBeLoaded() {
        assert Book.count() > 0
		
		def aBook = Book.get(1)
		assert aBook.title
		assert aBook.author
    }
}