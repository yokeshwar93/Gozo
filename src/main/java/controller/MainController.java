package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import helper.Helper;


@Controller
public class MainController {

	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	@RequestMapping("/augmented-reality")
	public String ar() {
		return "ar";
	}
	@RequestMapping("/virtual-reality")
	public String vr() {
		return "vr";
	}
	@RequestMapping("/projection-table")
	public String projection_table() {
		return "pmtable";
	}
	@RequestMapping("/projection-room")
	public String projection_room() {
		return "pmroom";
	}
	@RequestMapping("/hrd")
	public String hrd() {
		return "hdr";
	}
	@RequestMapping("/escape")
	public String escape() {
		return "escaperooms";
	}
	@RequestMapping(value = "/sendmessage", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
	public @ResponseBody String updateMetaFields(@RequestParam(value = "name") String name, @RequestParam(value = "email") String email,@RequestParam(value = "message") String message) {
		String response = null;
		try {
			new Helper().sendMailHelper(name,email,message);
			response = "{\"status\":\"success\",\"message\":\"Message sent successfully\"}";
		} catch (Exception e) {
			response = "{\"status\":\"failure\",\"message\":\"exception\",\"exception\":\"" + e.getMessage() + "\"}";
		}
		return response;
	}
}
