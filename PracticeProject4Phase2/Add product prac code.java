packagecom.servlets;



importjava.io.IOException;
importjava.io.PrintWriter;

importjavax.servlet.ServletException;
importjavax.servlet.annotation.WebServlet;
importjavax.servlet.http.HttpServlet;
importjavax.servlet.http.HttpServletRequest;
importjavax.servlet.http.HttpServletResponse;

importorg.hibernate.Session;
importorg.hibernate.SessionFactory;
importorg.hibernate.Transaction;

importcom.entity.EProduct;
importcom.util.HibernateUtil;

/**
 * Servlet implementation class AddProduct
 */
@WebServlet("/add-product")
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
publicAddProductServlet() {
super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("add-product.html").include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		

String productid = request.getParameter("id");
		String productname = request.getParameter("name");

		String producttype = request.getParameter("type");
		String productPrice = request.getParameter("price");
		
		//Step1: Gets session Factory
		SessionFactory sf = HibernateUtil.buildSessionFactory();
		
		//Step 2: Gets Session object
		Session session = sf.openSession();
		
		//Step3: Gets Tx object and begin transaction
		Transaction tx=  session.beginTransaction();
		
		// Step 4: Create and populate entity object
		EProduct product = new EProduct();
		product.setName(productId);
product.setName(productName);
product.setName(productType);
		product.setPrice(Double.parseDouble(productPrice));
		
		//Step 5: <h3 style='color:green'>ProductNischithNischith is created successfully ! </h3>Save record in DB
		session.save(product);
		
		tx.commit();
		
		out.print("<h3> Product is created successfully ! <h3>");
		session.close();
	}

}
