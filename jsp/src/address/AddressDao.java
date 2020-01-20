package address;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AddressDao {

	
	// DB 연결시  관한 변수 

	private static final String 	dbDriver	=	"oracle.jdbc.driver.OracleDriver";
	private static final String		dbUrl		=	"jdbc:oracle:thin:@192.168.0.138:1521:orcl";
	private static final String		dbUser		=	"seung";
	private static final String		dbPass		=	"seung";

		
	private static AddressDao memberDao;
	
	public static AddressDao getInstance() throws AddressException
	{
		if( memberDao == null )
		{
			memberDao =  new AddressDao();
		}
		return memberDao;
	}
	

	private AddressDao() throws AddressException
	{
			
		try{
			
			// 1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
		}catch( Exception ex ){
			throw new AddressException("DB 연결시 오류  : " + ex.toString() );	
		}
	}
	
	/*******************************************
	 * * 회원관리테이블 MEMBERTEST 에  회원정보를 입력하는 함수
	 * @param rec
	 * @return 
	 * @throws AddressException
	 * @throws SQLException 
	 */
	public ArrayList isSelect(String select ) throws AddressException
	{
		ArrayList list = new ArrayList();
		Connection con = null;
		PreparedStatement ps = null;
		String str="";
		try {
			 
			// 0. 연결객체 얻어오기
		
			con = DriverManager.getConnection(dbUrl,dbUser,dbPass);
			 // 1. sql 문장 만들기 ( insert문 )
			String sql = "select * from post where pnum = '"+select+"'";
			 // 2. sql 전송 객체 만들기
			ps = con.prepareStatement(sql);
			
			
			
			// 3. sql 전송
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				str="";
				str+=rs.getString("pnum");
				str+=" ";
				str+=rs.getString("pcity");
				str+=" ";
				str+=rs.getString("pgu");
				str+=" ";
				str+=rs.getString("pgil");
				str+=" ";
				list.add(str);
			}
			
		} catch ( Exception ex ){
			throw new AddressException("멤버 입력시 오류  : " + ex.toString() );			
		}finally {
			//객체 닫기
		
				
				JdbcUtil.close(ps);
				JdbcUtil.close(con);
		
			
		}
		
		return list;
	}
	
	
}
