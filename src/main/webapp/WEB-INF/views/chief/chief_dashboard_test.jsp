<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/taglib.jsp"%>

<title>Dashboard | CEO</title>

<body>
	<div class="pcoded-content">
		<!-- [ breadcrumb ] start -->
		<div class="page-header">
			<div class="page-block">
				<div class="row align-items-center">
					<div class="col-md-12">
						<div class="page-header-title float-left">
							<h5 class="m-b-10">
								Dashboard Analytics - <b>CEO</b>
							</h5>
						</div>
						<ul class="breadcrumb float-right">
							<li class="breadcrumb-item"><a href="index.html"><i
									class="feather icon-home"></i></a></li>
							<li class="breadcrumb-item"><a href="JavaScript:Void(0);">Dashboard
									Analytics</a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
		<!-- [ breadcrumb ] end -->
		
		
		
		<!-- ===== Tabs: Hiển thị thống kê ===== -->
		<link rel="stylesheet" href="<c:url value='/assets/css/highcharts/highcharts.css' />">
		<div class="row" style="margin-top: -2%;">
			<div class="col-sm-4">
				<div class="card">
                    <div class="card-header">
                        <h5>Bar chart stacked</h5>
                        <div class="card-header-right">
							<div class="btn-group card-option">
								<button type="button" class="btn dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
									<i class="feather icon-more-horizontal" style="font-size: 20px;"></i>
								</button>
								<ul class="list-unstyled card-option dropdown-menu dropdown-menu-right">
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
                        <figure class="highcharts-figure">
							<div id="highcharts-container-1"></div>
							<p class="highcharts-description" align="center">
								Đồ thị thống kê toàn bộ dự án Triển khai trong tuần
							</p>
						</figure>
                    </div>
                </div>
			</div>
			<div class="col-sm-4">
				<div class="card">
                    <div class="card-header">
                        <h5>Bar chart stacked</h5>
                        <div class="card-header-right">
							<div class="btn-group card-option">
								<button type="button" class="btn dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
									<i class="feather icon-more-horizontal" style="font-size: 20px;"></i>
								</button>
								<ul class="list-unstyled card-option dropdown-menu dropdown-menu-right">
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
                        <figure class="highcharts-figure">
							<div id="highcharts-container-2"></div>
							<p class="highcharts-description" align="center">
								Đồ thị thống kê toàn bộ dự án Viễn thông trong tuần
							</p>
						</figure>
                    </div>
                </div>
			</div>
			<div class="col-sm-4">
				<div class="card">
                    <div class="card-header">
                        <h5>Bar chart stacked</h5>
                        <div class="card-header-right">
							<div class="btn-group card-option">
								<button type="button" class="btn dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
									<i class="feather icon-more-horizontal" style="font-size: 20px;"></i>
								</button>
								<ul class="list-unstyled card-option dropdown-menu dropdown-menu-right">
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
                        <figure class="highcharts-figure">
							<div id="highcharts-container-3"></div>
							<p class="highcharts-description" align="center">
								Đồ thị thống kê toàn bộ dự án Chuyển đổi số trong tuần
							</p>
						</figure>
                    </div>
                </div>
			</div>
		</div>
		
		
		
		<!-- ===== Tabs: Hiển thị báo cáo công việc ===== -->
		<div class="row">
			<!-- [ tabs ] start -->
			<div class="col-sm-8">
				<div class="card">
					<div class="card-header">
						<h5>Giám sát công việc <i class="fas fa-play text-danger pl-3"></i></h5>
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
							<li class="nav-item"><a
								class="nav-link active text-uppercase" id="home-tab"
								data-toggle="tab" href="#deployment" role="tab"
								aria-controls="home" aria-selected="true">Triển khai</a></li>
							<li class="nav-item"><a class="nav-link text-uppercase"
								id="profile-tab" data-toggle="tab" href="#telecom" role="tab"
								aria-controls="profile" aria-selected="false">Viễn thông</a></li>
							<li class="nav-item"><a class="nav-link text-uppercase"
								id="contact-tab" data-toggle="tab" href="#digital-transfer"
								role="tab" aria-controls="contact" aria-selected="false">Chuyển
									đổi số</a></li>
						</ul>
						<div class="tab-content" id="myTabContent">
							<div class="tab-pane fade show active" id="deployment"
								role="tabpanel" aria-labelledby="deployment-tab">
								<div class="scroll_content">
									<table id="datatable_1" class="display" style="width:100%">
								        <thead>
								            <tr>
								                <th width="5%"></th>
								                <th>Dự án</th>
								                <th>Khách hàng</th>
								                <th width="10%">Ưu tiên</th>
								                <th>PIC</th>
								            </tr>
								        </thead>
								        <tfoot>
								            <tr>
								                <th></th>
								                <th>Dự án</th>
								                <th>Khách hàng</th>
								                <th>Ưu tiên</th>
								                <th>PIC</th>
								            </tr>
								        </tfoot>
								    </table>
								</div>
							</div>
							<div class="tab-pane fade" id="telecom" role="tabpanel"
								aria-labelledby="telecom-tab">
								<div class="scroll_content">
									<table id="datatable_2" class="display" style="width:100%">
								        <thead>
								            <tr>
								                <th width="5%"></th>
								                <th>Dự án</th>
								                <th>Khách hàng</th>
								                <th width="10%">Ưu tiên</th>
								                <th>PIC</th>
								            </tr>
								        </thead>
								        <tfoot>
								            <tr>
								                <th></th>
								                <th>Dự án</th>
								                <th>Khách hàng</th>
								                <th>Ưu tiên</th>
								                <th>PIC</th>
								            </tr>
								        </tfoot>
								    </table>
								</div>
							</div>
							<div class="tab-pane fade" id="digital-transfer" role="tabpanel"
								aria-labelledby="digital-transfer-tab">
								<div class="scroll_content">
									<table id="datatable_3" class="display" style="width:100%">
								        <thead>
								            <tr>
								                <th width="5%"></th>
								                <th>Dự án</th>
								                <th>Khách hàng</th>
								                <th width="10%">Ưu tiên</th>
								                <th>PIC</th>
								            </tr>
								        </thead>
								        <tfoot>
								            <tr>
								                <th></th>
								                <th>Dự án</th>
								                <th>Khách hàng</th>
								                <th>Ưu tiên</th>
								                <th>PIC</th>
								            </tr>
								        </tfoot>
								    </table>
								</div>
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
	
	<script src="<c:url value='/assets/js/highcharts/highcharts.js' />"></script>
	<script src="<c:url value='/assets/js/highcharts/exporting.js' />"></script>
	<script src="<c:url value='/assets/js/highcharts/export-data.js' />"></script>
	<script src="<c:url value='/assets/js/highcharts/accessibility.js' />"></script>
	
	
	
	<script type="text/javascript">
		var colors = Highcharts.getOptions().colors.slice(0),
			dark = -0.5;
		
		
		colors[1] = Highcharts.Color(colors[0]).brighten(dark).get();
		
		colors[3] = Highcharts.Color(colors[2]).brighten(dark).get();
		
		var colors_new = ['#9ccc65', '#ffba57', '#ff5252', '#4680ff'];
		
		const thong_ke = ${statistic};
		
		/* Đồ thị Triển khai */
		Highcharts.chart('highcharts-container-1',
		{
			chart : {
				type : 'column'
			},
			colors: colors_new,
			title : {
				text : 'Dự án Triển khai'
			},
			xAxis : {
				categories : [ 'Ưu tiên 1', 'Ưu tiên 2', 'Ưu tiên 3', 'Done' ]
			},
			yAxis : {
				min : 0,
				title : {
					text : 'Số lượng (dự án)'
				},
				stackLabels : {
					enabled : true,
					style : {
						fontWeight : 'bold',
						color : ( // theme
						Highcharts.defaultOptions.title.style && Highcharts.defaultOptions.title.style.color)
								|| 'gray'
					}
				}
			},
			legend : {
				align : 'right',
				x : -30,
				verticalAlign : 'top',
				y : 25,
				floating : true,
				backgroundColor : Highcharts.defaultOptions.legend.backgroundColor
						|| 'white',
				borderColor : '#CCC',
				borderWidth : 1,
				shadow : false
			},
			tooltip : {
				headerFormat : '<b>{point.x}</b><br/>',
				pointFormat : '{series.name}: {point.y}<br/>Total: {point.stackTotal}'
			},
			plotOptions : {
				column : {
					stacking : 'normal',
					dataLabels : {
						enabled : true
					}
				}
			},
			series : [ {
				name : 'Ongoing',
				data : [ 23, 35, 12, null ]
			}, {
				name : 'Warning',
				data : [ 34, 13, 21, null ]
			}, {
				name : 'Danger',
				data : [ 26, 16, 19, null ]
			}, {
				name : 'Complete',
				data : [ null, null, null, 25 ]
			} ]
		});
		
		
		
		/* Đồ thị Viễn thông */
		Highcharts.chart('highcharts-container-2',
		{
			chart : {
				type : 'column'
			},
			colors: colors_new,
			title : {
				text : 'Dự án Viễn thông'
			},
			xAxis : {
				categories : [ 'Ưu tiên 1', 'Ưu tiên 2', 'Ưu tiên 3', 'Done' ]
			},
			yAxis : {
				min : 0,
				title : {
					text : 'Số lượng (dự án)'
				},
				stackLabels : {
					enabled : true,
					style : {
						fontWeight : 'bold',
						color : ( // theme
						Highcharts.defaultOptions.title.style && Highcharts.defaultOptions.title.style.color)
								|| 'gray'
					}
				}
			},
			legend : {
				align : 'right',
				x : -30,
				verticalAlign : 'top',
				y : 25,
				floating : true,
				backgroundColor : Highcharts.defaultOptions.legend.backgroundColor
						|| 'white',
				borderColor : '#CCC',
				borderWidth : 1,
				shadow : false
			},
			tooltip : {
				headerFormat : '<b>{point.x}</b><br/>',
				pointFormat : '{series.name}: {point.y}<br/>Total: {point.stackTotal}'
			},
			plotOptions : {
				column : {
					stacking : 'normal',
					dataLabels : {
						enabled : true
					}
				}
			},
			series : [ {
				name : 'Ongoing',
				data : [ 23, 35, 12, null ]
			}, {
				name : 'Warning',
				data : [ 34, 13, 21, null ]
			}, {
				name : 'Danger',
				data : [ 26, 16, 19, null ]
			}, {
				name : 'Complete',
				data : [ null, null, null, 25 ]
			} ]
		});
		
		
		
		/* Đồ thị Chuyển đổi số */
		Highcharts.chart('highcharts-container-3',
		{
			chart : {
				type : 'column'
			},
			colors: colors_new,
			title : {
				text : 'Dự án Chuyển đổi số'
			},
			xAxis : {
				categories : [ 'Ưu tiên 1', 'Ưu tiên 2', 'Ưu tiên 3', 'Done' ]
			},
			yAxis : {
				min : 0,
				title : {
					text : 'Số lượng (dự án)'
				},
				stackLabels : {
					enabled : true,
					style : {
						fontWeight : 'bold',
						color : ( // theme
						Highcharts.defaultOptions.title.style && Highcharts.defaultOptions.title.style.color)
								|| 'gray'
					}
				}
			},
			legend : {
				align : 'right',
				x : -30,
				verticalAlign : 'top',
				y : 25,
				floating : true,
				backgroundColor : Highcharts.defaultOptions.legend.backgroundColor
						|| 'white',
				borderColor : '#CCC',
				borderWidth : 1,
				shadow : false
			},
			tooltip : {
				headerFormat : '<b>{point.x}</b><br/>',
				pointFormat : '{series.name}: {point.y}<br/>Total: {point.stackTotal}'
			},
			plotOptions : {
				column : {
					stacking : 'normal',
					dataLabels : {
						enabled : true
					}
				}
			},
			series : [ {
				name : 'Ongoing',
				data : [ 23, 35, 12, null ]
			}, {
				name : 'Warning',
				data : [ 34, 13, 21, null ]
			}, {
				name : 'Danger',
				data : [ 26, 16, 19, null ]
			}, {
				name : 'Complete',
				data : [ null, null, null, 25 ]
			} ]
		});
	</script>
</body>