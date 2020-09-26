### day1
创建并运行一个spring-boot项目的例子：
#### 1、创建spring-boot 勾选spring web   thymeleaf
#### 2、创建一个GreetingController类
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
#### 3、在resource/templates下创建greeting.html
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
#### 4、运行com.gevirgo.community.CommunityApplication类后，在浏览器输入
```http://localhost:8080/greeting?name=dingliangliang```

#### 5、更改端口
在application.properties中添加新的端口```server.port=8081```重新启动程序，运行
```http://localhost:8081/greeting?name=dingliangliang```


### day2
使用第三方登录
修复 session 过期时间很短问题

### day3
发布问题页面响应式布局

[BootStrap][https://www.bootcss.com/]

### day4
完成问题发布后端实现功能

创建表 question：
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
设置idea热部署
compiler.automake.allow.when.app.running

Allow auto-make to start even if developed application is currently running. Note that automatically started make may
eventually delete some classes that are required by the application.
