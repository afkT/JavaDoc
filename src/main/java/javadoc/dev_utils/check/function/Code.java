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
//                    .replaceAll("\\..\\..", "")
                    ;
            return temp.contains("\\.");
        }
        return false;
    }
}