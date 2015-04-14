package com.yilami.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yilami.entity.Log;
import com.yilami.service.LogService;
import com.yilami.util.Common;
import com.yilami.util.PageView;

/**
 * 
 * @author yilami
 * @Email: qunlin1108@163.com
 * @Date:  2015-04-11
 * @version 0.1v
 */
@Controller
@RequestMapping(value="/background/log/")
public class LogController {
	@Autowired
	private LogService logService;
	
	/**
	 * 查询客户登陆信息
	 * @param model
	 * @param log
	 * @param pageNow
	 * @return
	 */
	@RequestMapping(value="query")
	public String queryUserLogin(Model model, Log log, String pageNow){
		PageView pageView = null;
		if(Common.isEmpty(pageNow)){
			pageView = new PageView(1);
		}else{
			pageView = new PageView(Integer.parseInt(pageNow));
		}
		logService.query(pageView, log);
		model.addAttribute("pageView", pageView);
		return "/background/log/list";
	}

}
