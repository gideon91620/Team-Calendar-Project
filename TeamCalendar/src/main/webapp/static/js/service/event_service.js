
angular.module("myApp").service("EventService", function() {
    var events = [];

    this.getAllEvents = function() {
        return events;
    };

    this.addEvent = function(event) {
        events.push(event);
    };

    this.getEvent = function(name) {
        for (var i = 0; i < events.length; i++) {
            if (events[i].name == name) {
                return events[i];
            }
        }
    };
    this.updateEvent = function(event) {
        var currentEvent = this.getEvent(event.name);
        currentEvent.type = event.type;
        currentEvent.location = event.location;
        currentEvent.date = event.date;
        currentEvent.time = event.time;
        currentEvent.reason = event.reason;
    };

    this.deleteEvent = function(name) {
        var index = events.indexOf(this.getEvent(name));
        events.splice(index, 1);
    };
});
