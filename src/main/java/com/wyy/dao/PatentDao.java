package com.wyy.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class PatentDao {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int updatePatent(String id, String pictures) {
		String sql = "update patent_invention set pictures = '" + pictures + "' where id = '" + id + "'";
		return jdbcTemplate.update(sql);
	}

}
