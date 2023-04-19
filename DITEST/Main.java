public class Main {
    public static void main(String[] args) {
        // 로봇 - 팔과 다리로 구성
        // 로봇은 팔/다리 라는 부품이 없으면 만들 수 없다.
        // 로봇은 팔/다리에 의존하고있다.
        // 팔/다리는 로봇의 디펜던시
        // new Robot(팔,다리); -> 디펜던시 인젝션
        Arm arm = new Arm();
        Leg leg = new Leg();

        Robot robot = new Robot(arm, leg);

    }
}
