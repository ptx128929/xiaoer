<%@ page language="java" contentType="text/html; charset=UTF-8"
  
       pageEncoding="UTF-8"%>  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
     <%@ taglib prefix="fn"  uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link    rel="stylesheet"    href="<%=request.getContextPath() %>/css/index3.css"  type="text/css"  >
<script type="text/javascript"  src="<%=request.getContextPath() %>/js/jquery-1.8.3.min.js"></script> 

</head>
<body>
<table>
    <tr>
       <td>编号</td>
        <td>名称</td>
         <td>时间</td>
          <td>品牌</td>
    </tr>
    <c:forEach items="${list}" var="s">
    <tr>
    
       <td>${s.eid }</td>
              <td>${s.ename }</td>
                     <td>${s.dates }</td>
                            <td>${s.ping }</td>
    </tr>
    
    </c:forEach>
</table>
</body>
</html>