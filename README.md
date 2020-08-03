# 포트폴리오 

# CONTENT
1. 주요 프로젝트 
  - 1) [NHNCopeCamp : Secutity Multi-Bootloader Manager 2015 06.22 ~ 2015 08.25](https://github.com/KangHoyong/My-Portfolio/blob/master/README.md#1-nhncopecamp) 
  - 2) [Kit Engineering Fair 2015 참여 (수상 장려상) [학교 프로젝트 과목 : 시스템프로젝트] 2015 9.1 ~ 2015 11.27](https://github.com/KangHoyong/My-Portfolio/blob/master/README.md#2-kit-engineering-fair-2015-참여-수상-장려상-학교-프로젝트-과목--시스템프로젝트)
  - 3) [2016년 제10회 개발자 대회 참여 (수상 : 동상) 2015 05.09 ~ 2016 10.05](https://github.com/KangHoyong/My-Portfolio/blob/master/README.md#3-2016년-제10회-개발자-대회-참여-수상--동상)
  
  - 4) [안드로이드 개발 프로젝트 2018.05 ~ 2018.06](https://github.com/KangHoyong/My-Portfolio/tree/master/Android_Project)
    
  - 5) [Spring-JPA 프로젝트 2019. 03 ~ 2019. 04](https://github.com/KangHoyong/Spring-JPA)
  
  - 6) [대경혁신인재양성 프로젝트 Hust 1st 참여 (분야 : 로봇) 2019 10.1 ~ 2020 02.28 ](https://github.com/KangHoyong/My-Portfolio/blob/master/README.md#4-대경혁신인재양성-프로젝트-hust-1st-참여-분야--로봇-20191001--20200310) [참고](http://www.hustar.org/preview/01.htm)
  
  - 7) 영일엔지니어링(주) 인턴 2020 3.16 ~ 2020.3.30/ 소프트웨어 개발 부서(자동화설비 : LabView 개발) 및 C#
  
  - 8) 주식회사 인피닉스 개발팀원 재직중 2020 4.1 ~ 현재 /  AI 개발팀 (python, pytorch) 
      - 대경 휴스타 양성 사업 교육 지원 (AI) [실습코드 및 관련내](https://github.com/KangHoyong/My-Portfolio#5-%EB%8C%80%EA%B2%BD%ED%98%81%EC%8B%A0%EC%9D%B8%EC%9E%AC%EC%96%91%EC%84%B1-%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8-hust-2st-%EA%B0%95%EC%82%AC-%EB%B6%84%EC%95%BC--ai--ai-base-%EA%B5%90%EC%9C%A1)
  
## 1. [***NHNCopeCamp***](https://github.com/kbu1564/SecurityBootloader)

#### Project Name : Secutity Multi-Bootloader Manager 

#### Introduction
기존의 보안 프로그램들은 커널 로드 후에 작동되는 것들이 대부분이므로 운영체제에 코드가 종속적으로 작동되며, 커널이 로드된 이후 동작하므로 작동하기까지 다소 시간이 소요된다. 본 프로젝트는 이러한 속도상의 이점과 운영체제에 코드가 종속되어 동작하는 문제점을 해결하여 사용자에게 부팅시 최대한 빠른시간에 알리는 것을 목표로 하고 있다.

#### 개발일정 및 개발 인원 소개

개발일정 |  내용  
:---: | ---  
2015-06-22 | NHNCodeCamp 참가 & 프로젝트 시작
2015-08-25 | NHNCodeCamp 참가종료 & 프로젝트 완료

사용 언어 : c c++, Java
제작 인원 : 4명 
제작 기간 : 2달

TNTeams Team <a id="TNTeams"></a>  
협업 방식 : 주 1~2회 스프린트 미팅, Daily Scrum으로 매일(평일) 개발 상황 공유  
협업 도구 : Google docs, GitHumb  

Dev | Name | GitHub | e-mail  
:---: | :---: | :---: | ---  
Grub Network 통신 Custom Module 제작 & 분석, Epoll + MultiThreading Server 설계 | **김병욱(리더)** | [**kbu1564**](https://github.com/kbu1564) | [**quddnr145@gmail.com**](quddnr145@gmail.com) 
Grub 분석 & iPXE 소스분석, Epoll + MultiThreading Server 설계, 디자인 패턴 적용 | 유주현 | [JuHynu Yu](https://github.com/formfoxk) | [groovehyunji@gmail.com](formfoxk@gmail.com)
Grub분석 & iPXE 소스분석, Android Background Service 제작 및 UI 설계 구현 | 강호용 | [KangHoyong](https://github.com/KangHoyong) | [yugioh9@naver.com](yugioh9@naver.com)
Grub분석 & iPXE 소스분석, 중계서버 Android & Grub 공통 프로토콜 제작 및 설계 | 김하진 | [kimhajin](https://github.com/kimhajin) | - 

#### 개발 운영 환경 및 관련 사항 

1. Security Multi-Bootloader development operating environment : ubuntu 14.04 / Grub
2. Security Mulit-Bootloader App Version API 17 : Android 4.2 (Jelly Bean)
3. [Grub 시작 문자열 구성 변경 및 함수 호출 스택](https://github.com/kbu1564/SecurityBootloader/issues/3)
4. [Network related matters](https://github.com/kbu1564/SecurityBootloader/issues/7)
4. [Proxy Server related matters](https://github.com/kbu1564/SecurityBootloader/issues/19)
5. [Android related matters](https://github.com/kbu1564/SecurityBootloader/issues/17)

#### 본인 개발 내역 
- [Andorid](https://github.com/kbu1564/SecurityBootloader/tree/develop/android/SecurityBootloader/app/src/main/java/com/example/kimhajin/securitybootloader) Android Background Service, 소캣통신, UI 구현 작업 

- [안드로이드 로그인](https://github.com/KangHoyong/My-Portfolio/tree/master/Android%20Login%20Exercise/MyApplication/app/src/main/java/com/example/ganghoyong/myapplication)

- [안드로이드 GCM 서비스](https://github.com/KangHoyong/My-Portfolio/tree/master/Android%20GCM%20Exercise)

- [Grub분석](https://github.com/kbu1564/SecurityBootloader/issues/3)

- [iPXE분석](https://github.com/kbu1564/SecurityBootloader/issues/7) 

- [Grub 설정 변경 및 부팅 과정 분석](https://github.com/kbu1564/SecurityBootloader/issues/4) 

- [버그 픽스 공유 및 해결방안 제시](https://github.com/kbu1564/SecurityBootloader/issues/5) 

- [Wiki 제작 (설치방법 및 버그 픽스 해결방안 제시](https://github.com/kbu1564/SecurityBootloader/wiki) 

#### 설계이슈

이슈 목록 | 내용 | 주소  
:----: | :----: | ----  
Grub분석 | Grub 시작 문자열 구성 변경 및 함수 호출 스택 | https://github.com/kbu1564/SecurityBootloader/issues/3
네트워크분석 | 네트워크 통신을 위한 분석 | https://github.com/kbu1564/SecurityBootloader/issues/7
안드로이드 | 안드로이드 UI & IA | https://github.com/kbu1564/SecurityBootloader/issues/31

#### Project Introduce PPTX(PDF)
An interim announcement >> [PDF Link : TNTeams_ Security Booting Manager >> #1중간발표.pdf](https://github.com/kbu1564/SecurityBootloader/raw/develop/TNTeams_%20Security%20Booting%20Manager_%E1%84%8C%E1%85%AE%E1%86%BC%E1%84%80%E1%85%A1%E1%86%AB%E1%84%87%E1%85%A1%E1%86%AF%E1%84%91%E1%85%AD.pdf)

#### 프로젝트의 제작 후 문제점 발생
- Wifi 환경에서 작동 불가
- Protocol의 암호화 안됨으로 인해 프로토콜 분석 및 보안상 문제점 발생 위험
- UI/UX 부분의 사용자 고려가 전혀 되어있지 않아 사용이 불편함
- 설치가 불편하며, 곧바로 포맷을 통해 Bypass 가능

#### License
   - [GPL3.0](https://github.com/kbu1564/SecurityBootloader/blob/develop/LICENSE)
   - [GNU](https://www.gnu.org/licenses/licenses.html)

#### Used OpenSource List
   - Grub2 : GPLv3.0 License : [Grub2 Site](https://www.gnu.org/software/grub/)
   - iPXE : GPLv2.0 License : [iPXE Site](http://ipxe.org/)

#### [**소스코드**](https://github.com/kbu1564/SecurityBootloader)
#### [**Wiki**](https://github.com/kbu1564/SecurityBootloader/wiki)

## 2. Kit Engineering Fair 2015 참여 (수상 장려상) [학교 프로젝트 과목 : 시스템프로젝트]

#### Project Name : Secutity Multi-Bootloader Manager 

#### Introduction

기존의 보안 프로그램들은 커널 로드 후에 작동되는 것들이 대부분이므로 운영체제에 코드가 종속적으로 작동되며, 커널이 로드된 이후 동작하므로 작동하기까지 다소 시간이 소요된다. 본 프로젝트는 이러한 속도상의 이점과 운영체제에 코드가 종속되어 동작하는 문제점을 해결하여 사용자에게 부팅시 최대한 빠른시간에 알리는 것을 목표로 하고 있다.

#### 개발기간 및 일정 내용 

개발 일정 : 2015 9.1 ~ 2015 11.27

일정 | 내용 
:---: | ---
9/1(화) ~ 9/10(목) | 주제 발표 
9/15(화) ~ 9/24(목) | 요구명세 발표 
10/13(화) ~ 10/22(목) | 설계 발표 
11/10(화) ~ 11/19(목) | 중간 데모 
12/1(화) ~ 12/10(목) | 최종 데모 

- 주제발표 : 주제 제안 및 발표 
- 요구명세서 발표 : 각 기능을 구현하기 위한 기술적 요구 , 사용자 인터페이스에 대한 개략적인 계획을 제시, 시스템기능적 요구사항 명세서
- 설계 발표 : 기술적 요구사항을 상세화

### 개발 문서 (PDF)
- [개발 관련 문서](https://github.com/KangHoyong/My-Portfolio/tree/master/%EB%B0%9C%ED%91%9C%EC%9E%90%EB%A3%8C%20%EB%B0%8F%20%EB%AC%B8%EC%84%9C/%EC%8B%9C%EC%8A%A4%ED%85%9C%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8%20%EB%AC%B8%EC%84%9C)

### 참여자명단 

Dev | Name | GitHub | e-mail  
:---: | :---: | :---: | ---  
Grub Network 통신 Custom Module 제작 & 분석, Epoll + MultiThreading Server 설계 및 유지보수 | **김병욱(리더)** | [**kbu1564**](https://github.com/kbu1564) | [**quddnr145@gmail.com**](quddnr145@gmail.com) 
Grub분석 & iPXE 소스분석, Android Background Service 제작 및 UI 설계 구현 및 기존 UI 재설계 작업 | 강호용 | [KangHoyong](https://github.com/KangHoyong) | [yugioh9@naver.com](yugioh9@naver.com)

동일하게 진행되었고 부족한 부분 수정 작업 시행 유지보수 및 문제점 개선 

### 변경사항 
1. 보안부분 수정 (패킷전송시 문제점 개선) 
2. 버그 픽스 수정 유지보수 편의성 개선 (본인 및 팀원 같이 진행)
3. 안드로이드 버전 업그레이드 및 UI 개선사항 (본인)

#### 안드로이드 변경 사항 (본인개발 사항)

- [기존 안드로이드 UI](https://github.com/kbu1564/SecurityBootloader/issues/17) 

- 변경된 안드로이드 User Interface

#### Information Architecture

<img width="662" alt="2015-09-13 6 29 15" src="https://cloud.githubusercontent.com/assets/9815703/9836067/66e4c324-5a45-11e5-9295-bdeeedb93fc7.png">

#### APP 메인 화면 및 기능 

  <img width="934" alt="2015-09-13 6 41 41" src="https://cloud.githubusercontent.com/assets/9815703/9836104/2504a936-5a47-11e5-95f8-5a31c11cc8b3.png">

#### 알림 서비스 
  <img width="858" alt="2015-09-13 6 17 54" src="https://cloud.githubusercontent.com/assets/9815703/9836033/f2976928-5a43-11e5-8f50-3ecceee042a3.png">


## 3. [2016년 제10회 개발자 대회 참여 (수상 : 동상)](https://github.com/KangHoyong/SecurityBootManager)

#### Project Name : SecurityBootManager CoreLibrary

#### Project Introduce
본 프로젝트는 운영체제가 부팅되기 전 단계인 커널이 로드되기 전에 동작하여 수집하고자 하는 장치에 접근하여, 노트북이라면 일체화된 Camera, Wireless Network NIC, Ethernet 통신, 부팅된 시간, 위도 & 경도 등을 이용 할 수 있는 기반 Framework 를 제작하는 것이 목표인 프로젝트로써, 저희 Framework를 이용하게 될 경우 Target Machine 에 설치 되어있는 운영체제의 종류에 종속되지 않고 동작하여 정보를 수집 후 이를 자신의 창작물을 위한 기반으로써 이용이 가능합니다.

이를 효과적으로 보여드리기 위한 예시로써 운영체제의 부팅을 스마트폰으로 제어함으로써 사용자는 필요한 경우 자신의 기기를 부팅시도한 사용자가 누구이며 부팅당시 어느 지점에 존재 하였는지를 파악 할 수 있게 됩니다.

또한 수집된 정보는 추후 포맷으로도 삭제되지 않는 공간에 저장되도록 함으로써 해당 Framework 를 사용하여 구현하고자 하는 개발자들은 이러한 수집된 부팅당시의 전방 이미지사진, 접속당시 연결된 Wifi 정보, 아이피 주소를 기반으로 한 위도 & 경도 파악 등의 정보를 이용할 수 있습니다.

### 시스템 흐름도 
<img width="739" alt="2018-01-22 6 08 20" src="https://user-images.githubusercontent.com/9815703/35213049-a6a95df6-ff9f-11e7-89a3-532d573a3f08.png">

### 시스템 운영도 
사용자가 컴퓨터를 부팅하게 되면, 부팅 정보(IP, AP ssid, 접속시간)를 수집해 중개 서버(Middel Server)로 전송한다. 중개서버는 이를 데이터베이스에 저장한다.
사용자가 주변장치 정보를 보기 위해 웹 페이지를 요청하면, 중개서버의 데이터베이스로부터 부팅 정보 리스트를 얻어 출력한다.

<img width="736" alt="2018-01-22 6 22 06" src="https://user-images.githubusercontent.com/9815703/35213546-586775f4-ffa1-11e7-9084-cfc951cc75f5.png">


### 소개 PPT 
- [소개 PPT](https://github.com/KangHoyong/My-Portfolio/blob/master/발표자료%20및%20문서/7.%20학생_TNTeam(강호용).pdf)

#### 대회 참여자 리스트 

 Name | GitHub | e-mail  
:---: | :---: | ---  
김병욱 | [**kbu1564**](https://github.com/kbu1564) | [**quddnr145@gmail.com**](quddnr145@gmail.com) 
유주현 | [JuHynu Yu](https://github.com/formfoxk) | [groovehyunji@gmail.com](formfoxk@gmail.com)
강호용(리더) | [KangHoyong](https://github.com/KangHoyong) | [yugioh9@naver.com](yugioh9@naver.com)
김하진 | [kimhajin](https://github.com/kimhajin) | - 

#### 기존 버전에서 변경사항 
- Android phone 이용한 부팅제어 시스템 에서 부팅 시 주변 환경 정보를 얻을 수 있는 Framwork 변경 (Web환경에서 주변정보를 볼수있음)

#### Demo Movie
- [Demo Movie Link[2016,제10회공개SW개발자대회출품작 Demo Movie]](https://www.youtube.com/watch?v=fTKghltmX9U)

#### 최종 결과 
<img width="991" alt="2017-07-10 1 39 06" src="https://user-images.githubusercontent.com/9815703/28003055-50707a06-6575-11e7-936d-c80f7ea6ebe4.png">

## 4. 대경혁신인재양성 프로젝트 Hust 1st 참여 (분야 : 로봇) 2019.10.01 ~ 2020.06.15
![캡처](https://user-images.githubusercontent.com/9815703/68083654-830c7480-fe6e-11e9-9d37-195d597d17db.PNG)

### 교육과정 
![교육 커리큘럼](https://user-images.githubusercontent.com/9815703/68083810-bd771100-fe70-11e9-923c-40743da29018.PNG)

### [Hustar 로봇혁신아카데미 1st 스터디 및 학습 내용 정리](https://github.com/HUST-Robot/Algorithm_miscellaneous-work)
### [Hustar 캡스톤 디자인 : 스마트 미러 ](https://github.com/HUST-Robot/Capstone-design)
### [Hustar 심화프로젝트 : 카메라 영상을 이용한 로봇시뮬레이션 소프트웨어를 이용한 제어](https://github.com/KangHoyong/Development-of-a-Robot-Control-Software-using-camera-and-Robot-Simulator)

## 5. 대경혁신인재양성 프로젝트 Hust 2st 강사 (분야 : AI / AI Base 교육) 
일정 : 2020.7.20 ~ 2020.7.21 

교육 내용 : pytroch 소개 및 Tensor 실습 , 선형 회귀 분석 , 이진 분류 , 선택 분류, 퍼셉트론 이론 및 실습 진행

실습 코드 : [Huster 2st 교육 실습코드](https://github.com/KangHoyong/dmi_edu)

