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
		 $('#trdelstate').hide();
		 $('#treditstate').hide();
		 $('#trchangestate').hide();
		 
		 $('#rdaddstate').click(function(){			 
			 $('#traddstate').show();
			 $('#trdelstate').hide();
		     $('#treditstate').hide();
			 $('#trchangestate').hide();
		 });
		 
		  $('#rddeletestate').click(function(){
			 
			 $('#traddstate').hide();
			 $('#trdelstate').show();
		     $('#treditstate').hide();
			 $('#trchangestate').hide();
			 
		 });        
		
		 $('#rdeditstate').click(function(){
			 
			 $('#traddstate').hide();
			 $('#trdelstate').hide();
		     $('#treditstate').show();
			 $('#trchangestate').show();
		 });
		 $('#message').toggle(2000);
		 $.get('addstate.do',{districtid:disid},function(responsedata){
			 $("#tdcbochc").html(responsedata);
		 });
		  
// 		 $('#submit').click(function(){
// 			 if ($('#rdaddstate:checked').val() == 'true') {         
// 			         $('#form').attr('action','/savestate.do');
// 			    }
// 			    else if ($('#rddeletestate:checked').val() == 'true') {         	
// 			    		$('#form').attr('action','/deletestate.do');
// 			    }
// 			    else if ($('#rdeditstate:checked').val() == 'true') {      
// 			    		$('#form').attr('action','/editstate.do');
// 			    }
				
// 		 });
        
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
        <div class="Container" >
        
        	<div class="left_container" style="width:300px;height:400px;">
            </div>
            
            <div class="mid_container" style="width:342px;height:auto;margin-top:20px;">
                <div>
				<form action="savestate.do" method="post" id="form" name="form">
					<table >
                                       
						<tr>
						  <th colspan="2" style="height:50px"><h3>Add New State</h3></th></tr>
						
						<tr id="traddstate">
						   <td>New State</td> 
						   <td><input type="text" name="txtaddstate" id="txtaddstate" class="textbox1"/></td>
						</tr>
						 
                          <tr id="trdelstate">
                             <td>
                             	Delete State
                             </td>
                             <td>
                                 <select id="cbodelstate" name="cbodelstate">
                               		<option value="-1">Select State</option>
		                           	<c:forEach items="${statelist}" var="state">
		                           		<option value="${state.state_id}">
		                           		  ${state.state_name}
		                           		</option>
		                           	</c:forEach>
		                         </select>
                               </td>
                            </tr>
                         
                         <tr id="treditstate">
                             <td>
                             	Edit State
                              </td>
                                 <td>                                
                                	<select id="cboeditstate" name="cboeditstate">
                                    <option value="-1">Select State</option>
		                              <c:forEach items="${statelist}" var="state">
		                           		<option value="${state.state_id}">
		                           		  ${state.state_name}
		                           		</option>
		                           </c:forEach>
                                    </select>
                                  </td>
                         </tr>
                        
                       <tr id="trchangestate">
                             <td>
                             	Change State
                              </td>
                              <td> 
                              <input type="text" id="txtchangestate" name="txtchangestate" class="textbox1"/> 
                              </td>
                         </tr>
						<tr>
							<th colspan="2" style="height:50px;">
								<input type="radio" id="rdaddstate" name="rdmodification" value="add" checked="checked" />Add
								<input type="radio" id="rddeletestate" name="rdmodification" value="delete" />Delete
								<input type="radio" id="rdeditstate" name="rdmodification" value="edit" />Edit
							</th> 
						</tr>
						<tr>
							<th colspan="2" style="height:50px;">                         
								<input type="submit" value="Confirm!" id="submit"/>
								<input type="reset" value="Reset"/>
							</th> 
						</tr>
                        <tr><td style="text-align:center;background:none;" colspan="2" id="message">${msg}</td></tr>
                       
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
 	<!--dorp donw menu start-->
    
</body>
</html>
 