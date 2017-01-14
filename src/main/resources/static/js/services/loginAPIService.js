angular.module("routesapp").factory("loginAPI", function($http, config){
	
	var _login = function(user){
		return $http.post(config.baseUrlLogin + "/login", user);
	};

	var _singup = function(user){
		return $http.post(config.baseUrlLogin + "/singup", user);
	};

	return{
		login: _login,
		singup: _singup 
	};
});