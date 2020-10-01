package com.hb.service;

import java.util.List;

import com.hb.dao.HBPracticeDao;
import com.hb.dao.HBPracticeDaoImpl;
import com.hb.model.Answer;
import com.hb.model.OOAddress;
import com.hb.model.OOEmp;
import com.hb.model.Question;

public class HBPracticeServiceImpl implements HBPracticeService {

	HBPracticeDao hbDao = new HBPracticeDaoImpl();
	public boolean storedData(String name) {
		// TODO Auto-generated method stub
		return hbDao.storeData(name);
	}

	public boolean employee(String name) {
		// TODO Auto-generated method stub
		return hbDao.employee(name);
	}

	public boolean regularEmployee(String name, String salary, String bonus) {
		// TODO Auto-generated method stub
		return hbDao.regularEmployee(name,salary,bonus);
	}

	public boolean contractEmployee(String name, String pay_per_hour, String contract_period) {
		// TODO Auto-generated method stub
		return hbDao.contractEmployee(name,pay_per_hour,contract_period);
	}

	public boolean listDataStored(String question, String[] answer) {
		// TODO Auto-generated method stub
		return hbDao.listDataStored(question,answer);
	}

	public boolean oneToMany(String question, String[] answer) {
		// TODO Auto-generated method stub
		return hbDao.oneToMany(question,answer);
	}

	public boolean ooStoredData(String name, String address) {
		// TODO Auto-generated method stub
		return hbDao.ooStoredData(name,address);
	}

	public List<List<Object>> displayData(OOEmp emp, OOAddress add) {
		// TODO Auto-generated method stub
		return hbDao.displayData(emp,add);
	}

	public List<List<Object>> displayDataOM(Question q, Answer ans) {
		// TODO Auto-generated method stub
		return hbDao.displayDataOM(q,ans);
	}

	

}
