<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CognitiveServiceを使うサイト</title>
</head>
<ul class="nav nav-pills nav-fill bg-light">
    <li class="nav-item">
         <a class="nav-link" href="./languageRequest">Language(入力)</a>
    </li>
            
    <li class="nav-item">
        <a class="nav-link" href="./sentimentRequest">Sentiment(入力)</a>
    </li>
</ul>

<body>
<h1>CognitiveServiceを使うサイト</h1>

<h3>調べたい文字列を教えてください</h3>
<form method="POST" action="./result">
<input type="TEXT" name="string" />
<input type="submit" />
</form>
</body>
</html>