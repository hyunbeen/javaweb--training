package pds.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import pds.model.PdsItem;
import pds.model.PdsItemDao;
import pds.model.jdbc.ConnectionProvider;
import pds.model.jdbc.JdbcUtil;


public class SelectPathService {

	private static SelectPathService instance = new SelectPathService();

	public static SelectPathService getInstance() {
		return instance;
	}

	private SelectPathService() {
	}

	public List<PdsItem> getPathList() {
		
		PdsItemDao pdsItemDao = PdsItemDao.getInstance();
		Connection conn = null;
		try {
			conn = ConnectionProvider.getConnection();
			return  pdsItemDao.selectPath(conn);
		} catch (Exception e) {
			throw new RuntimeException("DB 자료실 검색 실패 :" + e.getMessage(), e);
		} finally {
			//JdbcUtil.close(conn);
		}
	}
	
}
