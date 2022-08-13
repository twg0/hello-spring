package hello.hellospring.domain;

import javax.persistence.*;

@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // DB에 값을 넣으면 db가 자동으로 id를 생성해주는 것을 identity 전략이라함
    private Long id; // 시스템이 저장하는 id

    @Column // @Column(name = "username") 이런식으로 컬럼을 지정할 수 있음
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
}
