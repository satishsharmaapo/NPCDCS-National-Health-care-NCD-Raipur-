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
	   height:30px;
	   width:180px;
  }
  
  .textbox1
  {
	   width:174px;
  }
  label
  {
	  display:inline-block;
	  width:auto;
  }
</style>
<script type="text/javascript">

	$(document).ready(function() {
		 $('#trdelphc').hide();
		 $('#treditphc').hide();
		 $('#trchangephc').hide();
		 $('#rdaddphc').click(function(){
			 
			 $('#traddphc').show();
			 $('#trdelphc').hide();
		     $('#treditphc').hide();
			 $('#trchangephc').hide();
		 });
		 
		  $('#rddeletephc').click(function(){
			 
			 $('#traddphc').hide();
			 $('#trdelphc').show();
		     $('#treditphc').hide();
			 $('#trchangephc').hide();
		 });        
		
		 $('#rdeditphc').click(function(){
			 
			 $('#traddphc').hide();
			 $('#trdelphc').hide();
		     $('#treditphc').show();
			 $('#trchangephc').show();
		 });
        
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
        
        	<div class="left_container" style="width:300px;height:400px;">
            </div>
            
            <div class="mid_container" style="width:342px;height:auto;margin-top:20px;">
                         <div style="height: auto;">
								<form action="/addphc.jsp">
						         <table width="100%">
										<tr>
										  <th colspan="2" style="height:50px;"><h3>Add New Primary Health Centre</h3></th>
										</tr>
										<tr id="trstate">
										   <td>State </td> 
										   <td>
												<select id="cbostate" name="cbostate">
													 <option value="-1">Select State</option>
							                           <c:forEach items="${statelist}" var="state">
							                           		<option value="${state.state_id}">
							                           		  ${state.state_name}
							                           		</option>
		                          						 </c:forEach>
										        </select>  
										   </td>
										</tr>
										 <tr id="trdistrict">
										   <td>District</td> 
										   <td>
												<select id="cbodistrict" name="cbodistrict">
													 <option value="-1">Select District</option>					   
												           <c:forEach items="${districtlist}" var="district">
												   			
								                           		<option value="${district.district_id}">
								                           		  ${district.district_name}
								                           		</option>
								                           </c:forEach>
												</select> 
										   </td>
										 </tr>
										 <tr id="trchc">
										   <td>CHC</td> 
										   <td>
											<select id="cbochc" name="cbochc">
											     <option value="-1">Select CHC</option>                         
                              		 
						                           <c:forEach items="${chclist}" var="chc">
						                           		<option value="${chc.chc_id}">
						                           		  ${chc.chc_name}
						                           		</option>
						                           </c:forEach>
											</select>
										   </td>
										</tr>
										 
										<tr id="traddphc">
										   <td>New PHC</td> 
										   <td>
											  <input type="text" id="txtsubcentre" name="txtsubcentre" class="textbox1" />
										   </td>
										</tr>
										
										<tr id="trdelphc">
										   <td>Delete PHC</td> 
										   <td>
											  <select id="cbodelphc" name="cbodelphc">
													   <option value="-1">Select PHC</option>                         
                              		 
								                           <c:forEach items="${phclist}" var="phc">
								                           		<option value="${phc.phc_id}">
								                           		  ${phc.phc_name}
								                           		</option>
								                           </c:forEach>
												  </select>
										   </td>
										</tr>
										
										<tr id="treditphc">
										   <td>Edit PHC</td> 
										   <td>
											   <select id="cboeditphc" name="cboeditphc">
													  <option value="-1">Select PHC</option>                         
                              		 
								                           <c:forEach items="${phclist}" var="phc">
								                           		<option value="${phc.phc_id}">
								                           		  ${phc.phc_name}
								                           		</option>
								                           </c:forEach>
												  </select>
										   </td>
										</tr>
										
										<tr id="trchangephc">
										   <td>Change PHC</td> 
										   <td>
											    <input type="text" id="txtchangephc" name="txtchangephc" class="textbox1"/>
										   </td>
										</tr>
										 
										<tr>
											<th colspan="2" style="height:50px;">
												<input type="radio" id="rdaddphc" name="rdmodification" checked="checked"/>Add
												<input type="radio" id="rddeletephc" name="rdmodification"/>Delete
												<input type="radio" id="rdeditphc" name="rdmodification"/>Edit
											</th> 
										</tr>
										<tr>
											<th colspan="2" style="height:50px;"><input type="submit" value="Confirm!" /><input type="reset"/></th> 
										</tr>
                                        <tr>
											<td colspan="2" style="text-align:center">${msg}</td> 
										</tr>
					           </table> 	
				         </form>
  
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
