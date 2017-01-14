angular.module("FuneSysApp").factory("AssociadoService", function($http, config){
	var _getAssociados = function(){
		return $http.get(config.baseUrl + "/associado/findall");
	};

	var _saveAssociado = function(associado){
		return $http.post(config.baseUrl + "/associado/save", associado);
	};

	var _deleteAssociado = function(associado){
		return $http.post(config.baseUrl + "/associado/delete", associado);
	};

	return{
		getAssociados: _getAssociados,
		saveAssociado: _saveAssociado,
		deleteAssociado: _deleteAssociado
	};
});