package cn.itcast.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.dao.accountDao;
import cn.itcast.domain.Account;
import cn.itcast.service.accountService;

@Service
public class accountServiceImpl implements accountService{
	@Autowired
  private accountDao dao;
	@Override
	public List<Account> findAll() {
		// TODO Auto-generated method stub
		
		List<Account> list = dao.findAll();
		return list;
	}

}
