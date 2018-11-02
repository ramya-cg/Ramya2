package com.cg.ramya.util;

import java.util.HashMap;
import java.util.Map;

import com.cg.ramya.bean.TransportBean;

public class DataBase {

	private static Map<String, String> transportDetails=new HashMap<>();
	private static Map<Integer, TransportBean> bookTransport=new HashMap<>();
	public static Map<String, String> getTransportDetails() {
		// TODO Auto-generated method stub
	transportDetails.put("f1", "Flight");
	transportDetails.put("t1", "Train");
	transportDetails.put("t2","Taxi");
		
		
		
		return transportDetails;
	}

	public static void addTransport(TransportBean bean) {
		// TODO Auto-generated method stub
		bookTransport.put(bean.getId(),bean);
	}

}
