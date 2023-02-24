# Project Setting
<ul>
  <li> JDK 1.8 </li>
  <li> Java 8 </li>
  <li> Spring Boot 2.7.8 </li>
  <li> Spring MVC </li>
  <li> Jsp </li>
  <li> MyBatis </li>
  <li> Gradle-kotlin </li>
</ul>

<h2> MVC </h2>
<img src="https://user-images.githubusercontent.com/96382179/221100121-babbacd0-20ab-4ab5-9946-ad53f53340d0.png"/>
<img src="https://user-images.githubusercontent.com/96382179/221101438-4d43fa88-7764-4a91-985b-514e78dc50c3.png"/>
<ul>
  <li>Model - View - Controller, 아키텍쳐 패턴</li>
  <li>
    <div>Model</div>
    <div>애플리케이션의 정보(데이터, Business Logic 포함)</div>
    <div>데이터베이스와 연동하여 사용자가 입력한 데이터나 사용자에게 출력할 데이터를 다루는 일을 함</div>
    <div>DAO 클래스, Service 클래스에 해당</div>
  </li>
  <li>
  <div>View</div>
  <div>사용자에게 제공할 화면(Presentation Logic)</div>
  <div>모델이 처리한 데이터나 그 작업 결과를 가지고 사용자에게 출력할 화면을 만드는 일을 함</div>
  <div>HTML과 JSP를 사용하여 작성 및 CSS, javaScript를 사용하여 출력할 UI 생성</div>
  </li>
  <li>
  <div>Controller</div>
  <div>Model과 View 사이의 상호 작용을 관리</div>
  <div>클라이언트의 요청을 받았을 때 요청에 대한 실제 업무를 수행하는 모델 컴포넌트를 호출하는 일을 함</div>
  <div>클라이언트가 보낸 데이터가 있다면, 데이터를 적절히 가공</div>
  <div>Model 에서의 업무가 끝나면, 그 결과를 가지고 화면을 생성하도록 View에게 전달</div>
  </li>
</ul>

<h2> Mybatis </h2>
<img src="https://user-images.githubusercontent.com/96382179/221105486-1a993e30-1973-4201-8227-c7e0631ada0a.png"/>
<ul>
  <li>자바 오브젝트와 SQL문 사이의 자동 Mapping 기능을 지원하는 ORM 프레임워크</li>
  <li>SQL을 별도의 파일로 분리해서 관리하며 객체-SQL 사이의 파라미터 Mappng 작업을 자동으로 해줌</li>
  <li>도메인 객체나 VO 객체를 중심으로 개발이 가능</li>
</ul>


<h2> JSP </h2>
<img src="https://user-images.githubusercontent.com/96382179/221106726-081afe89-0382-4d41-ab5c-50eb4cac1060.png">
<ul>
  <li>Java Server Page</li>
  <li>HTML 코드에 JAVA 코드를 넣어 동적웹페이지를 생성하는 웹어플리케이션 도구</li>
  <li>도메인 객체나 VO 객체를 중심으로 개발이 가능</li>
</ul>

<h2> Gradle - kotlin </h2>
<ul>
  <li>오픈소스 빌드도구</li>
  <li>모든 문자열을 큰따옴표(")로 작성하는 규칙이 있음</li>
  <li>코드 자동완성, 오류코드 강조, 빠른 문서보기 가능과 리팩터링의 장점</li>
<ul>  
