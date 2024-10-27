# kotlin-spring-start

Spring Boot를 사용하여 Kotlin 기본 문법을 공부합니다.  
Udemy의 Pragmatic Code School - "Kotlin 및 Spring Boot를 사용하여 RESTFUL API 구축하기" 강좌의 섹션 01 ~ 10을 기반으로 학습합니다.


## 프로젝트 소개
이 프로젝트는 Kotlin과 Spring Boot를 사용하여 RESTful API를 구축하는 방법을 시작하기 전 코틀린 기초를 학습한 기록입니다.  
기본적인 Kotlin 문법과 Spring Boot의 설정 방법을 배웠습니다.


## 프로젝트 구조
```angular2html

├── src/
│   ├── main/
│   │   ├── java/               # Java 코드
│   │   ├── kotlin/             # Kotlin 코드
│   │   ├── resources/          # 설정 파일 (application.properties)
│   └── test/                   # 테스트 코드 (현재는 비어 있음)
├── build.gradle.kts            # Gradle 빌드 파일
├── README.md                   # 리드미 파일
└── …
```
- **`src/main/resources/application.properties`**:
    - 현재는 `spring.application.name=kotlin-playground` 설정만 포함되어 있습니다.
    - 추후 필요에 따라 다른 설정을 추가할 수 있습니다.

- **`src/test/`**:
    - 테스트 코드를 작성할 위치로, 현재는 비어 있습니다.
    - 서비스 로직이나 컨트롤러의 동작을 검증하는 테스트 코드를 작성할 수 있습니다.

## 참고 자료
- [Udemy: Pragmatic Code School - Kotlin 및 Spring Boot 를 사용하여 RESTFUL API 구축하기](https://www.udemy.com/course/build-restful-apis-using-kotlin-and-spring-boot-korean/?couponCode=KEEPLEARNING)
