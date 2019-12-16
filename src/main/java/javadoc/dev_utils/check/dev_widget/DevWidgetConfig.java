package javadoc.dev_utils.check.dev_widget;

import javadoc.Utils;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * detail: 代码检测分析配置
 * @author Ttt
 */
final class DevWidgetConfig {

    private DevWidgetConfig() {
    }

    // 忽略指定方法 @param 处理
    protected static final HashMap<String, ArrayList<String>> sIgnoreAnnotateMap = new HashMap<>();
    // 忽略指定方法参数 final 修饰符
    protected static final HashMap<String, ArrayList<String>> sIgnoreFinalMap = new HashMap<>();
    // 忽略指定方法 static 修饰符
    protected static final HashMap<String, ArrayList<String>> sIgnoreStaticMap = new HashMap<>();
    // 忽略指定方法 @param 处理
    protected static final HashMap<String, ArrayList<String>> sIgnoreParamMap = new HashMap<>();
    // 忽略指定方法 @return 处理
    protected static final HashMap<String, ArrayList<String>> sIgnoreReturnMap = new HashMap<>();
    // 忽略指定方法非 public 处理
    protected static final HashMap<String, ArrayList<String>> sIgnoreUnPublicMap = new HashMap<>();
    // 忽略无修饰符变量 处理
    protected static final HashMap<String, ArrayList<String>> sIgnoreModifierVariableMap = new HashMap<>();
    // 忽略指定方法 return void 处理
    protected static final HashMap<String, ArrayList<String>> sIgnoreReturnVoidMap = new HashMap<>();

    // ==========
    // = 初始化 =
    // ==========

    static {
        // 初始化 忽略指定方法注释处理
        initIgnoreAnnotateMap();
        // 初始化 忽略指定方法参数 final 修饰符
        initIgnoreFinalMap();
        // 初始化 忽略指定方法 static 修饰符
        initIgnoreStaticMap();
        // 初始化 忽略指定方法 @param 处理
        initIgnoreParamMap();
        // 初始化 忽略指定方法 @return 处理
        initIgnoreReturnMap();
        // 初始化 忽略指定方法非 public 处理
        initIgnoreUnPublicMap();
        // 初始化 忽略无修饰符变量 处理
        initIgnoreModifierVariableMap();
        // 初始化 忽略指定方法 return void 处理
        initIgnoreReturnVoidMap();
    }

    /**
     * 初始化 忽略指定方法注释处理
     */
    private static void initIgnoreAnnotateMap() {
        sIgnoreAnnotateMap.put("AdjustHeightGridView", Utils.asList("onMeasure"));
        sIgnoreAnnotateMap.put("AdjustHeightListView", Utils.asList("onMeasure"));
        sIgnoreAnnotateMap.put("AdjustHeightRecyclerView", Utils.asList("onMeasure"));
        sIgnoreAnnotateMap.put("AdjustHeightWebView", Utils.asList("onMeasure"));
        sIgnoreAnnotateMap.put("ControlSlideGallery", Utils.asList("onFling","onTouchEvent"));
        sIgnoreAnnotateMap.put("ControlSlideViewPager", Utils.asList("onTouchEvent","onInterceptTouchEvent"));
        sIgnoreAnnotateMap.put("ControlSlideViewPager.OnDirectionListener", Utils.asList("onPageScrolled","onPageScrollStateChanged"));
        sIgnoreAnnotateMap.put("CustomHorizontalScrollView", Utils.asList("onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent"));
        sIgnoreAnnotateMap.put("CustomNestedScrollView", Utils.asList("onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent"));
        sIgnoreAnnotateMap.put("CustomProgressBar", Utils.asList("onDraw"));
        sIgnoreAnnotateMap.put("CustomRecyclerView", Utils.asList("onScrolled","onScrollStateChanged","onTouchEvent","onInterceptTouchEvent"));
        sIgnoreAnnotateMap.put("CustomScrollView", Utils.asList("onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent"));
        sIgnoreAnnotateMap.put("CustomWebView", Utils.asList("onScrollChanged","onTouchEvent","onInterceptTouchEvent"));
        sIgnoreAnnotateMap.put("LineTextView", Utils.asList("onMeasure","onDraw"));
        sIgnoreAnnotateMap.put("MaxHeightScrollView", Utils.asList("onMeasure"));
        sIgnoreAnnotateMap.put("RightClearEditText", Utils.asList("setCompoundDrawables","onTouchEvent","finalize"));
        sIgnoreAnnotateMap.put("ScanShapeView", Utils.asList("onDraw"));
        sIgnoreAnnotateMap.put("ScanShapeView.CornerEffect", Utils.asList("getRadius"));
        sIgnoreAnnotateMap.put("SignView", Utils.asList("onDraw","onTouchEvent"));
        sIgnoreAnnotateMap.put("WrapView", Utils.asList("onMeasure","onLayout"));
    }

