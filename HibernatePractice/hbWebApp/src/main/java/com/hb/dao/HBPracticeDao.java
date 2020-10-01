package com.hb.dao;

import java.util.List;

import com.hb.model.Answer;
import com.hb.model.OOAddress;
import com.hb.model.OOEmp;
import com.hb.model.Question;

public interface HBPracticeDao {

	public boolean storeData(String name);

	public boolean employee(String name);

	public boolean regularEmployee(String name, String salary, String bonus);

	public boolean contractEmployee(String name, String pay_per_hour, String contract_period);

	public boolean listDataStored(String question, String[] answer);

	public boolean oneToMany(String question, String[] answer);

	public boolean ooStoredData(String name, String address);

	public List<List<Object>> displayData(OOEmp emp,OOAddress add);

	public List<List<Object>> displayDataOM(Question q, Answer ans);

}
