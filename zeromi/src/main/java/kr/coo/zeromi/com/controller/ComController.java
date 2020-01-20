package kr.coo.zeromi.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ComController {
	
//	@Autowired
//	private TicketService tService;
	
	@RequestMapping("/demo")
	public String demo() {
		return "index_origin";
	}
	
	
}
