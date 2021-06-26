package org.zerock.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController2 {

	private static final Logger logger = LoggerFactory.getLogger(SampleController2.class);
	
	@RequestMapping("doC")
	// 뷰에 'msg' 이름의 파라미터를 문자열로 처리하여, 뷰에 전달. 
	public String doA(@ModelAttribute("msg") String msg) {
		
		logger.info("doC called........");
		
		return "result";
	}
	
}
