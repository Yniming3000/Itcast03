package cn.itcast.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.domain.Account;
import cn.itcast.exception.SysException;
import cn.itcast.service.accountService;

@Controller
@RequestMapping("/pages")
public class accountController {
	//eclipse第一次修改，，
	@Autowired
     private accountService service;
	
	 @RequestMapping("/demo01.do")
	public String test01() throws SysException {
		 
		 try {
			  int a=1/0;
			List<Account> list = service.findAll();
			 for (Account account : list) {
				System.out.println(account);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new SysException("来看小姐姐");
		}
		
		return "success";
	}
}
