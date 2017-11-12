<%@ page language="java" errorPage="/WEB-INF/common/exception.jsp" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ include file="/WEB-INF/common/taglibs.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<title>微信公众平台后台管理</title>
<frameset rows="90,*,30" frameborder="no" border="0" framespacing="0">
  <frame src="<c:url value='/frame/frame/head.jhtml'/>" name="topFrame" scrolling="No" noresize="noresize" id="topFrame" title="topFrame" />
  <frameset id="attachucp" framespacing="0" border="0" frameborder="no" cols="200,10,*" rows="*">
        <frame src="<c:url value='/frame/frame/leftbar.jhtml'/>" name="leftFrame" scrolling="no" noresize="noresize" id="leftFrame" />
        <frame id="leftbar" src="<c:url value='/frame/frame/switch.jhtml'/>" name="switchFrame" scrolling="No" noresize="noresize" />
        <frame id="mainFrame" src="<c:url value='/frame/frame/main.jhtml'/>" name="mainFrame" scrolling="yes" />
  </frameset>
  <frame src="<c:url value='/frame/frame/foot.jhtml'/>" name="bottomFrame" scrolling="No" noresize="noresize" id="bottomFrame" title="foot" />
</frameset>
<noframes><body>
</body>
</noframes>
<div class="footer">Copyright © 2013 广东京通资讯科技有限公司 ALl Rights Reserved.</div>