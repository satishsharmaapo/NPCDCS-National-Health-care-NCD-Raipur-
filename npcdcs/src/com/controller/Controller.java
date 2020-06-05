package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.print.attribute.standard.PDLOverrideSupported;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.Session;

import sun.misc.Cleaner;
import util.Util;

import npcdcs.database.dao.ChcDAO;
import npcdcs.database.dao.ChcReportingDAO;
 
import npcdcs.database.dao.DiagnosisNewDAO;
import npcdcs.database.dao.DistrictDAO;
import npcdcs.database.dao.DistrictReportingDAO;
import npcdcs.database.dao.LoginDAO;
import npcdcs.database.dao.NcdAtChcReportingDAO;
import npcdcs.database.dao.NcdAtDistrictReportingDAO;
import npcdcs.database.dao.NcdChcCumReportingDAO;
import npcdcs.database.dao.NcdDistrictCumReportingDAO;
import npcdcs.database.dao.PatientDetailsDAO;
import npcdcs.database.dao.PhcDAO;
import npcdcs.database.dao.ReferralDAO;
import npcdcs.database.dao.ScreeningDetailsDAO;
import npcdcs.database.dao.ScreeningReportDAO;
import npcdcs.database.dao.ShcDAO;
import npcdcs.database.dao.ShcReportingDAO;
import npcdcs.database.dao.StateDAO;
import npcdcs.database.pojo.Chc;
import npcdcs.database.pojo.DiagnosisNew;
import npcdcs.database.pojo.District;
import npcdcs.database.pojo.DistrictReporting;
import npcdcs.database.pojo.Login;
import npcdcs.database.pojo.NcdChcCumReporting;
import npcdcs.database.pojo.PatientDetails;
import npcdcs.database.pojo.Phc;
import npcdcs.database.pojo.Referral;
import npcdcs.database.pojo.ScreeningDetails;
import npcdcs.database.pojo.Shc;
import npcdcs.database.pojo.ShcReporting;
import npcdcs.database.pojo.State;

/**
 * Servlet implementation class Controller
 */
