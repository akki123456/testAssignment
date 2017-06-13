package com.newscorp.test.truncate.controller;

import java.util.Collections;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.newscorp.test.truncate.service.TruncateService;
import com.newscorp.test.truncate.truncateStrategy.TruncateStrategy;


@Controller
public   class  SubscriptionController { 
	
	TruncateService truncateService;
	TruncateStrategy truncateStrategy;
	
	
@RequestMapping (value =  "/subscribe" , method = RequestMethod. GET ) 
public  String subscribe(HttpServletRequest  request ) {
	String  orderDetails  = getOrderDetails( request );
	String  truncatedOrderDetails  = truncate( orderDetails, 250 ); 
	log( truncatedOrderDetails );
	return orderDetails;
}

private void log(String truncatedDetails){
	
}
private String getOrderDetails(HttpServletRequest  request){
	return "";
}
private String truncate(String detailedString, int length){
	return truncateService.truncate(detailedString,length,
			Collections.singletonList(truncateStrategy),null);
}
}

