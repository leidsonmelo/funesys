var app = angular.module("FuneSysApp")
app.controller("AssociadoCtrl", function ($scope, $http, AssociadoService) {

	$scope.associados = [];
	$scope.associado = {};
	
	var getAllAssociados = function(){
		AssociadoService.getAssociados().success(function (data) {
			$scope.associados = data;
		});
	}
	
	$scope.saveAssociado = function(associado){
		AssociadoService.saveAssociado(associado).success(function(data){
			$scope.associado = {};
			getAllAssociados();
		});
	};
	
	$scope.delete = function(associado){
		AssociadoService.deleteAssociado(associado).success(function(data){
			getAllAssociados();
		});
	}
	
	getAllAssociados();
	
});
