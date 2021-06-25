<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>update customer</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>update Customer</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/Customer/updateCustomer" method="post">
        <input type="hidden" name="cID" value="${customers.getcID()}"/>
        cID：<input type="text" name="cID" value="${customers.getcID()}"/>
        cName：<input type="text" name="cName" value="${customers.getcName()}"/>
        cWeChat：<input type="text" name="cWeChat" value="${customers.getcWeChat()}"/>
        cTel：<input type="text" name="cTel" value="${customers.getcTel()}"/>
        api：<input type="text" name="api" value="${customers.getApi()}"/>
        secret：<input type="text" name="secret" value="${customers.getSecret()}"/>
        re：<input type="text" name="re" value="${customers.getRe()}"/>
        reY：<input type="text" name="reY" value="${customers.getReY()}"/>
        reM：<input type="text" name="reM" value="${customers.getReM()}"/>
        reNow：<input type="text" name="reNow" value="${customers.getReNow()}"/>
        <input type="submit" value="提交"/>
    </form>

</div>