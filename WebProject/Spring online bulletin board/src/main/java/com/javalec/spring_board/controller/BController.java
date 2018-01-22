package com.javalec.spring_board.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javalac.spring_board.command.BCommand;
import com.javalac.spring_board.command.BContentCommand;
import com.javalac.spring_board.command.BDeleteCommand;
import com.javalac.spring_board.command.BListCommand;
import com.javalac.spring_board.command.BModifyCommand;
import com.javalac.spring_board.command.BReplyCommand;
import com.javalac.spring_board.command.BReplyViewCommand;
import com.javalac.spring_board.command.BWriteCommand;
@Controller
public class BController {

	BCommand command;

	// list 
	@RequestMapping("/list")
	public String list(Model model)
	{
		
		System.out.println("list()");
		
		command = new BListCommand();
		command.execute(model);

		return "list";
	}
	
	// 작성하는 화면 
	@RequestMapping("/write_view")
	public String write_view(Model model)
	{
		System.out.println("write_view()");
		// 그냥 작성하는 화면 
		return "write_view";
	}
	
	
	// 작성하는 작업 
	@RequestMapping("/write")
	public String write(HttpServletRequest request, Model model)
	{
		System.out.println("writ()");
		
		model.addAttribute("request" , request);
		command = new BWriteCommand();
		command.execute(model);
		
		// 컨트롤러에서 다시 list 가면 redirect 사용
		return "redirect:list";
	}
	
	// 작성한 내용 보기 
	@RequestMapping("/content_view")
	public String content_view(HttpServletRequest request, Model model)
	{
		
		System.out.println("content_view()");
		model.addAttribute("request", request);
		command = new BContentCommand();
		command.execute(model);
		
		return "content_view";
	}
	
	// 수정 
	@RequestMapping(method=RequestMethod.POST, value = "/modify")
	public String modify(HttpServletRequest request, Model model)
	{

		System.out.println("modify()");
		
		model.addAttribute("request", request);
		command = new BModifyCommand();
		command.execute(model);
		
		return "redirect:list";
		
	}
	
	// 답변 보기 
	@RequestMapping("/reply_view")
	public String reply_view(HttpServletRequest request, Model model)
	{
		System.out.println("reply_view()");
		model.addAttribute("request", request);
		command = new BReplyViewCommand();
		command.execute(model);

		return "reply_view";
	}
	
	// 답변 달기 
	@RequestMapping("/reply")
	public String reply(HttpServletRequest request, Model model)
	{
		System.out.println("reply()");
		model.addAttribute("request", request);
		command = new BReplyCommand();
		command.execute(model);
		
		return "redirect:list";
	}
	
	// 글 삭제 
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request, Model model)
	{
		System.out.println("delete()");
		
		model.addAttribute("request", request);
		command = new BDeleteCommand();
		command.execute(model);

		return "redirect:list";
	}
}
