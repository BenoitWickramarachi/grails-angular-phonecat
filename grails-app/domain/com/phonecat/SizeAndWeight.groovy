package com.phonecat

class SizeAndWeight {

	List<String> dimensions
	String weight
	
	static hasMany = [
		dimensions : String
		]
	
	static belongsTo = [PhoneDetail]
	
    static constraints = {
    }
}
