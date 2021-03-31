package com.kbh.reservation.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.kbh.reservation.dto.ResultData;

@Mapper
public interface ArticleDao {

	ResultData doAdd(Map<String, Object> param);

}
