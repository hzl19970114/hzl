<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>add customer</title>
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
                    <small>dd customer</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/Customer/addCustomer" method="post">
        ID：<input type="text" name="cID"><br><br><br>
        Name：<input type="text" name="cName"><br><br><br>
        WeChat：<input type="text" name="cWeChat"><br><br><br>
        Tel：<input type="text" name="cTel"><br><br><br>
        api：<input type="text" name="api"><br><br><br>
        secret：<input type="text" name="secret"><br><br><br>
        re：<input type="text" name="re"><br><br><br>
        reY：<input type="text" name="reY"><br><br><br>
        reM：<input type="text" name="reM"><br><br><br>
        reNow：<input type="text" name="reNow"><br><br><br>
        <input type="submit" value="添加">
    </form>

</div>