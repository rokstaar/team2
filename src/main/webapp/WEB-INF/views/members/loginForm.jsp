<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>


<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
    <link rel="stylesheet" type="text/css" href="/resources/assets/css/login.css" />
</head>
<body>

  <!-- header -->
    <header></header>

    <!-- sign-in -->
    <div class="sign-in">
      <form
        class="sign-in__wrap"
        id="join"
        action="/members/login"
        method="post"
        name="joinform"
      >
        <h2 class="sign-in__title">�α���</h2>

        <!-- id -->
        <div class="id-form__wrap">
          <label for="id">���̵�</label>
          <br />
          <div class="id-form">
            <input
              type="text"
              id="id"
              name="member_id"
              class="id-form__input"
              placeholder="���̵�"
              value="${not empty param.member_id ? param.member_id : ''}"
              required=""
            />
          </div>
        </div>

        <!-- password -->
        <div class="password-form__wrap form--margin">
          <label for="pwd">��й�ȣ</label>
          <br />
          <input
            type="password"
            id="pwd"
            name="member_pass"
            class="ps-form__input form--margin-top"
            placeholder="��й�ȣ"
            required=""
          />
        </div>

        <!-- btn -->
        <button type="submit" class="btn__wrap btn-default">
          <p class="sign-in__btn">�α���</p>
        </button>
        
        <c:if test="${not empty errorMessage}">
    <script>
    	alert("${errorMessage}");
    </script>
		</c:if>
        

        <!-- sign-in-info__list -->
        <ul class="sign-in-info__list">
          <div>
            <li>
              <a href="/members/insert">ȸ������</a>
            </li>
          </div>
          <div class="forgot-id-ps__list">
            <li>
              <a href="#">���̵� ã��</a>
            </li>
            <li>
              <a href="#">��й�ȣ ã��</a>
            </li>
          </div>
        </ul>
      </form>
    </div>

</body>
</html>