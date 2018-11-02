package com.cg.ramya.dao;

import java.util.Map;

import com.cg.ramya.bean.TransportBean;
import com.cg.ramya.util.DataBase;

public class TransportDaoImpl implements ITransportDao {

	@Override
	public Map<String, String> getTransportDetails() {
		// TODO Auto-generated method stub
		return DataBase.getTransportDetails();
	}

	@Override
	public void addTransport(TransportBean bean) {
		
		// TODO Auto-generated method stub
		 DataBase.addTransport(bean);
	}

}
