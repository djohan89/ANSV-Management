<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/taglib.jsp"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <title><dec:title default="Master-Layout" /></title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimal-ui">
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="description" content="" />
    <meta name="keywords" content="">
    <meta name="author" content="Phoenixcoded" />
    <!-- Favicon icon -->
    <link rel="icon" href="<c:url value='/assets/images/logo/logo_ansv.png' />" type="image/x-icon">
    <!-- vendor css -->
    <link rel="stylesheet" href="<c:url value='/assets/css/style.css' />">
    <!-- Font Awesome -->
	<link rel="stylesheet" href="<c:url value='/assets/plugins/fontawesome-free/css/all.min.css' />">
	
    <link rel="stylesheet" href="<c:url value='/assets/css/datatable/jquery.dataTables.min.css' />">
    
    <style>
    	.badge-size {
    		font-size: 15px;
    	}
    	.tr-click {
    		background-color: lightgray!important;
    		color: blue!important;
    	}
    	.td-data-link {
    		color: blue!important;
    	}
    	.scroll_content {
		  	height: 500px;
		  	overflow: auto;
		}
		.odd td a:hover,
		.even td a:hover {
			color: blue!important;
			font-weight: bold;
		  	text-decoration: underline;
		}
    </style>
</head>
<body>
	<!-- [ navigation menu ] start -->
	<%@include file="/WEB-INF/views/layouts/chief/menu.jsp"%>
	<!-- [ navigation menu ] end -->
	
	
	
	<!-- [ Header ] start -->
	<%@include file="/WEB-INF/views/layouts/chief/header.jsp"%>
	<!-- [ Header ] end -->
	
	

	<!-- [ Main Content ] start -->
	<div class="pcoded-main-container">
	    <dec:body />
	</div>
	<!-- [ Main Content ] end -->



	<!-- Required Js -->
	<script src="<c:url value='/assets/js/vendor-all.min.js' />"></script>
	<script src="<c:url value='/assets/js/plugins/bootstrap.min.js' />"></script>
	<script src="<c:url value='/assets/js/ripple.js' />"></script>
	<script src="<c:url value='/assets/js/pcoded.min.js' />"></script>
	
	<script src="<c:url value='/assets/js/datatable/jquery.dataTables.min.js' />"></script>
	
	<script src="<c:url value='/assets/js/demo_main.js' />"></script>
	<script src="<c:url value='/assets/js/datatable/demo_main.js' />"></script>
	
	
	
	<script type="text/javascript">
		var deployment_project = ${deployment_project};
		var telecom_project = ${telecom_project};
		var digital_transfer_project = ${digital_transfer_project};
	
		if (deployment_project != null) {
			/* ===== Datatable 1: Dự án Triển khai ===== */
			var table_1 = $('#datatable_1').DataTable( {
		        "data": deployment_project,
		        "columns": [
		            {
		                "className":      'dt-control',
		                "orderable":      false,
		                "data":           null,
		                "defaultContent": ''
		            },
		            { 
		            	"data": "project_name",
	    	            render: function(data, type, row) {
	    	            	var detail_id = row["detail_id"];
	    	            	var project_type = row["project_type"];
	    	            	var html = 	'<a href="<c:url value="/chief/detail/' + project_type + '_' + detail_id + '" />" class="text-dark">' + row["project_name"] + '</a>';
							return html;
	                    }
		            },
		            { "data": "customer" },
		            { "data": "priority_display" },
		            { "data": "pic_name" }
		        ],
		        "order": [[1, 'asc']]
		    } );
		    
		 	// Add event listener for opening and closing details
		    $('#datatable_1 tbody').on('click', 'td.dt-control', function () {
		        var tr = $(this).closest('tr');
		        var row = table_1.row( tr );
		 
		        if ( row.child.isShown() ) {
		            // This row is already open - close it
		            row.child.hide();
		            tr.removeClass('shown font-weight-bold tr-click');
		            tr.children('td').children('a').removeClass('td-data-link');
		        }
		        else {
		            // Open this row
		            row.child( format(row.data()) ).show();
		            tr.addClass('shown font-weight-bold tr-click');
		            tr.children('td').children('a').addClass('td-data-link');
		        }
		    } );
		    /* ===== End Datatable 1 ===== */
		}
		
		if (telecom_project != null) {
			/* ===== Datatable 2: Dự án Viễn thông ===== */
			var table_2 = $('#datatable_2').DataTable( {
		        "data": telecom_project,
		        "columns": [
		            {
		                "className":      'dt-control',
		                "orderable":      false,
		                "data":           null,
		                "defaultContent": ''
		            },
		            { 
		            	"data": "project_name",
	    	            render: function(data, type, row) {
	    	            	var detail_id = row["detail_id"];
	    	            	var project_type = row["project_type"];
	    	            	var html = 	'<a href="<c:url value="/chief/detail/' + project_type + '_' + detail_id + '" />" class="text-dark">' + row["project_name"] + '</a>';
							return html;
	                    }
		            },
		            { "data": "customer" },
		            { "data": "priority_display" },
		            { "data": "pic_name" }
		        ],
		        "order": [[1, 'asc']]
		    } );
		    
		 	// Add event listener for opening and closing details
		    $('#datatable_2 tbody').on('click', 'td.dt-control', function () {
		        var tr = $(this).closest('tr');
		        var row = table_2.row( tr );
		 
		        if ( row.child.isShown() ) {
		            // This row is already open - close it
		            row.child.hide();
		            tr.removeClass('shown font-weight-bold tr-click');
		            tr.children('td').children('a').removeClass('td-data-link');
		        }
		        else {
		            // Open this row
		            row.child( format(row.data()) ).show();
		            tr.addClass('shown font-weight-bold tr-click');
		            tr.children('td').children('a').addClass('td-data-link');
		        }
		    } );
		    /* ===== End Datatable 2 ===== */
		}
		
		if (digital_transfer_project != null) {
			/* ===== Datatable 3: Dự án Viễn thông ===== */
			var table_3 = $('#datatable_3').DataTable( {
		        "data": digital_transfer_project,
		        "columns": [
		            {
		                "className":      'dt-control',
		                "orderable":      false,
		                "data":           null,
		                "defaultContent": ''
		            },
		            { 
		            	"data": "project_name",
	    	            render: function(data, type, row) {
	    	            	var detail_id = row["detail_id"];
	    	            	var project_type = row["project_type"];
	    	            	var html = 	'<a href="<c:url value="/chief/detail/' + project_type + '_' + detail_id + '" />" class="text-dark">' + row["project_name"] + '</a>';
							return html;
	                    }
		            },
		            { "data": "customer" },
		            { "data": "priority_display" },
		            { "data": "pic_name" }
		        ],
		        "order": [[1, 'asc']]
		    } );
		    
		 	// Add event listener for opening and closing details
		    $('#datatable_3 tbody').on('click', 'td.dt-control', function () {
		        var tr = $(this).closest('tr');
		        var row = table_3.row( tr );
		 
		        if ( row.child.isShown() ) {
		            // This row is already open - close it
		            row.child.hide();
		            tr.removeClass('shown font-weight-bold tr-click');
		            tr.children('td').children('a').removeClass('td-data-link');
		        }
		        else {
		            // Open this row
		            row.child( format(row.data()) ).show();
		            tr.addClass('shown font-weight-bold tr-click');
		            tr.children('td').children('a').addClass('td-data-link');
		        }
		    } );
		    /* ===== End Datatable 3 ===== */
		}
	</script>
</body>
</html>