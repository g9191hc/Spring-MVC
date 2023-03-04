package hello.servlet.domain.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class MemberRepositoryTest {
    MemberRepository memberRepository = MemberRepository.getInstance();

    @AfterEach
    void afterEach(){
        memberRepository.clearStore();
    }

    @Test
    void save() {
        //given
        Member member = new Member("고현철", 30);
        //when
        Member savedMember = memberRepository.save(member);
        //then
        assertThat(member).isEqualTo(memberRepository.findById(savedMember.getId()));
    }

    @Test
    void findAll() {
        //given
        Member member1 = new Member("고현철", 30);
        Member member2 = new Member("이민숙", 50);
        Member member3 = new Member("이민숙", 50);
        memberRepository.save(member1);
        memberRepository.save(member2);
        //when
        List<Member> allMembers = memberRepository.findAll();
        //then
        assertThat(allMembers.size()).isEqualTo(2);
        assertThat(allMembers).doesNotContain(member3);

    }

    @Test
    void clearStore() {
    }
}