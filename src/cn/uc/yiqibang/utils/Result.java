package cn.uc.yiqibang.utils;
//结果集的封装工具类

public class Result {
   //响应码
   private int retCode;
   
   //响应结果
   private boolean retMsg;
   
   //响应数据
   private Object retData;
public int getRetCode() {
	return retCode;
}
public void setRetCode(int retCode) {
	this.retCode = retCode;
}
public boolean isRetMsg() {
	return retMsg;
}
public void setRetMsg(boolean retMsg) {
	this.retMsg = retMsg;
}
public Object getRetData() {
	return retData;
}
public void setRetData(Object retData) {
	this.retData = retData;
}
   
}
