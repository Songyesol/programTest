package test;

public class Exam06 {
	//필드
	
	private int bookNum; //번호
	private String title; //책제목
	private String writer; //저자명
	private String gr; //장르
	
	//생성자
	public Exam06() {
		
	}
	public Exam06(String gr) { //장르수정 기본생성자
		this.gr = gr;
	}
	public Exam06(int bookNum, String title,String writer,String gr  ) {
		this.bookNum=bookNum;
		this.title =title;
		this.writer = writer;
		this.gr = gr;
	}
	
	//메소드
	public int getBookNum() {
		return bookNum;
	}

	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getGr() {
		return gr;
	}

	public void setGr(String gr) {
		this.gr = gr;
	}
	
	public void showBookInfo() {
		System.out.println("도서번호: "+ bookNum + "| 도서제목: "+ title + "| 저자명: "+ writer + "| 장르: "+ gr);
	}
	

}
