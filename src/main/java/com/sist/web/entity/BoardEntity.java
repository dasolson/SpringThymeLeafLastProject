package com.sist.web.entity;
import java.util.*;
/*
 *  NO		NUMBER
	NAME	VARCHAR2(51 BYTE)
	SUBJECT	VARCHAR2(4000 BYTE)
	CONTENT	CLOB
	PWD	VARCHAR2(10 BYTE)
	REGDATE	DATE
	HIT	NUMBER
 */
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
// save(), delete()
// findByNo(int no) WHERE no=1
// findByName(String name)
// findByNameLike
// JPA 단점 : JOIN 어렵다 / SubQuery를 지원하지 않는다
@Data
@Entity(name = "board_3")
public class BoardEntity {
	@Id
	private int no;	
	private int hit;
	private String name, subject, content, pwd;
	private Date regdate;
}
