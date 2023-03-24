package BookRental;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
import java.util.UUID;


public class Main {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        Admin admin = new Admin("1234");
        Library library = new Library();

        String phonePattern = "^\\d{3}-\\d{4}-\\d{4}$";
        int choice;
        int choice2;
        int choice3;
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;

        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
        while (true) {
            DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss+'09:00'");
            Date cur_date = Date.from(zonedDateTime.toInstant());
            System.out.println("현재 날짜입니다.: " + df.format(zonedDateTime));

            System.out.println("=====================");
            System.out.println("ㅐ***안양시 도서관***ㅐ");
            System.out.println("1. 관리자 화면은 숫자 '1'을, 2. 사용자이시면 숫자 '2', 3. 프로그램종료는 '3'을 눌러주세요.");
            System.out.println("=====================");
            Scanner indexInput = new Scanner(System.in);
            int num = indexInput.nextInt();

            //관리자 화면
            switch (num) {
                case 1:
                    System.out.println("\n관리자 화면입니다.");
                    System.out.println("관리자 비밀번호를 입력해주세요");
                    String adminPassword = sc.nextLine();
                    if (adminPassword.equals(admin.getPassword())) {
                        while (true) {
                            System.out.println("\n-----------------------관리자모드-----------------------");
                            System.out.println("\n0. 뒤로 1. 회원관리 2. 도서관리 3. 종료");
                            System.out.println("숫자를 입력해주세요.");

                            choice = sc.nextInt();
                            sc.nextLine(); // 없으면 아래 sc.nextLine() 입력이 이상하게 된다.

                            switch (choice) {
                                case 0:
                                    continue; // 이전 단계로 돌아감
                                //회원관리
                                case 1:
                                    System.out.println("\n0. 뒤로 1. 전체 회원조회 2. 회원등록 3. 회원수정 4. 회원삭제 5. 삭제 취소");
                                    choice2 = sc.nextInt();
                                    sc.nextLine();
                                    switch (choice2) {
                                        case 0:
                                            continue;
                                        case 1: //회원 조회
                                            library.showAllMemberList();
                                            break;
                                        case 2: // 회원 등록
                                            break;
                                        case 3: // 회원 수정
                                            break;
                                        case 4: // 회원 삭제
                                            break;
                                        case 5: // 삭제 취소
                                            break;
                                        default:
                                            System.out.println("\n================================");
                                            System.out.println("****0~5 사이 숫자를 입력해주세요****");
                                            System.out.println("================================\n");
                                            break;
                                    }
                                    //도서관리
                                case 2:
                                    System.out.println("\n0. 뒤로 1. 전체도서조회 2. 대출 가능한 도서 조회  3. 도서수정 4. 도서삭제 5. 삭제 취소");
                                    choice3 = sc.nextInt();
                                    sc.nextLine();
                                    switch (choice3) {
                                        case 0:
                                            continue;
                                        case 1: //회원 조회
                                            break;
                                        case 2: // 회원 등록
                                            break;
                                        case 3: // 회원 수정
                                            break;
                                        case 4: // 회원 삭제
                                            break;
                                        case 5: // 삭제 취소
                                            break;
                                        default:
                                            System.out.println("\n================================");
                                            System.out.println("****0~5 사이 숫자를 입력해주세요****");
                                            System.out.println("================================\n");
                                            break;
                                    }

                                case 3:
                                    System.out.println("이용 감사합니다.");
                                    flag2 = true;
                                    break;

                                default:
                                    System.out.println("\n================================");
                                    System.out.println("****0~3 사이 숫자를 입력해주세요****");
                                    System.out.println("================================\n");
                                    break;
                            }
                            if (flag2 == true) break;
                        }
                    } else {
                        System.out.println("관리자 비밀번호가 틀렸습니다.");
                        break;
                    }
                    break;

            }

        }
    }
    public static Date transformDate(String date) {
        SimpleDateFormat beforeFormat = new SimpleDateFormat("yyyy-mm-dd");

        // Date로 변경하기 위해서는 날짜 형식을 yyyy-mm-dd로 변경해야 한다.
        SimpleDateFormat afterFormat = new SimpleDateFormat("yyyy-mm-dd");

        java.util.Date tempDate = null;

        try {
            // 현재 yyyymmdd로된 날짜 형식으로 java.util.Date객체를 만든다.
            tempDate = beforeFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // java.util.Date를 yyyy-mm-dd 형식으로 변경하여 String로 반환한다.
        String transDate = afterFormat.format(tempDate);

        // 반환된 String 값을 Date로 변경한다.
        java.sql.Date d = java.sql.Date.valueOf(transDate);

        return d;
    }
}