//@WebServlet("*.do")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private DistrictDAO districtDAO=null;
    private PatientDetailsDAO patientDetailsDAO = null;
    private LoginDAO loginDAO=null;
    private ScreeningDetailsDAO screeningDetailsDAO = null; 
    private ShcDAO shcDao=null;
    private StateDAO stateDAO=null;
    private ChcDAO chcDAO= null; 
    private PhcDAO phcDAO=null;
    private ScreeningReportDAO screeningreportDAO=null;
    private ReferralDAO referralDAO=null;
    private ShcReportingDAO shcreportingDAO=null;
    private ChcReportingDAO chcreportingDAO=null;
    private NcdAtDistrictReportingDAO ncdatdistrictDAO=null;
    private DistrictReportingDAO districtreportDAO=null;
    private NcdAtChcReportingDAO ncdatchcreportDAO=null;
    private NcdChcCumReportingDAO ncdchccumreportDAO=null;
    private NcdDistrictCumReportingDAO ncddistrictcumreportingDAO=null;
    private DiagnosisNewDAO diagnosisnewDAO=null;
      /**
       	* Default constructor. 
     */
    public Controller() {
        // TODO Auto-generated constructor stub
    }
	/**
	 	* @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		districtDAO = new DistrictDAO();
		patientDetailsDAO = new PatientDetailsDAO();
		loginDAO =new LoginDAO();
		screeningDetailsDAO = new ScreeningDetailsDAO();		
		stateDAO=new StateDAO();
		chcDAO=new ChcDAO();
		phcDAO=new PhcDAO();
		shcDao=new ShcDAO();
		screeningreportDAO=new ScreeningReportDAO();
		referralDAO=new ReferralDAO();
		shcreportingDAO=new ShcReportingDAO();
		chcreportingDAO=new ChcReportingDAO();
		ncdatdistrictDAO=new NcdAtDistrictReportingDAO();
		districtreportDAO=new DistrictReportingDAO();	
		ncdatchcreportDAO=new NcdAtChcReportingDAO();	
		ncdchccumreportDAO=new NcdChcCumReportingDAO();
		ncddistrictcumreportingDAO=new NcdDistrictCumReportingDAO();
		diagnosisnewDAO=new DiagnosisNewDAO();
	
		}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doPerform(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPerform(request, response);
	}

	private void doPerform(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = request.getServletPath();
		System.out.println(url);
		url = url.substring(1,url.indexOf('.'));
		RequestDispatcher rd = null;
		@SuppressWarnings("unchecked")
		List<District> districtList = districtDAO.list();
		//url="login";
		//url="adddistrict";
		System.out.println(url);
		if(url.equals("login"))
		{    
			request.setAttribute("dis", districtList);
			rd = request.getRequestDispatcher("/login.jsp");
			rd.forward(request, response);
		}
		 
		else if(url.equals("home"))
		{
			//userid and password ok
			 Login bin=new Login();
			 HttpSession hs = request.getSession(true);			 
			 bin.setPassword(request.getParameter("txtpassword"));			
			 String dis=request.getParameter("cbodistrictname");
			 String chc=request.getParameter("cbochc");
			 String phc=request.getParameter("cbophc");
			 String shc=request.getParameter("cboshc");
			 System.out.println("dis : "+dis);
			 System.out.println("chc : "+chc);
			 System.out.println("phc : "+phc);
			 System.out.println("shc : "+shc);
			 bin.setLevel(1);
			 hs.setAttribute("level",1);
//			 hs.setAttribute("centerid", dis);
//			 hs.setAttribute("status","dis");
			 if(dis!=null && !dis.equals("-1") && !dis.trim().equals("") )
			 {    
				 bin.setLevel(2);
				 hs.setAttribute("pw", request.getParameter("txtpassword"));
				 hs.setAttribute("level",2);
				 hs.setAttribute("centerid", dis);
				 hs.setAttribute("status","dis");
				 hs.setAttribute("centerName",((District)districtDAO.load(dis)).getDistrict_name());
//				 District d=(District)districtDAO.load(dis);
//				 hs.setAttribute("districtname1", d.getDistrict_name());
//				 hs.setAttribute("statename1",((State)stateDAO.load(d.getState_id())).getState_name());
				 				 
			 }
			 if(chc!=null && !chc.equals("-1") && !chc.trim().equals(""))
			 {
				 bin.setLevel(3);
				 hs.setAttribute("pw", request.getParameter("txtpassword"));
				 hs.setAttribute("level",3);
				 hs.setAttribute("centerid", chc);
				 hs.setAttribute("status","chc");
				 hs.setAttribute("disName",((District)districtDAO.load(dis)).getDistrict_name());
				 hs.setAttribute("centerName",((Chc)chcDAO.load(chc)).getChc_name());
//				 Chc d=(Chc)chcDAO.load(chc);
//				 hs.setAttribute("chcname1", d.getChc_name());
//				 District dis1=(District)districtDAO.load(d.getDistrict_id());
//				 hs.setAttribute("districtname1",dis1.getDistrict_name());
//				 State st=((State)stateDAO.load(dis1.getState_id()));
//				 hs.setAttribute("statename1",st.getState_name());
			 }
			 if(phc!=null && !phc.equals("-1") && !phc.trim().equals(""))
			 {
				 bin.setLevel(4);
				 hs.setAttribute("pw", request.getParameter("txtpassword"));
				 hs.setAttribute("level",4);
				 hs.setAttribute("centerid",phc);
				 hs.setAttribute("status","phc");
				 hs.setAttribute("disName",((District)districtDAO.load(dis)).getDistrict_name());
				 hs.setAttribute("chcName",((Chc)chcDAO.load(chc)).getChc_name());
				 hs.setAttribute("centerName",((Phc)phcDAO.load(phc)).getPhc_name());
//				// Phc phc1=(Phc)phcDAO.load(phc);
//				 hs.setAttribute("phcname", phc1.getPhc_name());
//				 Chc d=(Chc)chcDAO.load(phc1.getChc_id());
//				 hs.setAttribute("chcname1", d.getChc_name());
//				 District dis1=(District)districtDAO.load(d.getDistrict_id());
//				 hs.setAttribute("districtname1",dis1.getDistrict_name());
//				 State st=((State)stateDAO.load(dis1.getState_id()));
//				 hs.setAttribute("statename1",st.getState_name());
			 }
			 if(shc!=null && !shc.equals("-1") && !shc.trim().equals(""))
			 {
				 bin.setLevel(5);
				 hs.setAttribute("pw", request.getParameter("txtpassword"));
				 hs.setAttribute("level",5);
				 hs.setAttribute("centerid",shc);
				 hs.setAttribute("disName",((District)districtDAO.load(dis)).getDistrict_name());
				 hs.setAttribute("chcName",((Chc)chcDAO.load(chc)).getChc_name());
				 hs.setAttribute("phcName",((Phc)phcDAO.load(phc)).getPhc_name());
				 hs.setAttribute("centerName",((Shc)shcDao.load(shc)).getSub_name());
			 }
		  
			// bin.setPassword(hs.getAttribute("pw").toString());
			 bin.setLevel(Integer.parseInt(hs.getAttribute("level").toString()));
			 System.out.println(bin);
			 
			 // -------------from login form to home1 as patient
			 if (loginDAO.exist(bin))
			 {
				rd = request.getRequestDispatcher("/Patient_info.jsp");
				rd.forward(request, response);
			 }
			 else
			 {
				 request.setAttribute("msg","Invalid username and password");
				 rd = request.getRequestDispatcher("/login.do");
				 rd.forward(request, response);
			 }
		}
//		else if(url.equals("getchcpatient"))
//		{
//			
//			List<Chc> chclist=chcDAO.list();
//			request.setAttribute("chclist", chclist);
//			rd = request.getRequestDispatcher("/");
//			rd.forward(request, response);
//		}
//  
		else if(url.equals("save"))
		{
			  PatientDetails pd = new PatientDetails();
			  System.out.println(request.getParameter("txtpatientname"));
			    pd.setSub_id(Integer.parseInt(request.getSession().getAttribute("centerid").toString()));
				pd.setPat_name(request.getParameter("txtpatientname"));
				pd.setFather_name(request.getParameter("txtfathername"));
				pd.setId_type(request.getParameter("cboidtype"));
				pd.setId_no(request.getParameter("txtidno"));
				pd.setPat_address(request.getParameter("txtaddress"));
				pd.setAge(Integer.parseInt(request.getParameter("txtage")));
				pd.setSex(request.getParameter("cbosex"));
				pd.setVillage(request.getParameter("txtvillage"));
				pd.setCampregnoname(request.getParameter("txtcampregno"));
				pd.setContact(request.getParameter("txtcontactno"));				
				pd.setSmoking(Boolean.parseBoolean(request.getParameter("cbosmoking")));
				pd.setChewable(Boolean.parseBoolean(request.getParameter("cbochewable")));
        	    
        	     System.out.println(pd);

				 	if (patientDetailsDAO.save(pd))
					{				 		
						request.setAttribute("msg","Record is successfully inserted");
					}
					else
					{
						request.setAttribute("msg","Record is not inserted. Please try again");
					}
					 				
 		rd = request.getRequestDispatcher("/home.do");
 		rd.forward(request, response);
			
		}
//---------------------------Patient Details------------------------------------------------
		else if (url.equals("savediagnosis"))
		{
			DiagnosisNew sd=new DiagnosisNew();
			
			sd.setPat_id(Integer.parseInt(request.getParameter("pat_id")));	
			sd.setDiabetes(Boolean.parseBoolean(request.getParameter("cbodiabetes")));
			sd.setHypertension(Boolean.parseBoolean(request.getParameter("cbohypertension")));
			sd.setCardiovascular(Boolean.parseBoolean(request.getParameter("cbocardiovascular")));			 
			sd.setCancer(Boolean.parseBoolean(request.getParameter("cbocancer")));			
			sd.setNoofhomevisit(Boolean.parseBoolean(request.getParameter("cbovisit")));
			
		 	System.out.println(sd);
			if (diagnosisnewDAO.save(sd))
			{
				 request.setAttribute("msg","Record is successfully inserted");
				 int patid=Integer.parseInt(request.getParameter("pat_id"));
						Referral r=new Referral();
						r.setPat_id(patid);
						System.out.println("patient id : "+patid);
						r.setReference_from(request.getSession().getAttribute("centerid").toString());
						//System.out.println(Integer.parseInt(request.getSession(false).getAttribute("centerid").toString()));
						r.setReference_to(request.getParameter("cborefdistrict"));
						r.setDate_to_refer(Util.changeDateFormat(new java.util.Date()));
						System.out.println(r);
						referralDAO.save(r);
						request.setAttribute("msg","Record is successfully inserted");
					
			}
			else
			{
				request.setAttribute("msg","Record is not inserted. Please try again");
			}
			rd = request.getRequestDispatcher("/screening.do");
			rd.forward(request, response);
		}
//---------------------------------Shc Reporting from village level-----------------------
		else if (url.equals("savescreening"))
		{
			ScreeningDetails sd=new ScreeningDetails();
			sd.setPat_id(Integer.parseInt(request.getParameter("pat_id")));	
			sd.setHypertension_high(Float.parseFloat(request.getParameter("txthypertension_high")));
			sd.setHypertension_low(Float.parseFloat(request.getParameter("txthypertension_low")));
			sd.setDiabetes_test_type(request.getParameter("rdtype"));			 
			sd.setDiabetes(Float.parseFloat(request.getParameter("txtdiabetes")));			
			sd.setCancer(Boolean.parseBoolean(request.getParameter("cbocancer")));
			sd.setCardiovascular(Boolean.parseBoolean(request.getParameter("cbocardiovascular")));
			System.out.println(sd);
			if (screeningDetailsDAO.save(sd))
			{
				 request.setAttribute("msg","Record is successfully inserted");
				 int patid=Integer.parseInt(request.getParameter("pat_id"));
				 if(!request.getParameter("cbochc").equals("-1"))
					{
						Referral r=new Referral();
						r.setPat_id(patid);
						System.out.println("patient id : "+patid);
						r.setReference_from(request.getSession().getAttribute("centerid").toString());
						//System.out.println(Integer.parseInt(request.getSession(false).getAttribute("centerid").toString()));
						r.setReference_to(request.getParameter("cbochc"));
						r.setDate_to_refer(Util.changeDateFormat(new java.util.Date()));
						System.out.println(r);
						referralDAO.save(r);
						request.setAttribute("msg","Record is successfully inserted");
					}
			}
			else
			{
				request.setAttribute("msg","Record is not inserted. Please try again");
			}
			rd = request.getRequestDispatcher("/screening.do");
			rd.forward(request, response);
		}
//---------------------------------shc Reporting from village level--------------------------
		else if (url.equalsIgnoreCase("shcreporting"))
		{
			System.out.println(shcreportingDAO.list());			 
			request.setAttribute("shcreportdetails",shcreportingDAO.list());
			request.setAttribute("date",Util.changeDateFormatStyle(new Date()));
			rd = request.getRequestDispatcher("/shcreporting.jsp");
			rd.forward(request, response);
		}
//----------------------------------chc Reporting from sub center level---------------------
		else if (url.equalsIgnoreCase("chcreporting"))
		{
			//System.out.println(chcreportingDAO.list());			 
			request.setAttribute("chcreportdetails",chcreportingDAO.list());
//	request.setAttribute("status", arg1)request.getSession().getAttribute("centerid").toString()
			request.setAttribute("date",Util.changeDateFormatStyle(new Date()));
			rd = request.getRequestDispatcher("/chcreporting.jsp");
			rd.forward(request, response);
		}
//----------------------------------Ncd Clinic at District Reporting------------------------
		if(url.equalsIgnoreCase("ncdatdistrictreport"))
		{
			request.setAttribute("ncdatdistrictlist",ncdatdistrictDAO.list());
			request.setAttribute("date",Util.changeDateFormatStyle(new Date()));
			rd = request.getRequestDispatcher("/ncdatdistrictreporting.jsp");
			rd.forward(request, response);
		}
//----------------------------------NCD Clinic at CHC Reporting-----------------------------
		if(url.equalsIgnoreCase("ncdatchcreporting"))
		{
			request.setAttribute("ncdatdistrictlist",ncdatchcreportDAO.list());
			request.setAttribute("date",Util.changeDateFormatStyle(new Date()));
			rd = request.getRequestDispatcher("/ncdatchcreporting.jsp");
			rd.forward(request, response);
		}
//----------------------------------NCD CHC During the month  and cumulative------------------
		if(url.equalsIgnoreCase("ncdchccumreporting"))
		{
			List<NcdChcCumReporting> list=ncdchccumreportDAO.list();
			int pmale=0;
			int pfem=0;
			int pmalediabetes=0;
			int pmalehypertension=0;
			int pmalecardiovascular=0;
			int pmalecancer=0;
			int pmalerefdistrict=0;
			int pmalehomevisit=0;
			int pfemdiabetes=0;
			int pfemhypertension=0;
			int pfemcardiovascular=0;
			int pfemcancer=0;
			int pfemrefdistrict=0;
			int pfemhomevisit=0;
			NcdChcCumReporting ncd=null;
			for(int i=0;i<list.size();i++)
			{
				ncd=list.get(i);
				Date d=new Date();
				if(ncd.getSex().equalsIgnoreCase("male"))
				{
					pmale+=ncd.getNoofsex();
					pmalediabetes+=ncd.getNoofdiabetic();
					pmalehypertension+=ncd.getNoofhypertension();
					pmalecardiovascular+=ncd.getNoofcardiovascular();
					pmalecancer+=ncd.getNoofcancer();
					pmalerefdistrict+=ncd.getNoofrefpatient();
					pmalehomevisit+=ncd.getNoofhomevisit();
					
				}
				if(ncd.getSex().equalsIgnoreCase("female"))
				{
					pfem+=ncd.getNoofsex();
					pfemdiabetes+=ncd.getNoofdiabetic();
					pfemhypertension+=ncd.getNoofhypertension();
					pfemcardiovascular+=ncd.getNoofcardiovascular();
					pfemcancer+=ncd.getNoofcancer();
					pfemrefdistrict+=ncd.getNoofrefpatient();
					pfemhomevisit+=ncd.getNoofhomevisit();
				}
				if(ncd.getSex().equalsIgnoreCase("male") && ncd.getMonth()==d.getMonth()+1 )
				{
					request.setAttribute("cmale",ncd);
				}
				if(ncd.getSex().equalsIgnoreCase("female") && ncd.getMonth()==d.getMonth()+1)
				{
					request.setAttribute("cfemale",ncd);
				}
			}
			
			request.setAttribute("pmale",pmale);
			request.setAttribute("pfem",pfem);
			request.setAttribute("pmalediabetes",pmalediabetes);
			request.setAttribute("pmalehypertension",pmalehypertension);
			request.setAttribute("pmalecardiovascular",pmalecardiovascular);
			request.setAttribute("pmalecancer",pmalecancer);
			request.setAttribute("pmalerefdistrict",pmalerefdistrict);
			request.setAttribute("pfemrefdistrict",pfemrefdistrict);
			request.setAttribute("pmalehomevisit",pmalehomevisit);
			request.setAttribute("pfemdiabetes",pfemdiabetes);
			request.setAttribute("pfemhypertension",pfemhypertension);
			request.setAttribute("pfemcardiovascular",pfemcardiovascular);
			request.setAttribute("pfemcancer",pfemcancer);
			request.setAttribute("pfemrefdistrict",pfemrefdistrict);
			request.setAttribute("pfemhomevisit",pfemhomevisit);
				
			request.setAttribute("date",Util.changeDateFormatStyle(new Date()));
			rd = request.getRequestDispatcher("/ncdchccumreporting.jsp");
			rd.forward(request, response);
		}
//---------------------------------NCD District During the month and cumulative--------------
		if(url.equalsIgnoreCase("ncddistrictcumreporting"))
		{
			request.setAttribute("ncddistrictcumlistdetails",ncddistrictcumreportingDAO.list());
			request.setAttribute("date",Util.changeDateFormatStyle(new Date()));
			rd = request.getRequestDispatcher("/ncddistrictcumreporting.jsp");
			rd.forward(request, response);
		}
//---------------------------------District List Extract-------------------------------------
		if(url.equalsIgnoreCase("districtreporting"))
		{
			request.setAttribute("districtreportlist",districtreportDAO.list());
			request.setAttribute("date",Util.changeDateFormatStyle(new Date()));
			rd = request.getRequestDispatcher("/districtreporting.jsp");
			rd.forward(request, response);
		}
//---------------------------------Patient Details List--------------------------------------
		else if(url.equals("screening"))
		{		
			String st =(String) request.getSession().getAttribute("status");
			request.setAttribute("plist",patientDetailsDAO.list());
			System.out.println(st);
			System.out.println(patientDetailsDAO.list());
			if(st != null && (st.equalsIgnoreCase("dis") || st.equalsIgnoreCase("chc")))
			{
				request.setAttribute("districtlist",districtList);
				rd = request.getRequestDispatcher("/diagnosisnew.jsp");
				rd.forward(request, response);
				
			}
			else
			{
			
			rd = request.getRequestDispatcher("/screening.jsp");
			rd.forward(request, response);
			}
		}
//---------------------------------State list-------------------------------------------------
		else if(url.equals("addstate"))
		{
			System.out.println(stateDAO.list());
			request.setAttribute("statelist",stateDAO.list());
			rd = request.getRequestDispatcher("/addstate.jsp");
			rd.forward(request, response);			
		}
//---------------------------------District List----------------------------------------------
		else if(url.equals("adddistrict"))
		{
			System.out.println(districtDAO.list());
			request.setAttribute("districtlist", districtDAO.list());
			rd=request.getRequestDispatcher("/adddistrict.jsp");
			rd.forward(request, response);				 
		}
//--------------------------------Chc List----------------------------------------------------
		else if(url.equals("addchc"))
		{
			System.out.println(chcDAO.list());
			request.setAttribute("chclist", chcDAO.list());
			rd=request.getRequestDispatcher("/addchc.jsp");
			rd.forward(request, response);				 
		}
//--------------------------------Dynamic Retreive CHC----------------------------------------	
		else if(url.equals("getCHC"))
		{
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.println("<select class='textbox1' id='cbochc' name='cbochc'>");
			out.println("<option value='-1'>Select CHC</option>");
			@SuppressWarnings("unchecked")
			ArrayList<Chc> list = (ArrayList<Chc>)chcDAO.list(request.getParameter("districtid"));
			Iterator<Chc> it = list.iterator();
			Chc chc = null;
			while(it.hasNext())
			{
				chc = it.next();
				out.println("<option value='"+chc.getChc_id()+"'>"+chc.getChc_name()+"</option>");
			}
			out.println("</select>");
		}		
		  	 
//---------------------------------Dynamic Retreive PHC---------------------------------------
			else if(url.equals("getPHC"))
			{
				PrintWriter out = response.getWriter();
				response.setContentType("text/html");
				out.println("<select class='textbox1' id='cbophc' name='cbophc'>");
				out.println("<option value='-1'>Select PHC</option>");
				ArrayList<Phc> list = (ArrayList<Phc>)phcDAO.list(request.getParameter("chcid"));
				Iterator<Phc> it = list.iterator();
	             Phc phc = null;
				while(it.hasNext())
				{
					phc = it.next();
					out.println("<option value='"+phc.getPhc_id()+"'>"+phc.getPhc_name()+"</option>");
				}
				out.println("</select>");
			}
//----------------------------------Dynamic Retreive CHC-----------------------------------------------
		else if(url.equals("getSHC"))
		{
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.println("<select class='textbox1' id='cboshc' name='cboshc'>");
			out.println("<option value='-1'>Select CHC</option>");
			@SuppressWarnings("unchecked")
			ArrayList<Shc> list = (ArrayList<Shc>)shcDao.list(request.getParameter("phcid"));
			System.out.println(list);
			Iterator<Shc> it = list.iterator();
			Shc shc = null;
			while(it.hasNext())
			{
				shc = it.next();
				out.println("<option value='"+shc.getSub_id()+"'>"+shc.getSub_name()+"</option>");
			}
			out.println("</select>");
		}
//-----------------------------------Dynamic Retreive SHCCHC-------------------------------------------
		else if(url.equals("getSHCCHC"))
		{
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.println("<select class='textbox1' id='cboshc' name='cboshc'>");
			out.println("<option value='-1'>Select CHC</option>");
			@SuppressWarnings("unchecked")
			ArrayList<Shc> list = (ArrayList<Shc>)shcDao.listbyCHC(request.getParameter("chcid"));
			System.out.println(list);
			Iterator<Shc> it = list.iterator();
			Shc shc = null;
			while(it.hasNext())
			{
				shc = it.next();
				out.println("<option value='"+shc.getSub_id()+"'>"+shc.getSub_name()+"</option>");
			}
			out.println("</select>");
		}
 //----------------------------------Retreive District Details Dynamically-----------------------------
		else if(url.equals("getDistrictdel"))
		{
			//request.setAttribute("statelist",stateDAO.list());
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.println("<select class='textbox1' id='cbodeldistrict' name='cbodeldistrict'>");
			out.println("<option value='-1'>Select CHC</option>");
			@SuppressWarnings("unchecked")
			ArrayList<District> list = (ArrayList<District>)districtDAO.list(request.getParameter("stateid"));
			System.out.println("get dis : "+list);
			Iterator<District> it = list.iterator();
			District district = null;
			while(it.hasNext())
			{
				district = it.next();
				out.println("<option value='"+district.getDistrict_id()+"'>"+district.getDistrict_name()+"</option>");
			}
			out.println("</select>");
		}
//----------------------------------Retreive District Details Dynamically------------------------------
		else if(url.equals("getDistrictedit"))
		{
			//request.setAttribute("statelist",stateDAO.list());
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.println("<select class='textbox1' id='cboeditdistrict' name='cboeditdistrict'>");
			out.println("<option value='-1'>Select CHC</option>");
			@SuppressWarnings("unchecked")
			ArrayList<District> list = (ArrayList<District>)districtDAO.list(request.getParameter("stateid"));
			System.out.println("get dis : "+list);
			Iterator<District> it = list.iterator();
			District district = null;
			while(it.hasNext())
			{
				district = it.next();
				out.println("<option value='"+district.getDistrict_id()+"'>"+district.getDistrict_name()+"</option>");
			}
			out.println("</select>");
		}
		//----------------------------------Retreive CHC Details Dynamically-------------------------
		else if(url.equals("getCHCs"))
		{
			//request.setAttribute("statelist",stateDAO.list());
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.println("<select class='textbox1' id='cbodelchc' name='cbodelchc'>");
			out.println("<option value='-1'>Select CHC</option>");
			@SuppressWarnings("unchecked")
			ArrayList<Chc> list = (ArrayList<Chc>)chcDAO.list(request.getParameter("stateid"));
			System.out.println("get dis : "+list);
			Iterator<Chc> it = list.iterator();
			Chc chc = null;
			while(it.hasNext())
			{
				chc  = it.next();
				out.println("<option value='"+chc.getChc_id()+"'>"+chc.getChc_name()+"</option>");
			}
			out.println("</select>");
		}
//------------------------SubCenter Reporting-------------------------------------------------------
		else if(url.equalsIgnoreCase("subcenterreporting"))
		{
			System.out.println(screeningreportDAO.list());
			request.setAttribute("date",Util.changeDateFormatStyle(new Date()));
			request.setAttribute("screeningdetails",screeningreportDAO.list());
			rd = request.getRequestDispatcher("/subcenterreporting.jsp");
			rd.forward(request, response);	
			
		}
//-------------------- add update delete the state records-------------------------------------------
		else if(url.equals("savestate"))
		{

			if (request.getParameter("rdmodification").equals("add"))
			{
				System.out.println(request.getParameter("txtaddstate"));
				State st = new State();
				 // st.setState_id(Integer.parseInt(request.getParameter("state_id")));
				  st.setState_name(request.getParameter("txtaddstate"));
					if (stateDAO.save(st))
						{
							 request.setAttribute("msg","Record is successfully inserted");
						}
						else
						{
							request.setAttribute("msg","Record is not inserted. Please try again");
						}
			}
			else if(request.getParameter("rdmodification").equals("edit"))
			{
			 // st.setState_id(Integer.parseInt(request.getParameter("state_id")));
				State st = new State();
				st.setState_name(request.getParameter("cboeditstate"));
				st.setState_id(Integer.parseInt(request.getParameter("txtchangestate")));
								    
				  try{
					if (stateDAO.update(st))
						{
							 request.setAttribute("msg","Record is successfully Updated");
						}
						else
						{
							request.setAttribute("msg","Record is not Updated. Please try again");
						}
				  }
				  catch(Exception e)
				  {
					  e.printStackTrace();
				  }
			}
			else if(request.getParameter("rdmodification").equals("delete"))
			{
				 
				 // st.setState_id(Integer.parseInt(request.getParameter("state_id")));
				  String del=request.getParameter("cbodelstate");
				  System.out.println(request.getParameter("cbodelstate"));
					if (stateDAO.delete(del))
						{
							 request.setAttribute("msg","Record is successfully deleted");
						}
						else
						{
							request.setAttribute("msg","Record is not deleted. Please try again");
						}
			}
			//System.out.println(request.getParameter("rdmodification").equals("update"));
			rd = request.getRequestDispatcher("/addstate.jsp");
			rd.forward(request, response);
	}
//--------------------------------add update delete the district record ----------------------------		
		else if (url.equals("savedistrict"))
		{
			if (request.getParameter("rdmodification").equals("add"))
			{
				System.out.println(request.getParameter("txtadddistrict"));
				District dis = new District();
				 // st.setState_id(Integer.parseInt(request.getParameter("state_id")));
				  dis.setDistrict_name(request.getParameter("txtadddistrict"));
					if (districtDAO.save(dis))
						{
							 request.setAttribute("msg","Record is successfully inserted");
						}
						else
						{
							request.setAttribute("msg","Record is not inserted. Please try again");
						}
			}
		
			else if(request.getParameter("rdmodification").equals("edit"))
			{
				// st.setState_id(Integer.parseInt(request.getParameter("state_id")));
				State st=new State();
				  st.setState_name(request.getParameter("cboeditdistrict"));
				  st.setState_id(Integer.parseInt(request.getParameter("txtchangedistrict")));				    
				  try{
					if (districtDAO.update(st))
						{
							 request.setAttribute("msg","Record is successfully Updated");
						}
						else
						{
							request.setAttribute("msg","Record is not Updated. Please try again");
						}
				  }
				  catch(Exception e)
				  {
					  e.printStackTrace();
				  }
			}
			else if(request.getParameter("rdmodification").equals("delete"))
			{
				 
				 // st.setState_id(Integer.parseInt(request.getParameter("state_id")));
				  String del=request.getParameter("cbodeldistrict");
				  System.out.println(request.getParameter("cbodeldistrict"));
					if (districtDAO.delete(del))
						{
							 request.setAttribute("msg","Record is successfully deleted");
						}
						else
						{
							request.setAttribute("msg","Record is not deleted. Please try again");
						}
			}

		 	rd = request.getRequestDispatcher("/adddistrict.jsp");
			rd.forward(request, response);
		}
//--------------------------------add update delete the chc record --------------------------------		
	    else if (url.equals("savechc"))
				{					 
					if (request.getParameter("rdmodification").equals("add"))
					{
						System.out.println(request.getParameter("txtaddchc"));
						Chc chc = new Chc();
						 // st.setState_id(Integer.parseInt(request.getParameter("state_id")));
						    chc.setChc_name(request.getParameter("txtaddchc"));
						     
							if (chcDAO.save(chc))
								{
									 request.setAttribute("msg","Record is successfully inserted");
								}
								else
								{
									request.setAttribute("msg","Record is not inserted. Please try again");
								}
						     
						    }
					
				
					else if(request.getParameter("rdmodification").equals("edit"))
					{
						 
						 // st.setState_id(Integer.parseInt(request.getParameter("state_id")));
						 Shc s=new Shc();
						 s.setSub_id(Integer.parseInt(request.getParameter("cboeditchc")));
						 s.setSub_name(request.getParameter("txtchangechc"));
						   
						  try{
							if (chcDAO.update(s))
								{
									 request.setAttribute("msg","Record is successfully Updated");
								}
								else
								{
									request.setAttribute("msg","Record is not Updated. Please try again");
								}
						  }
						  catch(Exception e)
						  {
							  e.printStackTrace();
						  }
					}
					else if(request.getParameter("rdmodification").equals("delete"))
					{
						 
						 // st.setState_id(Integer.parseInt(request.getParameter("state_id")));
						  String del=request.getParameter("cbodelchc");
						  System.out.println(request.getParameter("cbodelchc"));
							if (chcDAO.delete(del))
								{
									 request.setAttribute("msg","Record is successfully deleted");
								}
								else
								{
									request.setAttribute("msg","Record is not deleted. Please try again");
								}
					}
				 	rd = request.getRequestDispatcher("/addchc.jsp");
					rd.forward(request, response);
		 		}
	        }
		}
	  
	

