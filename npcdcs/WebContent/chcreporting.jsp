<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@page import="java.util.Date"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
 
<link rel="stylesheet" type="text/css" href="CSS/MainStyle.css"/>
<link rel="stylesheet" type="text/css" href="CSS/td_th.css"/>
 
<link rel="stylesheet" type="text/css" href="CSS/menubest.css"/>
<script type="text/javascript" src="script/jquery-1.9.0.min.js"></script> 

<style>
td
{
	text-align:center;
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
        <div class="Container" style="background: rgb(252,255,244); /* Old browsers */
background: -moz-linear-gradient(top,  rgba(252,255,244,1) 0%, rgba(223,229,215,1) 97%, rgba(179,190,173,1) 100%); /* FF3.6+ */
background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,rgba(252,255,244,1)), color-stop(97%,rgba(223,229,215,1)), color-stop(100%,rgba(179,190,173,1))); /* Chrome,Safari4+ */
background: -webkit-linear-gradient(top,  rgba(252,255,244,1) 0%,rgba(223,229,215,1) 97%,rgba(179,190,173,1) 100%); /* Chrome10+,Safari5.1+ */
background: -o-linear-gradient(top,  rgba(252,255,244,1) 0%,rgba(223,229,215,1) 97%,rgba(179,190,173,1) 100%); /* Opera 11.10+ */
background: -ms-linear-gradient(top,  rgba(252,255,244,1) 0%,rgba(223,229,215,1) 97%,rgba(179,190,173,1) 100%); /* IE10+ */
background: linear-gradient(to bottom,  rgba(252,255,244,1) 0%,rgba(223,229,215,1) 97%,rgba(179,190,173,1) 100%); /* W3C */
filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#fcfff4', endColorstr='#b3bead',GradientType=0 ); /* IE6-9 */
   ">
        
        	<div class="left_container" style="width:80px;height:400px;">
            </div>
            
            <div class="mid_container" style="width:790px;height:auto;margin-top:20px;">
             <div>
            <table width="100%">
                 <tr>
                   <td>Name of CHC</td>
                   <td>
                    <input type="text" id="txtgetchcname" name="txtgetchcname" value="${centerName}"/>
                   </td>
                   <td>District</td>
                   <td>
                    <input type="text" id="txtgetchcname" name="txtgetchcname" value="${disName}"/>
                    </td>
                 </tr>
                 
                 <tr>
                   <td>State</td>
                   <td>
                    <input type="text" id="txtgetstatename" name="txtgetstatename" value="${stateName}"/>
                   </td>
                   <td>Date</td>
                   <td>
                    
                    <input type="text" id="txtgetdate" name="txtgetdate" value="${date}"/>
                   </td>
                 </tr>
               
            </table>
            </div>
					<div style="height:auto;width:790px" >

						<table width="100%" >
                <tr ><th colspan="6" style="height:10px;background-color:#30F"><h2> Community Health Centre Reporting</h2> </th></tr>
                    <tr>
                    	<th>
                        	Name of the Sub-Centre
                        </th>                 
                      	<th>
                        	No. of Screening Camps Organised during the month
                       </th>                  
                      	<th>
                        	No. of people screened for Blood Sugar &amp; Blood Pressure
                        </th>
                                          
                    	<th>No. of people suspected with Diabetes</th>
                                  <th>No. of people suspected with Hypertension</th>   
                        <th>No . of Persons referred to Community Health Centre</th>
                    
                    </tr>
                    <tr>
<%--                     <c:set var="total" value="0"/>  --%>
							<c:forEach items="${chcreportdetails}" var="sd">
							
							    <tr>
									<td>${sd.subcenter}</td>
									<td>${sd.noofscreening}</td>
									<td>${sd.noofpeopleBSBP}</td>
									<td>${sd.noofdiabetes}</td>
									<td>${sd.noofhypertension}</td>								
									<td>${sd.noofrefertochc}</td>
								</tr>
								
							</c:forEach>
                        
                    </tr>
                    
                     <tr>
                      <td><b>Total</b></td>
                      <td></td>
                      <td></td>
                      <td></td>
                      <td></td>
                      <td></td>
                      
                      
                    </tr>
                   </table> 
				</div>
            </div>
            	
            
            
        </div>
        <!------Container end ------------->

        <!------Footer start ------------->
        <div id="footer" style="height:auto;">
               <%@ include file="footer.jsp" %>
        </div>
        <!------Footer end ------------->
        
    </div>
    <!-----Wrapper end ------->
</body>
</html>
