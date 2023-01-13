'use strict';
 
angular.module('myApp').factory('SignupService', ['$http', '$q', function($http, $q){
 
    var REST_SERVICE_URI = 'http://localhost:8080/users/';
 
    var factory = {
        fetchAllUsers: fetchAllUsers,
        createUser: createUser
        //updateUser:updateUser,
        //deleteUser:deleteUser
    };
 
    return factory;
 
    function fetchAllUsers() {
        var deferred = $q.defer();
        $http.get(REST_SERVICE_URI)
            .then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Error while fetching Users');
                deferred.reject(errResponse);
            }
        );
        return deferred.promise;
    }
 
    function createUser(user) {
        var deferred = $q.defer();
        $http.post(REST_SERVICE_URI + "/signup", user)
            .then(
            function (response) {
				console.log("Post: ", response);
                deferred.resolve(response.data);
                },
            function(errResponse){
                console.error('Error while creating User');
                deferred.reject(errResponse);
            }
        );
        return deferred.promise;
    }
 
 
  
 
}]);