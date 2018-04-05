package edu.dmacc.spring.hotelregistration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HotelController {
	@Autowired HotelDao dao;
//	private static final String[] roomTypes = { "Single", "Double", "King", "Suite" };

	@RequestMapping(value = "/form")
	public ModelAndView hotel() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("hotelForm");
		modelAndView.addObject("hotel", new Hotel());
	//	modelAndView.addObject("roomTypes", roomTypes);

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
		dao.insertHotel(hotel); 
		modelAndView.setViewName("hotelResult"); 
		modelAndView.addObject("u", hotel); 
		return modelAndView;
}
	
	
	@Bean
	public HotelDao dao() {
	HotelDao bean = new HotelDao ();
	return bean;
	
}

@RequestMapping(value = "/viewAll")
	public ModelAndView viewAll() {
	ModelAndView modelAndView = new ModelAndView();
 	List<Hotel> allHotels = dao.getAllHotels();
	modelAndView.setViewName("viewAllHotels");
 	modelAndView.addObject("all", allHotels);
	return modelAndView;
	
}
}
