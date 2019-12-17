package javadoc.dev_utils.check.dev_widget;

import javadoc.Utils;
import javadoc.dev_utils.check.dev.ICheckConfig;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * detail: 代码检测分析配置
 * @author Ttt
 */
final class DevWidgetConfig implements ICheckConfig {

    /**
     * 获取忽略指定方法注释配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, ArrayList<String>> getIgnoreAnnotateMap() {
        // 忽略配置
        Map<String, ArrayList<String>> ignoreAnnotateMap = new HashMap<>();
        ignoreAnnotateMap.put("AdjustHeightGridView", Utils.asList("onMeasure"));
        ignoreAnnotateMap.put("AdjustHeightListView", Utils.asList("onMeasure"));
        ignoreAnnotateMap.put("AdjustHeightRecyclerView", Utils.asList("onMeasure"));
        ignoreAnnotateMap.put("AdjustHeightWebView", Utils.asList("onMeasure"));
        ignoreAnnotateMap.put("ControlSlideGallery", Utils.asList("onFling","onTouchEvent"));
        ignoreAnnotateMap.put("ControlSlideViewPager", Utils.asList("onTouchEvent","onInterceptTouchEvent"));
        ignoreAnnotateMap.put("ControlSlideViewPager.OnDirectionListener", Utils.asList("onPageScrolled","onPageScrollStateChanged"));
        ignoreAnnotateMap.put("CustomHorizontalScrollView", Utils.asList("onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent"));
        ignoreAnnotateMap.put("CustomNestedScrollView", Utils.asList("onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent"));
        ignoreAnnotateMap.put("CustomProgressBar", Utils.asList("onDraw"));
        ignoreAnnotateMap.put("CustomRecyclerView", Utils.asList("onScrolled","onScrollStateChanged","onTouchEvent","onInterceptTouchEvent"));
        ignoreAnnotateMap.put("CustomScrollView", Utils.asList("onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent"));
        ignoreAnnotateMap.put("CustomWebView", Utils.asList("onScrollChanged","onTouchEvent","onInterceptTouchEvent"));
        ignoreAnnotateMap.put("LineTextView", Utils.asList("onMeasure","onDraw"));
        ignoreAnnotateMap.put("MaxHeightScrollView", Utils.asList("onMeasure"));
        ignoreAnnotateMap.put("RightClearEditText", Utils.asList("setCompoundDrawables","onTouchEvent","finalize"));
        ignoreAnnotateMap.put("ScanShapeView", Utils.asList("onDraw"));
        ignoreAnnotateMap.put("ScanShapeView.CornerEffect", Utils.asList("getRadius"));
        ignoreAnnotateMap.put("SignView", Utils.asList("onDraw","onTouchEvent"));
        ignoreAnnotateMap.put("WrapView", Utils.asList("onMeasure","onLayout"));
        return ignoreAnnotateMap;
    }

    /**
     * 获取忽略指定方法参数 final 修饰符配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, ArrayList<String>> getIgnoreFinalMap() {
        // 忽略配置
        Map<String, ArrayList<String>> ignoreFinalMap = new HashMap<>();
        ignoreFinalMap.put("AdjustHeightGridView", Utils.asList("onMeasure"));
        ignoreFinalMap.put("AdjustHeightListView", Utils.asList("onMeasure"));
        ignoreFinalMap.put("AdjustHeightRecyclerView", Utils.asList("onMeasure"));
        ignoreFinalMap.put("AdjustHeightWebView", Utils.asList("onMeasure"));
        ignoreFinalMap.put("ControlSlideGallery", Utils.asList("onFling","onTouchEvent","isScrollingLeft","setSlide"));
        ignoreFinalMap.put("ControlSlideViewPager", Utils.asList("onTouchEvent","onInterceptTouchEvent","setSlide"));
        ignoreFinalMap.put("CustomHorizontalScrollView", Utils.asList("onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent","setSlide","setSlideListener","setScrollCallBack"));
        ignoreFinalMap.put("CustomNestedScrollView", Utils.asList("onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent","setSlide","setSlideListener","setScrollCallBack"));
        ignoreFinalMap.put("CustomProgressBar", Utils.asList("onDraw","drawProgressText","drawProgressText","calcTextSizeToWidth","setMax","setProgress","setProgressStyle","setProgressColor","setOuterRingColor","setInsideCircleWidth","setOuterRingWidth","setCanvasNumber","setNumberTextSize","setNumberTextColor"));
        ignoreFinalMap.put("CustomRecyclerView", Utils.asList("onScrolled","onScrollStateChanged","onTouchEvent","onInterceptTouchEvent","setSlide","setSlideListener","setScrollCallBack"));
        ignoreFinalMap.put("CustomScrollView", Utils.asList("onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent","setSlide","setSlideListener","setScrollCallBack"));
        ignoreFinalMap.put("CustomWebView", Utils.asList("onScrollChanged","onTouchEvent","onInterceptTouchEvent","setSlide","setSlideListener","setScrollCallBack"));
        ignoreFinalMap.put("LineTextView", Utils.asList("onMeasure","onDraw","setNewLineCallBack"));
        ignoreFinalMap.put("MaxHeightScrollView", Utils.asList("onMeasure","setMaxHeight"));
        ignoreFinalMap.put("RightClearEditText", Utils.asList("setCompoundDrawables","onTouchEvent","setDrawRightIcon","setRightDrawable","setTextWatcher","beforeTextChanged","onTextChanged","afterTextChanged"));
        ignoreFinalMap.put("ScanShapeView", Utils.asList("onDraw","setShapeType","setCornerEffect","setRegion","setRegion","setRegion","getRegion","setBorderMargin","setBorderColor","setBorderWidth","setDrawBorder","setDrawBackground","setBGColor","setDrawAnim","setAutoAnim","setBorderToSquare","setBorderWidthToSquare","setTriAngleLength","setSpecialToSquare","setLineDurationToSquare","setBitmapToSquare","setLineMarginTopToSquare","setLineMarginLeftToSquare","setLineColorToSquare","setLineWidthToHexagon","setLineMarginToHexagon","setLineAnimDirection","setLineColorToHexagon","setBitmapToAnnulus","setLineColorToAnnulus","setLineOffsetSpeedToAnnulus","setAnnulusDraws","setAnnulusColors","setAnnulusLengths","setAnnulusWidths","setAnnulusMargins","sin","calcShapeRegion","makeShape","makeBackground","makeAnim","drawAnim","resetAnim","animSwitch"));
        ignoreFinalMap.put("SignView", Utils.asList("onDraw","onTouchEvent","setPaint"));
        ignoreFinalMap.put("StateLayout", Utils.asList("setSize","setType","setState","setState","toggleStateView","getView","insert","insert","remove","setOnStateChanged","setBuilder","insertView","insertView","removeView"));
        ignoreFinalMap.put("StateLayout.GlobalBuilder", Utils.asList("insert","insert","remove"));
        ignoreFinalMap.put("StateLayout.State", Utils.asList("getState"));
        ignoreFinalMap.put("WrapView", Utils.asList("onMeasure","onLayout","setMaxLine","setRowTopMargin","setViewLeftMargin","setRowFristLeftMargin","setRowViewMargin"));
        return ignoreFinalMap;
    }

    /**
     * 获取忽略指定方法 static 修饰符配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, ArrayList<String>> getIgnoreStaticMap() {
        // 忽略配置
        Map<String, ArrayList<String>> ignoreStaticMap = new HashMap<>();
        ignoreStaticMap.put("AdjustHeightGridView", Utils.asList("onMeasure"));
        ignoreStaticMap.put("AdjustHeightListView", Utils.asList("onMeasure"));
        ignoreStaticMap.put("AdjustHeightRecyclerView", Utils.asList("onMeasure"));
        ignoreStaticMap.put("AdjustHeightWebView", Utils.asList("onMeasure"));
        ignoreStaticMap.put("ControlSlideGallery", Utils.asList("onFling","onTouchEvent","isScrollingLeft","isSlide","setSlide","toggleSlide"));
        ignoreStaticMap.put("ControlSlideViewPager", Utils.asList("onTouchEvent","onInterceptTouchEvent","isSlide","setSlide","toggleSlide"));
        ignoreStaticMap.put("CustomHorizontalScrollView", Utils.asList("onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent","isSlide","setSlide","toggleSlide","isSlideListener","setSlideListener","setScrollCallBack"));
        ignoreStaticMap.put("CustomNestedScrollView", Utils.asList("onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent","isSlide","setSlide","toggleSlide","isSlideListener","setSlideListener","setScrollCallBack"));
        ignoreStaticMap.put("CustomProgressBar", Utils.asList("init","onDraw","drawProgressText","drawProgressText","calcTextSizeToWidth","reset","getMax","setMax","getProgress","setProgress","getProgressStyle","setProgressStyle","getProgressColor","setProgressColor","getOuterRingColor","setOuterRingColor","getInsideCircleWidth","setInsideCircleWidth","getOuterRingWidth","setOuterRingWidth","isCanvasNumber","setCanvasNumber","getNumberTextSize","setNumberTextSize","getNumberTextColor","setNumberTextColor"));
        ignoreStaticMap.put("CustomRecyclerView", Utils.asList("onScrolled","onScrollStateChanged","onTouchEvent","onInterceptTouchEvent","isSlide","setSlide","toggleSlide","isSlideListener","setSlideListener","setScrollCallBack"));
        ignoreStaticMap.put("CustomScrollView", Utils.asList("onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent","isSlide","setSlide","toggleSlide","isSlideListener","setSlideListener","setScrollCallBack"));
        ignoreStaticMap.put("CustomWebView", Utils.asList("onScrollChanged","onTouchEvent","onInterceptTouchEvent","isSlide","setSlide","toggleSlide","isSlideListener","setSlideListener","setScrollCallBack"));
        ignoreStaticMap.put("LineTextView", Utils.asList("onMeasure","onDraw","isNewLine","setNewLineCallBack"));
        ignoreStaticMap.put("MaxHeightScrollView", Utils.asList("onMeasure","getMaxHeight","setMaxHeight"));
        ignoreStaticMap.put("RightClearEditText", Utils.asList("init","drawableOperate","setCompoundDrawables","onTouchEvent","finalize","isDrawRightIcon","setDrawRightIcon","setRightDrawable","setTextWatcher","beforeTextChanged","onTextChanged","afterTextChanged"));
        ignoreStaticMap.put("ScanShapeView", Utils.asList("init","handlerCornerPathEffect","onDraw","destroy","getShapeType","setShapeType","getCornerRadius","setCornerEffect","setRegion","setRegion","setRegion","getRegionLeft","getRegionTop","getRegionWidth","getRegionHeight","getRegion","getRegion","getRegionParent","getBorderMargin","setBorderMargin","getBorderColor","setBorderColor","getBorderWidth","setBorderWidth","isDrawBorder","setDrawBorder","isDrawBackground","setDrawBackground","getBGColor","setBGColor","isDrawAnim","setDrawAnim","isAutoAnim","setAutoAnim","getBorderToSquare","setBorderToSquare","getBorderWidthToSquare","setBorderWidthToSquare","getTriAngleLength","setTriAngleLength","isSpecialToSquare","setSpecialToSquare","getLineDurationToSquare","setLineDurationToSquare","getBitmapToSquare","setBitmapToSquare","getLineMarginTopToSquare","setLineMarginTopToSquare","getLineMarginLeftToSquare","setLineMarginLeftToSquare","getLineColorToSquare","setLineColorToSquare","getLineWidthToHexagon","setLineWidthToHexagon","getLineMarginToHexagon","setLineMarginToHexagon","isLineAnimDirection","setLineAnimDirection","getLineColorToHexagon","setLineColorToHexagon","getBitmapToAnnulus","setBitmapToAnnulus","getLineColorToAnnulus","setLineColorToAnnulus","getLineOffsetSpeedToAnnulus","setLineOffsetSpeedToAnnulus","getAnnulusDraws","setAnnulusDraws","getAnnulusColors","setAnnulusColors","getAnnulusLengths","setAnnulusLengths","getAnnulusWidths","setAnnulusWidths","getAnnulusMargins","setAnnulusMargins","refPaintToAnnulus","sin","getRegionMarginLeft","getRegionMarginTop","calcShapeRegion","calcShapeRegion","makeShape","makeBackground","makeAnim","drawAnim","resetAnim","startAnim","stopAnim","animSwitch","isAnimRunning","refLineColorToSquare","refLineColorToHexagon","refLineColorToAnnulus","initAnim"));
        ignoreStaticMap.put("ScanShapeView.CornerEffect", Utils.asList("getRadius"));
        ignoreStaticMap.put("SignView", Utils.asList("onDraw","onTouchEvent","setPaint"));
        ignoreStaticMap.put("StateLayout", Utils.asList("getSize","setSize","getType","setType","getState","setState","setState","toggleStateView","getView","insert","insert","remove","getStateChanged","setOnStateChanged","reset","init","insertView","insertView","removeView"));
        ignoreStaticMap.put("StateLayout.GlobalBuilder", Utils.asList("insert","insert","remove"));
        ignoreStaticMap.put("StateLayout.State", Utils.asList("getValue"));
        ignoreStaticMap.put("WrapView", Utils.asList("onMeasure","onLayout","calc","refreshDraw","getRowLine","getMaxLine","setMaxLine","setRowTopMargin","setViewLeftMargin","setRowFristLeftMargin","setRowViewMargin"));
        return ignoreStaticMap;
    }

    /**
     * 获取忽略指定方法 @param 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, ArrayList<String>> getIgnoreParamMap() {
        // 忽略配置
        Map<String, ArrayList<String>> ignoreParamMap = new HashMap<>();
        ignoreParamMap.put("AdjustHeightGridView", Utils.asList("onMeasure"));
        ignoreParamMap.put("AdjustHeightListView", Utils.asList("onMeasure"));
        ignoreParamMap.put("AdjustHeightRecyclerView", Utils.asList("onMeasure"));
        ignoreParamMap.put("AdjustHeightWebView", Utils.asList("onMeasure"));
        ignoreParamMap.put("ControlSlideGallery", Utils.asList("onFling","onTouchEvent"));
        ignoreParamMap.put("ControlSlideViewPager", Utils.asList("onTouchEvent","onInterceptTouchEvent"));
        ignoreParamMap.put("ControlSlideViewPager.OnDirectionListener", Utils.asList("onPageScrolled","onPageScrollStateChanged"));
        ignoreParamMap.put("CustomHorizontalScrollView", Utils.asList("onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent"));
        ignoreParamMap.put("CustomNestedScrollView", Utils.asList("onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent"));
        ignoreParamMap.put("CustomProgressBar", Utils.asList("onDraw"));
        ignoreParamMap.put("CustomRecyclerView", Utils.asList("onScrolled","onScrollStateChanged","onTouchEvent","onInterceptTouchEvent"));
        ignoreParamMap.put("CustomScrollView", Utils.asList("onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent"));
        ignoreParamMap.put("CustomWebView", Utils.asList("onScrollChanged","onTouchEvent","onInterceptTouchEvent"));
        ignoreParamMap.put("LineTextView", Utils.asList("onMeasure","onDraw"));
        ignoreParamMap.put("MaxHeightScrollView", Utils.asList("onMeasure"));
        ignoreParamMap.put("RightClearEditText", Utils.asList("setCompoundDrawables","onTouchEvent"));
        ignoreParamMap.put("ScanShapeView", Utils.asList("onDraw"));
        ignoreParamMap.put("SignView", Utils.asList("onDraw","onTouchEvent"));
        ignoreParamMap.put("WrapView", Utils.asList("onMeasure","onLayout"));
        return ignoreParamMap;
    }

    /**
     * 获取忽略指定方法 @return 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, ArrayList<String>> getIgnoreReturnMap() {
        // 忽略配置
        Map<String, ArrayList<String>> ignoreReturnMap = new HashMap<>();
        return ignoreReturnMap;
    }

    /**
     * 获取忽略指定方法非 public 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, ArrayList<String>> getIgnoreUnPublicMap() {
        // 忽略配置
        Map<String, ArrayList<String>> ignoreUnPublicMap = new HashMap<>();
        ignoreUnPublicMap.put("AdjustHeightGridView", Utils.asList("onMeasure"));
        ignoreUnPublicMap.put("AdjustHeightListView", Utils.asList("onMeasure"));
        ignoreUnPublicMap.put("AdjustHeightRecyclerView", Utils.asList("onMeasure"));
        ignoreUnPublicMap.put("AdjustHeightWebView", Utils.asList("onMeasure"));
        ignoreUnPublicMap.put("ControlSlideGallery", Utils.asList("isScrollingLeft"));
        ignoreUnPublicMap.put("CustomHorizontalScrollView", Utils.asList("onScrollChanged","computeScrollDeltaToGetChildRectOnScreen"));
        ignoreUnPublicMap.put("CustomHorizontalScrollView.ScrollCallBack", Utils.asList("onScrollChanged"));
        ignoreUnPublicMap.put("CustomNestedScrollView", Utils.asList("onScrollChanged","computeScrollDeltaToGetChildRectOnScreen"));
        ignoreUnPublicMap.put("CustomNestedScrollView.ScrollCallBack", Utils.asList("onScrollChanged"));
        ignoreUnPublicMap.put("CustomProgressBar", Utils.asList("init","onDraw","drawProgressText","drawProgressText","calcTextSizeToWidth"));
        ignoreUnPublicMap.put("CustomRecyclerView.ScrollCallBack", Utils.asList("onScrollStateChanged","onScrollChanged"));
        ignoreUnPublicMap.put("CustomScrollView", Utils.asList("onScrollChanged","computeScrollDeltaToGetChildRectOnScreen"));
        ignoreUnPublicMap.put("CustomScrollView.ScrollCallBack", Utils.asList("onScrollChanged"));
        ignoreUnPublicMap.put("CustomWebView", Utils.asList("onScrollChanged"));
        ignoreUnPublicMap.put("CustomWebView.ScrollCallBack", Utils.asList("onScrollChanged"));
        ignoreUnPublicMap.put("LineTextView", Utils.asList("onMeasure","onDraw"));
        ignoreUnPublicMap.put("LineTextView.OnNewLineCallBack", Utils.asList("onNewLine"));
        ignoreUnPublicMap.put("MaxHeightScrollView", Utils.asList("onMeasure"));
        ignoreUnPublicMap.put("RightClearEditText", Utils.asList("init","drawableOperate","finalize"));
        ignoreUnPublicMap.put("ScanShapeView", Utils.asList("init","handlerCornerPathEffect","onDraw","refPaintToAnnulus","sin","getRegionMarginLeft","getRegionMarginTop","calcShapeRegion","calcShapeRegion","makeShape","makeBackground","makeAnim","drawAnim","resetAnim","animSwitch","refLineColorToSquare","refLineColorToHexagon","refLineColorToAnnulus","initAnim"));
        ignoreUnPublicMap.put("SignView", Utils.asList("onDraw"));
        ignoreUnPublicMap.put("StateLayout", Utils.asList("init","insertView","insertView","removeView"));
        ignoreUnPublicMap.put("StateLayout.OnStateChanged", Utils.asList("OnChanged"));
        ignoreUnPublicMap.put("WrapView", Utils.asList("onMeasure","onLayout","calc"));
        return ignoreUnPublicMap;
    }

    /**
     * 获取忽略无修饰符变量处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, ArrayList<String>> getIgnoreModifierVariableMap() {
        // 忽略配置
        Map<String, ArrayList<String>> ignoreModifierVariableMap = new HashMap<>();
        ignoreModifierVariableMap.put("StateLayout", Utils.asList("        int value;"));
        ignoreModifierVariableMap.put("StateLayout.State", Utils.asList("    int value;"));
        return ignoreModifierVariableMap;
    }

    /**
     * 获取忽略指定方法 return void 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, ArrayList<String>> getIgnoreReturnVoidMap() {
        // 忽略配置
        Map<String, ArrayList<String>> ignoreReturnVoidMap = new HashMap<>();
        return ignoreReturnVoidMap;
    }

    /**
     * 忽略注释间距异常文件
     * @param map {@link HashMap}
     */
    @Override
    public void ignoreAnnotationSpaceMap(Map<String, String> map) {
    }
}