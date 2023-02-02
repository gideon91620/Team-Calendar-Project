'use strict';
 
angular.module('myApp').controller('SignupController', ['$scope', 'SignupService', function($scope, SignupService) {
    
    $scope.user={id:null,username:'',address:'',email:''};
    $scope.users=[];
 
    $scope.submit = submit;
    //$scope.edit = edit;
    //$scope.remove = remove;
    //$scope.reset = reset;
 
 
    fetchAllUsers();
 
    function fetchAllUsers(){
        SignupService.fetchAllUsers()
            .then(
            function(d) {
                $scope.users = d;
            },
            function(errResponse){
                console.error('Error while fetching Users');
            }
        );
    }
 
    function createUser(user){
        SignupService.createUser(user)
            .then(
            fetchAllUsers,
            function(errResponse){
                console.error('Error while creating User');
            }
        );
    }
 
    function submit() {
		if ($scope.user.id === null) {
			createUser($scope.user);
		
		} else {

			console.log('User updated with id ', $scope.user.id);
		}
	}
	
	 /*function updateUser(user, id){
        SignupService.updateUser(user, id)
            .then(
            fetchAllUsers,
            function(errResponse){
                console.error('Error while updating User');
            }
        );
    }
 
    function deleteUser(id){
        SignupService.deleteUser(id)
            .then(
            fetchAllUsers,
            function(errResponse){
                console.error('Error while deleting User');
            }
        );
    }
    
    function edit(id){
        console.log('id to be edited', id);
        for(var i = 0; i < self.users.length; i++){
            if(self.users[i].id === id) {
                self.user = angular.copy(self.users[i]);
                break;
            }
        }
    }
 
    function remove(id){
        console.log('id to be deleted', id);
        if(self.user.id === id) {//clean form if the user to be deleted is shown there.
            reset();
        }
        deleteUser(id);
    }
 
 
    function reset(){
        self.user={id:null,username:'',address:'',email:''};
        $scope.myForm.$setPristine(); //reset Form
    }
	*/
	
    
 
}]);