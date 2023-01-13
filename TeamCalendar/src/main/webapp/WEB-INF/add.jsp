<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Event Page</title>
</head>
<body>
<header>
  <nav>
    <a href="/">Home</a>
    <a href="/add">Add</a>
    <a href="/login">Login</a>
    <a href="/signup">Sign Up</a>
  </nav>
  
  </header> 
  
<h1>Add Page</h1>

<div>
  <form>
    <label>Event Name:</label>
    <input type="text">
    <br>
    <label>Event Type:</label>
    <select>
      <option value="practice">Practice</option>
      <option value="game">Game</option>
      <option value="meeting">Meeting</option>
      <option value="other">Other</option>
    </select>
    <br>
    <label>Location:</label>
    <input type="text">
    <br>
    <label>Date:</label>
    <input type="text">
    <br>
    <label>Time:</label>
    <input type="text">
    <br>
    <label>Reason:</label>
    <input type="text">
    <br>
    <button>Add Event</button>
  </form>
</div>
</body>
</html>