package board.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.BoardException;

public interface Service {
	public String execute( HttpServletRequest request, HttpServletResponse response  ) throws ServiceException, BoardException;
}