    /**
     * 初始化 忽略指定方法参数 final 修饰符
     */
    private static void initIgnoreFinalMap() {
        sIgnoreFinalMap.put("AdjustHeightGridView", Utils.asList("onMeasure"));
        sIgnoreFinalMap.put("AdjustHeightListView", Utils.asList("onMeasure"));
        sIgnoreFinalMap.put("AdjustHeightRecyclerView", Utils.asList("onMeasure"));
        sIgnoreFinalMap.put("AdjustHeightWebView", Utils.asList("onMeasure"));
        sIgnoreFinalMap.put("ControlSlideGallery", Utils.asList("onFling","onTouchEvent","isScrollingLeft","setSlide"));
        sIgnoreFinalMap.put("ControlSlideViewPager", Utils.asList("onTouchEvent","onInterceptTouchEvent","setSlide"));
        sIgnoreFinalMap.put("CustomHorizontalScrollView", Utils.asList("onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent","setSlide","setSlideListener","setScrollCallBack"));
        sIgnoreFinalMap.put("CustomNestedScrollView", Utils.asList("onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent","setSlide","setSlideListener","setScrollCallBack"));
        sIgnoreFinalMap.put("CustomProgressBar", Utils.asList("onDraw","drawProgressText","drawProgressText","calcTextSizeToWidth","setMax","setProgress","setProgressStyle","setProgressColor","setOuterRingColor","setInsideCircleWidth","setOuterRingWidth","setCanvasNumber","setNumberTextSize","setNumberTextColor"));
        sIgnoreFinalMap.put("CustomRecyclerView", Utils.asList("onScrolled","onScrollStateChanged","onTouchEvent","onInterceptTouchEvent","setSlide","setSlideListener","setScrollCallBack"));
        sIgnoreFinalMap.put("CustomScrollView", Utils.asList("onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent","setSlide","setSlideListener","setScrollCallBack"));
        sIgnoreFinalMap.put("CustomWebView", Utils.asList("onScrollChanged","onTouchEvent","onInterceptTouchEvent","setSlide","setSlideListener","setScrollCallBack"));
        sIgnoreFinalMap.put("LineTextView", Utils.asList("onMeasure","onDraw","setNewLineCallBack"));
        sIgnoreFinalMap.put("MaxHeightScrollView", Utils.asList("onMeasure","setMaxHeight"));
        sIgnoreFinalMap.put("RightClearEditText", Utils.asList("setCompoundDrawables","onTouchEvent","setDrawRightIcon","setRightDrawable","setTextWatcher","beforeTextChanged","onTextChanged","afterTextChanged"));
        sIgnoreFinalMap.put("ScanShapeView", Utils.asList("onDraw","setShapeType","setCornerEffect","setRegion","setRegion","setRegion","getRegion","setBorderMargin","setBorderColor","setBorderWidth","setDrawBorder","setDrawBackground","setBGColor","setDrawAnim","setAutoAnim","setBorderToSquare","setBorderWidthToSquare","setTriAngleLength","setSpecialToSquare","setLineDurationToSquare","setBitmapToSquare","setLineMarginTopToSquare","setLineMarginLeftToSquare","setLineColorToSquare","setLineWidthToHexagon","setLineMarginToHexagon","setLineAnimDirection","setLineColorToHexagon","setBitmapToAnnulus","setLineColorToAnnulus","setLineOffsetSpeedToAnnulus","setAnnulusDraws","setAnnulusColors","setAnnulusLengths","setAnnulusWidths","setAnnulusMargins","sin","calcShapeRegion","makeShape","makeBackground","makeAnim","drawAnim","resetAnim","animSwitch"));
        sIgnoreFinalMap.put("SignView", Utils.asList("onDraw","onTouchEvent","setPaint"));
        sIgnoreFinalMap.put("StateLayout", Utils.asList("setSize","setType","setState","setState","toggleStateView","getView","insert","insert","remove","setOnStateChanged","setBuilder","insertView","insertView","removeView"));
        sIgnoreFinalMap.put("StateLayout.GlobalBuilder", Utils.asList("insert","insert","remove"));
        sIgnoreFinalMap.put("StateLayout.State", Utils.asList("getState"));
        sIgnoreFinalMap.put("WrapView", Utils.asList("onMeasure","onLayout","setMaxLine","setRowTopMargin","setViewLeftMargin","setRowFristLeftMargin","setRowViewMargin"));
    }

