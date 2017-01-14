var app = angular.module("FuneSysApp")
app.controller("PlanoCtrl", function ($scope, $http, PlanoService) {

	$scope.planos = [];
	$scope.plano = {};
	
	var getAllPlanos = function(){
		PlanoService.getPlanos().success(function (data) {
			$scope.planos = data;
		});
	}
	
	$scope.savePlano = function(plano){
		PlanoService.savePlano(plano).success(function(data){
			$scope.plano = {};
			getAllPlanos();
		});
	};
	
	$scope.delete = function(plano){
		PlanoService.deletePlano(plano).success(function(data){
			getAllPlanos();
		});
	}
	
	getAllPlanos();
	
});
