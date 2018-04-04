package edu.dmacc.spring.hotelregistration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HotelController {

//	private static final String[] roomTypes = { "Single", "Double", "King", "Suite" };

	@RequestMapping(value = "/form")
	public ModelAndView hotel() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("hotelForm");
		modelAndView.addObject("hotel", new Hotel());
//		modelAndView.addObject("roomTypes", roomTypes);

		System.out.println("In Form");
		return modelAndView;

	}
	
//	@RequestMapping(value = "/result")
//	public ModelAndView processUser(Hotel hotel) {
//		
//		System.out.println("In ProcessHotel");
//		ModelAndView modelAndView = new ModelAndView();
//		System.out.println("value in getName: " + hotel.getHotelName());
//	//	dao.insertHotel(hotel);
//		modelAndView.setViewName("hotelResult");
//		modelAndView.addObject("u", hotel);
//		return modelAndView;
//	}
	@RequestMapping(value = "/result")
	public ModelAndView processUser(Hotel hotel) { 
		System.out.println("In ProcessUSER");
		ModelAndView modelAndView = new ModelAndView();
		//dao.insertEntry(entry); 
		modelAndView.setViewName("hotelResult"); 
		modelAndView.addObject("u", hotel); 
		return modelAndView;
}
	
}
