package com.xworkz.commonmodule.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xworkz.commonmodule.dto.MilitaryDTO;
import com.xworkz.commonmodule.service.MilitaryService;

@Component
@RequestMapping("/")
public class MilitaryController {
	@Autowired
	private MilitaryService MilitaryService;

	public MilitaryController() {
		System.out.println("Calling from Controller....");
	}

	@RequestMapping(value = "/form", method = RequestMethod.POST)
	public String showForm(MilitaryDTO dto, Model model) {
		int valid = this.MilitaryService.validateAndSave(dto);
		if (valid == 0) {
			model.addAttribute("Country Name:" + dto.getCountryName());
			model.addAttribute("Military Type:" + dto.getMilitaryType());
			model.addAttribute("Equipment:" + dto.getQuantity());
			model.addAttribute("Quantity" + dto.getQuantity());
			model.addAttribute("Price:" + dto.getPrice());
			model.addAttribute("Delivery Year:" + dto.getDeliveryYear());
			// model.addAttribute("Total Price:" + dto.get));
			return "Success";

		} else {
			System.out.println("Data invalid");
			model.addAttribute("Error", "data invalid check valid data");
			return "index";

		}
	}
}

/*
 * @RequestMapping(value = "/form", method = RequestMethod.POST) public String
 * handleForm() { return "form";
 */

/*
 * public String click() {
 * 
 * int valid = this.flowerService.validateAndSave(dto); if (valid == 0) {
 * model.addAttribute("name" + dto.getName()); model.addAttribute("type" +
 * dto.getType()); model.addAttribute("Color" + dto.getColor());
 * model.addAttribute("Quantity" + dto.getQuantity());
 * model.addAttribute("Price" + dto.getPrice());
 */
// System.out.println("will send response to Success.jsp");
// return "Success";
/*
 * else { System.out.println("Data invalid"); model.addAttribute("Error",
 * "data invalid check valid data"); return "index";
 */
// }
// }

// }
