package com.xhxy.eshop.service.impl.jdbc;

import com.xhxy.eshop.dao.FaqDao;
import com.xhxy.eshop.dao.impl.FaqDaoImpl;
import com.xhxy.eshop.entity.Faq;
import com.xhxy.eshop.service.FaqService;

import java.util.List;

public class FaqServiceImpl implements FaqService {

	private FaqDao faqDao = new FaqDaoImpl();
	
	@Override
	public List<Faq> findAll() {
		return faqDao.findAll();
	}

}
