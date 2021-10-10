# 자동차 경주 게임

## 진행 방법

* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정

* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 기능 목록

### 자동차 (Car)

- [X] 자동차를 생성할 수 있다.
  - [X] `이름` 속성을 가진다.
    - [X] 이름은 1자 이상 5자 이하, 가능
  - [X] `위치` 속성을 가진다.
- [X] 자동차를 전진할 수 있다.

### 자동차 세트 (Cars)

- [X] 경주에 참여하는 자동차들로 구성된다.
  - [X] 자동차 이름은 쉼표(,)로 구분되서 입력된다.
    - [X] 최소 2개는 입력해야 함
- [X] 자동차들의 행동을 결정할 수 있다.
- [X] 경기 종류 후 우승 자동차를 조회할 수 있다.

### 자동차 행동 (CarAction)

- [X] 자동차가 전진할지 멈출지 결정할 수 있다.
  - [X] 0 에서 9 사이의 random 값을 구한다.
    - [X] 4 이상이면 `전진`
    - [X] 3 이하이면 `정지`

### 우승 자동차 (Winners)

- [X] 우승 자동차 세트를 구할 수 있다.
  - [X] 자동차 세트로 우승 자동차를 계산한다.

### 경주 게임 (RacingGame)

- [X] 자동차 `시도 횟수`로 구성된다.
  - [X] 사용자에게 이동 횟수를 입력받는다.
  - [X] 시도 횟수는 1 이상이어야 한다.
- [X] 경주 게임을 시작한다.

### View

- [X] 사용자에게 자동차 이름을 입력받는다.
    - [X] 자동차 이름은 쉼표(,)로 구분됨
- [X] 사용자에게 시도 횟수를 입력받는다.
- [X] 사용자가 잘못된 값을 입력할 경우 [ERROR]로 시작하는 에러 메시지 출력 후 입력을 다시 받는다.

## 용어 사전

| 한글명 | 영문명 | 설명 |
| --- | --- | --- |
| 자동차 | Car | 경주에 참여하는 자동차 |
| 자동차 세트 | Cars | 경주에 참여하는 자동차 n개로 구성 |
| 자동차 행동 | CarAction | 자동차의 이동 여부를 결정 |
| 우승 자동차 | Winners | 경주에서 우승한 자동차 |
| 경주 게임 | RacingGame | 경주 게임을 관리하는 단위 |
