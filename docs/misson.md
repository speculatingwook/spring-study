## Spring basics

### 구성 파일에서 정의된 빈 간 관계 구현하기
- Spring 프레임워크에서 구성 파일(예: application.xml)을 사용하여 빈을 정의합니다. 
- 빈 간의 의존 관계를 설정하고, 해당 관계를 코드에서 구현합니다. 
- 빈 간 관계가 올바르게 구현되었는지 확인하기 위해 실행 결과를 확인합니다. 
- 결과물로 빈 간 관계가 구현된 코드와 실행 결과 스크린샷을 제출합니다.
![image](./spring-basics/bean-xml.png)
- [코드](/src/main/java/speculatingwook/spring/bean_xml/Application.java)

### 애너테이션을 사용하여 빈 주입하기
- Spring 프레임워크에서 애너테이션(@Autowired, @Inject 등)을 사용하여 빈을 주입합니다. 
- 애너테이션을 이용하여 빈 의존성을 설정하고, 해당 방식으로 빈을 주입하는 코드를 작성합니다. 
- 애너테이션으로 주입된 빈이 올바르게 동작하는지 확인하기 위해 실행 결과를 확인합니다. 
- 결과물로 애너테이션으로 주입된 빈의 실행 결과 스크린샷을 제출합니다.
![image](./spring-basics/bean-annotation.png)
- [코드](/src/main/java/speculatingwook/spring/bean_annotation/Application.java)

