angular.module("FuneSysApp").factory("PlanoService", function($http, config){
	var _getPlanos = function(){
		return $http.get(config.baseUrl + "/plano/findall");
	};

	var _savePlano = function(plano){
		return $http.post(config.baseUrl + "/plano/save", plano);
	};
	
	var _deletePlano = function(plano){
		return $http.post(config.baseUrl + "/plano/delete", plano);
	};

	return{
		getPlanos: _getPlanos,
		savePlano: _savePlano,
		deletePlano: _deletePlano
	};
});