package org.example;

// Shift을(를) 두 번 눌러 전체 검색 대화상자를 열고 'show whitespaces'를 입력한 다음,
// Enter를 누르세요. 그러면 코드 내에서 공백 문자를 확인할 수 있습니다.
public class Main {
    public static void main(String[] args) {
            User myUser = new User();
        int idx = myUser.getIdx();
        myUser.setName("홍길동");
        System.out.println(myUser);

        User user1 = new User(1, "임꺽정");

        User user2 = User.builder().idx(1).name("임꺽정").build();
    }
    }
