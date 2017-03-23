package com.lhh.webpackage.bbs.web;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lhh.core.util.LhhCoreUtilsCtrl;
import com.lhh.webpackage.bbs.service.TestService;

/**
 * 测试
 * @author hwaggLee
 * @createDate 2017年3月21日
 */
@Controller
@RequestMapping("test")
public class TestWeb {
	
	@Resource private TestService testService;
	
	/**
	 * 测试
	 * @param req
	 * @param res
	 * @param type
	 */
	@RequestMapping("init/{type}")
	public void init(HttpServletRequest req, HttpServletResponse res,@PathVariable(value="type") String type){
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("success", true);
		resultMap.put("msg", "操作成功");
		LhhCoreUtilsCtrl.putMapToJson(resultMap, res);
	}
	
}
