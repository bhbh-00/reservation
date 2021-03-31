package com.kbh.reservation.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kbh.reservation.dto.ResultData;
import com.kbh.reservation.service.ArticleService;

@Controller
public class AdmArticleController {
	@Autowired
	private ArticleService articleService;
	
	@RequestMapping("/adm/article/doAdd")
	@ResponseBody
	public ResultData doAdd(@RequestParam Map<String, Object> param, HttpServletRequest req) {
		int loginMemberId = (int) req.getAttribute("loginedMemberId");
		
		if (param.get("title") == null) {
			return new ResultData("F-1", "제목을 입력해주세요.");
		}
		
		if (param.get("body") == null) {
				return new ResultData("F-1", "내용을 입력해주세요.");
			}
	
		param.put("memberId", loginMemberId);

		return articleService.doAdd(param);
	}
}
