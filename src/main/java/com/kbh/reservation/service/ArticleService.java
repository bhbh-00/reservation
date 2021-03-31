package com.kbh.reservation.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kbh.reservation.dao.ArticleDao;
import com.kbh.reservation.dto.ResultData;

@Service
public class ArticleService{
	@Autowired
	private ArticleDao articleDao;

	public ResultData doAdd(Map<String, Object> param) {
		return articleDao.doAdd(param);
	}
}
