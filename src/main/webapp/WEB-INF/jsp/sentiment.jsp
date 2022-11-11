<%@page import="java.util.Optional"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<ul class="nav nav-pills nav-fill bg-light">
    <li class="nav-item">
         <a class="nav-link" href="./languageRequest">Language(入力)</a>
    </li>
            
    <li class="nav-item">
        <a class="nav-link" href="./sentimentRequest">Sentiment(入力)</a>
    </li>
</ul>
<%

Optional<String> string = 
	Optional.ofNullable((String) request.getAttribute("string"));

float negative = 
	((float) request.getAttribute("negative"));

float neutral = 
((float) request.getAttribute("neutral"));

float positive = 
((float) request.getAttribute("positive"));

%>

<body>
<H1>Sentiment</H1>
<H3>文章：<%= string.orElse("ERROR") %></H3>
<H3>結果：negative<%= negative %></H3>
<H3>neutral<%= neutral %></H3>
<H3>positive<%= positive%></H3>
</body>
</html>