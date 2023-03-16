package Main13;

public class A extends Y{
    @Override
    public void a() {
        System.out.println("Aa");
    }
    @Override
    public void b() {
        // TODO Auto-generated method stub
        System.out.println("Ab");
    }
    public void c() {
        System.out.println("Ac");
    }
    // 이게 왜 가능한가? 서비스에서 설계를 할때 부모 클래스를 인터페이스로 다 구현하고
    // 객체지향 : 개발자로서 설계와 유지보수의 관점 / 추상적인 것에 의존하라 
    // 서비스를 사용한다면 서비스는 추상적인 것이고, 주입되는 것은 구체적인 것이지 
    // void a만 가능

}