    /**
     * 初始化 忽略指定方法 static 修饰符
     */
    private static void initIgnoreStaticMap() {
        sIgnoreStaticMap.put("AdjustHeightGridView", Utils.asList("onMeasure"));
        sIgnoreStaticMap.put("AdjustHeightListView", Utils.asList("onMeasure"));
        sIgnoreStaticMap.put("AdjustHeightRecyclerView", Utils.asList("onMeasure"));
        sIgnoreStaticMap.put("AdjustHeightWebView", Utils.asList("onMeasure"));
        sIgnoreStaticMap.put("ControlSlideGallery", Utils.asList("onFling","onTouchEvent","isScrollingLeft","isSlide","setSlide","toggleSlide"));
        sIgnoreStaticMap.put("ControlSlideViewPager", Utils.asList("onTouchEvent","onInterceptTouchEvent","isSlide","setSlide","toggleSlide"));
        sIgnoreStaticMap.put("CustomHorizontalScrollView", Utils.asList("onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent","isSlide","setSlide","toggleSlide","isSlideListener","setSlideListener","setScrollCallBack"));
        sIgnoreStaticMap.put("CustomNestedScrollView", Utils.asList("onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent","isSlide","setSlide","toggleSlide","isSlideListener","setSlideListener","setScrollCallBack"));
        sIgnoreStaticMap.put("CustomProgressBar", Utils.asList("init","onDraw","drawProgressText","drawProgressText","calcTextSizeToWidth","reset","getMax","setMax","getProgress","setProgress","getProgressStyle","setProgressStyle","getProgressColor","setProgressColor","getOuterRingColor","setOuterRingColor","getInsideCircleWidth","setInsideCircleWidth","getOuterRingWidth","setOuterRingWidth","isCanvasNumber","setCanvasNumber","getNumberTextSize","setNumberTextSize","getNumberTextColor","setNumberTextColor"));
        sIgnoreStaticMap.put("CustomRecyclerView", Utils.asList("onScrolled","onScrollStateChanged","onTouchEvent","onInterceptTouchEvent","isSlide","setSlide","toggleSlide","isSlideListener","setSlideListener","setScrollCallBack"));
        sIgnoreStaticMap.put("CustomScrollView", Utils.asList("onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent","isSlide","setSlide","toggleSlide","isSlideListener","setSlideListener","setScrollCallBack"));
        sIgnoreStaticMap.put("CustomWebView", Utils.asList("onScrollChanged","onTouchEvent","onInterceptTouchEvent","isSlide","setSlide","toggleSlide","isSlideListener","setSlideListener","setScrollCallBack"));
        sIgnoreStaticMap.put("LineTextView", Utils.asList("onMeasure","onDraw","isNewLine","setNewLineCallBack"));
        sIgnoreStaticMap.put("MaxHeightScrollView", Utils.asList("onMeasure","getMaxHeight","setMaxHeight"));
        sIgnoreStaticMap.put("RightClearEditText", Utils.asList("init","drawableOperate","setCompoundDrawables","onTouchEvent","finalize","isDrawRightIcon","setDrawRightIcon","setRightDrawable","setTextWatcher","beforeTextChanged","onTextChanged","afterTextChanged"));
        sIgnoreStaticMap.put("ScanShapeView", Utils.asList("init","handlerCornerPathEffect","onDraw","destroy","getShapeType","setShapeType","getCornerRadius","setCornerEffect","setRegion","setRegion","setRegion","getRegionLeft","getRegionTop","getRegionWidth","getRegionHeight","getRegion","getRegion","getRegionParent","getBorderMargin","setBorderMargin","getBorderColor","setBorderColor","getBorderWidth","setBorderWidth","isDrawBorder","setDrawBorder","isDrawBackground","setDrawBackground","getBGColor","setBGColor","isDrawAnim","setDrawAnim","isAutoAnim","setAutoAnim","getBorderToSquare","setBorderToSquare","getBorderWidthToSquare","setBorderWidthToSquare","getTriAngleLength","setTriAngleLength","isSpecialToSquare","setSpecialToSquare","getLineDurationToSquare","setLineDurationToSquare","getBitmapToSquare","setBitmapToSquare","getLineMarginTopToSquare","setLineMarginTopToSquare","getLineMarginLeftToSquare","setLineMarginLeftToSquare","getLineColorToSquare","setLineColorToSquare","getLineWidthToHexagon","setLineWidthToHexagon","getLineMarginToHexagon","setLineMarginToHexagon","isLineAnimDirection","setLineAnimDirection","getLineColorToHexagon","setLineColorToHexagon","getBitmapToAnnulus","setBitmapToAnnulus","getLineColorToAnnulus","setLineColorToAnnulus","getLineOffsetSpeedToAnnulus","setLineOffsetSpeedToAnnulus","getAnnulusDraws","setAnnulusDraws","getAnnulusColors","setAnnulusColors","getAnnulusLengths","setAnnulusLengths","getAnnulusWidths","setAnnulusWidths","getAnnulusMargins","setAnnulusMargins","refPaintToAnnulus","sin","getRegionMarginLeft","getRegionMarginTop","calcShapeRegion","calcShapeRegion","makeShape","makeBackground","makeAnim","drawAnim","resetAnim","startAnim","stopAnim","animSwitch","isAnimRunning","refLineColorToSquare","refLineColorToHexagon","refLineColorToAnnulus","initAnim"));
        sIgnoreStaticMap.put("ScanShapeView.CornerEffect", Utils.asList("getRadius"));
        sIgnoreStaticMap.put("SignView", Utils.asList("onDraw","onTouchEvent","setPaint"));
        sIgnoreStaticMap.put("StateLayout", Utils.asList("getSize","setSize","getType","setType","getState","setState","setState","toggleStateView","getView","insert","insert","remove","getStateChanged","setOnStateChanged","reset","init","insertView","insertView","removeView"));
        sIgnoreStaticMap.put("StateLayout.GlobalBuilder", Utils.asList("insert","insert","remove"));
        sIgnoreStaticMap.put("StateLayout.State", Utils.asList("getValue"));
        sIgnoreStaticMap.put("WrapView", Utils.asList("onMeasure","onLayout","calc","refreshDraw","getRowLine","getMaxLine","setMaxLine","setRowTopMargin","setViewLeftMargin","setRowFristLeftMargin","setRowViewMargin"));
    }

