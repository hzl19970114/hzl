<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>customer list</title>
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
                    <small>customer list —— all customer</small>
                </h1>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-4 column">
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/Customer/toAddCustomer">新增</a>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>ID</th>
                    <th>name</th>
                    <th>WeChat</th>
                    <th>Tel</th>
                    <th>api</th>
                    <th>secret</th>
                    <th>re</th>
                    <th>reY</th>
                    <th>reM</th>
                    <th>reNow</th>
                    <th>操作</th>
                </tr>
                </thead>

                <tbody>
                <c:forEach var="customers" items="${requestScope.get('list')}">
                    <tr>
                        <td>${customers.getcID()}</td>
                        <td>${customers.getcName()}</td>
                        <td>${customers.getcWeChat()}</td>
                        <td>${customers.getcTel()}</td>
                        <td>${customers.getApi()}</td>
                        <td>${customers.getSecret()}</td>
                        <td>${customers.getRe()}</td>
                        <td>${customers.getReY()}</td>
                        <td>${customers.getReM()}</td>
                        <td>${customers.getReNow()}</td>
                        <td>
                            <a href="${pageContext.request.contextPath}/Customer/toUpdateCustomer?id=${customers.getcID()}">更改</a> |
                            <a href="${pageContext.request.contextPath}/Customer/del/${customers.getcID()}">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>