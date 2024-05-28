package Java0528;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Study01_1 {

	private String 드라이버 ;
	private String 주소 ;
	private String 사용자;
	private String 비밀번호 ;


	public  Study01_1(String 드라이버,  String 주소, String 사용자, String 비밀번호) {
		this.드라이버 = 드라이버;
		this.주소 = 주소;
		this.사용자 = 사용자;
		this.비밀번호 = 비밀번호;
		시작();
	}
	
	private void 시작() {
		try {
			Class.forName(드라이버);
			Connection conn = DriverManager.getConnection(주소, 사용자, 비밀번호);
			기능제어(conn);
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void 기능제어(Connection conn) {
		System.out.println("테이블 생성");
		String sql = "create OR REPLACE table 원피스 (";
		sql += " 번호 int,";
		sql += " 이름 varchar(50),";
		sql += " 성별 varchar(50),";
		sql += " 특징 varchar(50),";
		sql += " 해적단 varchar(50),";
		sql += " 역할 varchar(50)";
		sql += ")";
		if (테이블생성(sql, conn)) {
			// DML >> CRUD 기능
			// 1단계 insert 데이터 넣기
			System.out.println(sql);
			
			cud기능(데이터생성(), conn);
			
			
			//읽기
			데이터읽기("select * from 원피스" , conn);
			
			
			//수정
			sql = "update 원피스 set 역할 = '사황' where 번호 = 1";
			cud기능(sql, conn);
			데이터읽기("select * from 원피스" , conn);
			

			//삭제
			sql = "delete from 원피스 where 번호 = 1";
			cud기능(sql, conn);
			데이터읽기("select * from 원피스" , conn);
			
		} else {
			System.out.println("테이블 생성 실패");
		}
		
		
	}
	
	private String 데이터생성() {
		Study01_2 data = new Study01_2();
		data.set번호(1);
		data.set이름("몽키 D 루피");
		data.set성별("남자");
		data.set특징("태양의신 니카");
		data.set해적단("밀집모자");
		data.set역할("선장");
		
		String sql = "insert into 원피스 value(";
		
		sql += data.get번호();
		sql += ",'" + data.get이름() + "'";
		sql += ",'" + data.get성별() + "'";
		sql += ",'" + data.get특징() + "'";
		sql += ",'" + data.get해적단() + "'";
		sql += ",'" + data.get역할() + "'";

		sql += ")";
		
		
		//System.out.println(sql);
		return sql;
	}
	
	private boolean 테이블생성(String sql, Connection conn) {
		//System.out.println(sql);
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.execute();
			ps.close();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	private void 데이터읽기(String sql, Connection conn) {

		//System.out.println(sql);
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Study01_2 data = new Study01_2();
				data.set번호(rs.getInt("번호"));
				data.set이름(rs.getString("이름"));
				data.set성별(rs.getString("성별"));
				data.set특징(rs.getString("특징"));
				data.set해적단(rs.getString("해적단"));
				data.set역할(rs.getString("역할"));
				
				System.out.println(data);
				//System.out.println(sql);
				
			}
			rs.close();
			ps.close();
	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
	private void cud기능(String sql, Connection conn) {
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			int result = ps.executeUpdate();
			//System.out.println(result);
			System.out.println(sql);
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}