    /**
     * 初始化 忽略指定方法 @param 处理
     */
    private static void initIgnoreParamMap() {
        sIgnoreParamMap.put("AdjustHeightGridView", Utils.asList("onMeasure"));
        sIgnoreParamMap.put("AdjustHeightListView", Utils.asList("onMeasure"));
        sIgnoreParamMap.put("AdjustHeightRecyclerView", Utils.asList("onMeasure"));
        sIgnoreParamMap.put("AdjustHeightWebView", Utils.asList("onMeasure"));
        sIgnoreParamMap.put("ControlSlideGallery", Utils.asList("onFling","onTouchEvent"));
        sIgnoreParamMap.put("ControlSlideViewPager", Utils.asList("onTouchEvent","onInterceptTouchEvent"));
        sIgnoreParamMap.put("ControlSlideViewPager.OnDirectionListener", Utils.asList("onPageScrolled","onPageScrollStateChanged"));
        sIgnoreParamMap.put("CustomHorizontalScrollView", Utils.asList("onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent"));
        sIgnoreParamMap.put("CustomNestedScrollView", Utils.asList("onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent"));
        sIgnoreParamMap.put("CustomProgressBar", Utils.asList("onDraw"));
        sIgnoreParamMap.put("CustomRecyclerView", Utils.asList("onScrolled","onScrollStateChanged","onTouchEvent","onInterceptTouchEvent"));
        sIgnoreParamMap.put("CustomScrollView", Utils.asList("onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent"));
        sIgnoreParamMap.put("CustomWebView", Utils.asList("onScrollChanged","onTouchEvent","onInterceptTouchEvent"));
        sIgnoreParamMap.put("LineTextView", Utils.asList("onMeasure","onDraw"));
        sIgnoreParamMap.put("MaxHeightScrollView", Utils.asList("onMeasure"));
        sIgnoreParamMap.put("RightClearEditText", Utils.asList("setCompoundDrawables","onTouchEvent"));
        sIgnoreParamMap.put("ScanShapeView", Utils.asList("onDraw"));
        sIgnoreParamMap.put("SignView", Utils.asList("onDraw","onTouchEvent"));
        sIgnoreParamMap.put("WrapView", Utils.asList("onMeasure","onLayout"));
    }

