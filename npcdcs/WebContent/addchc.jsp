  
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
		 $('#message').toggle(3000);
		 $('#trdelchc').hide();
		 $('#treditchc').hide();
		 $('#trchangechc').hide();
		 
		 $('#rdaddchc').click(function(){			 
			 $('#traddchc').show();
			 $('#trdelchc').hide();
		     $('#treditchc').hide();
			 $('#trchangechc').hide();
		 });
		 
		  $('#rddeletechc').click(function(){			 
			 $('#traddchc').hide();
			 $('#trdelchc').show();
		     $('#treditchc').hide();
			 $('#trchangechc').hide();
		 });        
		
		 $('#rdeditchc').click(function(){
			 
			 $('#traddchc').hide();
			 $('#trdelchc').hide();
		     $('#treditchc').show();
			 $('#trchangechc').show();
		 });
		 $('#cbostate').change(function(event){
			 var stateid =  $('#cbostate').val();
			  
			 $.get('getDistrictdel.do',{stateid:stateid},function(responsedata){
				 	$("#tdcbodistrict").html(responsedata);				
				 });
			 $('#cbodistrict').change(function(event){
				 var districtid =  $('#cbodistrict').val();
					 $.get('getCHCs.do',{districtid:districtid},function(responsedata){
						 	$("#tdcbodelchc").html(responsedata);		
					 });
			 }); 
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
        <div class="Container" style="	background: rgb(252,255,244); /* Old browsers */
background: -moz-linear-gradient(top,  rgba(252,255,244,1) 0%, rgba(223,229,215,1) 97%, rgba(179,190,173,1) 100%); /* FF3.6+ */
background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,rgba(252,255,244,1)), color-stop(97%,rgba(223,229,215,1)), color-stop(100%,rgba(179,190,173,1))); /* Chrome,Safari4+ */
background: -webkit-linear-gradient(top,  rgba(252,255,244,1) 0%,rgba(223,229,215,1) 97%,rgba(179,190,173,1) 100%); /* Chrome10+,Safari5.1+ */
background: -o-linear-gradient(top,  rgba(252,255,244,1) 0%,rgba(223,229,215,1) 97%,rgba(179,190,173,1) 100%); /* Opera 11.10+ */
background: -ms-linear-gradient(top,  rgba(252,255,244,1) 0%,rgba(223,229,215,1) 97%,rgba(179,190,173,1) 100%); /* IE10+ */
background: linear-gradient(to bottom,  rgba(252,255,244,1) 0%,rgba(223,229,215,1) 97%,rgba(179,190,173,1) 100%); /* W3C */
filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#fcfff4', endColorstr='#b3bead',GradientType=0 ); /* IE6-9 */
   ">
        
        	<div class="left_container" style="width:300px;height:400px;">
            </div>
            
            <div class="mid_container" style="width:342px;height:auto;margin-top:20px;">
                <div>
				<form action="savechc.do" method="post">
					<table >
						<tr>
						  <th colspan="2" style="height:50px"><h3>Add New Community Health Centre</h3></th></tr>
						<tr id="trstate">
						   <td>State </td> 
						   <td id="tdcbostate"><select name="cbostate" id="cbostate">
							    <option value="-1">Select State</option>                         
                              		   <c:forEach items="${statelist}" var="state">
		                           		<option value="${state.state_id}">
		                           		  ${state.state_name}
		                           		</option>
		                           </c:forEach>
							  </select>  
						   </td>
						</tr>
						<tr>    
						   <td>District </td> 
						   <td id="tdcbodistrict">
						     <select name="cbodistrict" id="cbodistrict">	
						       <option value="-1">Select District</option>					   
							   <c:forEach items="${districtlist}" var="district">
							   			
			                           		<option value="${district.district_id}">
			                           		  ${district.district_name}
			                           		</option>
			                           </c:forEach>
							    
						      </select> 
						      </td>
						</tr>
						<tr id="traddchc">
						   <td>CHC</td> 
						   <td>
						   	<input type="text" name="txtaddchc" class="textbox1"/>
						   </td>
						</tr>
						 
                          <tr id="trdelchc">
                             <td>
                             	Delete CHC
                             </td>
                             <td>
                               <select id="cbodelchc" name="cbodelchc">      
                                   <option value="-1">Select CHC</option>                         
                              		 
		                           <c:forEach items="${chclist}" var="chc">
		                           		<option value="${chc.chc_id}">
		                           		  ${chc.chc_name}
		                           		</option>
		                           </c:forEach>
		                         </select>
                                     
                               
                              </td>
                           
                         </tr>
                         
                         <tr id="treditchc">
                             <td>
                             	Edit CHC
                              </td>
                              
                              <td id="tdcbodelchc">  
                                	<select id="cboeditchc" name="cboeditchc">                                    
                                            <option value="-1">Select CHC</option>                         
                              		 
					                           <c:forEach items="${chclist}" var="chc">
					                           		<option value="${chc.chc_id}">
					                           		  ${chc.chc_name}
					                           		</option>
					                           </c:forEach>
                                    </select>
                                  
                               </td>
                         </tr>
                         
                       <tr id="trchangechc">
                             <td>
                             	Change CHC
                              </td>
                              
                              <td> 
                              <input type="text" id="txtchangechc" name="txtchangechc" class="textbox1"/> 
                                	
                               </td>
                         </tr>
						<tr>
							<th colspan="2" style="height:50px;">
								<input type="radio" id="rdaddchc" name="rdmodification" value="add" checked="checked"/>Add
								<input type="radio" id="rddeletechc" name="rdmodification" value="delete"/>Delete
								<input type="radio" id="rdeditchc" name="rdmodification" value="edit"/>Edit
							</th> 
						</tr>
						
						<tr>
							<th colspan="2" style="height:50px;">                         
								<input type="submit" value="Confirm!"/>
								<input type="reset" value="Reset"/>
							</th> 
						</tr>
                        <tr>
							<td colspan="2" style="text-align:center;background:none;" id="message">                         
								${msg}
							</td> 
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
 