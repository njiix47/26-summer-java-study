**2일차 (4~6강)**
# 자바 프로그램의 실행 원리 및 기본 구조

## Java 기본 코드 작성법

```
public class Main{ // 1. 클래스 선언
 
   public static void main(String[] args){   // 2. 메인 메서드 (프로그램의 시작점)
     
      System.out.println("Hello, World!");   // 3. 실행할 코드 (콘솔 출력)
  
   }

}
```


public class Main : 소스 파일명과 클래스명이 반드시 일치해야함 (파일명: Main.java ) <br>
public static void main(String[] args) : 자바 프로그램이 실행될 때 가장 먼저 찾는 시작점

##
## 변수 · 자료형 및 기본 산술 연산자
1) 변수 (Variable) <br>
   데이터를 저장할 수 있는 메모리 공간 <br>
   자바는 변수를 사용하기 전에 반드시 어떤 종류의 데이터가 들어올지 미리 자료형
   지정 필요

2) 기본 자료형 (Data Type) <br>
   가장 자주 쓰이는 대표적인 기본 자료형


| 대분류 | 자료형 | 크기 | 설명 |
| --- | --- | --- | --- |
| 정수형 | int | 4 byte | 기본적으로 사용하는 정수 |
| "" | long | 8 byte | int 범위를 벗어난 정수 (접미사 L사용)<br> ex) long money = 3000000L; |
| 실수형 | double | 8 byte | 기본적으로 사용하는 실수 |
| 문자형 | char | 2 byte | 하나의 문자만 저장 (홑따옴표 사용) |
| 논리형 | boolean | 1 byte | 참 또는 거짓 |

##
## Java 제어문
### switch-case 조건문
특정 변수의 값에 따라 실행할 위치를 선택하는 조건문 <br>
범위를 비교하는 if 문과 달리, 명확하게 떨어지는 값(정수, 문자 등)을 비교할 때 가독성이 좋음

```
int rank = 2;

switch (rank) {
    case 1:
        System.out.println("금메달");
        break;
    
    case 2:
        System.out.println("은메달");
        break; // switch 문을 탈출하게 만듦
    
    case 3:
        System.out.println("동메달");
        break;

    default: // 일치하는 case가 없을 때 실행 (if문의 else 역할)
        System.out.println("참가상");
}
```
#### break의 중요성
case 끝에 break; 를 생략하면 다음 case 의 코드까지 연달아 실행되는<br> <u>Fall-through</u> 현상이 발생하므로 주의해야 함

##
### 루프 제어 명령어
**break** : 반복문을 즉시 종료하고 빠져나감 <br>
**continue** : 반복문의 나머지 코드를 건너뛰고 다음 반복(증감식 또는 조건식)으로 바로
넘어감


```
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue; // 3일 때는 출력을 건너뛰고 i++로 이동
    }
    
    if (i == 5) {
        break; // 5일 때는 반복문을 완전히 종료
    }

    System.out.println(i);
}  
// 출력 결과: 1, 2, 4
```
