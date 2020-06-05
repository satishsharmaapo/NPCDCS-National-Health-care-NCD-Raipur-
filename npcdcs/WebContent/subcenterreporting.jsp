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
                   <td>Name of Subcentre</td>
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
			   <table width="100%" >
                <tr ><th colspan="6" style="height:10px;background-color:#30F"><h2>Screening Data Report</h2></th></tr>
                    <tr>
                    	<th>
                        	Date
						</th>                       
                    	<th>
 							 No. of Person Screened
						</th>        
                       	<th>
                        	 Suspected for Diabetes(>140 mg/dl)
						</th>                                   
                    	<th>
						   Hypertension>(140/90 mmHg)
						 </th>                                        	
						<th>
						    % of Diabetes Suspected
						 </th>   	     
                        <th>
						    % of Hypertension Suspected
						</th>                       	 
                    </tr>                                     
                        <c:forEach items="${screeningdetails}" var="sd">
						    <tr>
								<td>${sd.date1}</td>
								<td>${sd.noofperson}</td>
								<td>${sd.suspectedfordiabetes}</td>
								<td>${sd.suspectedforhypertension}</td>
<%-- 								<c:set var="diabetes" scope="page" value="${sd.suspectedfordiabetes}"/> --%>
<%-- 								<c:set var="hypertension" scope="page" value="${sd.suspectedforhypertension}"/>  --%>
<%-- 		                        <c:set var="noofperson" scope="page" value="${sd.noofperson}"/> --%>
		                            
<%-- 		                            <c:set var="diabetes" scope="page" value="${sd.suspectedfordiabetes}"/>   --%>
<%--         							<c:set var="hypertension" scope="page" value="${sd.suspectedforhypertension}"/>  --%>
        					 <c:set var="perdiabetes" scope="page" value="${(sd.suspectedfordiabetes/sd.noofperson)*100}"/>
        					 <c:set var="perhypertension" scope="page" value="${(sd.suspectedforhypertension/sd.noofperson)*100}"/>
								<td >								 
								  <%= pageContext.getAttribute("perdiabetes").toString().substring(0,pageContext.getAttribute("perdiabetes").toString().indexOf('.')+2) %>
								</td>
								<td>
								  <%= pageContext.getAttribute("perhypertension").toString().substring(0,pageContext.getAttribute("perhypertension").toString().indexOf('.')+2) %>
								</td>
<%-- 								${(sd.suspectedfordiabetes/sd.noofperson)*100} --%>
<%-- 								<c:out value="" default=""/></td> --%>
								
<%-- 								<td><c:out value="${(sd.suspectedforhypertension/sd.noofperson)*100}"/></td> --%>
			
				           </tr>	
							</c:forEach>	
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
 