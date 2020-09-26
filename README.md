### day1
����������һ��spring-boot��Ŀ�����ӣ�
#### 1������spring-boot ��ѡspring web   thymeleaf
#### 2������һ��GreetingController��
```
@Controller
    public class GreetingController {
        @GetMapping("/greeting")
        public String greeting(@RequestParam(name = "name") String name, Model model) {
            model.addAttribute("name", name);
            return "greeting";
        }
    }    
```
#### 3����resource/templates�´���greeting.html
```
<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Getting Started: Serving Web Content</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<p th:text="'Hello, ' + ${name} + '!'" />
</body>
</html>
```
#### 4������com.gevirgo.community.CommunityApplication��������������
```http://localhost:8080/greeting?name=dingliangliang```

#### 5�����Ķ˿�
��application.properties������µĶ˿�```server.port=8081```����������������
```http://localhost:8081/greeting?name=dingliangliang```


### day2
ʹ�õ�������¼
�޸� session ����ʱ��ܶ�����

### day3
��������ҳ����Ӧʽ����

[BootStrap][https://www.bootcss.com/]

### day4
������ⷢ�����ʵ�ֹ���

������ question��
```sql
create table QUESTION
(
	ID INT auto_increment,
	TITLE VARCHAR(50),
	DESCRIPTION TEXT,
	GMT_CREATE BIGINT,
	GMT_MODIFIED BIGINT,
	CREATOR INT,
	COMMENT_COUNT INT default 0,
	VIEW_COUNT INT default 0,
	LIKE_COUNT INT default 0,
	TAG VARCHAR(256),
	constraint QUESTION_PK
		primary key (ID)
);
```
����idea�Ȳ���
compiler.automake.allow.when.app.running

Allow auto-make to start even if developed application is currently running. Note that automatically started make may
eventually delete some classes that are required by the application.
