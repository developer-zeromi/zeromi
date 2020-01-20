
/*
	Data Access Object의 줄임말이다. DB를 사용해 데이터를 조회하거나 조작하는 기능을 담당하는 것들을 DAO라고 부른다. 
	domain logic (비즈니스 로직이나 DB와 관련없는 코드들)을 persistence mechanism과 분리하기 위해 사용한다. 
	(persistence layer: Database에 data를 CRUD(Create, Read, Update, Drop)하는 계층)
	HTTP Request를 Web Application이 받게 되면 Thread를 생성하게 되는데 비즈니스 로직이 DB로부터 데이터를 얻어오기 위해 매번 Driver를 로드하고 
	Connection 객체를 생성하게 되면 엄청 많은 커넥션이 일어나므로 DAO를 하나 만들어 DB 전용 객체로만 쓰는 것이다. 이러면 부담이 줄어들게 된다.
	이 개념은 DBCP(Database Connection Pool)로부터 나왔다.  WAS(Web Application Server)이 실행되면 일정량의 DB Connection 객체를 Pool에다 저장해 두고, 
	HTTP Request에 따라 필요할 때마다 Pool에서 Connection 객체를 가져다 쓰고 반환하는 것이다.
*/

package kr.coo.zeromi.com.model.dao;

import org.springframework.stereotype.Repository;

@Repository("comDao")
public class ComDao {	

//	@Autowired
//	private SqlSessionTemplate sqlSession;
	
	//crud
}
