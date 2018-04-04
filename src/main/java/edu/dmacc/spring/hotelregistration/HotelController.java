package edu.dmacc.spring.hotelregistration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HotelController {

	private static final String[] roomTypes = { "Single", "Double", "King", "Suite" };

	@RequestMapping(value = "/form")
	public ModelAndView hotel() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("hotelForm");
		modelAndView.addObject("hotel", new Hotel());
		modelAndView.addObject("roomTypes", roomTypes);

		System.out.println("In Form");
		return modelAndView;

	}
}
