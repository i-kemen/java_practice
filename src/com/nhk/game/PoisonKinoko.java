package com.nhk.game;

public class PoisonKinoko extends Kinoko {
    // 독 공격이 가능한 남은 횟수
    private int poisonAttack = 5;

    public int getPoisonAttack() {
        return poisonAttack;
    }

    public void setPoisonAttack(int poisonAttack) {
        this.poisonAttack = poisonAttack;
    }

    // 아래 코드로 인스턴스화 되는 클래스
    PoisonKinoko(char suffix) {
        this.suffix = suffix;
    }

    // attack() 메소드가 호출되면 다음 내용의 공격을 한다.
    // 우선, “보통 괴물버섯과 같은 공격"을 한다
    // “독 공격의 남은 횟수"가 0이 아니면 다음을 추가로 수행한다
    // 화면에 “추가로, 독 포자를 살포했다!” 를 표시
    // 용사의 HP 의 1/5에 해당하는 포인트를 용사의 HP 로부터 감소시키고, “~포인트의 데미지" 라고 표시
    // “독 공격의 남은 횟수" 를 1 감소 시킨다

    @Override
    public void attack(Hero hero) {
        super.attack(hero);

        if (this.poisonAttack != 0) {
            System.out.println("추가로, 독 포자를 살포했다!");
            final int damage = (int) (0.2 * hero.getHP());
            hero.setHp(hero.getHP() - damage);
            System.out.println(damage + "포인트의 데미지");
            this.poisonAttack -= 1;
        }

    }

}
