package cn.uc.yiqibang.utils;
//������ķ�װ������

public class Result {
   //��Ӧ��
   private int retCode;
   
   //��Ӧ���
   private boolean retMsg;
   
   //��Ӧ����
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
