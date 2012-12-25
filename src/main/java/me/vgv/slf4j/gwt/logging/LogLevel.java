package me.vgv.slf4j.gwt.logging;

/**
 * @author Vasily Vasilkov (vgv@vgv.me)
 */
enum LogLevel {

	INFO {
		@Override
		public native void writeMessage(String msg) /*-{
			if ($wnd.console != undefined) {
				$wnd.console.info(msg);
			}
		}-*/;
	},

	WARNING {
		@Override
		public native void writeMessage(String msg)/*-{
			if ($wnd.console != undefined) {
				$wnd.console.warn(msg);
			}
		}-*/;
	},

	ERROR {
		@Override
		public native void writeMessage(String msg)/*-{
			if ($wnd.console != undefined) {
				$wnd.console.error(msg);
			}
		}-*/;
	};

	public abstract void writeMessage(String msg);

}
