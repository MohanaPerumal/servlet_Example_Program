<html>
    <head>
    <title>StudentDetails</title>
<!--<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>-->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<link rel="shortcut icon" href="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSOnO8OvBKUH9OxS5m63Qv2v-1Ch-tLoY9yXSnh94RKkTUEp6hScQ" type="image"/>
<style>


.jumbotron {
  background-image:url(https://www.google.co.in/imgres?imgurl=http%3A%2F%2Fwww.going2college.org%2Fimages%2Fgoing2collegelogo.png&imgrefurl=http%3A%2F%2Fwww.going2college.org%2F&docid=YwnyrkZpooR0SM&tbnid=GnSop74diZ-EUM%3A&vet=10ahUKEwi8l7mIrqbVAhWIwrwKHTuQAVI4ZBAzCAsoCTAJ..i&w=1200&h=292&bih=490&biw=1093&q=college%20images&ved=0ahUKEwi8l7mIrqbVAhWIwrwKHTuQAVI4ZBAzCAsoCTAJ&iact=mrc&uact=8);
  height:700px;
  background-repeat: no-repeat;
  background-size: cover;
  border-bottom:1px solid #ff6a00
}

#form{
 background-color:lightskyblue;
 }
 body{
background-color:purple;
}
   </style>
 </head>
<body>
    <div class ="container-fluid">
    <h1><div align="center">
<div class ="well blue"> Request your need.. </div></div></h1>
<div class ="jumbotron">
<form action="InsertStudent" method="post">
       
    <h1 align="center">Student details</h1> 
     <table cellspacing=5 cellpadding=5 id="form" align="center">
    <tr><td>Name:</td>  <td><input type="text" name="name"/></td></tr>
    <tr><td>Reg_No:</td><td><input type="text" name="regno"/></td></tr> 
    <tr><td>Department:</td><td><input type="text" name="department"/></td></tr>
    <tr><td>Cgpa:</td><td> <input type="text" name="cgpa"/></td></tr>
    <tr><td>Sgpa:</td><td> <input type="text" name="sgpa"/></td></tr> 
    <tr><td>No_Of_Arears:</td><td> <input type="text" name="noofarears"/></td></tr>
    <tr><td>Attendance:</td><td><input type="text" name="attendance"/></td></tr>
    <tr><td>Result:</td><td><input type="text"name="result"/></td></tr>
    <tr><td>E-mail:</td><td><input type="text"name="email"/></td></tr>   
    <tr><td><center><input type="submit" value="SUBMIT"  ></center></td></tr>        
    </form>
        <form action="ViewAllDetails" method="get">
            <tr><td><center><input type="submit" value="DISPLAY"></center></td></tr>
        </form>
      <form action="delete.html" method="GET">
        <tr><td><center><input type="submit" value="DELETE"></center></td></tr>
    </form>
    <form action="update.html" method="GET">
      <tr><td><center><input type="submit" value="UPDATE"></center></td></tr>
    </form>

     </table>
</div>
    </body>
</html>