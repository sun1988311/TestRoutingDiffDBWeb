<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>login page</title>
<style>
      .loginName.ng-valid {
          background-color: lightgreen;
      }
      .loginName.ng-dirty.ng-invalid-required {
          background-color: red;
      }
      .loginName.ng-dirty.ng-invalid-minlength {
          background-color: yellow;
      }

      .password.ng-valid {
          background-color: lightgreen;
      }
      .password.ng-dirty.ng-invalid-required {
          background-color: red;
      }
      .password.ng-dirty.ng-invalid-email {
          background-color: yellow;
      }
      
    </style>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link href="<c:url value='/css/app.css' />" rel="stylesheet"></link>

</head>
<body ng-app="myApp" class="ng-cloak">
  <div class="generic-container" ng-controller="UserController as ctrl">
    <div class="panel panel-default">
      <div class="panel-heading"><span class="lead">User login Form </span></div>
      <div class="formcontainer">
        <form ng-submit="ctrl.submit()" name="myForm" class="form-horizontal">
          <div class="row">
            <div class="form-group col-md-12">
              <label class="col-md-2 control-lable" for="loginName">loginName</label>
              <div class="col-md-7">
                <input type="email" ng-model="ctrl.user.loginName" name="loginName" class="loginName form-control input-sm" placeholder="Enter your login name" required/>
                <div class="has-error" ng-show="myForm.$dirty">
                  <span ng-show="myForm.loginName.$error.required">This is a required field</span><br/>
                  <span ng-show="myForm.loginName.$invalid">This field is invalid </span>
                </div>
              </div>
            </div>
          </div>
          <div class="row">
            <div class="form-group col-md-12">
              <label class="col-md-2 control-lable" for="password">password</label>
              <div class="col-md-7">
                <input type="password" ng-model="ctrl.user.password" name="password" class="password form-control input-sm" placeholder="Enter your password" required ng-minlength="6"/>
                <div class="has-error" ng-show="myForm.$dirty">
                  <span ng-show="myForm.password.$error.required">This is a required field</span><br/>
                  <span ng-show="myForm.password.$invalid">This field is invalid </span>
                </div>
              </div>
            </div>
          </div>
          <div class="row">
            <div class="form-actions floatRight">
              <input type="submit"  value="submit" class="btn btn-primary btn-sm" ng-disabled="myForm.$invalid"/>
              <button type="button" ng-click="ctrl.reset()" class="btn btn-warning btn-sm" ng-disabled="myForm.$pristine">Reset Form</button>
            </div>
          </div>
        
        </form>
      </div>
    </div>
  
  </div>
  
<script src="http://cdn.static.runoob.com/libs/angular.js/1.4.6/angular.min.js"></script>
<script src="<c:url value='/js/app.js' />"></script>
<script src="<c:url value='/js/service/user_service.js' />"></script>
<script src="<c:url value='/js/controller/user_controller.js' />"></script>  
</body>
</html>