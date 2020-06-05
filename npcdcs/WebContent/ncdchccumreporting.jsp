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
            <div style="width:766px;height:auto">
            		<div style="width:780px">
                         <div style="width:260px;float:left;">
                            Indicator
                         </div>
                         <div style="width:260px;float:left;">
                             During the Reporting Month
                          </div>
                         <div style="width:260px;float:left;">
                              Cummulative during the Year
                         </div>
                      </div>
                         <div style="width:260px;height:380px;float:left;background-color:yellow;">
				     <div style="width:260px;padding:25px;">
				     </div>
				     <div style="width:260px;padding:10px;">
					No of Person attended NCD Clinic
				     </div>
				      <div style="width:260px;padding:10px;">
					Patient Diagnosed with Diabetes
				     </div>
				     <div style="width:260px;padding:10px;">
					Patient Diagnosed with Hypertension
				     </div>
				     <div style="width:260px;padding:10px;">
					 Person with suspected cardiovascular disease
				     </div>
				     <div style="width:260px;padding:10px;">
					 Person with suspected Cancer
				     </div>
				     <div style="width:260px;padding:10px;">
					No of Person refered to district hospital
				     </div>
				     <div style="width:260px;padding:10px;">
					No of Home visit
				     </div>                
                        </div>
				 <div style="width:240px;height:380px;float:left;background-color:blue;">
					<div>During the Reporting Month</div>
					
					<div style="width:60px;padding:5px;float:left"> 
					  Male 
					</div>
					<div  style="width:60px;padding:5px;float:left"> 
					  Female 
					</div>
					<div style="width:60px;padding:5px;text-align:center;float:left"> 
					  Total 
					</div>
					<div style="width:230px;padding:10px;float:left;text-align:center;background-color:blue;">
						<div style="height:300px;width:60px;background-color:white;float:left;">
						1
						</div>
						<div style="height:300px;width:60px;background-color:white;float:left;margin-left:20px">
						2
						</div>
						<div style="height:300px;width:60px;background-color:white;float:left;margin-left:20px">
						3
						</div>
						 
					</div>
                             </div>
                            	 
                              <div style="width:260px;height:380px;float:left;background-color:blue;">
					<div style="width:250px">Cummulative during the year</div>
					<div style="width:60px;padding:5px;float:left"> 
					  Male 
					</div>
					<div  style="width:60px;padding:5px;float:left"> 
					  Female 
					</div>
					<div style="width:60px;padding:5px;text-align:center;float:left"> 
					  Total 
					</div>

					<div style="width:230px;padding:10px;float:left;text-align:center;background-color:blue;">
					 
						<div style="height:300px;width:60px;background-color:white;float:left;">
						   <c:forEach items="${cmale}" var="sd">
							     
									<div style="padding:10px;">${sd.noofperson}</div>
									<div style="padding:10px;">${sd.noofdiabetic}</div>
									<div style="padding:10px;">${sd.noofhypertension}</div>
									<div style="padding:10px;">${sd.noofcardiovascular}</div>
									<div style="padding:10px;">${sd.noofcancer}</div>								
									<div style="padding:10px;">${sd.noofrefpatient}</div>
									<div style="padding:10px;">${sd.noofhomevisit}</div>
								  								
							</c:forEach>  
						  </div>
					 
						 </div>
					</div>
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
