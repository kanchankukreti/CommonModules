package com.xworkz.commonmodule.dao;

import com.xworkz.commonmodule.entity.LoginEntity;
import com.xworkz.commonmodule.entity.MilitaryEntity;

public interface MilitaryDAO {

	public void create(MilitaryEntity entity);
	public void logindao(LoginEntity loginentity);
	public void homeLoginCheck(String email, String password);

}
