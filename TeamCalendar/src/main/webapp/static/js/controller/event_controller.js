'use strict';
angular.module("myApp").controller("EventController", ["$scope", "EventService", function($scope, EventService) {
    $scope.events = EventService.getAllEvents();
    $scope.event = {};

    $scope.addEvent = function() {
        EventService.addEvent($scope.event);
        $scope.event = {};
    };

    $scope.getEvent = function(name) {
        $scope.event = EventService.getEvent(name);
    };

    $scope.updateEvent = function() {
        EventService.updateEvent($scope.event);
        $scope.event = {};
    };

    $scope.deleteEvent = function(name) {
        EventService.deleteEvent(name);
    };
}]);