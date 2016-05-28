package com.ppd.util;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class SqlSessionDaoSupportTool extends SqlSessionDaoSupport{

	public void setSqlSessionTemplateTool(SqlSessionTemplate sqlSessionTemplate) {
		super.setSqlSessionTemplate(sqlSessionTemplate);
	}
	
}
