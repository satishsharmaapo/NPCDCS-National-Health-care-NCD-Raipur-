<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ page session="false" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
<link rel="stylesheet" type="text/css" href="CSS/MainStyle.css"/>
<link rel="stylesheet" type="text/css" href="CSS/td_th.css"/>
<link rel="stylesheet" type="text/css" href="CSS/flexdropdown.css"/>
<script type="text/javascript" src="script/flexdropdown.js"></script>

<script type="text/javascript" src="script/jquery-1.9.0.min.js"></script>

 <style>
  td{
	    width: 76px;
	    padding:5px;
  }
 
 #templatemo_footer {
    background: url("../images/templatemo_footer_bg.jpg") no-repeat scroll 0 0 transparent;
    border-top: 1px solid #22211E;
    clear: both;
    color: #555555;
    margin: 0 auto;
    padding: 40px;
    text-align: center;
    width: 900px;
}
#templatemo_footer a {
    color: #777777;
    font-weight: normal;
}
#templatemo_footer a:hover {
    color: #CCCCCC;
    text-decoration: none;
}
#templatemo_footer .footer_menu {
    list-style: none outside none;
    margin: 0 0 10px;
    padding: 0;
}
.footer_menu li {
    border-right: 1px solid #555555;
    display: inline;
    margin: 0;
    padding: 0 20px;
}
.footer_menu .last_menu {
    border: medium none;
}
 
  </style>
<script type="text/javascript">
$(document).ready(function () {
	
  $('#trchc').hide();
   $('#trphc').hide();
   $('#trshc').hide();
   $('#msg').toggle(3000);
   
   $('#rdchc').click(function(){
	       $('#trchc').show();
		   $('#trphc').hide();
		   $('#trshc').hide();
		   $('#trdistrict').show();
		  
   });
      $('#rdphc').click(function(){
	       $('#trchc').show();
		   $('#trphc').show();
		   $('#trshc').hide();
		   $('#trdistrict').show();
   });
      $('#rdshc').click(function(){
	       $('#trchc').show();
// 		   $('#trphc').show();
		   $('#trshc').show();
		   $('#trdistrict').show();
   });
    $('#rddistrict').click(function(){
	       $('#trchc').hide();
		   $('#trphc').hide();
		   $('#trshc').hide();
		   $('#trdistrict').show();
   });
     $('#rdadmin').click(function(){
	       $('#trchc').hide();
		   $('#trphc').hide();
		   $('#trshc').hide();
		   $('#trdistrict').hide();
		   
   });
     $('#trphc').hide();
     $('#tdrdphc').hide();
     
     $('#cbodistrictname').change(function(event){
		 var disid =  $('#cbodistrictname').val();
		 
		 $.get('getCHC.do',{districtid:disid},function(responsedata){
			 $("#tdcbochc").html(responsedata);
			 $('#cbochc').change(function(event){
				 var chcid =  $('#cbochc').val();				 
				 $.get('getPHC.do',{chcid:chcid},function(responsedata){
					 $("#tdcbophc").html(responsedata);
					 	$('#cbophc').change(function(event){
							 var phcid =  $('#cbophc').val();				 
							 $.get('getSHC.do',{phcid:phcid},function(responsedata){
								 $("#tdcboshc").html(responsedata);
							 	});	
					 	});
					 	 $.get('getSHCCHC.do',{chcid:chcid},function(responsedata){
							 $("#tdcboshc").html(responsedata);
						 	});
					 });
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
        
        
        <div class="menu" style="height:auto;" >
         
		</div>
        
        <!------Container start ------------->
        <div class="Container">
        
        	<div class="left_container" style="width:290px;height:380px;">
            </div>
            
            <div class="mid_container" style="height:auto;width:auto;">
				<div>
					<form action="home.do" method="post">
						<table style="width:auto;">
						            <tr>
						               <td style="color:blue;text-align:center;" colspan="5"><h1>Login Form</h1></td>
						            </tr>
						            <tr>
						               
						               <td style="text-align:center;" colspan="5">${msg}</td>
						            
						            </tr>
									<tr>
									    <td style="width:100px;text-align:right">
											<input type="radio" name="option" value="District Hospital" id="rddistrict" checked="checked"/>District
										</td>
										
										<td>
											<input type="radio" name="option" value="CHC" id="rdchc"/>CHC
										</td>
										
										<td id="tdrdphc">
											 <input type="radio" name="option" value="PHC" id="rdphc"/>PHC
										</td>
										
										<td>
											  <input type="radio" name="option" value="SHC" id="rdshc"/>SHC
										</td>
										
										<td>
											 <input type="radio" name="option" value="Admin" id="rdadmin"/>ADMIN
										</td>
								
									</tr>
									<tr id="trdistrict">
										<td colspan="2" id="tdlbldistrict">
                                           <label id="lbldistrict">
													District Name
                                            </label>
										</td>
										<td colspan="2" id="tdcbodistrictname">
										    <select class="textbox1" id="cbodistrictname" name="cbodistrictname" >
										    <option value="-1">Select District</option>
										    <c:forEach items="${dis}" var="district">
												<option value="${district.district_id}">${district.district_name}</option>
											</c:forEach>	
											</select>
										</td>
									</tr>
									
									 <tr id="trchc">
										<td colspan="2" id="tdlblchc"> 
                                        	<label id="lblchc">
                                            	CHC
                                             </label>
                                        </td>
										<td colspan="2" id="tdcbochc">
                                          	<select class="textbox1" id="cbochc" name="cbochc">
												<option>
												</option>
											</select>
                                           
										</td>
									 </tr>
									 
									 <tr id="trphc">
										<td  colspan="2" id="tdlblphc"><label id="lblphc">PHC</label></td>
										<td colspan="2" id="tdcbophc">
											<select class="textbox1" id="cbophc" name="cbophc">
												<option>
												</option>
											</select>
										</td>
									 </tr>
									 <tr id="trshc">
										<td  colspan="2" id="tdlblshc"><label id="lblshc">SHC</label></td>
										<td colspan="2" id="tdcboshc">
											<select class="textbox1" id="cboshc" name="cboshc">
												<option>
												</option>
											</select>
										</td>
									 </tr>
									 <tr id="trpassword">
										<td colspan="2" id="tdlblpassword">
                                        <label id="lblpassword">
											Password 
                                        </label>
										</td>
										<td colspan="2" id="tdtxtpassword" >
											<input type="password" id="txtpassword" name="txtpassword" style="width:168px"/>
										</td>
								
								
									 </tr>
									 <tr>
									 <td colspan="5" style="text-align:center">
										 <input type="submit"  id="login" value="Login!"/>
									 </td>
								  </tr>                     
							</table>            
					</form>
			       </div>
            </div>
            
        </div>
        <!--------Container end ------------->

        <!--------Footer start ------------->
        <div id="footer" style="height:auto;">
            <%@ include file="footer.jsp" %> 
        </div>
        <!---------Footer end ------------->
        
    </div>
    <!-----Wrapper end ------->
 
</body>
</html>
  