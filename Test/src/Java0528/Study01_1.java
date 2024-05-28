package Java0528;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Study01_1 {

	private String 드라이버 ;
	private String 주소 ;
	private String 사용자;
	private String 비밀번호 ;
	
	
	private String 테이블 = "create OR REPLACE table "
							+ " 원피스("
							+ " 번호 		int,"
							+ " 이름 		varchar(50),"
							+ " 성별 		varchar(50),"
							+ " 특징 		varchar(50),"
							+ " 해적단 		varchar(50),"
							+ " 역할 		varchar(50)"
							+ ")";
	
	private String 입력 = "insert into 원피스 value (?,?,?,?,?,?)";
	private String 읽기 = "select * from 원피스";
	private String 수정 = "update 원피스 set 역할 = ? where 번호 = ?";
	private String 삭제 = "delete from 원피스 where 번호 = ?";


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
	
//		System.out.println("테이블 생성");
//		String sql = "create OR REPLACE table 원피스 (";
//		sql += " 번호 int,";
//		sql += " 이름 varchar(50),";
//		sql += " 성별 varchar(50),";
//		sql += " 특징 varchar(50),";
//		sql += " 해적단 varchar(50),";
//		sql += " 역할 varchar(50)";
//		sql += ")";
	private void 기능제어(Connection conn) {
		if (테이블생성(테이블, conn)) {
			List<Study01_2> list = 데이터생성();
			for(int i = 0; i < list.size(); i++) {
				cud기능(입력, conn, (Study01_2) list.get(i), "I");
				
			}

			//읽기
			데이터읽기(읽기, conn);
			
//			//수정
			Study01_2 data = new Study01_2();
			data.set번호(10);
			data.set역할("사황");
			
			System.out.println("\n" + "\t" +  "버기 역할 수정 : 선장 > 사황 " + "\n");
			
			cud기능(수정, conn, data, "U");
			데이터읽기(읽기, conn);
			
			data = new Study01_2();
			data.set번호(10);
			
//			//삭제
			System.out.println("\n" + "\t" + " 번호 10번 삭제 " + "\n");
			
			cud기능(삭제, conn, data, "D");
			데이터읽기(읽기, conn);
//			sql = "update 원피스 set 역할 = '사황' where 번호 = 1";
//			cud기능(sql, conn);
//			데이터읽기("select * from 원피스" , conn);
//			
//
//			sql = "delete from 원피스 where 번호 = 1";
//			cud기능(sql, conn);
//			데이터읽기("select * from 원피스" , conn);
			
		} else {
			System.out.println("테이블 생성 실패");
		}
		
		
	}
	
	private List<Study01_2> 데이터생성() {
		List<Study01_2> list = new ArrayList<Study01_2>();
		
		Study01_2 data = new Study01_2();
		data.set번호(1);
		data.set이름("몽키 D 루피");
		data.set성별("남자");
		data.set특징("태양의 신 니카");
		data.set해적단("밀짚모자");
		data.set역할("선장");
		list.add(data);
		
		data = new Study01_2();
		data.set번호(2);
		data.set이름("롤로노아 조로");
		data.set성별("남자");
		data.set특징("삼도류");
		data.set해적단("밀짚모자");
		data.set역할("부선장");
		list.add(data);
		
		data = new Study01_2();
		data.set번호(3);
		data.set이름("상디");
		data.set성별("남자");
		data.set특징("여미새");
		data.set해적단("밀짚모자");
		data.set역할("요리사");
		list.add(data);
		
		data = new Study01_2();
		data.set번호(4);
		data.set이름("나미");
		data.set성별("여자");
		data.set특징("도둑 고양이");
		data.set해적단("밀짚모자");
		data.set역할("항해사");
		list.add(data);
		
		data = new Study01_2();
		data.set번호(5);
		data.set이름("우솝");
		data.set성별("남자");
		data.set특징("저격왕");
		data.set해적단("밀짚모자");
		data.set역할("저격수");
		list.add(data);
		
		data = new Study01_2();
		data.set번호(6);
		data.set이름("토니토니 쵸파");
		data.set성별("동물");
		data.set특징("사람사람 열매");
		data.set해적단("밀짚모자");
		data.set역할("의사");
		list.add(data);
		
		data = new Study01_2();
		data.set번호(7);
		data.set이름("니코 로빈");
		data.set성별("여자");
		data.set특징("꽃꽃 열매");
		data.set해적단("밀짚모자");
		data.set역할("고고학자");
		list.add(data);
		
		data = new Study01_2();
		data.set번호(8);
		data.set이름("프랑키");
		data.set성별("남자");
		data.set특징("사이보그");
		data.set해적단("밀짚모자");
		data.set역할("조선공");
		list.add(data);
		
		data = new Study01_2();
		data.set번호(9);
		data.set이름("브룩");
		data.set성별("남자");
		data.set특징("부활부활 열매");
		data.set해적단("밀짚모자");
		data.set역할("소울킹");
		list.add(data);
		
		data = new Study01_2();
		data.set번호(10);
		data.set이름("버기");
		data.set성별("남자");
		data.set특징("동강동강 열매");
		data.set해적단("크로스 길드");
		data.set역할("선장");
		list.add(data);
		
		return list;
	}
		//Study01_2 data = new Study01_2();
//		data.set번호(1);
//		data.set이름("몽키 D 루피");
//		data.set성별("남자");
//		data.set특징("태양의신 니카");
//		data.set해적단("밀집모자");
//		data.set역할("선장");
		
		//String sql = "insert into 원피스 value(?,?,?,?,?,?)";
		
//		sql += data.get번호();
//		sql += ",' " + data.get이름() + " '";
//		sql += ",' " + data.get성별() + " '";
//		sql += ",' " + data.get특징() + " '";
//		sql += ",' " + data.get해적단() + " '";
//		sql += ",' " + data.get역할() + " '";
//
//		sql += ")";
		
		
		//System.out.println(sql);
		
	
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
	
	private void cud기능(String sql, Connection conn, Study01_2 data, String type) {
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			if("I".equals(type)) {
				ps.setInt(1, data.get번호());
				ps.setString(2, data.get이름());
				ps.setString(3, data.get성별());
				ps.setString(4, data.get특징());
				ps.setString(5, data.get해적단());
				ps.setString(6, data.get역할());
			} else if("U".equals(type)) {
				ps.setString(1, data.get역할());
				ps.setInt(2, data.get번호());
			} else if("D".equals(type)) {
				ps.setInt(1, data.get번호());
			}
			
			
			int result = ps.executeUpdate();
			//System.out.println(sql);

			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}







