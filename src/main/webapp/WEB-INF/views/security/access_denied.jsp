<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/taglib.jsp"%>

<title>
	<c:if test="${ not empty message }">Login Error</c:if>
	<c:if test="${ empty message }">Login</c:if>
</title>

<div class="auth-wrapper">
	<div class="auth-content">
		<div class="card">
			<div class="row align-items-center text-center">
				<div class="col-md-12">
					<div class="card-body">
						<form name='loginForm' action="<c:url value='/admin/j_spring_security_login' />" method='POST' id="my_form">
							<img src="<c:url value='/assets/images/logo/ANSV_logo.png' />" alt="" class="img-fluid mb-4">
							<h4 class="mb-3 f-w-400">Đăng nhập</h4>
							<div class="form-group mb-3">
								<label class="floating-label" for="Email">Địa chỉ Email</label>
								<input type="text" name='username' id="usn" class="form-control" placeholder="">
							</div>
							<div class="form-group mb-4">
								<label class="floating-label" for="Password">Mật khẩu</label>
								<input type='hidden' name='password' id="psw" />
								<input type="password" name='password_main' id="psw_main" class="form-control" placeholder="">
							</div>
							<div class="custom-control custom-checkbox text-left mb-4 mt-2">
								<input type="checkbox" class="custom-control-input" id="customCheck1">
								<label class="custom-control-label" for="customCheck1">Save credentials.</label>
							</div>
							<button type="submit" id="btn_form" class="btn btn-block btn-primary mb-2">Đăng nhập</button>
							<c:if test="${ not empty message }">
								<p align="center">
									<font color="red" size="2"><b><i>${message}</i></b></font>
								</p>
							</c:if>
							
							<input type="hidden" id="token" name="${_csrf.parameterName}" value="${_csrf.token}" id="token" />
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>