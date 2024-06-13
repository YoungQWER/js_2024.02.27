![캡처.PNG](https://prod-files-secure.s3.us-west-2.amazonaws.com/3dd11b2b-5dab-4a37-95df-d30bba5e54a8/10dad862-9764-4ed6-adaf-eb331b4c59c8/%EC%BA%A1%EC%B2%98.png)

![캡처.PNG](https://prod-files-secure.s3.us-west-2.amazonaws.com/3dd11b2b-5dab-4a37-95df-d30bba5e54a8/124b5b65-f43d-4217-95e5-ad45c1513305/%EC%BA%A1%EC%B2%98.png)

출력 : <%=출력 >

# forward 방식

![캡처.PNG](https://prod-files-secure.s3.us-west-2.amazonaws.com/3dd11b2b-5dab-4a37-95df-d30bba5e54a8/3bf55b23-81b0-4143-a51f-6bff9b8561bb/%EC%BA%A1%EC%B2%98.png)

RequestDispatcher dispatcher = request.getRequestDispatcher("**addition03.jsp**");
dispatcher.forward(request, response);    //addition03.jsp에서 가져온다.

![캡처.PNG](https://prod-files-secure.s3.us-west-2.amazonaws.com/3dd11b2b-5dab-4a37-95df-d30bba5e54a8/b15cee6c-1e2a-45ca-bd8a-ca72b1079328/%EC%BA%A1%EC%B2%98.png)

# 서블릿 servlet ( server + applet )

자바를 이용하여 웹에서 실행되는 프로그램

![캡처.PNG](https://prod-files-secure.s3.us-west-2.amazonaws.com/3dd11b2b-5dab-4a37-95df-d30bba5e54a8/2c7500dc-e194-4498-8b10-96bb10f0c7ae/%EC%BA%A1%EC%B2%98.png)

response.setContentType("text/html; charset=utf-8");    >>필수 없으면 한글깨진다.

![캡처.PNG](https://prod-files-secure.s3.us-west-2.amazonaws.com/3dd11b2b-5dab-4a37-95df-d30bba5e54a8/5df0896a-1263-4926-81a9-ebdcc85e4cb9/%EC%BA%A1%EC%B2%98.png)

/Test 어노테이션으로 URL 매핑

실제 서블릿 클래스 이름을 공개하지 않기 위해서

( http://localhost8181/web-study-02/Test )