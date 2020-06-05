  <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
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
        <div class="Container">
        
        	<div class="left_container" style="width:80px;height:400px;">
            </div>
            
            <div class="mid_container" style="width:790px;height:auto;margin-top:20px;">
            <div>
            <table width="100%">
                 <tr>
                   <td>District </td>
                   <td>
                    <input type="text" id="txtgetchcname" name="txtgetchcname" value="${centerName}"/>
                   </td>
                    <td colspan="1">State</td>
                    <td colspan="2" style="text-align: left;">
                    <input type="text" id="txtgetstatename" name="txtgetstatename" value="${statename}"/>
                   </td>
                    
                 </tr>
           
                 <tr>
                   
                   <td colspan="2" style="text-align: right;">Date</td>
                   <td colspan="2" style="text-align: left;">
                    <input type="text" id="txtgetdate" name="txtgetdate" value="${date}"/>
                   </td>
                   <td>
                   </td>
                 </tr>
              
            </table>
            </div>
            <div style="width:766px;height:auto">
            		<table width="103%" class="tb_workspace">
                <tr ><th colspan="7" style="height:10px;background-color:#30F"><h2> For District Health Centre Reporting</h2> </th></tr>
                    <tr>
                    	<th>
                        	Name of the CHC</th>
                   
                     
                    	<th>
                        	No. of Screening Camps Organised during the month</th>
                   
                 
                    	<th>
                        	No. of people screened for Blood Sugar &amp; Blood Pressure</th>
                     
                     
                    	<th>No. of people suspected with Diabetes</th>
                                         	<th>No. of people suspected with Hypertension</th>   	    
  
                                <th>No . of Persons referred from Sub-Centres to CHCs</th>
                                <th>No. of Home Visits</th>
                
                    	 
                    </tr>
                    <tr>
                       <c:forEach items="${distreportdetails}" var="sd">
							    <tr>
									<td>${sd.chccenter}</td>
									<td>${sd.noofscreening}</td>
									<td>${sd.noofpeopleBSBP}</td>
									<td>${sd.noofdiabetes}</td>
									<td>${sd.noofhypertension}</td>								
									<td>${sd.noofrefersubtochc}</td>
									<td>${sd.noofhomevisit}</td>								
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
