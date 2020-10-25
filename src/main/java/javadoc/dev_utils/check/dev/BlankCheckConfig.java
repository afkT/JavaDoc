package javadoc.dev_utils.check.dev;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * detail: 空白实现类
 * @author Ttt
 */
public class BlankCheckConfig implements ICheckConfig {

    @Override
    public Map<String, List<String>> getIgnoreAnnotateMap() {
        return new HashMap<>();
    }

    @Override
    public Map<String, List<String>> getIgnoreFinalMap() {
        return new HashMap<>();
    }

    @Override
    public Map<String, List<String>> getIgnoreStaticMap() {
        return new HashMap<>();
    }

    @Override
    public Map<String, List<String>> getIgnoreParamMap() {
        return new HashMap<>();
    }

    @Override
    public Map<String, List<String>> getIgnoreReturnMap() {
        return new HashMap<>();
    }

    @Override
    public Map<String, List<String>> getIgnoreUnPublicMap() {
        return new HashMap<>();
    }

    @Override
    public Map<String, List<String>> getIgnoreModifierVariableMap() {
        return new HashMap<>();
    }

    @Override
    public Map<String, List<String>> getIgnoreReturnVoidMap() {
        return new HashMap<>();
    }

    @Override
    public void ignoreAnnotationSpaceMap(Map<String, String> map) {
    }
}