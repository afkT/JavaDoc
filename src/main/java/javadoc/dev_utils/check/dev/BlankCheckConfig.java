package javadoc.dev_utils.check.dev;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * detail: 空白实现类
 * @author Ttt
 */
public class BlankCheckConfig implements ICheckConfig {

    @Override
    public Map<String, ArrayList<String>> getIgnoreAnnotateMap() {
        return new HashMap<>();
    }

    @Override
    public Map<String, ArrayList<String>> getIgnoreFinalMap() {
        return new HashMap<>();
    }

    @Override
    public Map<String, ArrayList<String>> getIgnoreStaticMap() {
        return new HashMap<>();
    }

    @Override
    public Map<String, ArrayList<String>> getIgnoreParamMap() {
        return new HashMap<>();
    }

    @Override
    public Map<String, ArrayList<String>> getIgnoreReturnMap() {
        return new HashMap<>();
    }

    @Override
    public Map<String, ArrayList<String>> getIgnoreUnPublicMap() {
        return new HashMap<>();
    }

    @Override
    public Map<String, ArrayList<String>> getIgnoreModifierVariableMap() {
        return new HashMap<>();
    }

    @Override
    public Map<String, ArrayList<String>> getIgnoreReturnVoidMap() {
        return new HashMap<>();
    }

    @Override
    public void ignoreAnnotationSpaceMap(Map<String, String> map) {
    }
}