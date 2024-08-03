package com.app.gsa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.gsa.DAO.MatrimonyDAO;
import com.app.gsa.DTO.MatrimonyDTO;

@Service
public class MatrimonyService {
	@Autowired
	private MatrimonyDAO dao;
	public void register(MatrimonyDTO dto) {
		dao.register(dto);
	}
}
