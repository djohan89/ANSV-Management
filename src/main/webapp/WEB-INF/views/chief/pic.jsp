<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/taglib.jsp"%>

<title>PIC | CEO</title>

<body>
	<div class="pcoded-content">
		<!-- [ breadcrumb ] start -->
		<div class="page-header">
			<div class="page-block">
				<div class="row align-items-center">
					<div class="col-md-12">
						<div class="page-header-title float-left">
							<h5 class="m-b-10">PIC</h5>
						</div>
						<ul class="breadcrumb float-right">
							<li class="breadcrumb-item">
								<a href="#"><i class="feather icon-home"></i></a>
							</li>
							<li class="breadcrumb-item">
								<a href="<c:url value='/chief/dashboard/${week}_${year}' />">Dashboard Analytics</a>
							</li>
							<li class="breadcrumb-item">
								<a href="JavaScript:Void(0);">PIC</a>
							</li>
						</ul>
					</div>
				</div>
			</div>
		</div>
		<!-- [ breadcrumb ] end -->
		
		
		
		<!-- ===== Tabs: Hiển thị báo cáo công việc ===== -->
		<div class="row" style="margin-top: -2%;">
			<!-- [ tabs ] start -->
			<div class="col-sm-8">
				<div class="card">
					<div class="card-header">
						<h5>Cho phép hoạt động</h5>
						<div class="card-header-right">
							<div class="btn-group card-option">
								<button type="button" class="btn dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
									<i class="feather icon-more-horizontal" style="font-size: 20px;"></i>
								</button>
								<ul class="list-unstyled card-option dropdown-menu dropdown-menu-right">
									<li class="dropdown-item full-card">
										<a href="#!">
											<span><i class="feather icon-maximize"></i> maximize</span>
											<span style="display: none"><i class="feather icon-minimize"></i> Restore</span></a></li>
									<li class="dropdown-item minimize-card">
										<a href="#!">
											<span><i class="feather icon-minus"></i> collapse</span>
											<span style="display: none"><i class="feather icon-plus"></i> expand</span>
										</a>
									</li>
								</ul>
							</div>
						</div>
					</div>
					<div class="card-body table-responsive">
						<table id="table_user_all" class=" table-hover display" style="width: 100%;">
							<thead>
								<tr>
									<th>STT</th>
									<th>Mã nhân viên</th>
									<th>Tên</th>
									<th>Quyền</th>
									<th>Ngày tạo</th>
								</tr>
							</thead>
							
							<tbody>
								<c:forEach items="${list_users}" varStatus="index" var="user" >
									<tr>
										<td>${index.count }</td>
										<td>${user.staff_code }</td>
										<td>${user.display_name }</td>
										<td>${user.role }</td>
										<td>${user.created_at }</td>
									</tr>
								
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="card chat-card">
                    <div class="card-header">
                        <h5>Cấm hoạt động</h5>
                        <div class="card-header-right">
                            <div class="btn-group card-option">
                                <button type="button" class="btn dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    <i class="feather icon-more-horizontal"></i>
                                </button>
                                <ul class="list-unstyled card-option dropdown-menu dropdown-menu-right">
                                    <li class="dropdown-item full-card"><a href="#!"><span><i class="feather icon-maximize"></i> maximize</span><span style="display:none"><i class="feather icon-minimize"></i> Restore</span></a></li>
                                    <li class="dropdown-item minimize-card"><a href="#!"><span><i class="feather icon-minus"></i> collapse</span><span style="display:none"><i class="feather icon-plus"></i> expand</span></a></li>
                                    <li class="dropdown-item reload-card"><a href="#!"><i class="feather icon-refresh-cw"></i> reload</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <div class="card-body table-responsive">
                        <table id="table_user_ban" class=" table-hover display" style="width: 100%;">
							<thead>
								<tr>
									<th>STT</th>
									<th>Mã nhân viên</th>
									<th>Tên</th>
									<th>Quyền</th>
									<th>Ngày tạo</th>
								</tr>
							</thead>
							
							<tbody>
								<c:forEach items="${list_users_ban}" varStatus="index_ban" var="user_ban" >
									<tr>
										<td>${index.count }</td>
										<td>${user_ban.staff_code }</td>
										<td>${user_ban.display_name }</td>
										<td>${user_ban.role }</td>
										<td>${user_ban.created_at }</td>
									</tr>
								
								</c:forEach>
							</tbody>
						</table>
                    </div>
                </div>
			</div>
			<!-- [ tabs ] end -->
		</div>
		<!-- ===== End tabs ===== -->
	</div>
</body>