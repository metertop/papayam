package com.palfish.framework.command;

import com.palfish.framework.core.DriverManagerFactory;
import com.palfish.framework.utils.ClickUtil;

public class LongPressCommand implements Command {
    private String arg;

    public LongPressCommand(String arg) {
        this.arg = arg;
    }

    public void execute() {
        String[] str = arg.split(",");
        if(str.length == 3) {
            new ClickUtil().longPressByAbsolute(DriverManagerFactory.getInstance().getDriverManager().getRunningDriver(),Integer.valueOf(str[0]),Integer.valueOf(str[1]),Integer.valueOf(str[2]));
        }
    }
}
