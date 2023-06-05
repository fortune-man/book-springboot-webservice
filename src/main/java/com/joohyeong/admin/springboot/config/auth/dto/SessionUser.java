package com.joohyeong.admin.springboot.config.auth.dto;

import com.joohyeong.admin.domain.user.User;
import java.io.Serializable;
import lombok.Getter;

@Getter
public class SessionUser implements Serializable {
    private String name;
    private String email;
    private String picture;

    public SessionUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}


/**
 * User 클래스를 사용하면 안되는 이유
 * User를 그대로 사용하면 세션에 저장하려고하여 직렬화를 구현하지 않았다는 의미의 에러 발생
 * User 클래스는 엔티티이기 때문에 언제 다른 엔티티와의 관계가 형성될지 모름
 * 직렬화 대상에 자식들까지 포함됨으로써 성능 이슈와 부수 효과 발생 확률이 높아짐
 * 직렬화 기능을 가진 세션 Dto를 하나 추가로 만드는 것이 이후 운영 및 유지보수에 많은 도움이 됨
 */
