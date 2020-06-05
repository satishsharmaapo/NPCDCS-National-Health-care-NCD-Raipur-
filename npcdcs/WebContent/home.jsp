<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
 
<link rel="stylesheet" type="text/css" href="CSS/MainStyle.css"/>
<link rel="stylesheet" type="text/css" href="CSS/td_th.css"/>
 
<link rel="stylesheet" type="text/css" href="CSS/menubest.css"/>
<script type="text/javascript" src="script/jquery-1.9.0.min.js"></script> 



<style>
table
{
border-collapse:collapse;
}
table,th, td
{
border: 1px solid black;
}
</style>
</head>
<body>
	<!-----Wrapper start ------->
    <div id="Wrapper">    
    	<!-----Header start ------->
        <div id="header">
        	 <%@ include file="headericons.jsp" %>
	    </div>
        <!-----Header end ------->
        
        
        <div class="menu" >
               <%@ include file="menubutton.jsp" %> 
	    </div>
        
        <!------Container start ------------->
        <div class="Container">
        
        	<div class="left_container">
            </div>            
            <div class="mid_container">
			    <div>
                 <img src="images/npcdcshome.png" width="675" height="410" alt="No image found" />
                </div>
            </div>            
        </div>
        <!------Container end ------------->

        <!------Footer start ------------->
        <div id="footer">
           <%@ include file="footer.jsp" %>
           
        </div>
        <!------Footer end ------------->
        
    </div>
    <!-----Wrapper end ------->
 
</body>
</html>
 