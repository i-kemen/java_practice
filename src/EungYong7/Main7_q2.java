package EungYong7;

import java.io.*;


public class Main7_q2 {
    public static void main(String[] args) {
        // 리더 객체 생성
        Employee leader = new Employee();
        leader.name = "홍길동";
        leader.age = 41;

        // 부서 객체 생성
        Department department = new Department();
        department.name = "총무부";
        department.leader = leader;

        try {
            // 파일에 쓰기
            FileOutputStream fileOut = new FileOutputStream("company.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(department);
            out.close();
            fileOut.close();
            System.out.println("직렬화된 데이터가 company.dat 파일에 저장되었습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
