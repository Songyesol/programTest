package test;
import java.util.Scanner;

public class Exam07 {
	static Scanner scn = new Scanner(System.in);
	static Exam06[] books = new Exam06[50];

	public static void insertBook(Exam06 book) {
		for (int i = 0; i < books.length; i++) {
			if (books[i] == null) {
				books[i] = book;
				break;
			}
		}
	}

	public static void main(String[] args) { // 실행

		while (true) {
			System.out.println("===============================");
			System.out.println("1)등록 | 2)수정 | 3)삭제 | 4)전체목록 5)종료");
			System.out.println("===============================");
			System.out.println("번호를 선택하세요> ");
			int selectNo = scn.nextInt();
			scn.nextLine();

			if (selectNo == 1) { // 등록
				for(int i = 0; i<books.length; i++) {
				System.out.println("책 번호 >> ");
				int bookNum = scn.nextInt();
				scn.nextLine();
				System.out.println("책 제목 >> ");
				String title = scn.nextLine();
				System.out.println("저자명>>  ");
				String writer = scn.nextLine();
				System.out.println("책의 장르>> ");
				String gr = scn.nextLine();

				books[i] = new Exam06(bookNum, title, writer, gr);

				System.out.println("등록완료");
				}
			} else if (selectNo == 2) { // 수정
				System.out.println("수정할 책 번호를 입력하세요>> ");
				int bookNum = scn.nextInt();

			} else if (selectNo == 3) { // 삭제

			} else if (selectNo == 4) { // 전체조회
				for (int i = 0; i < books.length; i++) {
					if (books[i] != null) {
						books[i].showBookInfo();
					}
				}
			} else if (selectNo == 5) {
				break;
			}

		}

	}
}