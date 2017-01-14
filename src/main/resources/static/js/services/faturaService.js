angular.module("FuneSysApp").factory("FaturaService", function($http, config) {
	var _getFaturas = function() {
		return $http.get(config.baseUrl + "/fatura/findall");
	};

	var _deleteFatura = function(fatura) {
		return $http.post(config.baseUrl + "/fatura/delete", fatura);
	};

	return {
		getFaturas : _getFaturas,
		deleteFatura : _deleteFatura
	};
});