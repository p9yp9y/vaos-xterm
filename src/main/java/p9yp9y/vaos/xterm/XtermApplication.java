package p9yp9y.vaos.xterm;

import com.vaadin.server.Resource;

import p9yp9y.vaos.VaosNodeJSApplication;

public class XtermApplication extends VaosNodeJSApplication {

	@Override
	public String getApplicationName() {
		return "xterm";
	}

	@Override
	public Resource getApplicationIcon() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getNodeJSArgument() {
		return "-p 3000";
	}

	@Override
	public String getModuleName() {
		return "wetty";
	}
}
