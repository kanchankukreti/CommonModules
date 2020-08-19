package com.xworkz.commonmodule.service;

import com.xworkz.commonmodule.dto.LoginDTO;
import com.xworkz.commonmodule.dto.MilitaryDTO;

public interface MilitaryService {
	public int validateAndSave(MilitaryDTO dto);
	public int loginCheck(LoginDTO loginDTO);

}
