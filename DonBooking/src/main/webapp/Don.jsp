<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<h3>DON BOOKING HUB</h3>
</head>
<script>
	function airindia()
	{

    	var data="";
		var req=new XMLHttpRequest();
		req.open("GET","http://localhost:8222/AirIndia",true);
		req.send();
		
		
		
		req.onreadystatechange=function()
    	{
    		
    		if(req.readyState==4 && req.status==200)
    			{
    				
    			var table=document.getElementById("k");
        		
        		var tbody=document.getElementById("p");
    				var obj=JSON.parse(req.responseText);
    				alert(req.responseText);
    				
    				for(var i=0;i<obj.length;i++)
    					{
    					data+="<tr><td>"+obj[i].pno+"</td><td>"+obj[i].location+"</td><td>"+obj[i].date+"</td><td>"+obj[i].availablity+"</td><td>";
    					//alert(data);
    					$('#p').html(data);
    						/* document.getElementById("dis").innerHTML="+ID+"obj[i].id+"NAME"+obj[i].name+"ADDRESS"+obj[i].address; */
    					
    			}
    			
    	}
    	
    		
	}
	}
	function go()
	{
		var req=new XMLHttpRequest();
		req.open("GET","http://localhost:8222/Go",true);
		req.send();
		req.onreadystatechange=function()
    	{
    		
    		if(req.readyState==4 && req.status==200)
    			{
    				
    			var table=document.getElementById("k");
        		
        		var tbody=document.getElementById("p");
    				var obj=JSON.parse(req.responseText);
    				alert(req.responseText);
    				
    				for(var i=0;i<obj.length;i++)
    					{
    					data+="<tr><td>"+obj[i].pno+"</td><td>"+obj[i].location+"</td><td>"+obj[i].date+"</td><td>"+obj[i].availablity+"</td><td>";
    					//alert(data);
    					$('#p').html(data);
    						/* document.getElementById("dis").innerHTML="+ID+"obj[i].id+"NAME"+obj[i].name+"ADDRESS"+obj[i].address; */
    					}
    			}
    			
    	}
	}
</script>
<body>
<table id="k" class="table table-striped table-bordered">
                                        <thead>
                                            <tr>
                                                <th>NAME</th>
                                                <th>MOBILE</th>
                                                <th>VIN</th>
                                                <th>MODEL TYPE</th>
                                                <th>Start date</th>
                                                
                                            </tr>
                                        </thead>
                                       	<tbody id="p">
                                       		<!-- <tr>
                                       			<td><input  type="text" name="name" value="stu.name"></td>
                                       			<td>Avinash</td>
                                       			<td>Avinash</td>
                                       			<td>Avinash</td>
                                       			<td>Avinash</td>
                                       			<td>Avinash</td>
                                       		</tr> -->
                                       	</tbody>
                                       	</table>
<table border="2">
	<tr>
	<td><input type=submit value="AIRINDIA" onclick="airindia()"></td>
	<td><input type=submit value="GO" onclick="go()"></td>
	<td><input type=submit value="EMIRITES" onclick="emirites()"></td>
	</tr>
</table>
</body>
</html>