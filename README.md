# Custom-er
고객이 원하는 이미지로 직접 디자인해서 구매할 수 있는 서비스
<br>
> 2023.01.07 ~ 
<br>

## 사용 기술
<img alt="Spring_Boot" src ="https://img.shields.io/badge/Spring_Boot-6DB33F.svg?&style=for-the-badge&logo=Spring-Boot&logoColor=white"/> <img alt="Spring_Security" src ="https://img.shields.io/badge/Spring Security-6DB33F.svg?&style=for-the-badge&logo=Spring Security&logoColor=white"/> <img alt="Gradle" src ="https://img.shields.io/badge/Gradle-02303A.svg?&style=for-the-badge&logo=Gradle&logoColor=white"/> <img alt="JPA" src ="https://img.shields.io/badge/JPA-59666C.svg?&style=for-the-badge&logo=Hibernate&logoColor=white"/> <img alt="Vue.js" src ="https://img.shields.io/badge/Vue.js-4FC08D.svg?&style=for-the-badge&logo=Vue.js&logoColor=white"/> <img alt="Bootstrap" src ="https://img.shields.io/badge/Bootstrap-7952B3.svg?&style=for-the-badge&logo=Bootstrap&logoColor=white"/> <img alt="PostgreSQL" src ="https://img.shields.io/badge/PostgreSQL-4169E1.svg?&style=for-the-badge&logo=PostgreSQL&logoColor=white"/>

<b>BE</b>
- Java 11
- Spring Boot
- Spring Security
- Spring Data JPA
- Lombok

<b>FE</b>
- HTML5/CSS
- JavaScript
- Vue.js
- Bootstrap
- Thymeleaf

<b>Build Tool</b>
- Gradle

<b>DB</b>
- PostgreSQL


## 핵심 구현 기능
### ⭐로그인 및 회원가입

- 일반 로그인 및 회원가입
  - 회원가입 시 Validation 추가해 정합성 검증 (+ 이메일 중복 검사)
  - 회원가입 시 비밀번호를 BCryptPasswordEncoder로 해싱해 DB에 저장
  - 로그인시 검증을 걸쳐 검증된 인증 정보로 JWT 토큰 생성

- 소셜 로그인 및 회원가입
  - Google, Naver, Kakao 소셜 로그인 제공
  - Spring Security + OAuth2.0 + JWT 방식 사용


