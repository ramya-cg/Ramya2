package com.cg.ramya.dao;

import java.util.Map;

import com.cg.ramya.bean.TransportBean;

public interface ITransportDao {

	Map<String, String> getTransportDetails();

	

	void addTransport(TransportBean bean);

}
