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
	
	$scope.pagarFaturaDebito = function(fatura){
		FaturaService.pagarFaturaDebito(fatura).success(function(data){
			getAllFaturas();
		});
	}
	
	$scope.pagarFaturaCarne = function(fatura){
		FaturaService.pagarFaturaCarne(fatura).success(function(data){
			getAllFaturas();
		});
	}
	
	$scope.pagarFaturaBoleto = function(fatura){
		FaturaService.pagarFaturaBoleto(fatura).success(function(data){
			getAllFaturas();
		});
	}
	
	getAllFaturas();
	
});