    /**
     * 初始化 忽略指定方法 @return 处理
     */
    private static void initIgnoreReturnMap() {
    }

    /**
     * 初始化 忽略指定方法非 public 处理
     */
    private static void initIgnoreUnPublicMap() {
        sIgnoreUnPublicMap.put("AdjustHeightGridView", Utils.asList("onMeasure"));
        sIgnoreUnPublicMap.put("AdjustHeightListView", Utils.asList("onMeasure"));
        sIgnoreUnPublicMap.put("AdjustHeightRecyclerView", Utils.asList("onMeasure"));
        sIgnoreUnPublicMap.put("AdjustHeightWebView", Utils.asList("onMeasure"));
        sIgnoreUnPublicMap.put("ControlSlideGallery", Utils.asList("isScrollingLeft"));
        sIgnoreUnPublicMap.put("CustomHorizontalScrollView", Utils.asList("onScrollChanged","computeScrollDeltaToGetChildRectOnScreen"));
        sIgnoreUnPublicMap.put("CustomHorizontalScrollView.ScrollCallBack", Utils.asList("onScrollChanged"));
        sIgnoreUnPublicMap.put("CustomNestedScrollView", Utils.asList("onScrollChanged","computeScrollDeltaToGetChildRectOnScreen"));
        sIgnoreUnPublicMap.put("CustomNestedScrollView.ScrollCallBack", Utils.asList("onScrollChanged"));
        sIgnoreUnPublicMap.put("CustomProgressBar", Utils.asList("init","onDraw","drawProgressText","drawProgressText","calcTextSizeToWidth"));
        sIgnoreUnPublicMap.put("CustomRecyclerView.ScrollCallBack", Utils.asList("onScrollStateChanged","onScrollChanged"));
        sIgnoreUnPublicMap.put("CustomScrollView", Utils.asList("onScrollChanged","computeScrollDeltaToGetChildRectOnScreen"));
        sIgnoreUnPublicMap.put("CustomScrollView.ScrollCallBack", Utils.asList("onScrollChanged"));
        sIgnoreUnPublicMap.put("CustomWebView", Utils.asList("onScrollChanged"));
        sIgnoreUnPublicMap.put("CustomWebView.ScrollCallBack", Utils.asList("onScrollChanged"));
        sIgnoreUnPublicMap.put("LineTextView", Utils.asList("onMeasure","onDraw"));
        sIgnoreUnPublicMap.put("LineTextView.OnNewLineCallBack", Utils.asList("onNewLine"));
        sIgnoreUnPublicMap.put("MaxHeightScrollView", Utils.asList("onMeasure"));
        sIgnoreUnPublicMap.put("RightClearEditText", Utils.asList("init","drawableOperate","finalize"));
        sIgnoreUnPublicMap.put("ScanShapeView", Utils.asList("init","handlerCornerPathEffect","onDraw","refPaintToAnnulus","sin","getRegionMarginLeft","getRegionMarginTop","calcShapeRegion","calcShapeRegion","makeShape","makeBackground","makeAnim","drawAnim","resetAnim","animSwitch","refLineColorToSquare","refLineColorToHexagon","refLineColorToAnnulus","initAnim"));
        sIgnoreUnPublicMap.put("SignView", Utils.asList("onDraw"));
        sIgnoreUnPublicMap.put("StateLayout", Utils.asList("init","insertView","insertView","removeView"));
        sIgnoreUnPublicMap.put("StateLayout.OnStateChanged", Utils.asList("OnChanged"));
        sIgnoreUnPublicMap.put("WrapView", Utils.asList("onMeasure","onLayout","calc"));
    }

    /**
     * 初始化 忽略无修饰符变量 处理
     */
    private static void initIgnoreModifierVariableMap() {
        sIgnoreModifierVariableMap.put("StateLayout", Utils.asList("        int value;"));
        sIgnoreModifierVariableMap.put("StateLayout.State", Utils.asList("    int value;"));
    }

    /**
     * 初始化 忽略指定方法 return void 处理
     */
    private static void initIgnoreReturnVoidMap() {
    }
}