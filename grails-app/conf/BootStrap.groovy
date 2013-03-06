
class BootStrap {
	def fixtureLoader

    def init = { servletContext ->
		// create test data
		fixtureLoader.load("books/*")
    }

    def destroy = {
    }
}
