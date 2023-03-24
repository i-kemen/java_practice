package BookRental;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MemberList {
    Scanner sc = new Scanner(System.in);

    String phonePattern = "^\\d{3}-\\d{4}-\\d{4}$";

    String birthDayPattern = "^\\d{4}-\\d{2}-\\d{2}$";


    List<Member> arr = new ArrayList<>();

    public MemberList() {
        this.arr.add(new Member("김남훈", "경기도 안양시", "010-6390-9180", "1992-08-19", "2023-03-02"));
        this.arr.add(new Member("김범수", "서울특별시", "010-1234-5678", "1979-01-26", "2023-03-20"));
        this.arr.add(new Member("성시경", "서울특별시", "010-2345-6789", "1979-04-17", "2023-03-22"));
    }

    // 회원 가입
    public void addMember() {
        System.out.println("이름을 입력해주세요.");
        String name = sc.nextLine();
        System.out.println("전화번호를 입력해주세요.(000-0000-0000)");
        String phoneNumber = sc.nextLine();

        while (Pattern.matches(phonePattern, phoneNumber) == false) {
            System.out.println("올바른 전화번호를 입력해주세요.");
            phoneNumber = sc.nextLine();
        }
        System.out.println("주소를 입력해주세요.");
        String address = sc.nextLine();

        System.out.println("생일을 입력해주세요.(0000-00-00)");
        String birthDay = sc.nextLine();
        while (Pattern.matches(birthDayPattern, birthDay) == false) {
            System.out.println("올바른 생년월일을 입력해주세요.");
            birthDay = sc.nextLine();
            sc.nextLine();
            String id = null;

            this.arr.add(new Member(name, phoneNumber, address, birthDay, id));
        }
    }

    //회원 정보 불러오기
    public void getMemberInfo() {
        String phoneNumber = sc.nextLine();
        for (int i = arr.size() - 1; i >= 0; i--) {
            if (phoneNumber.equals(this.arr.get(i).getPhoneNumber())) {
                System.out.println(arr.get(i) + "\n");
            }
        }
    }

    // 회원 삭제
    public void removeMember() {
        System.out.println("삭제할 회원의 전화번호를 입력해주세요.(000-0000-0000)");
        String phoneNumber = sc.nextLine();

        for (int i = arr.size() - 1; i >= 0; i--) {
            if (phoneNumber.equals(this.arr.get(i).getPhoneNumber())) {
                arr.remove(i);
                System.out.println("회원 삭제가 완료되었습니다.");
                return;
            }
        }
        System.out.println("일치하는 회원이 없습니다.");
    }

}
