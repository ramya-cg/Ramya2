package com.cg.ramya.service;

import java.util.Map;

import com.cg.ramya.bean.TransportBean;

public interface ITransportService {

	Map<String, String> getTransportDetails();


	void addTransport(TransportBean bean);

}
