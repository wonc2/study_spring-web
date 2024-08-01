package org.example.springweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*  @SpringBootApplication의 역할
    1. 스프링부트의 auto configuration 기능을 활성화 시킨다.
    2. @Configuration 어노테이션을 이용해서 추가로 설정한 정보를 파악해서 필요한 작업을 수행한다.
    3. 현재 패키지 및 모든 하위 패키지에서 클래스를 스캔해서 객체를 생성하고, 객체간의 의존성을 조사해서 객체들을 조립한다.
*/
@SpringBootApplication
public class SpringWebApplication {

    public static void main(String[] args) {
        // 아래의 메소드는 스프링 컨테이너를 생선한다.
        // 스프링 컨테이너는
        SpringApplication.run(SpringWebApplication.class, args);
    }

}
