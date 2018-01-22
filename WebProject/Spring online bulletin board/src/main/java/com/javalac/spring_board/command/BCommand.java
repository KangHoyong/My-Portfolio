package com.javalac.spring_board.command;

import org.springframework.ui.Model;

public interface BCommand {
	// 실행 모델 생성
	public void execute(Model model);
	
}
