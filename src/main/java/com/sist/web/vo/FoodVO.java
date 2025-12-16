package com.sist.web.vo;

import lombok.Data;

/*
 *  FNO	NUMBER
	NAME	VARCHAR2(200 BYTE)
	TYPE	VARCHAR2(100 BYTE)
	PHONE	VARCHAR2(20 BYTE)
	ADDRESS	VARCHAR2(500 BYTE)
	SCORE	NUMBER(2,1)
	THEME	CLOB
	PRICE	VARCHAR2(50 BYTE)
	TIME	VARCHAR2(100 BYTE)
	PARKING	VARCHAR2(100 BYTE)
	POSTER	VARCHAR2(260 BYTE)
	IMAGES	CLOB
	CONTENT	CLOB
	HIT	NUMBER
	JJIMCOUNT	NUMBER
	LIKECOUNT	NUMBER
	REPLYCOUNT	NUMBER
 */
@Data
public class FoodVO {
	private int fno, hit, jjimcount, likecount, replycount;
	private String name, address, phone, theme, type, price, time, parking, poster, images, content;
	private double score;
}
