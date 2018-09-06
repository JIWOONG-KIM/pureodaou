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

input[type=radio] {
	margin-right: 10px;
}

.footer {
	position: fixed;
	left: 0px;
	bottom: 0px;
	height: 50px;
	width: 100%;
	background: #EEEEEE;
	text-align: right;
	padding: 10px;
}
</style>
<script>
	function blockRightClick() {
		alert("복사 방지를 위해 오른쪽 버튼은 사용하실 수 없습니다.");
		return false;
	}
	function LockF5(e) {
		var key = (e) ? e.keyCode : event.keyCode;
		if ((key == 67 && event.ctrlKey) || (key == 86 && event.ctrlKey)) {
			window.alert('복사 방지를 위해 ctrl+c, ctrl+v는 사용하실 수 없습니다.')
			event.keyCode = 0;
			event.returnValue = false;
		} else if (key == 85 && event.ctrlKey) {
			window.alert('소스 보기 기능을 사용하실 수 없습니다')
			event.keyCode = 0;
			event.returnValue = false;
		} else if (key == 8 || key == 116 || key == 78 || key == 82) {
			if (e) { //표준
				console.log('f5');
				e.preventDefault();
			} else { //익스용
				event.keyCode = 0;
				event.returnValue = false;
			}
		}
	}
	document.onkeydown = LockF5;

	$('#tempstrg').click(function() {
		$.ajax({
			method : 'post',
			url : '${pageContext.request.contextPath}/user/exam/tempstrg.do',
			data : $('#f').serialize(),
			success : function() {
				alert('임시 저장 되었습니다');
			},
			error : function() {
				alert('임시저장 실패');
			}
		});
	});
</script>
</head>
<body>
	<div style="padding-left: 25%; padding-right: 25%; padding-top: 20px;"
		oncontextmenu="return blockRightClick()">
		<div class="topbox"
			style="background-color: #114a9b; color: white; font-size: 16px; padding: 10px;">
			<ul>
				<li>카테고리 : 정보보안</li>
				<li>기간 : 2018-09-01 ~ 2018-09-10</li>
			</ul>
		</div>
		<form name="f">
			<div class="midbox"
				style="border-style: solid; border-width: 1px; padding: 25px; margin-bottom: 60px;">

				<c:forEach items="${pList }" var="pVO" varStatus="status">
					<c:choose>
						<c:when test="${pVO.type eq '1'}">
							<div>
								<div
									style="border-style: solid; border-width: 1px; padding: 20px">
									<span style="font-size: 30px; color: orange;">${status.count }</span>
									<div style="display: inline-block;">
										<div
											style="color: white; background-color: #114a9b; border-radius: 15px; padding: 7px; margin: 5px;">OX형
											: 10점</div>
									</div>
									<div style="padding-left: 20px;">${pVO.problem }</div>
								</div>
								<div style="padding: 20px;">
									<input type="radio" name="${status.count }" value="O">O<br>
									<input type="radio" name="${status.count }" value="X">X
								</div>
							</div>
						</c:when>
						<c:when test="${pVO.type eq '2' }">
							<div>
								<div
									style="border-style: solid; border-width: 1px; padding: 20px">
									<span style="font-size: 30px; color: orange;">${status.count }</span>
									<div style="display: inline-block;">
										<div
											style="color: white; background-color: #114a9b; border-radius: 15px; padding: 7px; margin: 5px;">객관식
											: 10점</div>
									</div>
									<div style="padding-left: 20px;">${pVO.problem }</div>
								</div>
								<div style="padding: 20px;">
									<c:forEach items="${pVO.ovo }" var="op">
										<input type="radio" name="${status.count }"
											value="${op.option_seq }">${op.option_contents }<br>
									</c:forEach>
								</div>
							</div>
						</c:when>
					</c:choose>
				</c:forEach>
			</div>
		</form>
	</div>
	<div class="footer">
		<input class="btn btn-primary" type="button" value="임시저장"
			name="tempstrg"> <input class="btn btn-primary" type="submit"
			value="제출하기">
	</div>
</body>
</html>