package com.lhh.webpackage.bbs.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 测试
 * @author hwaggLee
 * @createDate 2017年3月21日
 */
@Controller
@RequestMapping("test")
public class TestWeb {
	
	
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
		writeStr2Res(resultMap.toString(), res);
	}
	
	

    private void writeStr2Res(String jsonStr, HttpServletResponse res) {
        res.setContentType("text/html");
        res.setContentType("text/html; charset=UTF-8");
        try {
            res.getWriter().write(jsonStr);  
        } catch (IOException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }
    
}
