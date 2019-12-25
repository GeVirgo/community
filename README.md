### day1
创建并运行一个spring-boot项目的例子：
1、创建spring-boot 勾选spring web   thymeleaf
2、创建一个GreetingController类
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
3、在resource/templates下创建greeting.html
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
4、运行com.gevirgo.community.CommunityApplication类后，在浏览器输入
```http://localhost:8081/greeting?name=dingliangliang```