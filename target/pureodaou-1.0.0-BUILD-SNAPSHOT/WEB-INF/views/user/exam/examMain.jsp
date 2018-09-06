<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">
.topbox {
	border-top-left-radius: 7px;
	border-top-right-radius: 7px;
}
</style>
</head>
<body>
	<div style="padding-left: 25%; padding-right: 25%; padding-top: 20px;">
		<div class="topbox" style="background-color: #114a9b; color: white; font-size: 16px; padding: 10px;">
			<ul>
				<li>
					각 개월차 평가(과제/시험)는 정해진 참여기간 내에 응시 하셔야 하며, 미참여시 미수료 됩니다. 
				</li>
				<li>
					각 평가당 총점 60점 이상(100점 만점 기준)이어야 수료됩니다.
				</li>
				<li>
					평가 기록은 학습장 첫 페이지의 [기록보기]를 확인하시기 바랍니다.
				</li>
			</ul>
		</div>
		<div class="midbox" style="border-style: solid; border-width: 1px; padding: 25px;">
			<table class="table table-hover">
				<tr style="background-color: #DDDDDD"><th>회차</th><th>카테고리</th><th>기간</th><th>유형</th><th>점수</th><th>평가</th></tr>
				<tr><td>1</td><td>정보보안</td><td>2018-09-01 ~ 2018-09-10</td><td>평가</td><td></td><td><input class="btn btn-primary" type="button" value="참여하기"> </td></tr>
				<tr><td>2</td><td>시스템보안</td><td>2018-09-07 ~ 2018-09-16</td><td>평가</td><td></td><td><input class="btn btn-primary" type="button" value="참여하기"> </td></tr>
			</table>
		</div>
	</div>
</body>
</html>