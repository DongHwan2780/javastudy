package pkg03_dql;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
 * DTO
 * 1. Data Transfer Object
 * 2. 데이터베이스의 데이터를 자바와 주고 받을 때 사용하는 객체
 * 3. 기본적으로 테이블 하나당 DTO 하나를 만든다
 * 4. 필드는 칼럼에 매칭하고 생성자와 Getter/Setter 를 만든다
 * */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SampleDto
{
  private int sample_num;
  private String sample_content, sample_edition;
  private Date sample_dt;
}
