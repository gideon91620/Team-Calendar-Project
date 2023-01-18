<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html ng-app="myApp">
<head>
<meta charset="ISO-8859-1">
<title>Add Event Page</title>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>
<script src="/static/js/app.module.js"></script>
<script src="/static/js/controller/event_controller.js"></script>
<script src="/static/js/service/event_service.js"></script>
</head>
<body ng-controller="EventController">
<header>
  <nav>
    <a href="/">Home</a>
    <a href="/add">Add</a>
    <a href="/login">Login</a>
    <a href="/signup">Sign Up</a>
  </nav>
  
  </header> 
  
<h1>Add Page</h1>

<form>
        <div>
            <label for="eventName">Event Name:</label>
            <input type="text" id="eventName" ng-model="event.name" required />
        </div>
        <div>
            <label for="eventType">Event Type:</label>
            <select id="eventType" ng-model="event.type" required>
                <option value="practice">Practice</option>
                <option value="game">Game</option>
                <option value="meeting">Meeting</option>
                <option value="other">Other</option>
            </select>
        </div>
        <div>
            <label for="eventLocation">Event Location:</label>
            <input type="text" id="eventLocation" ng-model="event.location" required />
        </div>
        <div>
            <label for="eventDate">Event Date:</label>
            <input type="text" id="eventDate" ng-model="event.date" required />
        </div>
        <div>
            <label for="eventTime">Event Time:</label>
            <input type="text" id="eventTime" ng-model="event.time" required />
        </div>
        <div>
            <label for="eventReason">Event Reason:</label>
            <input type="text" id="eventReason" ng-model="event.reason" required />
        </div>
        <div>
            <button ng-click="addEvent()">Add Event</button>
        </div>
    </form>
    <hr>
    <div ng-repeat="event in events | filter: {date:searchEvent}">
        <p>Name: {{event.name}}</p>
        <p>Type: {{event.type}}</p>
        <p>Location: {{event.location}}</p>
        <p>Date: {{event.date}}</p>
        <p>Time: {{event.time}}</p>
        <p>Reason: {{event.reason}}</p>
        <button ng-click="getEvent(event.name)">Edit</button>
        <button ng-click="deleteEvent(event.name)">Delete</button>
    </div>
    <div>
        <input type="text" ng-model="searchEvent" placeholder="Filter events by date">
    </div>
    
</body>
</html>