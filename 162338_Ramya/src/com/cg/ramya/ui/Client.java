package com.cg.ramya.ui;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Scanner;
import java.util.function.LongToDoubleFunction;

import com.cg.ramya.bean.TransportBean;
import com.cg.ramya.service.ITransportService;
import com.cg.ramya.service.TransportServiceImpl;

public class Client {
	public static void main(String[] args) {
	TransportBean bean=new TransportBean();
		
		ITransportService service = new TransportServiceImpl();
		Map<String, String> transportDetails = service.getTransportDetails();
		System.out.println("Mode of Transport");
		int count = 1;
		for (Map.Entry<String, String> entrySet : transportDetails.entrySet()) {
			System.out.println(count + "." + entrySet.getValue());
			count++;
		}
		System.out.println("Enter option");
		Scanner scanner = new Scanner(System.in);
        int choice=scanner.nextInt();
        int count1 = 1;
		for (Map.Entry<String, String> entrySet : transportDetails.entrySet()) {
			if(choice==count1){
				bean.setTransportCategoryId(entrySet.getKey());
			}
			count1++;
		}
		int id=(int) (Math.random() *10000);
		bean.setId(id);
		System.out.println("Enter reason");
		scanner.nextLine();
		String reason=scanner.nextLine();
		bean.setReason(reason);
		System.out.println("When\n1. This week\n 2. Next week \n 3. Next month");
		int whenchoice=scanner.nextInt();
		if(whenchoice==1){
			bean.setWhen("a");
		}
		if(whenchoice==2){
			bean.setWhen("b");
		}
		if(whenchoice==3){
			bean.setWhen("c");
		}
		service.addTransport(bean);
		LocalDateTime ltd= LocalDateTime.now();
		DateTimeFormatter f=DateTimeFormatter.ofPattern(("dd MMMM yyyy hh:mm a"));
		System.out.println("Booked with " +id+ "on" +ltd.format(f));
	
	}
}
