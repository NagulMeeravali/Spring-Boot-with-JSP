<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <style>
        ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
}

li {
  float: left;
}

li a {
  display: block;
  padding: 8px;
  background-color: black;
  color:white;
}.active {
  background-color: #04AA6D;
}
         input{
             border-radius: 5px;
             height:40px;

            }
            #div1{
                background-color: black;
                color: white;
                width:100%;
                height:40px;
            }
            #div2{
                background-color:#eeeeee;
               
                width:100%;
            }
            #rc{
                width:170px;
                border-radius: 5px;
                height:30px;
            }
            #rc1{
                width:270px;
                border-radius: 5px;
                height:30px;
            }
            #b1{
                width:90px;
            }
            #rightdiv{
                float: right;
                background-color:#eeeeee;
                width: 56%;
                height:100%;
                border-style: double;
            }
            #leftdiv{
                float:left;
                background-color: #eeeeee;
                height:100%;
                border-style: double;
            }
            #outerdiv{
                background-color:azure;
            }
            #menu{
                background-color:black;
                color: white;
                width:100%;
                height: 40px;
            }

    </style>
</head>
<body>
    <div id="outerdiv">
<div id="leftdiv">
    <div id="div1">
        Job Details
    </div>
   <div id="div2">
    <form action="/reqSaveJobDetails" method="post">
        <table width=100% cellpadding="5">  
            <tr><td>Job name:</td> </tr>
            <tr><td><input type="text" name="jobname"></td></tr>
     <tr><td>Description: </td></tr>
     <tr><td colspan="3"> <textarea rows="10" cols="65" name="description"></textarea> </td></tr>
     <tr><td>Recurrence :</td> <td>Start Date:</td><td>End Date:</td></tr>
        <tr><td> <select id="rc" name="recurrance_id" >
         <option>Daily</option>
         <option>Weekly</option>
         <option>Monthly</option>
         <option>Yearly</option>
         
     </select></td>

      <td><input type="Date" name="startdate"></td> 
      <td><input type="Date" name="enddate"></td></tr> 
     <tr><td>Duration :</td> <td>Tasks:</td> </tr>
        <tr><td>
        <input type="text" name="duration" ></td> <td colspan="2"> 
      <select id="rc1" name="task_name">
         <option>De-Duplication</option>
         <option>Trim</option>
         <option>Date Formatter</option>
         <option>Currency Formatter</option>
         
     </select></td></tr>
     <tr><td><input type="submit" value="Save" id="b1"></td> <td>
     <input type="submit" value="Delete" id="b1" ></td></tr>
    </table>
</form>
</div>
</div>
<div id="rightdiv">
<div id="menu">
    <ul>
        <li><a href="/getAllUsers">View All Users</a></li>
        <li><a href="/getAllJobs">View All Jobs</a> </li>
        
      </ul>

</div>
<table border="2" cellpadding="8" cellspacing="5" width="100%">
    <tr><td>Id</td><td>Created at</td> <td>Full Name</td> <td>Username</td><td>Password</td></tr>
    <c:forEach var="user" items="${users}">
       <tr><td>${user.getId()}</td> <td>${user.getCreated_at()}</td><td>${user.getFull_name()} </td>
        <td> ${user.getUsername()} </td> <td> ${user.getPassword()} </td> </tr>
       
    </c:forEach>
</table>

<table border="2" cellpadding="8" cellspacing="5" width="100%">
    <tr><td>Id</td><td>Created at</td> <td>Full Name</td> <td>Username</td><td>Password</td> <td>Task Name</td></tr>
    <c:forEach var="user" items="${users}">
       <tr><td>${user.getId()}</td> <td>${user.getCreated_at()}</td><td>${user.getFull_name()} </td>
        <td> ${user.getUsername()} </td> <td> ${user.getPassword()} </td> </tr>
       
    </c:forEach>
</table>
</div>
</div>
</body>
</html>