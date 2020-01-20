//복수의 DAO 호출로 다중 데이터 접근/갱신하며 얻은 데이터에 대한 비즈니스 로직 수행함. 그것을 하나 또는 여러개의 트랜잭션으로 묶음
//트랜잭션 단위
package kr.coo.zeromi.com.model.service;

import org.springframework.stereotype.Service;

@Service("comService")
public class ComServiceImpl implements ComService {

}
