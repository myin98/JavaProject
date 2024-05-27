package Java0527;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Study01_1 {
	//java코드만 이야기 (SQL문은 나중에 배웁니다)
	// 데이터베이스 접속
	// jdbc > 데이터베이스타입 > 호스트(ip) > 포트 > 데이터베이스명
	// jdbc: oracle:thin:@// [HOST]  [:PORT]/SERVICE
	String 드라이버 = "org.mariadb.jdbc.Driver";
	String 주소 = "jdbc:mariadb://localhost:3306/test";
	String 사용자 = "root";
	String 비밀번호 = "111222";
	
	public void 접속() {
		System.out.println("접속 시작");
		try {
			//System.out.println("드라이버 클래스 존재 합니다");
			
			
			Class.forName(드라이버);
			Connection conn = DriverManager.getConnection(주소, 사용자, 비밀번호);
			//System.out.println("섹션 생성 완료");
			//DDL Create
			String sql1 = "create OR REPLACE table test (no int, name varchar(50))";
						
			PreparedStatement ps = conn.prepareStatement(sql1);
			ps.execute();
			
			//DML  select ,insert ,update ,delete
			String sql2 = "insert into test (name , no) value ('안녕', 1)";
			ps = conn.prepareStatement(sql2);
			int result = ps.executeUpdate();
			System.out.println(result);
			
			
			// sql  = select문 실행해서 위의 insert된 데이터를 출력 하시오
			String sql3 = "select * from test";
			ps = conn.prepareStatement(sql3);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				int no = rs.getInt("no");
				String name = rs.getString("name");
				TestDTO testDto = new TestDTO();
				testDto.setNo(no);
				testDto.setName(name);
				System.out.println(testDto);
				//System.out.println(no + " , " + name);
			}
			//수정
			String sql4 = "update test set name = '잘가'";
			ps = conn.prepareStatement(sql4);
			result = ps.executeUpdate();
			System.out.println(result);
			
			//데이터 확인
			
			ps = conn.prepareStatement(sql3);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				int no = rs.getInt("no");
				String name = rs.getString("name");
				TestDTO testDto = new TestDTO();
				testDto.setNo(no);
				testDto.setName(name);
				System.out.println(testDto);
			}
			

			//삭제
			String sql5 = "delete from test";
			ps = conn.prepareStatement(sql5);
			result = ps.executeUpdate();
			System.out.println(result);
			
			
			//데이터 확인
			ps = conn.prepareStatement(sql3);
			rs = ps.executeQuery();
			int cnt = 0;
			while(rs.next()) {
				int no = rs.getInt("no");
				String name = rs.getString("name");
				TestDTO testDto = new TestDTO();
				testDto.setNo(no);
				testDto.setName(name);
				System.out.println(testDto);
				cnt++;
			}
			System.out.println("행수 : " + cnt);
			
			
			
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
