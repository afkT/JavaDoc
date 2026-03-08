package other;

import java.util.LinkedHashSet;

import dev.utils.DevFinal;

/**
 * detail: IntentData 类创建
 *
 * @author Ttt
 * <pre>
 *     生成 Intent 传参读写辅助类快捷方法
 * </pre>
 */
public class StateIntLiveDataGenerateMain {

    // 方法字符串
    private static final String METHOD_STR;

    static {
        StringBuilder builder = new StringBuilder();
        builder.append("\n    // XXX");
        builder.append("\n    open fun isXXXState(): Boolean = isEqual(StateInt.XXX)");
        builder.append("\n    open fun setXXX(): Boolean = setPayload(StateInt.XXX)");
        builder.append("\n    open fun postXXX(): Boolean = postPayload(StateInt.XXX)");
        builder.append("\n    open fun smartUpdateXXX(): Boolean = smartUpdatePayload(StateInt.XXX)");
        METHOD_STR = builder.toString();
    }

    public static void main(String[] args) {
        LinkedHashSet<String> keys = new LinkedHashSet<>();


        // 默认状态
        keys.add("NORMAL");

        // 操作中
        keys.add("ING");

        // 操作成功
        keys.add("SUCCESS");

        // 操作失败
        keys.add("FAIL");

        // 操作异常
        keys.add("ERROR");

        // 开始操作
        keys.add("START");

        // 重新开始操作
        keys.add("RESTART");

        // 操作结束
        keys.add("END");

        // 操作暂停
        keys.add("PAUSE");

        // 操作恢复 ( 继续 )
        keys.add("RESUME");

        // 操作停止
        keys.add("STOP");

        // 操作取消
        keys.add("CANCEL");

        // 创建
        keys.add("CREATE");

        // 销毁
        keys.add("DESTROY");

        // 回收
        keys.add("RECYCLE");

        // 初始化
        keys.add("INIT");

        // 已打开
        keys.add("ENABLED");

        // 正在打开
        keys.add("ENABLING");

        // 已关闭
        keys.add("DISABLED");

        // 正在关闭
        keys.add("DISABLING");

        // 连接成功
        keys.add("CONNECTED");

        // 连接中
        keys.add("CONNECTING");

        // 连接失败、断开
        keys.add("DISCONNECTED");

        // 暂停、延迟
        keys.add("SUSPENDED");

        // 未知
        keys.add("UNKNOWN");

        // 新增
        keys.add("INSERT");

        // 删除
        keys.add("DELETE");

        // 更新
        keys.add("UPDATE");

        // 查询
        keys.add("SELECT");

        // 加密
        keys.add("ENCRYPT");

        // 解密
        keys.add("DECRYPT");

        // 重置
        keys.add("RESET");

        // 关闭
        keys.add("CLOSE");

        // 打开
        keys.add("OPEN");

        // 退出
        keys.add("EXIT");

        // 下一步
        keys.add("NEXT");

        // 无任何
        keys.add("NONE");

        // 结束
        keys.add("FINISH");

        // 等待中
        keys.add("WAITING");

        // 完成
        keys.add("COMPLETE");

        // ==========
        // = 开始拼接 =
        // ==========

        StringBuilder builder = new StringBuilder();
        for (String name : keys) {
            // 方法字符串【格式化后】
            String methodFormat = METHOD_STR.replaceAll(
                    "XXX", name
            );
            builder.append(DevFinal.SYMBOL.NEW_LINE)
                    .append(methodFormat);
        }
        // 最终内容
        String content = builder.toString();

        String debug = "";
    }
}