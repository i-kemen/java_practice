package BookRental;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Member {
    //    가입한 날짜, 이름, 주소, 연락처, 생일
    String name;    // 회원 이름
    String address;  // 주소
    String phoneNumber; //연락처
    String birthDay; //생일
    String signInDate; // 가입일자
    String id;  // 회원 번호

    public Member(String name, String address, String phoneNumber, String birthDay, String signInDate) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.birthDay = birthDay;
        this.signInDate = signInDate;
        this.id = UUID.randomUUID().toString();
    }






    //getter, setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getSignInDate() {
        return signInDate;
    }

    public void setSignInDate(String signInDate) {
        this.signInDate = signInDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "\n회원 이름 : " + name +
                "\n회원 주소 : " + address +
                "\n회원 연락처 : " + phoneNumber +
                "\n회원 생일 : " + birthDay +
                "\n가입 일자 : " + signInDate +
                "\n회원 아이디 : " + id
                ;
    }


}