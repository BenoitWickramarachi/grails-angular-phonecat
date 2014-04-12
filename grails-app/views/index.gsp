<!doctype html>
<html lang="en">
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"><!--<![endif]-->
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<title>Google Phone Gallery</title>	 
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<r:require module="angular"/>
		<r:layoutResources />
	</head>
	
	<body>
	  <div class="view-container" ng-app="phonecatApp">
	    <div ng-view class="view-frame"></div>
	  </div>
	  <r:layoutResources />
	</body>
	
</html>
