  
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
<script type="text/javascript" src="script/jquery.validate.pack.js"></script>

<style>
select
{
	width:205px;
}
label{
	   display:inline-block;
	   width:150px;
      }
	  label.error
	  {
		 display:inline-block;
	   width:auto; 
	  }
.textbox1
{
	width:200px;
}
</style>
 
<!-- //    $(document).ready(function() { -->
<!-- //      $('#divscreeningform').hide(); -->
<!-- // 	 $('#btnpatientdetails').click(function(){ -->
<!-- // 		 $('#divscreeningform').hide(); -->
<!-- // 		 $('#divpatientform').show(); -->
<!-- // 	 }); -->
<!-- // 	  $('#btnscreeningdetail').click(function(){ -->
<!-- // 		 $('#divscreeningform').show(); -->
<!-- // 		 $('#divpatientform').hide(); -->
<!-- // 	 }); -->
<!-- // }); -->
 
<script type="text/javascript">
$(document).ready(function(){
	  $('#msg').toggle(3000);
	  jQuery.validator.addMethod("lettersonly", function(value, element) {
		  return this.optional(element) || /^[a-z]+$/i.test(value);
		}, "Letters only please"); 
	
	});
	
	
	$(document).ready(function(){
		$("#register").validate({
			   	     
			     rules: {
			    	 txthypertension_high: {required:true,number:true},
			    	 txthypertension_low: {required:true,number:true},
			    	 txtdiabetes: {required:true,number:true},
			    	 
				 }
		});
	});
</script>
</head>
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
        
        	<div class="left_container" style="width:270px;height:400px;">
            </div>
            
            <div class="mid_container" style="height:auto;width:383px;margin-top:20px;">
            <div id="choosebutton" style="text-align:center;">
            	   
            	<a  href="home1.do">Patient Entry form</a>
                <a  href="screening.do">Screening Entry form</a>
            </div>
             
               <div id="divscreeningform">
            		  <form action="savescreening.do" method="post" id="register">
							<table style="width:100%;border-collapse:collapse;border:4px double #CCCCCC;">
							<tr>
					            <td colspan="2" style=";background-color:white;font-size:5px;color:red;text-align:center"><h1>${msg}</h1></td>
					        </tr>
		        <tr>
		            <th colspan="2" style="height:50px"><h1>Screening Entry form</h1></th>
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

                        <input type="text" name="txthypertension_high" id="txthypertension_high"  style="width:57px;"/>
                       <font style="font-size:20px;"><strong>&nbsp; / &nbsp;</strong></font>
                       <input type="text" name="txthypertension_low" id="txthypertension_low" style="width:57px;"/>mm Hg
                    </td>
            </tr>
            
          
                <tr>
               <td>Diabetes Type:</td>
                    <td>
                       <input type="radio" id="rdfp" name="rdtype" value="FP"/>FP
                       <input type="radio" id="rdpp" name="rdtype" value="PP"/>PP
                       <input type="radio" id="rdrandom" name="rdtype" value="Random"/>RANDOM
                    </td>
               </tr>
            <tr>
                <td>Diabetes :</td>
                    <td>
                       <input type="text" id="txtdiabetes" name="txtdiabetes" style="width:150px;"/> mg/dl
                    </td>
            </tr>
          
        	<tr>
            
        		<td>Cardiovascular Disease</td>
        		<td>
        		<select id="cbosmoking" name="cbocardiovascular">
                    <option value="-1">Select Please</option>
        			<option value="true">Yes</option>
        			<option value="false">No</option>
        		</select>
        		</td>
        </tr>
        	<tr>
        		<td>Cancer</td>
        		<td>
        		<select id="cbochewable" name="cbocancer">
                    <option value="-1">Select Please</option>
        			<option value="true">Yes</option>
        			<option value="false">No</option>
        		</select>
        </td>
        </tr>
        <tr>
        <td>Refered to CHC:</td>
        	<td id="tdcbochc">
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



 

 