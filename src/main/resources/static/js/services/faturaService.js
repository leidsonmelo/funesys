angular.module("FuneSysApp").factory("FaturaService", function($http, config) {
	var _getFaturas = function() {
		return $http.get(config.baseUrl + "/fatura/findall");
	};

	var _deleteFatura = function(fatura) {
		return $http.post(config.baseUrl + "/fatura/delete", fatura);
	};

	var _pagarFaturaDebito = function(fatura) {
		return $http.post(config.baseUrl + "/fatura/pagarDebibo", fatura);
	};

	var _pagarFaturaCarne = function(fatura) {
		return $http.post(config.baseUrl + "/fatura/pagarCarne", fatura);
	};

	var _pagarFaturaBoleto = function(fatura) {
		return $http.post(config.baseUrl + "/fatura/pagarBoleto", fatura);
	};
	
	return {
		getFaturas : _getFaturas,
		deleteFatura : _deleteFatura,
		pagarFaturaDebito: _pagarFaturaDebito,
		pagarFaturaCarne: _pagarFaturaCarne,
		pagarFaturaBoleto: _pagarFaturaBoleto
	};
});