<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/taglib.jsp"%>

<title>Detail | CEO</title>

<body>
	<div class="pcoded-content">
		<!-- [ breadcrumb ] start -->
		<div class="page-header">
			<div class="page-block">
				<div class="row align-items-center">
					<div class="col-md-12">
						<div class="page-header-title float-left">
							<h5 class="m-b-10">
								Chi tiết dự án - <b>CEO</b>
							</h5>
						</div>
						<ul class="breadcrumb float-right">
							<li class="breadcrumb-item">
								<a href="#"><i class="feather icon-home"></i></a>
							</li>
							<li class="breadcrumb-item">
								<a href="#">Dashboard Analytics</a>
							</li>
							<li class="breadcrumb-item">
								<a href="JavaScript:Void(0);">Project detail</a>
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
						<h5>Chi tiết dự án</h5>
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
					<div class="card-body">
						<ul class="nav nav-tabs mb-3" id="myTab" role="tablist">
							<li class="nav-item">
								<a class="nav-link active text-uppercase" id="home-tab" data-toggle="tab" 
									href="#table-detail" role="tab" aria-controls="home" aria-selected="true">
									Bảng kế hoạch</a></li>
							<li class="nav-item">
								<a class="nav-link text-uppercase" id="contact-tab" data-toggle="tab" 
									href="#detail-status" role="tab" aria-controls="contact" aria-selected="false">
									Tình trạng</a></li>
							<li class="nav-item">
								<a class="nav-link text-uppercase" id="profile-tab" data-toggle="tab" 
									href="#detail-plan" role="tab" aria-controls="profile" aria-selected="false">
									Kế hoạch</a></li>
							<li class="nav-item">
								<a class="nav-link text-uppercase" id="contact-tab" data-toggle="tab" 
									href="#detail-result" role="tab" aria-controls="contact" aria-selected="false">
									Kết quả</a></li>
						</ul>
						<div class="tab-content" id="myTabContent">
							<div class="tab-pane fade show active" id="table-detail" role="tabpanel"
								aria-labelledby="digital-transfer-tab">
								<table class="table table-hover table-bordered">
									<tr>
										<th style="width: 20%;" class="text-center">Kế hoạch</th>
										<th class="text-center">Số tiền<br />(${project_detail.currency_unit})</th>
										<th class="text-center" style="width: 26%;">Ngày thanh toán<br/>(D / M / Y)</th>
										<th class="text-center" style="width: 26%;">Nghiệm thu<br/>(D / M / Y)</th>
									</tr>
									<tr class="text-center">
										<th>DAC</th>
										<td class="text-right">
											<c:if test="${project_detail.so_tien_DAC != 0}">
												<fmt:formatNumber type="number" value="${project_detail.so_tien_DAC}" />
											</c:if>
										</td>
										<td><fmt:formatDate value="${project_detail.ke_hoach_thanh_toan_DAC}" pattern="dd / MM / yyyy" /></td>
										<td><fmt:formatDate value="${project_detail.DAC}" pattern="dd / MM / yyyy" /></td>
									</tr>
									<tr class="text-center">
										<th>PAC</th>
										<td class="text-right">
											<c:if test="${project_detail.so_tien_PAC != 0}">
												<fmt:formatNumber type="number" value="${project_detail.so_tien_PAC}" />
											</c:if>
										</td>
										<td><fmt:formatDate value="${project_detail.ke_hoach_thanh_toan_PAC}" pattern="dd / MM / yyyy" /></td>
										<td><fmt:formatDate value="${project_detail.PAC}" pattern="dd / MM / yyyy" /></td>
									</tr>
									<tr class="text-center">
										<th>FAC</th>
										<td class="text-right">
											<c:if test="${project_detail.so_tien_FAC != 0}">
												<fmt:formatNumber type="number" value="${project_detail.so_tien_FAC}" />
											</c:if>
										</td>
										<td><fmt:formatDate value="${project_detail.ke_hoach_thanh_toan_FAC}" pattern="dd / MM / yyyy" /></td>
										<td><fmt:formatDate value="${project_detail.FAC}" pattern="dd / MM / yyyy" /></td>
									</tr>
									<tr class="text-center">
										<th>Tổng</th>
										<td class="text-right">
											<c:if test="${project_detail.tong_gia_tri != 0}">
												<fmt:formatNumber type="number" value="${project_detail.tong_gia_tri }" />
											</c:if>
										</td>
										<td>N/A</td>
										<td>N/A</td>
									</tr>
									<tr class="text-center">
										<th>Tạm ứng</th>
										<td class="text-right">
											<c:if test="${project_detail.so_tien_tam_ung != 0}">
												<fmt:formatNumber type="number" value="${project_detail.so_tien_tam_ung }" />
											</c:if>
										</td>
										<td><fmt:formatDate value="${project_detail.ke_hoach_tam_ung}" pattern="dd / MM / yyyy" /></td>
										<td>N/A</td>
									</tr>
								</table>
							</div>
							<div class="tab-pane fade" id="detail-status"
								role="tabpanel" aria-labelledby="deployment-tab">
								<p>${project_detail.general_issue}</p>
							</div>
							<div class="tab-pane fade" id="detail-plan" role="tabpanel"
								aria-labelledby="telecom-tab">
								<p>${project_detail.ke_hoach}</p>
							</div>
							<div class="tab-pane fade" id="detail-result" role="tabpanel"
								aria-labelledby="telecom-tab">
								<p>${project_detail.ket_qua_thuc_hien_ke_hoach}</p>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="card chat-card">
                    <div class="card-header">
                        <h5>Chat</h5>
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
                    <div class="card-body">
                        <div class="row m-b-20 received-chat">
                            <div class="col-auto p-r-0">
                                <img src="<c:url value='/assets/images/user/avatar-2.jpg' />" alt="user image" class="img-radius wid-40">
                            </div>
                            <div class="col">
                                <div class="msg">
                                    <p class="m-b-0">Em gặp phải vấn đề cực kỳ nghiêm trọng!</p>
                                </div>
                                <p class="text-muted m-b-0"><i class="fa fa-clock-o m-r-10"></i>10:20 am</p>
                            </div>
                        </div>
                        <div class="row m-b-20 send-chat">
                            <div class="col">
                                <div class="msg">
                                    <p class="m-b-0">Vấn đề gì? Nói chị nghe nào!</p>
                                </div>
                                <p class="text-muted m-b-0"><i class="fa fa-clock-o m-r-10"></i>10:21 am</p>
                            </div>
                            <div class="col-auto p-l-0">
                                <img src="<c:url value='/assets/images/user/avatar-3.jpg' />" alt="user image" class="img-radius wid-40">
                            </div>
                        </div>
                        <div class="row m-b-20 received-chat">
                            <div class="col-auto p-r-0">
                                <img src="<c:url value='/assets/images/user/avatar-2.jpg' />" alt="user image" class="img-radius wid-40">
                            </div>
                            <div class="col">
                                <div class="msg">
                                    <p class="m-b-0">Em đang thuyết phục khách hàng.<br>Vấn đề của em đây! Chị nhìn ảnh nhé!</p>
                                    <img src="<c:url value='/assets/images/widget/dashborad-1.jpg' />" alt="">
                                    <img src="<c:url value='/assets/images/widget/dashborad-3.jpg' />" alt="">
                                </div>
                                <p class="text-muted m-b-0"><i class="fa fa-clock-o m-r-10"></i>10:23 am</p>
                            </div>
                        </div>
                        <div class="form-group m-t-15">
                            <label class="floating-label" for="Project">Send message</label>
                            <input type="text" name="task-insert" class="form-control" id="Project">
                            <div class="form-icon">
                                <button class="btn btn-primary btn-icon">
                                    <i class="feather icon-message-circle"></i>
                                </button>
                            </div>
                        </div>
                    </div>
                </div>
			</div>
			<!-- [ tabs ] end -->
		</div>
		<!-- ===== End tabs ===== -->
	</div>
</body>