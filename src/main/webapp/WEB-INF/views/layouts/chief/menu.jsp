<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/taglib.jsp"%>

<nav class="pcoded-navbar menu-light ">
	<div class="navbar-wrapper  ">
		<div class="navbar-content scroll-div " >
			
			<div class="">
				<div class="main-menu-header">
					<img class="img-radius" src="<c:url value='/assets/images/user/avatar-1.jpg' />" alt="User-Profile-Image">
					<div class="user-details">
						<div id="more-details">${display_name} <i class="fa fa-caret-down"></i></div>
					</div>
				</div>
				<div class="collapse" id="nav-user-link">
					<ul class="list-unstyled">
						<li class="list-group-item"><a href="#"><i class="feather icon-user m-r-5"></i> Thông tin cá nhân</a></li>
						<li class="list-group-item"><a href="#"><i class="feather icon-settings m-r-5"></i> Tuỳ chỉnh</a></li>
						<li class="list-group-item">
							<form action="<c:url value="/j_spring_security_logout" />" method="post" id="logout">
								<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
								<a href="JavaScript:Void(0);" onclick="logout()"><i class="feather icon-log-out m-r-5"></i> Đăng xuất</a>
							</form>
						</li>
					</ul>
				</div>
			</div>
			
			<ul class="nav pcoded-inner-navbar ">
				<li class="nav-item pcoded-menu-caption">
				    <label>Điều hướng</label>
				</li>
				<li class="nav-item">
				    <a href="<c:url value='/chief/dashboard/${week}_${year}' />" class="nav-link ">
				    	<span class="pcoded-micon"><i class="feather icon-home"></i></span>
				    	<span class="pcoded-mtext">Dashboard</span>
				   	</a>
				</li>
				<li class="nav-item">
				    <a href="<c:url value='/chief/customer' />" class="nav-link ">
				    	<span class="pcoded-micon"><i class="feather icon-users"></i></span>
				    	<span class="pcoded-mtext">Khách hàng</span>
				    </a>
				</li>
				<li class="nav-item">
				    <a href="<c:url value='/chief/pic' />" class="nav-link "><span class="pcoded-micon"><i class="feather icon-users"></i></span><span class="pcoded-mtext">PIC</span></a>
				</li>
				<li class="nav-item">
				    <a href="#" class="nav-link "><span class="pcoded-micon"><i class="feather icon-clipboard"></i></span><span class="pcoded-mtext">Thống kê</span></a>
				</li>
			</ul>
		</div>
	</div>
</nav>