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
                   <td> Name of CHC</td>
                   <td>
                    <input type="text" id="txtgetchcname" name="txtgetchcname" value="${centerName}"/>
                   </td>
                   <td> District</td>
                   <td>
                    <input type="text" id="txtgetchcname" name="txtgetchcname" value="${disName}"/>
                    </td>
                 </tr>
                 
                 <tr>
                   <td> State</td>
                   <td>
                    <input type="text" id="txtgetstatename" name="txtgetstatename" value="${stateName}"/>
                   </td>
                   <td >Date</td>
                   <td>
                    <input type="text" id="txtgetdate" name="txtgetdate" value="${date}" value="${date}"/>
                   </td>
                 </tr>
                 
            </table>
            </div>
             
            <div style="height:auto;width:790px">
            		 <table width="100%">
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
                        <tr>
                        	<td colspan="2">No of Person attended NCD Clinic</td>
                            <td>1</td>
                            <td>2</td>
                            <td>3</td>
                            <td>1</td>
                            <td>2</td>
                            <td>3</td>
                            
                            
                        </tr>
                        <tr>
                        	<td colspan="2">No of Person attended NCD Clinic</td>
                            <td>2</td>
                            <td>2</td>
                            <td>4</td>
                            <td>3</td>
                            <td>3</td>
                            <td>6</td>
                                                      
                        </tr>                      	
                        <tr>
                            
                               <td rowspan="4" colspan="1" style="height:80px;" > New Patient Diagnosed				 								</td>
                               <td  style="" rowspan="1"> Diabetes</td>
                               			<td>5</td>
                                        <td>5</td>
                                        <td>10</td>
                                        <td>1</td>
                                        <td>1</td>
                                        <td>5</td></tr>
                                <td rowspan="1"> Hypertension</td>
                                <td>3</td>
                                        <td>3</td>
                                        <td>6</td>
                                        <td>4</td>
                                        <td>4</td>
                                        <td>8</td></tr>
                                 <td rowspan="1"> Cardiovasculr Disease</td>
                                <td>1</td>
                                        <td>1</td>
                                        <td>2</td>
                                        <td>1</td>
                                        <td>1</td>
                                        <td>2</td></tr>
                                 <td rowspan="1"> Cancer</td>
                                <td>0</td>
                                        <td>0</td>
                                        <td>0</td>
                                        <td>0</td>
                                        <td>0</td>
                                        <td>0</td>
                                        </tr>
                                        
                             <tr>
                            
                               <td rowspan="4" colspan="1" style="height:80px;" >Person referred to medical College/Tertiary Hospital				 								</td>
                               <td rowspan="1"> Diabetes</td>
                               			<td>2</td>
                                        <td>2</td>
                                        <td>4</td>
                                        <td>3</td>
                                        <td>3</td>
                                        <td>6</td></tr>
                                <td rowspan="1"> Hypertension</td>
                                 <td>2</td>
                                        <td>2</td>
                                        <td>4</td>
                                        <td>3</td>
                                        <td>3</td>
                                        <td>6</td>
                                         </tr>
                                 <td rowspan="1"> Cardiovascular Disease</td>
                                
                                         <td>2</td>
                                        <td>2</td>
                                        <td>4</td>
                                        <td>3</td>
                                        <td>3</td>
                                        <td>6</td></tr>
                                 <td rowspan="1"> 
                                 	Cancer
                                 </td>
                                <td>2</td>
                                        <td>2</td>
                                        <td>4</td>
                                        <td>3</td>
                                        <td>3</td>
                                        <td>6</td></tr>
                         
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
 