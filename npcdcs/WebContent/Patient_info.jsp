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

.textbox1
{
	width:200px;
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
</style>
<script type="text/javascript">

	$(document).ready(function(){
	  $('#msg').toggle();
	  jQuery.validator.addMethod("lettersonly", function(value, element) {
		  return this.optional(element) || /^[a-z]+$/i.test(value);
		}, "Letters only please"); 
	
	});
	
	
	$(document).ready(function(){
		$("#register").validate({
			   	     
			     rules: {
					 
			    	 txtfathername : {required:true,lettersonly:true},
			    	 txtpatientname : {required:true,lettersonly:true},
			    	 txtidno : {required:true},
			    	 txtaddress : {required:true}, 
			    	 txtage : {required:true,number:true},
			    	 txtvillage : {required:true,lettersonly:true}, 
			    	 txtcampregno : {required:true}, 
			    	 txtcontactno : {required:true,number:true,maxlength:10},
				 }
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
        <div class="containerstyle">
        
        	<div class="left_container" style="width:260px;">
            </div>
            
            <div class="mid_container" style="height:auto;width:383px;margin-top:20px;">
            <div id="choosebutton" style="text-align:center;">
            	   
            	<a  href="home1.do">Patient Entry form</a>
                <a  href="screening.do">Screening Entry form</a>
            </div>
            
            <div id="divpatientform">
                  <form action="save.do" method="post" id="register">
							<table style="width:100%;border-collapse:collapse;border:4px double #CCCCCC;">
							<tr>
					            <td colspan="2" style="background-color:white;font-size:5px;color:red;text-align:center;"><h1>${msg}</h1></td>
					        </tr>
        <tr>
            <th colspan="2" Style="height:50px"><h1>Patient Information form</h1></th>
        </tr>
       
        <tr>
        	    <td>Patient Name :</td>
            	<td>
                	<input type="text" name="txtpatientname" id="txtpatientname" class="textbox1"/>
                </td>
        </tr>
		
		<tr>
        	    <td>Fathers Name :</td>
            	<td> 
                	<input type="text" name="txtfathername" id="txtfathername" class="textbox1"/>
                </td>
        </tr>
		
        <tr>
        	<td>ID Type :</td>
                <td>
                    <select id="cboidtype" name="cboidtype">
                        <option value="-1">Select Please</option>
                        <option value="VoterID">Voter ID</option>
                        <option value="Rashan Card">Rashan Card</option>
                        <option value="Passport">Passport</option>
                        <option value="Driving Licence">Driving Licence</option>
                        <option value="Pan Card">Pan Card</option>
                        <option value="Smart Card">Smart Card</option>
                        <option value="other">Others</option>
                    </select>
                     
                </td>
        </tr>
        <tr>
        	<td>ID No :</td>
                <td>
                    <input type="text" name="txtidno" id="txtidno" class="textbox1"/>
                </td>
        </tr>
        
        <tr>
        	<td>Address :</td>
            	<td>
                	<input type="text" name="txtaddress" id="txtaddress" class="textbox1"/>
                </td>
         </tr>
        <tr>
        	<td>Age :</td>
        		<td>
        			<input type="text" name="txtage" id="txtage" class="textbox1"/>
        		</td>
        </tr>
        <tr>
        <td>Sex :</td>
        	<td>
                <select id="cbosex" name="cbosex">
                    <option value="-1">Select Please</option>
                    <option value="Male">Male</option>
                    <option value="Female">Female</option>
                     
                </select>
        	</td>
        </tr>
        <tr>
<!--         <td>Refered to CHC:</td> -->
<!--         	<td id="tdcbochc"> -->
<!--                 <select id="cbochc" name="cbochc"> -->
<!--                                     <option value="-1">Select CHC</option> -->
<%-- 		                              <c:forEach items="${chclist}" var="chc"> --%>
<%-- 		                           		<option value="${chc.chc_id}"> --%>
<%-- 		                           		  ${chc.chc_name} --%>
<!-- 		                           		</option> -->
<%-- 		                              </c:forEach> --%>
<!--                 </select> -->
<!--         	</td> -->
<!--         </tr> -->
        
        <tr>
         	<td>Village :</td>
        	<td>
               <input type="text" id="txtvillage" name="txtvillage" class="textbox1">
        	</td>
        </tr>
        
          <tr>
         	<td>Camp RegNo/Name</td>
        	<td>
               <input type="text" id="txtcampregno" name="txtcampregno" class="textbox1">
        	</td>
        </tr>
                <tr>
        <td>Contact No :</td>
        	<td>
            	<input type="text" name="txtcontactno" class="textbox1">
        	</td>
        	</tr>
             
 
             
            
               
             
        	<tr>
            
        		<td>Smoking :</td>
        		<td>
        		<select id="cbosmoking" name="cbosmoking">
        			<option value="-1">Select Please</option>
        			<option value="true">Yes</option>
        			<option value="false">No</option>
        		</select>
        		</td>
        </tr>
        	<tr>
        		<td>Chewable :</td>
        		<td>
        		<select id="cbochewable" name="cbochewable">
        		    <option value="-1">Select Please</option>
        			<option value="true">Yes</option>
        			<option value="false">No</option>
        		</select>
        </td>
        </tr>
        <tr>
			<th colspan="2" style="height:50px">
			
				<input type="submit" value="save" class="buttonstyle"/> 
				<input type="reset" class="buttonstyle"/>
			</th> 
	   </tr>
    </table> 
    </form>
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

 