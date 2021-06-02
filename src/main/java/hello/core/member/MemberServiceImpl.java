package hello.core.member;

public class MemberServiceImpl implements MemberService {

    // 인터페이스 의존 그런데 구현체에도 의존
    // 추상화에 의존하면서 구체화에도 의존
   private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
