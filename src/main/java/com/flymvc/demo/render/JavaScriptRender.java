package com.flymvc.demo.render;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.flymvc.render.Render;

/**
 * JavaScriptRender
 * 
 * @author jameszhou
 *
 */
public class JavaScriptRender implements Render {

	@Override
	public void render(HttpServletRequest request, HttpServletResponse response, String view) {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charSet=utf-8");
		PrintWriter writer;
		StringBuffer sb = new StringBuffer();
		try {
			writer = response.getWriter();
			sb.append("<script>");
			sb.append("alert(\""+view+"\");");
			sb.append("</script>");
			writer.print(sb.toString());
			writer.flush();
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
