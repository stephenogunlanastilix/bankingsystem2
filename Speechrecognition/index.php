<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css" type="text/css">
    <link href="https://fonts.googleapis.com/css2?family=Montserrat" rel="stylesheet">
    <title>Speech Recognition</title>
</head>
<body>

<center>
    <!-- form to get user information to database -->
    <form method="get" action="display.php">
        <h1>Click on microphone icon to Say your member id</h1>
        <input type="text" name="memberid" id="display" placeholder="Enter Member Id" required>
        <span id="microphone">
        </span>
        <br>
        <input type="submit" name="submit" value="Search">
    </form>
</center>
<script src="script.js"></script>
</body>
</html>