package com.xhxy.eshop.controller;

import com.xhxy.eshop.entity.Faq;
import com.xhxy.eshop.service.FaqService;
import com.xhxy.eshop.service.impl.mybatis.FaqServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

// 常见问题Faq：列表
@WebServlet("/faq")
public class FaqController  extends BaseServlet {

	private FaqService faqService = new FaqServiceImpl();
	
	public String index(HttpServletRequest request, HttpServletResponse response) {
		List<Faq> faqs = faqService.findAll();
		
		request.setAttribute("faqs", faqs);
		return "faq.jsp";
	}
}
