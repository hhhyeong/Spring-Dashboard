package org.zerock.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.ProductVO;

@Controller
public class SampleController4 {

	private static final Logger logger = LoggerFactory.getLogger(SampleController4.class);
	
	
	// 스프링 MVC는 브라우저에 '/doF'호출하게 됨.
	@RequestMapping("doE")
	public String doE(RedirectAttributes rttr) {
		
		logger.info("doE called but redirect to /doF..........");
		
		return "redirect:/doF";
	}
	
	
	
	// msg 데이터를 같이 전달.
	@RequestMapping("doF")
	public void doE(String msg) {
		
		logger.info("doF called .........." + msg);

	}
	
}
