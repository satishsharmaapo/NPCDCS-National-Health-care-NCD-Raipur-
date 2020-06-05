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
  
table
{
 border-collapse:collapse;
}
table,th, td
{
border: 1px double white;
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
                   <td>District Hospital</td>
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
               <div style="width:790px;height:auto">            
			      <table width="100%">
                  <tr >
                  	<th colspan="8" style="height:50px;color:#FC5400;" >
                        <h1 style="color:black;"> 
                            For NCD Clinic at District Reporting
                        </h1> 
                    </th>
                 </tr>
                  <tr >
                  <th colspan="2" style="height:30px;"  >
                  </th>
                  	<th colspan="4" style="height:30px;" >
                   		 New Patients diagnosed with 
                    </th>
                   <th colspan="2" style="height:30px;">
                   </th></tr>
                    <tr>
                    
                    	<th>
                        	Name of CHC
                        </th>                                       
                    	<th>
                        	No. of Persons attended NCD Clinic
                        </th>
                        <th>
							Diabetes
						</th>                                             
                    	<th>
							Hypertension
						</th>
                        <th>
							Suspected Cardiovascular Disease
						</th>   
						<th>
							Suspected Cancer
						</th>
                        <th>
							Referrals to District Hospital
						</th>
                         <th>
							Home Visits
						 </th>                              	                                            	 
                    </tr>
                    <tr>
<%--                     <c:set var="a" value=0> --%>
<%--                     <c:set var="b" value="0"> --%>
<%--                     <c:set var="c" value="0"> --%>
<%--                     <c:set var="d" value="0"> --%>
<%--                     <c:set var="e" value="0"> --%>
<%--                      <c:set var="f" value="0"> --%>
<%--                     <c:set var="g" value="0"> --%>
                     
                    
                    
                       <c:forEach items="${ncdatdistrictlist}" var="sd">
							    <tr>
									<td>${sd.chccenter}</td>
									<td>${sd.noofperson}</td>
									<td>${sd.noofdiabetes}</td>
									<td>${sd.noofhypertension}</td>
									<td>${sd.noofcardiovascular}</td>								
									<td>${sd.noofcancer}</td>
									<td>${sd.noofreftodistrict}</td>								
									<td>${sd.noofhomevisit}</td>
								
								</tr>
						</c:forEach>                        
                    </tr>
                    <tr>
<!--                       <td><b>Total</b></td> -->
                      <td></td>
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
