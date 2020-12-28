<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglib.jsp"%>

<html>
<head>
    <title>Chỉnh sửa bài viết</title>
</head>
<body>
<div class="main-content">
    <div class="main-content-inner">
        <div class="breadcrumbs" id="breadcrumbs">
            <script type="text/javascript">
                try{ace.settings.check('breadcrumbs' , 'fixed')}catch(e){}
            </script>
            <ul class="breadcrumb">
                <li>
                    <i class="ace-icon fa fa-home home-icon"></i>
                    <a href="#">Trang chủ</a>
                </li>
                <li class="active">Chỉnh sửa bài viết</li>
            </ul><!-- /.breadcrumb -->
        </div>
        <div class="page-content">
            <div class="row">
                <div class="col-xs-12">
                        <c:if test="${not empty messageResponse}">
									<div class="alert alert-${alert}">
  										${messageResponse}
									</div>
						</c:if>
                        <form  action="/DoAnBeta/admin-insert" method="get">                
                            <div class="form-group">
                                <label class="col-sm-3 control-label no-padding-right">Name</label>
                                <div class="col-sm-9">
                                    <input type="text" class="form-control" id="title" name="Name" value=""/>
                                </div>
                            </div>
                            <br/>
                            <br/>
                            <div class="form-group">
                                <label class="col-sm-3 control-label no-padding-right">Parent_id</label>
                                <div class="col-sm-9">
                                    <input type="text" class="form-control" id="thumbnail" name="Parent_id" value=""/>
                                </div>
                            </div>
                            <br/>
                            <br/>
                            <div class="form-group">
                                <label class="col-sm-3 control-label no-padding-right">Created_at</label>
                                <div class="col-sm-9">
                                    <input type="text" class="form-control" id="shortDescription" name="Created_at" value=""/>
                                </div>
                            </div>
                            <br/>
                            <br/>
                            <div class="form-group">
                                <div class="col-sm-12">           
                                    <input type="submit" value="Insert"/>
                                </div>
                            </div> 
                            <input type="hidden" name="action" value="insert">                         
                        </form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
