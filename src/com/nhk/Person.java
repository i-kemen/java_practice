package com.nhk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Person {
    private String name;
    private int age;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<>();

        // 이름이 '홍길동' 인 Person 인스턴스 생성
        Person person1 = new Person("홍길동");
        personList.add(person1);

        // 이름이 '한석봉' 인 Person 인스턴스 생성
        Person person2 = new Person("한석봉");
        personList.add(person2);

        // ArrayList에 담긴 모든 Person 인스턴스의 이름 출력
        for (Person person : personList) {
            System.out.println(person.getName());
        }

        // 이름과 나이를 쌍으로 저장하는 HashMap 생성
        Map<String, Integer> personMap = new HashMap<>();
        personMap.put("홍길동", 20);
        personMap.put("한석봉", 25);

        // 저장된 값 출력
        for (String name : personMap.keySet()) {
            int age = personMap.get(name);
            System.out.printf("%s의 나이는 %d살\n", name, age);
            
        }
        
    }

}
