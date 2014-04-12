package com.phonecat

import grails.converters.JSON

class PhonesController {

	def index() {
		def json = Phone.list() as JSON
		render json
	}
		
    def showPhone() {
		def json = PhoneDetail.findByPhoneId(params.phoneId) as JSON
		render json
    }
	
}