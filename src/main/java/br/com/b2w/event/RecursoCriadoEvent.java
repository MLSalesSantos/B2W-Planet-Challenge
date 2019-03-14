package br.com.b2w.event;

import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationEvent;

public class RecursoCriadoEvent extends ApplicationEvent {

	static final long serialVersionUID = 1L;

	private HttpServletResponse response;
	private String id;

	public RecursoCriadoEvent(Object source, HttpServletResponse response, String id) {
		super(source);
		this.response = response;
		this.id = id;
	}

	public HttpServletResponse getResponse() {
		return response;
	}

	public String getId() {
		return id;
	}
}