<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>NDA 2021: Application Form, Exam Date, Syllabus, Eligibility Criteria</title>
<meta name="description" content="Get complete information about the upcoming NDA Exam 2021, NDA application form 2021, exam date, syllabus, eligibility criteria, exam pattern, admit card, result, selection process." />
<meta property="og:title" content="NDA 2021: Application Form, Exam Date, Syllabus, Eligibility Criteria" />
<meta property="og:description" content="Get complete information about the upcoming NDA Exam 2021, NDA application form 2021, exam date, syllabus, eligibility criteria, exam pattern, admit card, result, selection process." />
<meta name="twitter:description" content="Get complete information about the upcoming NDA Exam 2021, NDA application form 2021, exam date, syllabus, eligibility criteria, exam pattern, admit card, result, selection process." />
<meta name="twitter:title" content="NDA 2021: Application Form, Exam Date, Syllabus, Eligibility Criteria" />
<jsp:include page="nda_header.jsp" />
</head>
<body>
	<form action="/show" method="post">
  <div class="form-group">
    <label for="email">Email address:</label>
    <input type="email" class="form-control" id="email">
  </div>
  <div class="form-group">
    <label for="pwd">Password:</label>
    <input type="password" class="form-control" id="pwd">
  </div>
  <div class="checkbox">
    <label><input type="checkbox"> Remember me</label>
  </div>
  <button type="submit" class="btn btn-default">Submit</button>
</form>
</body>
</html>