<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="bootstrap/bootstrap-3.3.7/dist/css/bootstrap.min.css">
<script src="jquery/jquery-1.11.1.min.js"></script>
<script src="bootstrap/bootstrap-3.3.7/dist/js/bootstrap.min.js"></script>
<script src="bootstrap/bootstrap-3.3.7/js/carousel.js"></script>
<script src="bootstrap/bootstrap-3.3.7/js/popover.js"></script>
    
<style>
       *{
            margin:0;
            padding:0;
        }
        ul,li,ol,table{
            list-style:none;
        }

        .container{
            width:920px;
            height:520px;
            margin:0 auto;
            margin-top: 20px;
            padding: 0px;
        }
        .row{
            width:920px;
            height:60px;
            background: #1e324b;
            margin: 0px;
            padding: 0px;
        }
        .end{
            width:920px;
            height:520px;
        }
        .left{
            width:139px;
            height:520px;
            background: #1d2732;
        }
        .right{
            width:600px;
            height:520px;
            background: #162435;
        }
        .left>ul>li{
            width:139px;
            height:44px;
            line-height: 44px;
            padding-left: 12px;
            font-family: STHeitiSC-Light;
            font-size: 12px;
            color: rgba(191, 189, 190, 0.5);
        }
</style>
<script>
        $(function(){
            $(".myul1>li").mouseover(function(){
                $(".myul1>li").css({"background":"  #1d2732","color":"rgba(191, 189, 190, 0.5)"});
                $(this).css({"background":"#161d22","color":"#e9ebed"});
                $(".myul1>li>.M").css("display","none");
                $(".myul1>li>.M").eq($(this).index()).css("display","block");
                $(".right>div").css("display","none");
                $(".right>div").eq($(this).index()).css("display","block");

            })
        })
        $(function(){
             $(".myul2>li").click(function(){
                 $(".myul2>li").css("background","#f0f0f0");
                 $(this).css("background"," #ffa602");
                 $(".mydivA>div").css("display","none");
                 $(".mydivA>div").eq($(this).index()).css("display","block");
             })
        })
        $(function () {

            $("#btn_add").click(function () {
                $("#myModalLabel").text("新增");
                $('#myModal1').modal();
            });
        })

    </script>
