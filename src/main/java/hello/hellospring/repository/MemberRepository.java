package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member); // 저장소 저장
    Optional<Member> findById(Long id); // 찾아오기
    Optional<Member> findByName(String name); // 찾아오기
    List<Member> findAll(); // 저장된 모든 리스트 반환
}
