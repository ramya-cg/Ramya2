package com.cg.ramya.service;

import java.util.Map;

import com.cg.ramya.bean.TransportBean;
import com.cg.ramya.dao.ITransportDao;
import com.cg.ramya.dao.TransportDaoImpl;

public class TransportServiceImpl implements ITransportService {
ITransportDao dao=new TransportDaoImpl();
	@Override
	public Map<String, String> getTransportDetails() {
		// TODO Auto-generated method stub
		return dao.getTransportDetails();
	}
	@Override
	public void addTransport(TransportBean bean) {
		// TODO Auto-generated method stub
		dao.addTransport(bean);
	}

}
