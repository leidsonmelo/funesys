angular.module("FuneSysApp").controller("LoginCtrl", function($scope, $window, loginAPI, session){
	$scope.toLogin = true;
	$scope.userLogin = {};
	$scope.userSingup = {};
	$scope.message = "";
	$scope.wrong = false;
	$scope.wronglogin = false;
	$scope.messageLogin = "";

	$scope.noLogin = function(){
		$scope.toLogin = !$scope.toLogin;
	}

	$scope.login = function(){
		loginAPI.login($scope.userLogin).success(function (data){
			console.log(data);
			$scope.userLogin = {};
			if(data){
				session.setUser(data);
				$window.location.href = 'view/dashboard.html';
			}else{
				$scope.wronglogin = true;
				$scope.messageLogin = "Username or Password not found!"
			}
		});
	}

});