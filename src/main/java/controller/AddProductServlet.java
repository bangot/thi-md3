package controller;

import dao.category.CategoryDAO;
import dao.category.ICategory;
import dao.product.IProduct;
import dao.product.ProductDAO;
import model.Category;
import model.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "add",urlPatterns = "/add")
public class AddProductServlet extends HomeServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException , IOException{
        req.setCharacterEncoding("UTF-8");
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset+UTF-8");
        String name=req.getParameter("name");
        int price= Integer.parseInt(req.getParameter("price"));
        int total=Integer.parseInt(req.getParameter("toal"));
        String color=req.getParameter("color");
        String desc=req.getParameter("desc");
        int category_id= Integer.parseInt(req.getParameter("category_id"));
        Product product = new Product(name, Integer.valueOf(price), Integer.valueOf(total), color, desc, Integer.valueOf(category_id));
        IProduct iProduct=new ProductDAO();
        iProduct.insert(product);
        req.setAttribute("status", "add ok.!!");
        RequestDispatcher dispatcher = req.getRequestDispatcher("add.jsp");
        dispatcher.forward(req, resp);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");

        ICategory iProduct = new CategoryDAO();
        List<Category> lists = iProduct.findAlL();
        req.setAttribute("lists", lists);

        RequestDispatcher dispatcher = req.getRequestDispatcher( "add.jsp");
        dispatcher.forward(req, resp);


    }
}
