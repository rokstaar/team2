<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML>
<html>
<head>
<title>My Page</title>

<link rel="stylesheet" href="/resources/assets/css/chat.css">
	
<style type="text/css">
body{
  padding: 0;
  margin: 0;
}

div{
  box-sizing: border-box;
}

/* alert badge */
.circle{
  display: inline-block;
  width: 5px;
  height: 5px;
  border-radius: 2.5px;
  background-color: #ff0000;
  position: absolute;
  top: -5px;
  left: 110%;
}

/* 파랑색 테스트 */
.rightBlue{
  color: #3F72AF;
}

.wrap{
  background-color: #F8F8F8;  
}
/* 녹색배경 */
.greenContainer{  
  height: 132px;
  background-color: #24855b;    
  
  display: flex;
  align-items: flex-end;
  padding: 16px;
}

.greenContainer .name{
   font-size: 20px;
  font-weight: bold;
  color: #ffffff;
} 
.greenContainer .modify{
  margin-left: auto;
}

/* 단골상점 , 상품후기 , 적립금 박스 */
.summaryContainer{
  background-color: white;  
  display: flex;  
  padding: 21px 16px;  
  height: 90px;
  margin-bottom: 10px;
}
/* 단골상점 , 상품후기 , 적립금 */
.summaryContainer .item{
  flex-grow: 1
}
/* 파란 숫자 */
.summaryContainer .rightBlue{
  font-size: 19px;
  font-weight: bold;
  color: #3F72AF;
}
/* 텍스트 */
.summaryContainer .item > div:nth-child(2){
  font-size: 13px;
}

/* ================== 주문/배송조회 박스 시작 ==================== */
.shippingStatusContainer{
  padding: 21px 16px;
  background-color: white;
  margin-bottom: 10px;
}

/* 주문/배송조회 타이틀 */
.shippingStatusContainer .title{
  font-size: 16px;
  font-weight: bold;
  margin-bottom: 15px;
}

/* 장바구니 결제완료 배송중 구매확정 [로우] */
.shippingStatusContainer .status{
  display: flex;
  justify-content: space-between;
  margin-bottom: 21px;
}
/* 장바구니 결제완료 배송중 구매확정 [아이템]  */
.shippingStatusContainer .item{
  display: flex;
}

.shippingStatusContainer .number{
  font-size: 31px;
  font-weight: 500;
  text-align: center;
}
.shippingStatusContainer .text{
  font-size: 14px;
  font-weight: normal;
  color: black;
  font-weight : bold;
  text-align: center;
}
.shippingStatusContainer .memberUpdate{
  font-size: 14px;
  font-weight: normal;
  color: #769fcd;
  font-weight : bold;
  text-align: center;
}
.shippingStatusContainer .icon{
  display: flex;
  align-items: center;
  padding: 20px;
  width: 16px;
  height: 16px;
}


/*=================== 주문목록 ~ 찜한상품 리스트 ==================*/
.listContainer{  
  padding: 0;
  background-color: #ffffff;
  margin-bottom: 10px;
}
.listContainer .item{  
  display: flex;
  align-items: center;
  padding: 16px;
  color: black;
  text-decoration: none;  
  height: 56px;
  box-sizing: border-box;
}
.listContainer .icon{  
  margin-right: 14px;
}
.listContainer .text{
  font-size: 16px;
  position: relative;
}
.listContainer .right{
  margin-left: auto;
}


/*=================== 내지갑의 보유 적립금 들어가는 부분 ================*/
.listContainer .smallLight{
  font-size: 14px;
  color: #c2c2c2;  
}
.listContainer .smallLight > span{
  margin-left: 10px;
}

.listContainer .right .blct{
  font-size: 14px;
  font-weight: bold;
  margin-right: 5px;
}

/* 공지사항 이용안내 고객센터 */
.infoContainer{
  background-color: white; 
  display: flex;
  height: 100px;
  margin-bottom: 10px;    
}

/* .infoContainer .item{
  flex-grow: 1;
  display: flex;
  align-items: center;
  justify-content: center;
  flex-direction: column;
  font-size: 13px;
  text-decoration: none;
  color: black;
} */

.infoContainer .item{
  flex-grow: 1;
  display: flex;
  align-items: center;
  justify-content: center;
  flex-direction: column;
  font-size: 23px;
  text-decoration: none;
  color: 769fcd;
  font-weight: bold;
}
.infoContainer .item > div:first-child{
  margin-bottom: 2px;
}

/*  */
.listContainer .item:hover{
/*   background-color: #f8f8f8; */
}
.infoContainer .item:hover{
/*   background-color: #f8f8f8; */
}
		
</style>

	<meta charset="utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
	<link rel="stylesheet" href="/resources/assets/css/main.css" />
	

