package hello.servlet.domain.member;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Member {
    Long id;
    String username;
    int age;

    public Member() {
    }
    // id는 DB(MemberRepository)에서 자동부여
    public Member(String username, int age) {
        this.username = username;
        this.age = age;
    }
}
