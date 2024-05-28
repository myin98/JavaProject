package Java0527;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Mariadb_1 {

	
	public void 접속() {
		
		String 드라이버 = "org.mariadb.jdbc.Driver";
		String 주소 = "jdbc:mariadb://localhost:3306/test";
		String 사용자 = "root";
		String 비밀번호 = "111222";
		System.out.println("접속 시작");
		
		try {
			//System.out.println("드라이버 클래스 존재 합니다");
			
			
			Class.forName(드라이버);
			Connection conn = DriverManager.getConnection(주소, 사용자, 비밀번호);
			//System.out.println("섹션 생성 완료");
			//DDL Create
			String sql1 = "create OR REPLACE table onepiece (번호 int, 이름 varchar(50), 성별 varchar(5), 특징 varchar(20), 해적단 varchar(10), 역할 varchar(10))";			
			PreparedStatement ps = conn.prepareStatement(sql1);
			ps.execute();
			
			
			//DML  select ,insert ,update ,delete
			
			// 단원 입력
			
			String crew = "insert into onepiece value (1, '몽키 D 루피', '남자', '태양의 신 니카,사황', '밀집모자', '선장')";
			ps = conn.prepareStatement(crew);
			int result = ps.executeUpdate();
			
			String crew1 = "insert into onepiece value (2, '롤로노아 조로', '남자', '삼도류', '밀집모자', '부선장')";
			ps = conn.prepareStatement(crew1);
			int result1 = ps.executeUpdate();
			
			String crew2 = "insert into onepiece value (3, '상디', '남자', '여미새', '밀집모자', '요리사')";
			ps = conn.prepareStatement(crew2);
			int result2 = ps.executeUpdate();
			
			String crew3 = "insert into onepiece value (4, '나미', '여자', '항해사', '밀집모자', '항해사')";
			ps = conn.prepareStatement(crew3);
			int result3 = ps.executeUpdate();
			
			String crew4 = "insert into onepiece value (5, '우솝', '남자', '저격왕', '밀집모자', '저격수')";
			ps = conn.prepareStatement(crew4);
			int result4 = ps.executeUpdate();
			
			String crew5 = "insert into onepiece value (6, '토니토니 쵸파', '동물', '사람사람 열매', '밀집모자', '의사')";
			ps = conn.prepareStatement(crew5);
			int result5 = ps.executeUpdate();
			
			String crew6 = "insert into onepiece value (7, '니코로빈', '여자', '꽃꽃 열매', '밀집모자', '고고학자')";
			ps = conn.prepareStatement(crew6);
			int result6 = ps.executeUpdate();
			
			String crew7 = "insert into onepiece value (8, '프랑키', '남자', '사이보그', '밀집모자', '조선공')";
			ps = conn.prepareStatement(crew7);
			int result7 = ps.executeUpdate();
			
			String crew8 = "insert into onepiece value (9, '브룩', '남자', '부활부활 열매', '밀집모자', '소울킹')";
			ps = conn.prepareStatement(crew8);
			int result8 = ps.executeUpdate();
			
			String crew9 = "insert into onepiece value (10, '버기', '남자', '동강동강 열매', '크로스 길드', '광대')";
			ps = conn.prepareStatement(crew9);
			int result9 = ps.executeUpdate();
			
			
			
			
			
			//        //
			
			// select //
			String sle = "select * from onepiece where 해적단 = '밀집모자'";
			ps = conn.prepareStatement(sle);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				int 번호 = rs.getInt("번호");
				String 해적단 = rs.getString("해적단");
				DTO Dto = new DTO();
				Dto.setNo(번호);
				Dto.set해적(해적단);
				System.out.println(번호 + ". " +  해적단);
				
			}
			
			//update //
			
			String upd = "update onepiece set 역할 = '사황' where 번호 = 10";
			ps = conn.prepareStatement(upd);
			result = ps.executeUpdate();
			//System.out.println(result);
			
			//데이터 확인
			
			ps = conn.prepareStatement(sle);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				int 번호 = rs.getInt("번호");
				String 역할 = rs.getString("역할");
				DTO Dto = new DTO();
				Dto.setNo(번호);
				Dto.set칭호(역할);
				//System.out.println(역할);
			}
			
			//삭제 delete
//			String dele = "delete from onepiece where 번호 = 10";
//			ps = conn.prepareStatement(dele);
//			result = ps.executeUpdate();
//			System.out.println(result);
//			
//			
//			//데이터 확인
//			ps = conn.prepareStatement(sle);
//			rs = ps.executeQuery();
//			int cnt = 0;
//			while(rs.next()) {
//				int no = rs.getInt("no");
//				String name = rs.getString("name");
//				TestDTO testDto = new TestDTO();
//				testDto.setNo(no);
//				testDto.setName(name);
//				System.out.println(testDto);
//				cnt++;
//			}
//			System.out.println("행수 : " + cnt);
			
			
			
			
			
			
			
			
			
			
			
			
			conn.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