</head>

	<body>
		<!-- Wrapper -->
			<div id="wrapper">

				<!-- Main -->
					<div id="main">
						<div class="inner">

							<!-- Header -->
								<header id="header">
									<a href="/main" class="logo"><strong>있지마켓</strong></a>
									<ul class="icons">
										<c:if test="${id == null }">
											<li><a href="/members/login"><span class="label">로그인</span></a></li>
										</c:if>
										<c:if test="${id != null }">
											<li><a href="/members/logout"><span class="label">로그아웃</span></a></li>
											<li><a href="/members/myPage" ><span class="label">마이페이지</span></a></li>
											<li><a href="#"><span class="label">판매하기</span></a></li>
											<li><a href="#"><span class="label">내채팅</span></a></li>
										</c:if>										
									</ul>
								</header>

							<!-- Banner -->
								<section id="banner">
								
									<div class="content">
									
									<div class="wrap">
									  <div class="shippingStatusContainer">
									    <div class="status">
									      
									      <div class="item">
									        <div>
									        	<img alt="프로필사진" src="/resources/images/pic01.jpg" width="100px" height="100px" >
									        </div>
									       
									        <div>
									          <div class="text">관리자</div>
									       	   <div class="text">페이 : 50,000원</div>
									        	<div class="memberUpdate">
									        		<a href="#">회원정보수정</a>
									        	</div>
									          </div>
									        </div>
										      
									      <div class="item">
									        <div>
									          <div class="text">거래내역</div>
									          <div class="rightBlue number">6</div>
									        </div>
									      </div>     
									      <div class="item">
									        <div>
									          <div class="text">거래내역</div>
									          <div class="rightBlue number">6</div>
									        </div>
									      </div>     
									      <div class="item">
									        <div>
									          <div class="text">경매내역</div>
									          <div class="rightBlue number">0</div>
									        </div>
									      </div>     
									      <div class="item">
									        <div>
									          <div class="text">찜한상품</div>
									          <div class="rightBlue number">1</div>
									        </div>
									      </div>     
									      <div class="item">
									        <div>
									          <div class="text">거래후기</div>
									          <div class="rightBlue number">3</div>
									        </div>
									      </div>     
									      
									    </div>		    
									  </div>  
									</div>	
									 
									<div class="infoContainer">
									    <a href="#" class="item">내채팅</a>
									</div>									  
									

									<input type="text" id="message" /> <br>
									<input type="button" id="sendBtn" value="채팅 전송"/>
									<div id="messageArea"></div> 

									
									 <!-- 채팅 -->
										  <div id="space" style="height:100px;"></div>
										  <div class="container">
										    <div class="messaging">
										      <div class="inbox_msg">
										        <div class="inbox_people">
										          <div class="headind_srch">
										            <div class="recent_heading">
										            
										              ${id }님 채팅 테스트중 ....
										            </div>
										          </div>
										          <div class="inbox_chat" id="inbox_chat" onclick="showChatList();">
									
										          </div>
										        </div>
										        <div class="mesgs" id="chatbox">
										
										
										          <div class="msg_history" id="msg_history">
										          </div>
										          <div class="type_msg">
										            <div class="input_msg_write">
										              <input type="text" class="write_msg" placeholder="메시지를 입력하세요." id="msgContent" onkeyup="enterkey();"/>
										              <button class="msg_send_btn" id="sendBtn" type="button" onclick="sendMsg();">
														<i class="fas fa-paper-plane"></i>
										             </button>

										            </div>
										          </div>
										        </div>
										      </div>
										    </div>
										  </div>
									</div>
									
								</section>
							<!-- banner -->

						</div>
					</div>

					<%@ include file="../include/sidebar.jsp" %>
			</div>


		<!-- Scripts -->
			<script src="/resources/assets/js/jquery.min.js"></script>
			<script src="/resources/assets/js/skel.min.js"></script>
			<script src="/resources/assets/js/util.js"></script>
			<script src="/resources/assets/js/main.js"></script>
			<script src="http://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.js"></script>
			<script type="text/javascript"
			src="https://cdnjs.cloudflare.com/ajax/libs/sockjs-client/1.1.5/sockjs.min.js"></script>
		
	</body>
	
	<script type="text/javascript">
	$("#sendBtn").click(function() {
		sendMessage();
		$('#message').val('')
	});

	let sock = new SockJS("http://localhost:8080/chat");
	sock.onmessage = onMessage;
	sock.onclose = onClose;
	
	// 메시지 전송
	function sendMessage() {
		sock.send($("#message").val());
	}
	
	// 서버로부터 메시지를 받았을 때
	function onMessage(msg) {
		var data = msg.data;
		$("#messageArea").append("<br/>" + data);
	}
	
	// 서버와 연결을 끊었을 때
	function onClose(evt) {
		$("#messageArea").append("연결 끊김");

	}
	
</script>
</html>