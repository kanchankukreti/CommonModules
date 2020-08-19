package com.xworkz.commonmodule.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.commonmodule.dao.MilitaryDAO;
import com.xworkz.commonmodule.dto.LoginDTO;
import com.xworkz.commonmodule.dto.MilitaryDTO;
import com.xworkz.commonmodule.entity.LoginEntity;
import com.xworkz.commonmodule.entity.MilitaryEntity;

@Component
public class MilitaryServiceImp implements MilitaryService {

	@Autowired
	private MilitaryDAO dao;

	public MilitaryServiceImp() {
		System.out.println("hey its me /t" + this.getClass().getSimpleName());
	}

	@Override
	public int validateAndSave(MilitaryDTO dto) {
		System.out.println("invoke: validateAndSave method: " + dto);
		int isValid = 0;
		try {
			if (isValid == 0) {
				MilitaryEntity entity = new MilitaryEntity();
				BeanUtils.copyProperties(dto, entity);
				System.out.println("data is valid and can save fields");
				// long total_price = dto.getPrice() * dto.getQuantity();
				dao.create(entity);
				return isValid;
			}
			System.out.println("End of the validateAndSave method" + dto);
		} catch (Exception e) {
			System.out.println("Exception in validateAndSave method" + e.getMessage());
		}
		return isValid;
	}

	@Override
	public int loginCheck(LoginDTO DTO) {
		int isValid = 0;
		LoginEntity entity = new LoginEntity();
		try {
			if (isValid == 0) {
				BeanUtils.copyProperties(DTO, entity);
				System.out.println("data is valid and can save fields");
				dao.homeLoginCheck(DTO.getEmail(), DTO.getPassword());
				return isValid;
			}
			System.out.println("End of the loginCheck method" + DTO);
		} catch (Exception e) {
			System.out.println("Exception in loginCheck method" + e.getMessage());
		}
		return isValid;
	}
}
