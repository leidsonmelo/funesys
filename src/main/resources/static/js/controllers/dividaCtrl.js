var app = angular.module("FuneSysApp")
app.controller("DividaCtrl", function ($scope, $http, FaturaService) {

	$scope.faturas = [];
	$scope.fatura = {};
	
	var getAllFaturas = function(){
		FaturaService.getFaturas().success(function (data) {
			$scope.faturas = data;
		});
	}
	
	$scope.delete = function(fatura){
		FaturaService.deleteFatura(fatura).success(function(data){
			getAllFaturas();
		});
	}
	
	getAllFaturas();
	
});
