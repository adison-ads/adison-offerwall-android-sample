
## Adison Offerwall SDK
### Last Release Version : v1.0.52

### 1. Gradle 설정

- 프로젝트 단위 .gradle 에 아래 Repository 추가

  ```
  repositories {
      maven {
          //Offerwall SDK Repository
          url 'https://nbt.bintray.com/adison-offerwall'
      }
  }
  ```

- 모듈 단위 .gradle 에 아래 Dependency 추가

  ```
  dependencies {
  	//Offerwall SDK
      implementation ('co.adison:adison-offerwall-sdk:{version}8@aar') {
          //종속성 연동을 위한 값
          transitive = true
      }
  }
  ```

------

### 2. 기본적인 오퍼월 목록 표시 방법

1. Adison.initialize() 함수를 이용하여 Adison 초기화
    - initialize() 함수는 Main Application이 초기화 되는 시점에 같이 초기화 되도록 구성해 주시기 바랍니다.
2. Adison.setOfferwallListener() 함수를 사용하여 이벤트 수신자 설정
    - 이벤트 종류 : 로그인 요청, 광고 참여 실패, 그외 오류 발생
3. Adison.showOfferwall() 함수를 호출하여 오퍼월 목록 표시

------

### 3. 기타 사항

- 초기화에 사용된 App ID가 Dev App ID일 경우 Adison.setServer() 함수를 이용해 대상 서버를 Development로 변경
- 사용자가 로그인 한 경우 Adison.setUid() 함수를 사용하여 사용자 아이디 설정
- Debug Log  출력이 필요한 경우 Adison.setDebugEnabled() 함수 사용
- Test 광고를 표시 하려면 Adison.setIsTester() 함수 사용

------

[Document](https://github.com/adison-offerwall/adison_offerwall_sdk_android_sample/wiki/Document)

