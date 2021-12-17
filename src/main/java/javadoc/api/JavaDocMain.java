package javadoc.api;

import com.sun.javadoc.ClassDoc;
import com.sun.javadoc.MethodDoc;
import com.sun.javadoc.RootDoc;

import javadoc.dev_utils.ApiConfig;

import java.util.Arrays;

/**
 * detail: JavaDoc 读取演示
 * @author Ttt
 */
class JavaDocMain {

    public static void main(String[] args) {
        // 文件路径
        final String path = ApiConfig.PROJECT_PATH + "/lib/DevApp/src/main/java/dev/utils/common/assist/search/";
        // 类名
        final String className = "FileBreadthFirstSearchUtils.java";
        // 执行参数
        final String[] executeParams = JavaDocReader.getExecuteParams(true, path, className);

        // 读取文档
        String javaDcoData = JavaDocReader.readDoc(new JavaDocReader.Callback() {
            @Override
            public String callback(
                    String path,
                    String className,
                    RootDoc rootDoc,
                    ClassDoc[] classDocs
            ) {
                StringBuilder builder = new StringBuilder();
                builder.append("\n\n");
                builder.append("\n===============");
                builder.append("\n= 读取 JavaDoc =");
                builder.append("\n===============");
                builder.append("\n");
                // 拼接信息
                builder.append("\n文件路径: ").append(path + className)
                        .append("\n文件名字: ").append(className)
                        .append("\n执行参数: ").append(Arrays.toString(executeParams));

                if (classDocs != null) {
                    StringBuilder classBuilder = new StringBuilder();
                    // 循环 Class Doc 信息
                    for (ClassDoc classDoc : classDocs) {
                        classBuilder.append("\n\n");
                        classBuilder.append("\n= " + classDoc.name() + " =\n");
                        // 包名.类名
                        classBuilder.append("\n包名.类名: ").append(classDoc.toString());
                        // 类注释
                        classBuilder.append("\n类注释: ").append(classDoc.commentText());

                        // ==========
                        // = 读取方法 =
                        // ==========

                        StringBuilder methodBuilder = new StringBuilder();
                        // 获取方法 Doc 信息数组
                        MethodDoc[] methodDocs = classDoc.methods();
                        // 防止不存在方法
                        if (methodDocs.length != 0) {
                            methodBuilder.append("\n\n| 方法信息 |");
                        }
                        // 循环读取方法信息
                        for (MethodDoc methodDoc : methodDocs) {
                            methodBuilder.append("\n");
                            // 方法名
                            methodBuilder.append("\n方法名: " + methodDoc.name());
                            // 方法注释
                            methodBuilder.append("\n方法注释: " + methodDoc.commentText());
                        }
                        // 保存方法信息
                        classBuilder.append(methodBuilder);
                    }
                    // 保存类信息
                    builder.append(classBuilder);
                }

                builder.append("\n\n");
                builder.append("\n===================");
                builder.append("\n= 读取 JavaDoc 结束 =");
                builder.append("\n===================");
                builder.append("\n");

                // 返回文档信息
                return builder.toString();
            }

            @Override
            public void error(Exception e) {
                System.out.println(e);
            }
        }, path, className, executeParams);

        // 打印文档信息
        System.out.println(javaDcoData);
    }
}