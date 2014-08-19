package test;

import java.io.IOException;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MsgTagSimpleHandler extends SimpleTagSupport{
	public void doTag() throws IOException
	{
		JspWriter out=getJspContext().getOut();
		out.println("커스텀 태그 출력메시지: Hello!!");
	}
}
