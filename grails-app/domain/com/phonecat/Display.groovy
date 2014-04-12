package com.phonecat

class Display {

	String screenResolution
	String screenSize
	String touchScreen
	
	static belongsTo = [PhoneDetail]
	
    static constraints = {
    }
}
