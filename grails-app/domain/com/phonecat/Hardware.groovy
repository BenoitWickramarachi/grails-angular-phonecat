package com.phonecat

class Hardware {

	String accelerometer
	String audioJack
	String cpu
	String fmRadio
	String physicalKeyboard
	String usb
	
	static belongsTo = [PhoneDetail]
	
	static constraints = {
		audioJack  nullable : true
	}

}
