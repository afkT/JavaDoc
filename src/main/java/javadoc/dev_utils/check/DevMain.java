package javadoc.dev_utils.check;

import javadoc.dev_utils.check.dev_app.DevAppMain;
import javadoc.dev_utils.check.dev_assist.DevAssistMain;
import javadoc.dev_utils.check.dev_base.DevBaseMain;
import javadoc.dev_utils.check.dev_basemvvm.DevBaseMVVMMain;
import javadoc.dev_utils.check.dev_other.DevOtherMain;
import javadoc.dev_utils.check.dev_standard.DevStandardMain;
import javadoc.dev_utils.check.dev_widget.DevWidgetMain;

/**
 * detail: 统一检测 Dev 模块
 * @author Ttt
 */
public class DevMain {

    public static void main(String[] args) {

        boolean coverText = false;
        boolean generateConfig = true;

        DevAppMain.main(new String[]{coverText + "", generateConfig + ""});
        DevAssistMain.main(new String[]{coverText + "", generateConfig + ""});
        DevBaseMain.main(new String[]{coverText + "", generateConfig + ""});
        DevBaseMVVMMain.main(new String[]{coverText + "", generateConfig + ""});
        DevOtherMain.main(new String[]{coverText + "", generateConfig + ""});
        DevStandardMain.main(new String[]{coverText + "", generateConfig + ""});
        DevWidgetMain.main(new String[]{coverText + "", generateConfig + ""});
    }
}