</head>
<body>
	<div class="container">

              <div class="row">

                  <div class="col-md-5" style="font-family: STSongti-SC-Regular;color:#e9ebed;font-size: 12px;line-height: 60px;width:436px;">
                      <img src="img/touxiang.png" style="margin-right: 5px;width:35px;height:35px;">刘老师</div>
                  <div class="col-md-5" style="height:60px;width:367px;"></div>
                  <div class="col-md-1" style="line-height: 60px;width:53px;"><img src="img/suoxiaochuankou.png" ></div>
                  <div class="col-md-1" style="width: 33px;line-height: 60px;"><img src="img/guanbi.png" ></div>

              </div>
          <div class="end">
             <table class="list-inline" style="margin: 0px;">
                 <tr>
                 <td class="left" valign="top">
                     <ul class="myul1">
                         <li><img src="img/yonghuguanli.png">&nbsp;&nbsp;&nbsp;&nbsp;用户管理<img src="img/cebianlan-sanjiaoxing.png" style="margin-right: -4px;float: right;display: none;margin-top: 11px;" class="M" ></li>
                         <li><img src="img/xinwenguuanli.png">&nbsp;&nbsp;&nbsp;&nbsp;新闻管理<img src="img/cebianlan-sanjiaoxing.png" style="margin-right: -4px;float: right;display: none;margin-top: 11px;" class="M" ></li>
                         <li><img src="img/pinglunguanli.png">&nbsp;&nbsp;&nbsp;&nbsp;评论管理<img src="img/cebianlan-sanjiaoxing.png" style="margin-right: -4px;float: right;display: none;margin-top: 11px;" class="M" ></li>
                         <li><img src="img/xinwenpachong.png">&nbsp;&nbsp;&nbsp;&nbsp;新闻爬虫<img src="img/cebianlan-sanjiaoxing.png" style="margin-right: -4px;float: right;display: none;margin-top: 11px;" class="M" ></li>
                         <li><img src="img/xinwenguanlfenlei.png">&nbsp;&nbsp;&nbsp;&nbsp;新闻分类管理<img src="img/cebianlan-sanjiaoxing.png" style="margin-right: -4px;float: right;display: none;margin-top: 11px;" class="M" ></li>
                     </ul>
                     <img src="img/logo1.png" style="width:110px;height:35px;margin-top: 220px;margin-left: 15px;">
                 </td>
                 <td class="right" valign="top">
                     <div>
                        <fieldset style="width: 781px;height:40px;background: #f0f0f0;">
                            <table style="width: 781px;height:40px;font-size: 12px;font-family: STHeitiSC-Light;" >
                                <tr class="mytr1">
                                    <td style="text-align: right" class="mytd1">
                                        <ul class="list-inline myul2" style="text-align: center;height:40px;margin-bottom: 0px;">
                                            <li style="margin-top: 10px;height:30px;line-height: 25px;">会员</li>
                                            <li style="margin-top: 10px;height:30px;line-height: 25px;margin-left: 10px;">管理员</li>
                                        </ul>
                                    </td>
                                    <td style="text-align: center">
                                        <div class="input-group " style="margin: 0px;padding: 0px;">
                                            <input type="text"  id="formGroupInputSmall"  style="color:#bebebe;font-size:12px;font-family:STHeitiSC-Light;width:100px;height:25px;background: #ffffff; border: 0px;"placeholder="昵称/用户名/手机/备注">
                                            <span class="input-group-addon " style="background: #ffffff;width: 35px;height:25px;border: 0px;text-align: center;padding: 0px;margin: 0px;" ><img src="img/fangdajing.png"></span>
                                        </div>
                                    </td>
                                    <td style="text-align: left"><button style="width: 40px;background:#ffffff " id="btn_add">添加</button></td>
                                </tr>
                            </table>
                        </fieldset>
                        <div style="width:781px;height:480px;" class="mydivA">
                            <div>
                        <table cellpadding="6px"  width="781px" style="font-size: 12px;">
                            <thead >
                            <th>序号</th>
                            <th>用户名</th>
                            <th>昵称</th>
                            <th>性别</th>
                            <th>生日</th>
                            <th>地址</th>
                            <th>手机号</th>
                            <th>状态</th>
                            <th>创建时间</th>
                            <th>修改时间</th>
                            <th>登录时间</th>
                            <th>头像</th>
                            <th>备注</th>
                            <th>设为管理员</th>
                            <th>操作</th>
                            </thead>
                            <tbody id="perListBox">
                            </tbody>
                        </table>
                            </div>
                            <div style="display: none">
                            <table cellpadding="6px" width="781px" style="font-size: 12px;">
                                <thead>
                                <th>序号</th>
                                <th>级别</th>
                                <th>状态</th>
                                <th>用户名</th>
                                <th>添加时间</th>
                                <th>操作</th>
                                </thead>
                                <tbody id="perListBox0">
                                </tbody>
                            </table>
                            </div>
                        </div>
                    </div>
                     <div style="display: none"><table>BBBB</table></div>
                     <div style="display: none"><table>CCCC</table></div>
                     <div style="display: none"><table>DDDD</table></div>
                     <div style="display: none"><table>EEEE</table></div>
                 </td>
                 </tr>
             </table>
         </div>
     </div>
     <div class="modal fade" id="myModal1" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
         <div class="modal-dialog" role="document">
             <div class="modal-content">
                 <div class="modal-header">
                     <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                     <h4 class="modal-title" id="myModalLabel">新增</h4>
                 </div>
                 <div class="modal-body">

                     <div class="form-group">
                         <label for="txt_departmentname">部门名称</label>
                         <input type="text" name="txt_departmentname" class="form-control" id="txt_departmentname" placeholder="部门名称">
                     </div>
                     <div class="form-group">
                         <label for="txt_parentdepartment">上级部门</label>
                         <input type="text" name="txt_parentdepartment" class="form-control" id="txt_parentdepartment" placeholder="上级部门">
                     </div>
                     <div class="form-group">
                         <label for="txt_departmentlevel">部门级别</label>
                         <input type="text" name="txt_departmentlevel" class="form-control" id="txt_departmentlevel" placeholder="部门级别">
                     </div>
                     <div class="form-group">
                         <label for="txt_statu">描述</label>
                         <input type="text" name="txt_statu" class="form-control" id="txt_statu" placeholder="状态">
                     </div>
                 </div>
                 <div class="modal-footer">
                     <button type="button" class="btn btn-default" data-dismiss="modal"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span>关闭</button>
                     <button type="button" id="btn_submit" class="btn btn-primary" data-dismiss="modal"><span class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span>保存</button>
                 </div>
             </div>
         </div>
     </div>
</body>
</html>