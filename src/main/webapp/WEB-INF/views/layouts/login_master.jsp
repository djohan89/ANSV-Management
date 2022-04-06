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
</head>
<body>
	<!-- [ auth-signin ] start -->
	<dec:body />
	<!-- [ auth-signin ] end -->
	
	<!-- Required Js -->
	<script src="<c:url value='/assets/js/vendor-all.min.js' />"></script>
	<script src="<c:url value='/assets/js/plugins/bootstrap.min.js' />"></script>
	<script src="<c:url value='/assets/js/ripple.js' />"></script>
	<script src="<c:url value='/assets/js/pcoded.min.js' />"></script>
</body>
</html>