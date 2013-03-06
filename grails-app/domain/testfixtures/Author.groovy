package testfixtures

class Author {
	String name
	String address1
	String city
	String state
	String country = 'US'
	Date   birthDate
    
	static constraints = {
		name()
		address1(nullable: true, blank: false)
		city(nullable: true, blank: false)
		state(nullable: true, blank: false)
		country(nullable: true, blank: false)
		birthDate(nullable: true)
    }

	String toString() {
		name
	}
}
