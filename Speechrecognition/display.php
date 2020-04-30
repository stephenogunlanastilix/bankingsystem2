
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dashboard</title>
    <link href="https://fonts.googleapis.com/css2?family=Montserrat" rel="stylesheet">
    <style>
        body{
            padding:100px;
        }
        h1{
            font-family: 'Montserrat', sans-serif;
            font-size:60px;
        }
        table {
        font-family: 'Montserrat', sans-serif;
        border-collapse: collapse;
        width: 100%;
        border-radius:10px;
        border-left: 2px solid black;
        border-right: 2px solid black;
        }

        td, th {
        border-top: 2px solid black;

        text-align: left;
        font-size:13px;
        padding: 8px;
        padding-top:20px;
        padding-bottom:20px;
        padding-left:20px;
        }

        tr:nth-child(even) {
        background-color:black;
        color:white;
        }
    </style>
</head>
<body>
    
</body>
</html>
<?php
if(!isset($_GET['memberid'])){
    header('Location: index.php');
}else{
$memberid = $_GET['memberid'];
$memberid = htmlspecialchars($memberid);

$servername = "localhost";
$username = "root";
$password = "";
$databasename = "bankingsystem";

//Create sql connection
$connection = new mysqli($servername, $username, $password, $databasename);
$memberid =  mysqli_real_escape_string($connection, $memberid);
// Check sql connection
if ($connection->connect_error) {
    die("Connection failed: " . $connection->connect_error);
}

$sql = "SELECT * FROM userinfo WHERE memberid=$memberid";
$sqlresult = $connection->query($sql);
//check if the number of rows is greater than 0
if ($sqlresult->num_rows > 0) {
    while($row = $sqlresult->fetch_assoc()) {
        //Prints out Information in a table
        echo "<h1>Welcome ".$row["first_name"]." ".$row["last_name"]."</h1>";
        echo "<table>
        <tr>
          <th>Username</th>
          <th>Firstname</th>
          <th>Lastname</th>
          <th>Password</th>
          <th>Membership id</th>
          <th>Account balance</th>
          <th>Date of registration</th>
        </tr>
        <tr>
          <td>".$row["username"]."</td>
          <td>".$row["first_name"]."</td>
          <td>".$row["last_name"]."</td>
          <td>".$row["password"]."</td>
          <td>".$row["memberid"]."</td>
          <td>$".$row["acctbalance"]."</td>
          <td>".$row["regdate"]."</td>
        </tr>
        </table>
        ";
    }
}
else {
    //Prints out error that id could not be found
    echo "<h1 style='text-transform:capitalize;'>Could not find user with the Membership ID ".$_GET['memberid']." </h1>";
    echo "<a href='index.php'>Go back home </a>";
}

$connection->close();
}
?>