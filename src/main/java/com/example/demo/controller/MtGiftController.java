package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 随手礼controller
 * @author Cary
 * @date 2018-9-11
 */
@Controller
@RequestMapping("/ac")
public class MtGiftController {

	/**
	 * 跳转到随手礼列表页
	 * @return
	 */
	@RequestMapping(value = "/list")
	public String list() {
		System.out.println("yutt is going.....");
		return "gift/list";
	}

}
