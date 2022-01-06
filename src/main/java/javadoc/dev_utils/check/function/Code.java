package javadoc.dev_utils.check.function;

final class Code {

    public Code() {
    }

    /**
     * 是否隐藏文件、文件夹判断
     * @param path 待判断文件路径
     * @return {@code true} yes, {@code false} no
     */
    public static boolean isHidden(final String path) {
        if (path != null) {
            String temp = path.replaceAll("/../..", "")
                    .replaceAll("\\...\\...", "")
                    .replaceAll("\\..\\..", "");
            // 判断是否存在特殊情况
            if (temp.contains("..")) {
                System.out.println("path replace 未彻底 : " + path);
            }
            return temp.contains("\\.") || temp.contains("/.");
        }
        return false;
    }

    /**
     * 是否 Build 文件、文件夹判断
     * @param path 待判断文件路径
     * @return {@code true} yes, {@code false} no
     */
    public static boolean isBuild(final String path) {
        if (path != null) {
            if (path.contains("\\build\\")) return true;
            return (path.contains("/build/"));
        }
        return false;
    }
}