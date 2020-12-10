package com.study.servlet;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LifeCycleEx2")
public class LifeCycleEx extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LifeCycleEx() {
        super();
        System.out.println("생성");
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("init");
	}

	public void destroy() {
		System.out.println("destroy");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("doget");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
		System.out.println("dopost");
	}
	
	@PostConstruct
	private void aaa() {
		System.out.println("생성자 호출 직후 불림");
	}
	
	@PreDestroy
	private void bbb() {
		System.out.println("디스트로이 호출시 먼저 불림");
	}
}
