package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import beans.Register;


public class RegisterController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		Map<String,String> m = new HashMap<String,String>();
		ModelAndView mav = null;
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String no = req.getParameter("no");
		String pass = req.getParameter("pass");
		String cpass = req.getParameter("cpass");
		String email = req.getParameter("email");
		if(pass.equals(cpass)) {
			
			Configuration cfg = new Configuration();
			cfg.configure("resources/hibernate.cfg.xml");
			SessionFactory sf = cfg.buildSessionFactory();
			Session s = sf.openSession();
			Register r = new Register();
			r.setName(fname + " " + lname);
			r.setEmail(email);
			r.setMobileno(Long.parseLong(no));
			r.setPassword(pass);
			int pk = (int)s.save(r);
			s.beginTransaction().commit();
			s.close();
			if(pk != 0) {
				m.put("msg", "User Register Successfully");
				mav = new ModelAndView("success",m);	
			}
			else {
				m.put("msg", "User not Register");
				mav = new ModelAndView("register",m);	
			}
		}
		else {
			m.put("msg", "please enter correct password and confirm password");
			m.put("fname", fname);
			m.put("lname", lname);
			m.put("no", no);
			m.put("email", email);
			
			mav = new ModelAndView("register",m);
		}
		return mav;
	}

}
