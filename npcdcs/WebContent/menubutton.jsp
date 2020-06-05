<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav>
	<ul>
		<li><a href="#">Home</a></li>
		 
		
		<li><a href="#">District</a> 
		            <ul><c:if test="${level==2 or level==1}">
					<li><a href="home.do">Patient Entry</a></li>
						<li><a href="screening.do">Diagnosis</a></li>
						<li><a href="#">Report</a>
						  <ul>
						       <li><a href="districtreporting.do">District Report</a></li>
						       <li><a href="ncdatdistrictlist.do">NCD Clinic at District</a></li>
							   <li><a href="ncddistrictcumreporting.do">NCD Clinic Cummulative at District</a></li>
						  </ul> 
						</li> 
						</c:if>
					</ul>
		</li>
		<li><a href="#">CHC</a> 
		            <ul><c:if test="${level==3 or level==1}">
					 <li><a href="home.do">Patient Entry</a></li>
						<li><a href="diagnosisnew.do">Diagnosis</a></li>
						<li><a href="#">Report</a>
						  <ul>
						       <li><a href="chcreporting.do">CHC Report</a></li>
						       <li><a href="ncdatchcreporting.do">NCD Clinic at CHC</a></li>
							   <li><a href="ncdchccumreporting.do">NCD Clinic Cummulative at CHC</a></li>
						  </ul> 
						  </li> 
						  </c:if>
					</ul>
		</li>
				<li><a href="#">SHC</a> 
		            <ul><c:if test="${level==5 or level==1}">
					<li><a href="home.do">Patient Entry</a></li>
						<li><a href="screening.do">Screening</a></li>
						<li><a href="#">Report</a>
						  <ul>
<!-- 						       <li><a href="chcreporting.do">CHC Report</a></li> -->
						       <li><a href="shcreporting.do">Sub Center Report</a></li>
						       <li><a href="subcenterreporting">Screening Report</a></li>
							
						  </ul> 
						 </li> 
						 </c:if>
					</ul>
		        </li>
		<li>
			<a href="login.do">Admin</a>
		</li>
		<li>
			<a href="http://www.cgncd.in/about.php" target="_blank">About Us</a>
		</li>
		<li style="width:100px;"> 
		</li>
		<li style="width:100px;"> 
		</li>
		<li style="width:100px;"> 
		</li>
		<li style="width:100px;"> 
		</li>
	</ul>
</nav>