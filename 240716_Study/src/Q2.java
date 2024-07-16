import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

//2. 일기 관리 프로그램
//2-1. 일기 작성
//- 일자, 날씨, 제목, 내용
//(동일한 일자에 대해서, 기존의 일기가 사라짐)
//
//2-2. 일기 목록 보기
//- 일자순 제목 보기
//- 날씨로 검색하여 제목 보기
//
//2-3. 특정 일자의 일기 내용 보기

//---

class SortByDate implements Comparator<Diary> {

	@Override
	public int compare(Diary o1, Diary o2) {
		// TODO Auto-generated method stub
		if (o1 == null && o2 == null)
			return 0;
		if (o1 == null)
			return 1;
		if (o2 == null)
			return -1;
		return o1.getDate().compareTo(o2.getDate());
	}

}

class SortByWeather implements Comparator<Diary> {

	@Override
	public int compare(Diary o1, Diary o2) {
		// TODO Auto-generated method stub
		if (o1 == null && o2 == null)
			return 0;
		if (o1 == null)
			return 1;
		if (o2 == null)
			return -1;
		return o1.getWeather().compareTo(o2.getWeather());
	}

}

class Diary implements Comparable<Diary> {
	LocalDate date;
	String weather;
	String title;
	String note;

	public Diary(LocalDate date, String weather, String title, String note) {
		super();
		this.date = date;
		this.weather = weather;
		this.title = title;
		this.note = note;
	}

	LocalDate getDate() {
		return date;
	}

	void setDate(LocalDate date) {
		this.date = date;
	}

	String getWeather() {
		return weather;
	}

	void setWeather(String weather) {
		this.weather = weather;
	}

	String getTitle() {
		return title;
	}

	void setTitle(String title) {
		this.title = title;
	}

	String getNote() {
		return note;
	}

	void setNote(String note) {
		this.note = note;
	}

	@Override
	public int compareTo(Diary o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Diary [date=" + date + ", weather=" + weather + ", title=" + title + ", note=" + note + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((note == null) ? 0 : note.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((weather == null) ? 0 : weather.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Diary other = (Diary) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (note == null) {
			if (other.note != null)
				return false;
		} else if (!note.equals(other.note))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (weather == null) {
			if (other.weather != null)
				return false;
		} else if (!weather.equals(other.weather))
			return false;
		return true;
	}

}

class DiaryMangement {
	List<Diary> diary = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	public void makeDiary() {

		System.out.print("날짜 입력(yyyy-mm-dd) : ");
		String dateString = sc.nextLine();
		LocalDate date = null;
		String weather = null;
		String title = null;
		String note = null;
		try {

			String[] dateArr = dateString.split("-");
			date = LocalDate.of(Integer.parseInt(dateArr[0]), Integer.parseInt(dateArr[1]),
					Integer.parseInt(dateArr[2]));
			System.out.print("날씨 입력 : ");
			weather = sc.nextLine();
			System.out.print("제목 입력 : ");
			title = sc.nextLine();
			System.out.print("내용 입력 : ");
			note = sc.nextLine();
			for (Diary d : diary) {
				if (d.getDate().equals(date)) {
					System.out.println("같은 날짜가 있어 덮어씌우기가 됩니다.");
					d.setDate(date);
					d.setNote(note);
					d.setTitle(title);
					d.setWeather(weather);
					return;
				}
			}
			System.out.println("새로운 날짜로 작성합니다.");
			diary.add(new Diary(date, weather, title, note));

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("올바른 형식으로 입력하세요(yyyy-mm-dd)");
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("숫자를 입력하세요.");
		} catch (DateTimeException e) {

			System.out.println("날짜에 맞는 숫자를 입력하세요");
		}

	}

	public void sortByWeather() {
		Collections.sort(diary, new SortByWeather());

		for (Diary d : diary) {
			//System.out.println("날짜 : " + d.getDate());
			System.out.println("날씨 : " + d.getWeather());
			System.out.println("제목 : " + d.getTitle());
		}
	}

	public void sortByDate() {
		Collections.sort(diary, new SortByDate());
		for (Diary d : diary) {
			System.out.println("날짜 : " + d.getDate());
			//System.out.println("날씨 : " + d.getWeather());
			System.out.println("제목 : " + d.getTitle());
		}
	}

	public void findDiaryByDate() {
		try {
			System.out.print("찾을 날짜 입력(yyyy-mm-dd) : ");
			String dateString = sc.nextLine();
			String[] dateArr = dateString.split("-");
			LocalDate date = LocalDate.of(Integer.parseInt(dateArr[0]), Integer.parseInt(dateArr[1]),
					Integer.parseInt(dateArr[2]));

			for (Diary d : diary) {
				if (d.getDate().equals(date)) {
					System.out.println("일기 날짜 : " + d.getDate());
					System.out.println("일기 날씨 : " + d.getWeather());
					System.out.println("일기 제목 : " + d.getTitle());
					System.out.println("일기 내용 : " + d.getNote());

					return;
				}
			}
			System.out.println("해당하는 날짜의 일기가 없습니다.");

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("올바른 형식으로 입력하세요(yyyy-mm-dd)");
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("숫자로 날짜를 입력하세요.");
		} catch (DateTimeException e) {

			System.out.println("날짜 형식에 맞는 숫자를 입력하세요");
		}
	}
}

public class Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DiaryMangement dm = new DiaryMangement();
		System.out.println("\n==================");
		System.out.println("다이어리 관리");
		
		while (true) {
			System.out.println("\n==================");
			System.out.println("1. 다이어리 작성");
			System.out.println("2. 다이어리 목록 보기(날짜순)");
			System.out.println("3. 다이어리 목록 보기(날씨순)");
			System.out.println("4. 다이어리 찾기(날짜로 입력)");
			System.out.println("0. 종료");
			System.out.println("==================");
			System.out.print("입력 : ");
			String choose = sc.next();
			sc.nextLine();
			switch (choose) {
			case "1":
				dm.makeDiary();
				break;
			case "2":
				dm.sortByDate();
				break;
			case "3":
				dm.sortByWeather();
				break;
			case "4":
				dm.findDiaryByDate();
				break;
			case "0":
				return;
			default:
				System.out.println("올바른 번호를 입력하세요");
				break;
			}
		}

	}
}
