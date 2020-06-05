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
		
		 $('#trdeletedistrict').hide();
		 $('#treditdistrict').hide();
		 $('#trchangedistrict').hide();
		 
		 $('#rdadddistrict').click(function(){
			 
			 $('#tradddistrict').show();
			 $('#trdeletedistrict').hide();
		     $('#treditdistrict').hide();
			 $('#trchangedistrict').hide();
		 });
		 
		  $('#rddeletedistrict').click(function(){
			 
			 $('#tradddistrict').hide();
			 $('#trdeletedistrict').show();
		     $('#treditdistrict').hide();
			 $('#trchangedistrict').hide();
		 });        
		
		 $('#rdeditdistrict').click(function(){
			 
			 $('#tradddistrict').hide();
			 $('#trdeletedistrict').hide();
		     $('#treditdistrict').show();
			 $('#trchangedistrict').show();
		 });
		 
		 $('#cbostate').change(function(event){
			 var stateid =  $('#cbostate').val();
			 alert(stateid);
			 $.get('getDistrictdel.do',{stateid:stateid},function(responsedata){
				 	$("#tdcbodeldistrict").html(responsedata);				
				 });
			 $.get('getDistrictedit.do',{stateid:stateid},function(responsedata){
				 	$("#tdcboeditdistrict").html(responsedata);				
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
        
        
        <div class="menu">
                    
              <%@ include file="menubutton.jsp" %> 
			
		</div>
        
        <!------Container start ------------->
        <div class="Container">
        
        	<div class="left_container" style="width:300px;height:400px;">
            </div>
            
            <div class="mid_container" style="width:342px;height:auto;margin-top:20px;">
                <div>
				<form action="savedistrict.do" method="post">
					<table >
						<tr>
						  <th colspan="2" style="height:50px"><h3>Add New District</h3></th></tr>
						 <tr>
						    <td>State </td> 
						   <td><select name="cbostate" id="cbostate" >
							    <option value="-1">Select State</option>                         
                              		 
		                           <c:forEach items="${statelist}" var="state">
		                           		<option value="${state.state_id}">
		                           		  ${state.state_name}
		                           		</option>
		                           </c:forEach>
							  </select>  
						   </td>
						</tr>
                        
                        <tr id="tradddistrict">    
						   <td >District </td> 
						   <td>
                           <input type="text" name="txtadddistrict" id="txtadddistrict" class="textbox1"/>
                            </td>
						</tr>
                        
						<tr  id="trdeletedistrict">    
						   <td >Delete District</td> 
						   <td id="tdcbodeldistrict">
						       <select id="cbodeldistrict" name="cbodeldistrict">
						        <option value="-1">Select District</option>
						         <c:forEach var="district" items="${districtlist}">
						           <option value="${district.district_id}"></option>
						         </c:forEach>
							    </select>
							 </td>
							     
						</tr>
                        
                        <tr  id="treditdistrict">    
						   <td >Edit District</td> 
						   <td id="tdcboeditdistrict">
						   <select name="cbodeldistrict" id="cbodeldistrict">
							     <option value="-1">Select District</option>
						         	<c:forEach var="district" items="${districtlist}">
						         <option value="${district.district_id}"></option>
						         </c:forEach>
							    </select>
						    </td>
						</tr>
                        
                          <tr id="trchangedistrict">
                             <td id="tdcbochangedistrict">
                             	Change District
                              </td>
                              
                              <td> 
                              <input type="text" id="txtchangedistrict" name="txtchangedistrict" class="textbox1"/> 
                                	
                               </td>
                         </tr>
						<tr>
							<th colspan="2" style="height:50px;">
								<input type="radio" id="rdadddistrict" name="rdmodification" value="add" checked="checked"/>Add
								<input type="radio" id="rddeletedistrict" name="rdmodification" value="delete" />Delete
								<input type="radio" id="rdeditdistrict" name="rdmodification" value="edit" />Edit
							</th> 
						</tr>
						 
								
						<tr>
							<th colspan="2" style="height:50px;">                         
								<input type="submit" value="Confirm!"/>
								<input type="reset" value="Reset"/>
							</th> 
						</tr>
                        <tr>
							<td colspan="2" style="text-align:center;background:none;" >                         
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


 