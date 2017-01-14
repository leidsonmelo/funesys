var app = angular.module("FuneSysApp").service("session", function($window) {
 	
 	var KEY = 'App.Session';

    var _setUser = function(newObj) {
    	$window.sessionStorage.removeItem(KEY);
        var mydata = $window.sessionStorage.getItem(KEY);
        if (mydata) {
            mydata = JSON.parse(mydata);
        } else {
            mydata = [];
        }
        mydata.push(newObj);
        $window.sessionStorage.setItem(KEY, JSON.stringify(mydata));
    };

    var _getUset = function(){
        var mydata = $window.sessionStorage.getItem(KEY);
        if (mydata) {
            mydata = JSON.parse(mydata);
        }
        if(mydata){
            return mydata[0];
        }
        return mydata;
    };

    return {
        setUser: _setUser,
        getUser: _getUset
    };

});