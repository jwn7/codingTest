# Java Coding Test Log

Java로 매일 한 문제씩 풀며 코딩테스트 구현력과 문제 해결 과정을 기록하는 저장소입니다.

## Goal

- 부트캠프 및 개발 직군 코딩테스트 대비
- 삼성 SW 역량테스트 A형 구현/시뮬레이션 문제 대비
- A형 기반이 안정된 뒤 B형 자료구조 설계 문제로 확장
- 문제를 맞히는 데서 끝내지 않고, 복잡도와 조건 해석을 설명할 수 있는 개발자 되기

## Study Loop

1. 프로그래머스에서 Java로 문제를 직접 풉니다.
2. 통과 후 시간복잡도, 공간복잡도, 경계 조건을 먼저 스스로 점검합니다.
3. 피드백을 통해 놓친 조건과 다른 Java 표현 방식을 확인합니다.
4. 통과한 코드를 문제명 Java 파일로 보관하고 GitHub에 기록합니다.

## Repository Structure

```text
src/learning/
  EvenOdd.java
  KthNumber.java
  SequenceAndIntervalQuery4.java
  ...
```

- 파일명과 public 클래스명을 동일하게 유지합니다.
- 각 파일 상단에는 풀이 날짜, 문제명, 원문 링크를 남깁니다.
- 진행 중인 임시 파일과 상세 코칭 메모는 로컬에서만 관리합니다.

## Review Record Example

| Date | Problem | Core Concept | Review Point |
| --- | --- | --- | --- |
| 2026-07-13 | 수열과 구간 쿼리 3 | 2차원 배열, 값 교환 | 임시 변수로 원래 값을 보존하고 쿼리 수 기준 `O(Q)`로 정리 |
| 2026-07-14 | 수열과 구간 쿼리 2 | 구간 순회, 최솟값 갱신 | 쿼리마다 결과 하나를 저장하고 `O(Q * N)`으로 분석 |
| 2026-07-15 | 수열과 구간 쿼리 4 | 나머지 연산, 인덱스 조건 | 값이 아닌 인덱스가 `k`의 배수인지 판별 |

## Current Progress

- Started: 2026-06-17
- Language: Java
- Solved: 29 problems
- Current focus: arrays, two-dimensional arrays, conditional iteration, and implementation basics

Detailed learning notes are intentionally kept local so this repository stays focused on completed Java solutions.
