 <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
<link rel="stylesheet" type="text/css" href="CSS/MainStyle.css"/>
<link rel="stylesheet" type="text/css" href="CSS/td_th.css"/>
</head>
<!-----Wrapper start ------->
    <div id="Wrapper">
    
    	<!-----Header start ------->
        <div id="header">
        	
            <div class="left_logo">
                 <img src="images/DHSLOGO.png" width="135" height="120" alt="logo" /> 
            </div>
            <div class="mid_heading">
            
                <img src="images/title1.jpg" width="650" height="90" alt="No Title" />
            </div>
            <div class="right_logo">
                 <img src="images/logo1.png" width="135" height="120" alt="logohealth" /> 
            </div>
	    </div>
        <!-----Header end ------->
        
        
        <div class="menu" >
                    
              <ul class="semiopaquemenu">
                <li><a href="#">Home</a></li>
                <!-- <li><a href="#" class="selected">CSS Codes</a></li> !-->
                <li><a href="#">CSS Codes</a></li>
                <li><a href="#">Forums</a></li>
                <li><a href="#">Webmaster Tools</a></li>
                <li><a href="#">JavaScript</a></li>
                <li><a href="#">Gallery</a></li>
              </ul>
			 <div class="bottombar"></div>  
			
		</div>
        
        <!------Container start ------------->
        <div class="Container">
        
        	<div class="left_container">
            </div>
            
            <div class="mid_container" style="width:790px">
             <div>
            <table>
                 <tr>
                   <td>District Hospital</td>
                   <td>
                    <input type="text" id="txtgetchcname" name="txtgetchcname"/>
                   </td>
                   <td>District</td>
                   <td>
                    <input type="text" id="txtgetchcname" name="txtgetchcname"/>
                 </tr>
                
                 <tr>
                   <td>State</td>
                   <td>
                    <input type="text" id="txtgetstatename" name="txtgetstatename"/>
                   </td>
                   <td>Date</td>
                   <td>
                    <input type="text" id="txtgetdate" name="txtgetdate"/>
                   </td>
                 </tr>
            </table>
            </div>
            <div style="height:none;width:790px">
            		 <table width="100%" class="tb_workspace">
               			<tr>
                        	<th style="height:50px;width:790px" colspan="8"><h3>Reporting For NCD Clinic at CHC</h3></th>
                        </tr>
                        <tr>
                        	<td rowspan="2" colspan="2">Indicator</td>
                            <td colspan="3">During the reporting Month</td>
                            <td colspan="3">Cumulative during the year</td>
                        </tr>
                        <tr>
                        	<td>Male</td>
                            <td>Female</td>
                            <td>Total</td>
                             <td>Male</td>
                            <td>Female</td>
                            <td>Total</td>
                        </tr>    
                        <c:set values="${cmale}" var="sd"/>
                            <c:set values="${cfemale}" var="fd"/>
                            
							  
                        <tr>
                        	<td colspan="2">No of Person attended NCD Clinic</td>
	                            <td>${sd.noofperson}</td>
	                            <td>${fd.noofperson}</td>
	                            <td>${sd.noofperson}+${fd.noofperson}</td>	                            
	                            <td>${pmale}</td>
                            	<td>${pfem}</td>
                            	<td>${pfem}+${pmale}</td>
                        </tr>	
                           <tr>
                            
                               <td rowspan="2" colspan="1" style="height:80px;">Diagnosed</td>
                               <td  rowspan="1"> Diabetes</td>
                                    <td>${sd.noofdiabetic}</td>
                            		<td>${fd.noofdiabetic}</td>
                            		<td>${sd.noofdiabetic}+${fd.noofdiabetic}</td>
                            		<td>${pmalediabetes}</td>
                                    <td>${pfemdiabetes}</td>
                                    <td>${pmalediabetes}+${pfemdiabetes}</td>
                           </tr>
                            	 
                      	<tr>
                                 <td rowspan="1">Hypertension</td>
                                 <td>${sd.noofhypertension}</td>
                            	 <td>${fd.noofhypertension}</td>
                           		 <td>${sd.noofhypertension}+${fd.noofhypertension}</td>
                           		 <td>${pmalehypertension}</td>
                                 <td>${pfemhypertension}</td>
                                 <td>${pmalehypertension}+${pfemhypertension}</td>
                         </tr>
                         <tr>
                        <td colspan="2">Persion With suspected Cardiovascular Disease</td>
                            <td>${sd.noofcardiovascular}</td>
                            <td>${fd.noofcardiovascular}</td>
                            <td>${sd.noofcardiovascular}+${fd.noofcardiovascular}</td>
                            <td>${pmalecardiovascular}</td>
                            <td>${pfemcardiovascular}</td>
                            <td>${pmalecardiovascular}+${pfemcardiovascular}</td>
                       	</tr>
                            
                        <tr>
                        <td colspan="2">Persion With suspected Cancer</td>
                            <td>${sd.noofcancer}</td>
                            <td>${fd.noofcancer}</td>
                            <td>${sd.noofcancer}+${fd.noofcancer}</td>
                            <td>${pmalecancer}</td>
                            <td>${pfemcancer}</td>
                            <td>${pmalecancer}+${pfemcancer}</td>
                        </tr>
                        <tr>
                        <td colspan="2">No. of Persion referred to District Hospital
                            <td>${sd.noofrefpatient}</td>
                            <td>${fd.noofrefpatient}</td>
                            <td>${sd.noofrefpatient}+${fd.noofrefpatient}</td>
                            <td>${pmalerefdistrict}</td>
                            <td>${pfemrefdistrict}</td>
                            <td>${pmalerefdistrict}+${pfemrefdistrict}</td>
                         </tr>
                            <td colspan="2">No. of Home Visits made
                         <td>${sd.noofhomevisit}</td>
                            <td>${fd.noofhomevisit}</td>
                            <td>${sd.noofhomevisit}+${fd.noofhomevisit}</td>
                            <td>${pmale}</td>
                            <td>${pfem}</td>
                            <td>${pmale}+${pfem}</td>
                        </tr>
                                                 
  
            </div>
            
            </div>
            
        </div>
        <!------Container end ------------->

        <!------Footer start ------------->
        <div id="footer">
        </div>
        <!------Footer end ------------->
        
    </div>
    <!-----Wrapper end ------->


 
</body>
</html>
 