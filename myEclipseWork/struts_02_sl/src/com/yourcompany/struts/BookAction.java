package com.yourcompany.struts;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.sl2.dao.BookDao;
import com.sl2.dao.impl.BookDaoImpl;
import com.sl2.entity.Book;

public class BookAction extends DispatchAction {

	BookDao bd=new BookDaoImpl();
	List<Book> booklist=new ArrayList<Book>();
	public ActionForward queryByName(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		BookForm bf=(BookForm)form;
		booklist=bd.findName("NAME", bf.getKeywords());
		request.setAttribute("booklist", booklist);
		return mapping.findForward("list");
	}
	public ActionForward queryByAuthor(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		BookForm bf=(BookForm)form;
		booklist=bd.findName("AUTHOR", bf.getKeywords());
		request.setAttribute("booklist", booklist);
		return mapping.findForward("list");
	}
	public ActionForward queryByPublish(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		BookForm bf=(BookForm)form;
		booklist=bd.findName("PUBLISH", bf.getKeywords());
		request.setAttribute("booklist", booklist);
		return mapping.findForward("list");
	}
	

}
