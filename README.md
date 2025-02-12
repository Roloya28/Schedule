# [Spring 5기] CH3 일정 관리 앱 Develop
<br> 
JPA를 활용한 데이터베이스 관리와 Cookie/Session을 활용한 인증/인가를 목표 <br/>
<br>

## 목차
* [과제 진척도](#과제-진척도)
* [주요 기능](#주요-기능)
* [API 문서](#api-문서-)
* [ERD 구조](#erd-구조-)
<br/>

## 과제 진척도
- **LV0 - 필수 (진행완료)**
  - API 명세서 작성
  - ERD 작성
  - SQL 작성

- **LV1 - 필수 (진행완료)**
  - 일정 CRUD

- **LV2 - 필수 (진행완료)**
  - 유저 CRUD
 
- **LV3 - 필수 (진행완료)**
  - 회원가입
 
- **LV4 - 필수 (진행완료)**
  - 로그인

- **LV5 ~ LV8 도전 (미진행)**

<br/>

## 주요 기능

### ▶ 일정 관리
- **일정 추가** ('POST')
  - 회원가입 진행 후, 일정 등록 가능
- **전체 일정 조회** ('READ')
  - 모든 일정을 한번에 조회
- **단건 일정 조회** ('READ')
  - 한가지의 일정 조회
- **일정 삭제** ('DELETE')
  - 선택한 일정 삭제
 
<br/>

### ▶ 사용자 관리
- **회원추가** ('POST')
  - 신규 회원 추가
- **회원 조회** ('READ')
  - 아이디 확인
- **비밀번호 수정** ('PATCH')
  - 비밀번호 변경 가능
 
<br/>

## API 문서 <br>

|      기능      |    Method    |          URL         |                                               RequestBody                                               |                                                  response                                                 |   상태코드   |
| :------------: | :----------: | :------------------: | :-----------------------------------------------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------: | :----------: |
|    회원가입    |     POST     |      /schedules      |            { "username" : "test", <br/> "email" : "test@mail.com", <br/> "password" : "1111"}            |               { "id" : 1, <br/> "username" : "test", <br/> "email" : "test@mail.com" }                    | 201: Created |
|   스케쥴 생성   |     POST     |      /schedules      |         { "title" : "test-title", <br/> "content" : "test-content", <br/> "username" : "test"}         |             { "id" : 1, <br/> "title" : "test-title", <br/> "contents" : "test-contents"}                  | 201: Created |
|    전체 조회    |     GET     |       /schedules      |                                                                                                         |                                                                                                            |   200: OK   |
|    단건 조회    |     GET     |    /schedules/{id}    |                                                                                                         |                                                                                                            |   200: OK   |
|    회원 조회    |     GET     |    /schedules/{id}    |                                                                                                         |                                                                                                            |   200: OK   |
|  비밀번호 수정  |     PATH     |    /schedules/{id}   |                                                                                                         |                                                                                                            |   200: OK   |
|    일정 삭제    |    DELETE    |      /schedules      |                                                                                                         |                                                                                                            |   200: OK   |

▷ POSTMAN 링크 : [https://github.com/Roloya28/Calendar2/tree/main/src/main/java/com/example/calendar2](https://documenter.getpostman.com/view/41325087/2sAYXCidA7)

<br/>

## ERD 구조 <br/>
![Image](https://github.com/user-attachments/assets/740e26b9-56ad-4284-9557-5017dd0005ae)

<br/>




