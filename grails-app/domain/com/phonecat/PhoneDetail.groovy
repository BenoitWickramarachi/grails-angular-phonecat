package com.phonecat

class PhoneDetail {

	String additionalFeatures
	Android android
	Battery battery
	Camera camera
	Connectivity connectivity
	String description
	Display display
	Hardware hardware
	String phoneId
	String name
	SizeAndWeight sizeAndWeight
	Storage storage
	
	static hasMany = [
		availability : String,
		dimensions : String,
		images : String
		]
	
	static mapping = {
		additionalFeatures type: "text"
		description type: "text"
	}
	
    static constraints = {
		additionalFeatures  nullable : true
    }

}
