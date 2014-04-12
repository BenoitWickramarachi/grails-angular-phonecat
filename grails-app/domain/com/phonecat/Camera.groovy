package com.phonecat

class Camera {

	String primaryCamera
	
	static hasMany = [
		features : String
		]
	
	static belongsTo = [PhoneDetail]
	
    static constraints = {
    }
	
}
