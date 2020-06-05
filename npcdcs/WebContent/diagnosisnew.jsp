
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
select
{
	width:205px;
}

.textbox1
{
	width:200px;
}
</style>
<script>
//    $(document).ready(function() {
//      $('#divscreeningform').hide();
// 	 $('#btnpatientdetails').click(function(){
// 		 $('#divscreeningform').hide();
// 		 $('#divpatientform').show();
// 	 });
// 	  $('#btnscreeningdetail').click(function(){
// 		 $('#divscreeningform').show();
// 		 $('#divpatientform').hide();
// 	 });
// });
$(document).ready(function(){
	   $('#msg').toggle(3000);
});
</script>
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
        
        	<div class="left_container" style="width:260px;">
            </div>
            
            <div class="mid_container" style="height:auto;width:383px;margin-top:20px;">
            <div id="choosebutton" style="text-align:center;">
            	   
            	<a  href="save.do">Patient Entry form</a>
                <a  href="diagnosisnew.do">Diagnosis Entry form</a>
            </div>
          
            <div id="divscreeningform">
            		  <form action="savediagnosis.do" method="post">
							<table style="width:100%;border-collapse:collapse;border:4px double #CCCCCC;">
							<tr>
					            <td colspan="2" style=";background-color:white;font-size:5px;color:red;text-align:center"><h1>${msg}</h1></td>
					        </tr>
        <tr>
            <th colspan="2" style="height:50px"><h1>Diagnosis Details</h1></th>
        </tr>
        
              
              <tr>
                <td>Patient Name :</td>
                    <td >
                         <select id="cbopatientid" name="pat_id">
                           <option value="-1">Select Patient</option>
                           <c:forEach items="${plist}" var="pat">
                           		<option value="${pat.pat_id}">
                           		  ${pat.pat_name}
                           		</option>
                           </c:forEach>
                         </select>
                    </td>
              </tr>
            
            <tr>
                <td>Hypertension :</td>
                    <td >
                        <select id="cbohypertension" name="cbohypertension">
                    <option value="-1">Select Please</option>
        			<option value="true">Yes</option>
        			<option value="false">No</option>
        		</select>
                </td>
         
            </tr>
          
                <tr>
               <td>Diabetes:</td>
                    <td>
                       <select id="cbodiabetes" name="cbodiabetes">
                    <option value="-1">Select Please</option>
        			<option value="true">Yes</option>
        			<option value="false">No</option>
        		     </select>
                    </td>
            </tr>
     
        	<tr>
      		<td>Cardiovascular Disease:</td>
        		 
        		 <td>
                       <select id="cbocardiovascular" name="cbocardiovascular">
                    <option value="-1">Select Please</option>
        			<option value="true">Yes</option>
        			<option value="false">No</option>
        		     </select>
                    </td>
    	 
        </tr>
        	<tr>
        		<td>Cancer:</td>
        		<td>
        		 <select id="cbocancer" name="cbocancer">
                    <option value="-1">Select Please</option>
        			<option value="true">Yes</option>
        			<option value="false">No</option>
        		 </select>
                </td>
           </tr>
           <tr>
        <td>Refered to District Hospital:</td>
        	<td id="tdcbodistrict">
                <select id="cborefdistrict" name="cborefdistrict">
                                    <option value="-1">Select District</option>
		                              <c:forEach items="${districtlist}" var="dis">
		                           		<option value="${dis.district_id}">
		                           		  ${dis.district_name}
		                           		</option>
		                              </c:forEach>
                </select>
        	</td>
        </tr>
        <tr>
        		<td>Home Visit</td>
        		<td>
        		 <select id="cbovisit" name="cbovisit">
                    <option value="-1">Select Please</option>
        			<option value="true">Yes</option>
        			<option value="false">No</option>
        		 </select>
                </td>
           </tr>
        <tr>
			<th colspan="2" style="height:50px">
				<input type="submit" value="save"/> 
				<input type="reset"/>
			</th> 
	   </tr>
       
    </table> 
    </form>
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



