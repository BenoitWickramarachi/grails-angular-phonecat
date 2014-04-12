class UrlMappings {

	static mappings = {
		
		"/phones/phones.json" {
			controller = "phones"
		}
		
		"/phones/${phoneId}.json" {
			controller = "phones"
			action = "showPhone"
		}
		
        "/"(view:"/index")
	}

}
