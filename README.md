# game-spring-expert-assignment

Spring Boot 기반 멀티플레이어 게임 서버 과제. 플레이어/월드 관리와 WebSocket 실시간 채팅·이동·접속자 조회를 제공합니다.

## 기술 스택

- Java 21, Spring Boot 4.1.0 (Web MVC, WebSocket, Data JPA, Validation)
- MySQL 8.4, Redis 7
- WebCraft Engine 2.1.5, Lombok
- 테스트: JUnit 5, Testcontainers, H2

## 실행

1. `.env` 에 `ROOT_PASSWORD` 설정 후 MySQL/Redis 기동

   ```bash
   docker compose up -d
   ```

2. IntelliJ에서 `GameExpertApplication` 실행 → `http://localhost:8080`

- MySQL: `localhost:3306` / DB `game-db` / user `root`
- Redis: `localhost:6410`

## 테스트

IntelliJ에서 `src/test/java` 의 테스트 클래스를 실행합니다. 레벨별 과제 테스트는 주석 처리되어 있으므로 해당 레벨을 풀 때 주석을 해제하고 실행하면 됩니다.

## 패키지 구조

```
com.gameexpert
├── player/      플레이어 등록
├── world/       월드 생성·조회·삭제
├── chat/        채팅 저장, 히스토리, 캐시, 레이트 리밋, 릴레이
├── ws/          WebSocket 핸들러, 라우팅, 세션 레지스트리, 브로드캐스트
├── presence/    접속자 추적
├── trial/       월드 시련 지점 (낙관적 락)
├── config/      WebSocket·스토리지 설정
└── common/      공통 에러 응답 및 예외 처리
```
