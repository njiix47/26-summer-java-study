**2일차 (7~9강)**
# Java 배열과 참조 자료형

## 1. 1차원 및 2차원 배열 (Array)

**배열** : **같은 타입**의 여러 변수를 하나의 묶음으로 다루는 자료구조로 <br>
데이터가 메모리의 연속적인 공간에 고정된 크기로 저장

### 1차원 배열

**선언** : 데이터 타입 뒤에 대괄호 [] 사용 <br>
**생성** : `new` 키워드를 사용해 배열의 크기 지정 및 생성 <br>
**초기화** : 배열을 만들 때 동시에 값을 직접 대입하여 초기화 가능 <br>
**인덱스 접근** : 배열명.length 를 통해 배열의 전체 길이 확인 가능

```
// 방법 1: 선언 후 생성 (기본값인 0으로 자동 초기화)
int[] scores = new int[5];
scores[0] = 80; // 0번 인덱스에 값 대입

// 방법 2: 선언과 동시에 초기화 (크기는 자동으로 3이 됨)
int[] runtimes = {10, 20, 30};

// 배열 순회 출력
for (int i = 0; i < runtimes.length; i++) {
    System.out.println(runtimes[i]);
```

### 2차원 배열

**선언 및 초기화**

```
// 2행 3열짜리 정수형 2차원 배열 선언
int[][] matrix = new int[2][3];

// 선언과 동시에 초기화
int[][] table = {
    {10, 20, 30}, // 0행
    {40, 50, 60} // 1행
};

// 2차원 배열 순회 (이중 for문 사용)
for (int i = 0; i < table.length; i++) { // table.length는 '행'의 개수 (2)
    for (int j = 0; j < table[i].length; j++) { // table[i].length는 해당 행의 '열'의 개수 (3)
        System.out.print(table[i][j] + " ");
    }
    System.out.println();
}
```

## 2. 참조 자료형(Reference Type)의 이해 및 String 클래스

자바의 데이터 타입은 크게 기본 자료형 / 참조 자료형으로 나뉨<br>

### 1) 기본형 vs 참조형 메모리 구조
**기본 자료형 (int , double , boolean 등) :** <br>
실제 값(Data)이 메모리의 스택(Stack) 영역에 직접 저장됨<br><br>
**참조 자료형 (배열, 클래스, 인터페이스 등) :** <br>
실제 객체는 힙(Heap) 영역에 생성되고, 스택 영역에는 그 객체가 위치한 메모리 주소(Reference)가 저장됨
<hr>

### 2) String 클래스의 특별한 특징
<u>String</u> : **문자열을 다루는 참조 자료형 클래스** <br>
워낙 자주 쓰이기 때문에 기본형처럼 편리하게 쓸 수 있도록 자바가 특별 관리함 <br>

**리터럴 할당 vs new 연산자 할당** <br>
- 리터럴( "" )을 사용하면 문자열 상수 풀(String Constant Pool)이라는 공간을 공유하므로 주소값이 같을 수 있음<br>
- new String() 을 사용하면 항상 힙 영역에 새로운 객체 생성


```
String str1 = "Java"; // 리터럴 할당
String str2 = "Java"; // str1과 같은 주소를 가리킴
String str3 = new String("Java"); // 새로운 메모리 주소에 생성

// 주소(참조값) 비교 연산자: ==
System.out.println(str1 == str2); // true (주소가 같음)
System.out.println(str1 == str3); // false (주소가 다름)

// 문자열 '내용' 비교 메서드: .equals()
System.out.println(str1.equals(str3)); // true (내용이 같으므로 참)

```
