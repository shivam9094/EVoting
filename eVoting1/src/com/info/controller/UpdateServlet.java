package com.info.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.Arrays;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;


import com.info.model.Employee;
import com.info.service.EmployeeService;
import com.info.security.Main;
/*import com.info.security.PasswordEncryptionService;*/

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/updateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		HttpSession session = request.getSession(false);
		if(session == null)//session.isNew();
		{
			RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
			rd.include(request, response);	
			
		}
	else{
		String aadhar1 = (String)session.getAttribute("name");
		String voter_id = request.getParameter("voter_id");
		String party_name = request.getParameter("party_name");
		class PasswordEncryptionService {

			 public boolean authenticate(String attemptedPassword, byte[] encryptedPassword, byte[] salt)
			   throws NoSuchAlgorithmException, InvalidKeySpecException {
			  // Encrypt the clear-text password using the same salt that was used to
			  // encrypt the original password
			  byte[] encryptedAttemptedPassword = getEncryptedPassword(attemptedPassword, salt);

			  // Authentication succeeds if encrypted password that the user entered
			  // is equal to the stored hash
			  return Arrays.equals(encryptedPassword, encryptedAttemptedPassword);
			 }

			 public byte[] getEncryptedPassword(String password, byte[] salt)
			   throws NoSuchAlgorithmException, InvalidKeySpecException {
			  // PBKDF2 with SHA-1 as the hashing algorithm. Note that the NIST
			  // specifically names SHA-1 as an acceptable hashing algorithm for PBKDF2
			  String algorithm = "PBKDF2WithHmacSHA1";
			  // SHA-1 generates 160 bit hashes, so that's what makes sense here
			  int derivedKeyLength = 160;
			  // Pick an iteration count that works for you. The NIST recommends at
			  // least 1,000 iterations:
			  // http://csrc.nist.gov/publications/nistpubs/800-132/nist-sp800-132.pdf
			  // iOS 4.x reportedly uses 10,000:
			  // http://blog.crackpassword.com/2010/09/smartphone-forensics-cracking-blackberry-backup-passwords/
			  int iterations = 20000;

			  KeySpec spec = new PBEKeySpec(password.toCharArray(), salt, iterations, derivedKeyLength);

			  SecretKeyFactory f = SecretKeyFactory.getInstance(algorithm);

			  return f.generateSecret(spec).getEncoded();
			 }

			 public byte[] generateSalt() throws NoSuchAlgorithmException {
			  // VERY important to use SecureRandom instead of just Random
			  SecureRandom random = SecureRandom.getInstance("SHA1PRNG");

			  // Generate a 8 byte (64 bit) salt as recommended by RSA PKCS5
			  byte[] salt = new byte[8];
			  random.nextBytes(salt);

			  return salt;
			 }
			}
			
				
					
					
			try{
					PasswordEncryptionService pass = new PasswordEncryptionService();
					byte [] salt = pass.generateSalt();
					byte [] aadhar = pass.getEncryptedPassword(aadhar1, salt);
					System.out.println(""+aadhar);
					String aadhar2 = Arrays. toString(aadhar);
					/*boolean flag = pass.authenticate("shivam", s, salt);
					if(flag)
					{
						System.out.println("true");
					}*/
					
					byte [] salt1 = pass.generateSalt();
					byte [] party_name1 = pass.getEncryptedPassword(party_name, salt1);
					System.out.println(""+party_name1);
					String party_name2 = Arrays. toString(party_name1);
					byte [] salt2 = pass.generateSalt();
					byte [] voter_id1 = pass.getEncryptedPassword(voter_id, salt2);
					System.out.println(""+voter_id1);
					String voter_id2 = Arrays. toString(voter_id1);
					Employee emp = new Employee(aadhar2,party_name2,voter_id2);
					boolean flag = EmployeeService.insert1(emp);
					if(flag)
						{
						request.setAttribute("UpdateFlag", "flase");
						RequestDispatcher rd =request.getRequestDispatcher("user.jsp");
						rd.include(request, response);
						}
					else{
						request.setAttribute("UpdateFlag", "flase");
						RequestDispatcher rd = request.getRequestDispatcher("updatee.jsp");
						rd.include(request, response);
						}
				}
			catch( Exception e)
			{
				System.out.println("error"+e);
			}
					
			}

		
		}
			/*String gender = request.getParameter("gender");
			String address = request.getParameter("address");
			String city = request.getParameter("city");
			String state = request.getParameter("state");
			String country = request.getParameter("country");
			String pincode = request.getParameter("pincode");
			Employee emp = new Employee(user,gender, address ,city,state,country,pincode);
			String email = request.getParameter("email");
			String phone = request.getParameter("phone");
			String password = request.getParameter("password");
			Employee emp1 = new Employee(password,email,phone,user);
			boolean flag1 = EmployeeService.update(emp1);
			boolean flag = EmployeeService.insert1(emp);
			if( flag1 && flag)
				{
				request.setAttribute("UpdateFlag", "flase");
				RequestDispatcher rd =request.getRequestDispatcher("user.jsp");
				rd.include(request, response);
				}
			else{
				request.setAttribute("UpdateFlag", "flase");
				RequestDispatcher rd = request.getRequestDispatcher("updatee.jsp");
				rd.include(request, response);
				}
			*/
			
	/*boolean flag1 = EmployeeService.update(emp1);
		if(flag1)
			{
			request.setAttribute("UpdateFlag", "flase");
			RequestDispatcher rd =request.getRequestDispatcher("user.jsp");
			rd.include(request, response);
			}
		else{
			request.setAttribute("UpdateFlag", "flase");
			RequestDispatcher rd = request.getRequestDispatcher("updatee.jsp");
			rd.include(request, response);
			}
		*/

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
