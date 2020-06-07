package javadoc.dev_utils.check.dev_widget;

import javadoc.Utils;
import javadoc.dev_utils.check.dev.ICheckConfig;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * detail: DevWidgetConfig 代码检测分析配置
 * @author Ttt
 */
final class DevWidgetConfig implements ICheckConfig {

    /**
     * 获取忽略指定方法注释配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, ArrayList<String>> getIgnoreAnnotateMap() {
        Map<String, ArrayList<String>> ignoreAnnotateMap = new HashMap<>();
        ignoreAnnotateMap.put("AdjustHeightGridView", Utils.asList("onMeasure"));
        ignoreAnnotateMap.put("AdjustHeightListView", Utils.asList("onMeasure"));
        ignoreAnnotateMap.put("AdjustHeightRecyclerView", Utils.asList("onMeasure"));
        ignoreAnnotateMap.put("AdjustHeightWebView", Utils.asList("onMeasure"));
        ignoreAnnotateMap.put("CornerLabelView", Utils.asList("onMeasure","onDraw"));
        ignoreAnnotateMap.put("CustomGallery", Utils.asList("onMeasure","onFling","onTouchEvent","onInterceptTouchEvent"));
        ignoreAnnotateMap.put("CustomHorizontalScrollView", Utils.asList("onMeasure","onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent"));
        ignoreAnnotateMap.put("CustomNestedScrollView", Utils.asList("onMeasure","onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent"));
        ignoreAnnotateMap.put("CustomRecyclerView", Utils.asList("onMeasure","onScrolled","onScrollStateChanged","onTouchEvent","onInterceptTouchEvent"));
        ignoreAnnotateMap.put("CustomScrollView", Utils.asList("onMeasure","onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent"));
        ignoreAnnotateMap.put("CustomViewPager", Utils.asList("onMeasure","onTouchEvent","onInterceptTouchEvent"));
        ignoreAnnotateMap.put("CustomViewPager.OnDirectionListener", Utils.asList("onPageScrolled","onPageScrollStateChanged"));
        ignoreAnnotateMap.put("CustomWebView", Utils.asList("onMeasure","onScrollChanged","onTouchEvent","onInterceptTouchEvent"));
        ignoreAnnotateMap.put("FlowLikeView", Utils.asList("onMeasure","onSizeChanged"));
        ignoreAnnotateMap.put("FlowLikeView.AnimationEndListener", Utils.asList("onAnimationEnd"));
        ignoreAnnotateMap.put("FlowLikeView.CurveEvaluator", Utils.asList("evaluate"));
        ignoreAnnotateMap.put("FlowLikeView.CurveUpdateLister", Utils.asList("onAnimationUpdate"));
        ignoreAnnotateMap.put("LimitLayout", Utils.asList("onMeasure"));
        ignoreAnnotateMap.put("LineTextView", Utils.asList("onDraw"));
        ignoreAnnotateMap.put("LoadProgressBar", Utils.asList("onDraw"));
        ignoreAnnotateMap.put("RightIconEditText", Utils.asList("setCompoundDrawables","onTouchEvent","finalize"));
        ignoreAnnotateMap.put("ScanShapeView", Utils.asList("onDraw"));
        ignoreAnnotateMap.put("ScanShapeView.CornerEffect", Utils.asList("getRadius"));
        ignoreAnnotateMap.put("SignView", Utils.asList("onDraw","onTouchEvent"));
        ignoreAnnotateMap.put("StateLayout", Utils.asList("setGlobal","setListener","showIng","showFailed","showSuccess","showEmptyData","showType","notifyDataSetChanged","gone","visible","getTag","setTag","getData","setData","getData","setData","getView","getCurrentType","getCurrentView"));
        ignoreAnnotateMap.put("StateLayout.Listener", Utils.asList("onRemove","onNotFound","onChange"));
        ignoreAnnotateMap.put("StateLayout.TypeAdapter", Utils.asList("onCreateView","onBindView"));
        ignoreAnnotateMap.put("ViewAssist", Utils.asList("showIng","showFailed","showSuccess","showEmptyData","notifyDataSetChanged","gone","visible","getWrapper","getTag","setTag","getData","setData","getData","setData","getAdapter","getView","getCurrentType","getCurrentView","setListener"));
        ignoreAnnotateMap.put("ViewAssist.Adapter", Utils.asList("onCreateView","onBindView"));
        ignoreAnnotateMap.put("ViewAssist.Listener", Utils.asList("onRemove","onNotFound","onChange"));
        ignoreAnnotateMap.put("WrapView", Utils.asList("onMeasure","onLayout"));

        return ignoreAnnotateMap;
    }

    /**
     * 获取忽略指定方法参数 final 修饰符配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, ArrayList<String>> getIgnoreFinalMap() {
        Map<String, ArrayList<String>> ignoreFinalMap = new HashMap<>();
        ignoreFinalMap.put("AdjustHeightGridView", Utils.asList("onMeasure"));
        ignoreFinalMap.put("AdjustHeightListView", Utils.asList("onMeasure"));
        ignoreFinalMap.put("AdjustHeightRecyclerView", Utils.asList("onMeasure"));
        ignoreFinalMap.put("AdjustHeightWebView", Utils.asList("onMeasure"));
        ignoreFinalMap.put("CornerLabelView", Utils.asList("initAttrs","onMeasure","onDraw","setPaddingTop","setPaddingCenter","setPaddingBottom","setFillColor","setFillShader","triangle","setText1","setTextColor1","setTextHeight1","setTextBold1","setText2","setTextColor2","setTextHeight2","setTextBold2"));
        ignoreFinalMap.put("CornerLabelView.Painter", Utils.asList("draw"));
        ignoreFinalMap.put("CustomGallery", Utils.asList("initAttrs","onMeasure","onFling","onTouchEvent","onInterceptTouchEvent","isScrollingLeft","setMaxWidth","setMaxHeight","setSlide"));
        ignoreFinalMap.put("CustomHorizontalScrollView", Utils.asList("initAttrs","onMeasure","onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent","setMaxWidth","setMaxHeight","setSlide","setScrollCallBack"));
        ignoreFinalMap.put("CustomNestedScrollView", Utils.asList("initAttrs","onMeasure","onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent","setMaxWidth","setMaxHeight","setSlide","setScrollCallBack"));
        ignoreFinalMap.put("CustomRecyclerView", Utils.asList("initAttrs","onMeasure","onScrolled","onScrollStateChanged","onTouchEvent","onInterceptTouchEvent","setMaxWidth","setMaxHeight","setSlide","setScrollCallBack"));
        ignoreFinalMap.put("CustomScrollView", Utils.asList("initAttrs","onMeasure","onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent","setMaxWidth","setMaxHeight","setSlide","setScrollCallBack"));
        ignoreFinalMap.put("CustomViewPager", Utils.asList("initAttrs","onMeasure","onTouchEvent","onInterceptTouchEvent","setMaxWidth","setMaxHeight","setSlide"));
        ignoreFinalMap.put("CustomWebView", Utils.asList("initAttrs","onMeasure","onScrollChanged","onTouchEvent","onInterceptTouchEvent","setMaxWidth","setMaxHeight","setSlide","setScrollCallBack"));
        ignoreFinalMap.put("FlowLikeView", Utils.asList("initAttrs","onMeasure","onSizeChanged","generateCTRLPointF","generateCurveAnimation","generateEnterAnimation","startAnimation","setDrawables","setIconWidth","setIconHeight","setAnimDuration"));
        ignoreFinalMap.put("FlowLikeView.AnimationEndListener", Utils.asList("onAnimationEnd"));
        ignoreFinalMap.put("FlowLikeView.CurveEvaluator", Utils.asList("evaluate"));
        ignoreFinalMap.put("FlowLikeView.CurveUpdateLister", Utils.asList("onAnimationUpdate"));
        ignoreFinalMap.put("LimitLayout", Utils.asList("initAttrs","onMeasure","setMaxWidth","setMaxHeight"));
        ignoreFinalMap.put("LineTextView", Utils.asList("onDraw","setNewLineCallBack"));
        ignoreFinalMap.put("LoadProgressBar", Utils.asList("initAttrs","onDraw","drawProgressText","drawProgressText","setMax","setProgress","setProgressColor","setOuterRingColor","setInsideCircleWidth","setOuterRingWidth","setCanvasNumber","setNumberTextSize","setNumberTextColor","setProgressStyle"));
        ignoreFinalMap.put("RightIconEditText", Utils.asList("setCompoundDrawables","onTouchEvent","setRangeMultiple","setDrawRightIcon","setRightIcon","setTextWatcher","init"));
        ignoreFinalMap.put("ScanShapeView", Utils.asList("onDraw","setShapeType","setCornerEffect","setRegion","setRegion","setRegion","getRegion","setBorderMargin","setBorderColor","setBorderWidth","setDrawBorder","setDrawBackground","setBGColor","setDrawAnim","setAutoAnim","setBorderToSquare","setBorderWidthToSquare","setTriAngleLength","setSpecialToSquare","setLineDurationToSquare","setBitmapToSquare","setLineMarginTopToSquare","setLineMarginLeftToSquare","setLineColorToSquare","setLineWidthToHexagon","setLineMarginToHexagon","setLineAnimDirection","setLineColorToHexagon","setBitmapToAnnulus","setLineColorToAnnulus","setLineOffsetSpeedToAnnulus","setAnnulusDraws","setAnnulusColors","setAnnulusLengths","setAnnulusWidths","setAnnulusMargins","sin","calcShapeRegion","makeShape","makeBackground","makeAnim","drawAnim","resetAnim","animSwitch"));
        ignoreFinalMap.put("SignView", Utils.asList("onDraw","onTouchEvent","_resetCanvas","setPath","setPaint","setDrawCallBack"));
        ignoreFinalMap.put("StateLayout", Utils.asList("setGlobal","setListener","showType","register","unregister","unregister","setTag","setData","getData","setData","getView"));
        ignoreFinalMap.put("StateLayout.Global", Utils.asList("register","unregister"));
        ignoreFinalMap.put("StateLayout.TypeAdapter", Utils.asList("onCreateView","onBindView"));
        ignoreFinalMap.put("ViewAssist", Utils.asList("wrap","wrap","showType","register","unregister","unregister","setTag","setData","getData","setData","getAdapter","getView","setListener"));
        ignoreFinalMap.put("WrapView", Utils.asList("initAttrs","onMeasure","onLayout","setMaxLine","setRowTopMargin","setViewLeftMargin","setRowFristLeftMargin","setRowViewMargin"));

        return ignoreFinalMap;
    }

    /**
     * 获取忽略指定方法 static 修饰符配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, ArrayList<String>> getIgnoreStaticMap() {
        Map<String, ArrayList<String>> ignoreStaticMap = new HashMap<>();
        ignoreStaticMap.put("AdjustHeightGridView", Utils.asList("onMeasure"));
        ignoreStaticMap.put("AdjustHeightListView", Utils.asList("onMeasure"));
        ignoreStaticMap.put("AdjustHeightRecyclerView", Utils.asList("onMeasure"));
        ignoreStaticMap.put("AdjustHeightWebView", Utils.asList("onMeasure"));
        ignoreStaticMap.put("CornerLabelView", Utils.asList("initAttrs","onMeasure","onDraw","calcPath","getPainter1","getPainter2","setPaddingTop","setPaddingCenter","setPaddingBottom","setFillColor","setFillShader","left","right","top","bottom","triangle","setText1","setTextColor1","setTextHeight1","setTextBold1","setText2","setTextColor2","setTextHeight2","setTextBold2","refresh"));
        ignoreStaticMap.put("CornerLabelView.Painter", Utils.asList("init","draw","getPaint","getText","getTextColor","getTextHeight","isTextBold"));
        ignoreStaticMap.put("CustomGallery", Utils.asList("initAttrs","onMeasure","onFling","onTouchEvent","onInterceptTouchEvent","isScrollingLeft","getMaxWidth","setMaxWidth","getMaxHeight","setMaxHeight","isSlide","setSlide","toggleSlide"));
        ignoreStaticMap.put("CustomHorizontalScrollView", Utils.asList("initAttrs","onMeasure","onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent","getMaxWidth","setMaxWidth","getMaxHeight","setMaxHeight","isSlide","setSlide","toggleSlide","setScrollCallBack"));
        ignoreStaticMap.put("CustomNestedScrollView", Utils.asList("initAttrs","onMeasure","onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent","getMaxWidth","setMaxWidth","getMaxHeight","setMaxHeight","isSlide","setSlide","toggleSlide","setScrollCallBack"));
        ignoreStaticMap.put("CustomRecyclerView", Utils.asList("initAttrs","onMeasure","onScrolled","onScrollStateChanged","onTouchEvent","onInterceptTouchEvent","getMaxWidth","setMaxWidth","getMaxHeight","setMaxHeight","isSlide","setSlide","toggleSlide","setScrollCallBack"));
        ignoreStaticMap.put("CustomScrollView", Utils.asList("initAttrs","onMeasure","onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent","getMaxWidth","setMaxWidth","getMaxHeight","setMaxHeight","isSlide","setSlide","toggleSlide","setScrollCallBack"));
        ignoreStaticMap.put("CustomViewPager", Utils.asList("initAttrs","onMeasure","onTouchEvent","onInterceptTouchEvent","getMaxWidth","setMaxWidth","getMaxHeight","setMaxHeight","isSlide","setSlide","toggleSlide"));
        ignoreStaticMap.put("CustomWebView", Utils.asList("initAttrs","onMeasure","onScrollChanged","onTouchEvent","onInterceptTouchEvent","getMaxWidth","setMaxWidth","getMaxHeight","setMaxHeight","isSlide","setSlide","toggleSlide","setScrollCallBack"));
        ignoreStaticMap.put("FlowLikeView", Utils.asList("initAttrs","onMeasure","onSizeChanged","generateCTRLPointF","generateCurveAnimation","generateEnterAnimation","startAnimation","resetLayoutParams","like","getDrawables","setDrawables","setDrawablesById","getIconWidth","setIconWidth","getIconHeight","setIconHeight","getAnimDuration","setAnimDuration"));
        ignoreStaticMap.put("FlowLikeView.AnimationEndListener", Utils.asList("onAnimationEnd"));
        ignoreStaticMap.put("FlowLikeView.CurveEvaluator", Utils.asList("evaluate"));
        ignoreStaticMap.put("FlowLikeView.CurveUpdateLister", Utils.asList("onAnimationUpdate"));
        ignoreStaticMap.put("LimitLayout", Utils.asList("initAttrs","onMeasure","getMaxWidth","setMaxWidth","getMaxHeight","setMaxHeight"));
        ignoreStaticMap.put("LineTextView", Utils.asList("onDraw","isNewLine","setNewLineCallBack"));
        ignoreStaticMap.put("LoadProgressBar", Utils.asList("initAttrs","init","onDraw","drawProgressText","drawProgressText","reset","getMax","setMax","getProgress","setProgress","getProgressColor","setProgressColor","getOuterRingColor","setOuterRingColor","getInsideCircleWidth","setInsideCircleWidth","getOuterRingWidth","setOuterRingWidth","isCanvasNumber","setCanvasNumber","getNumberTextSize","setNumberTextSize","getNumberTextColor","setNumberTextColor","getProgressStyle","setProgressStyle"));
        ignoreStaticMap.put("RightIconEditText", Utils.asList("setCompoundDrawables","onTouchEvent","finalize","getRangeMultiple","setRangeMultiple","isDrawRightIcon","setDrawRightIcon","getRightIcon","setRightIcon","setTextWatcher","init","drawOperate"));
        ignoreStaticMap.put("ScanShapeView", Utils.asList("init","handlerCornerPathEffect","onDraw","destroy","getShapeType","setShapeType","getCornerRadius","setCornerEffect","setRegion","setRegion","setRegion","getRegionLeft","getRegionTop","getRegionWidth","getRegionHeight","getRegion","getRegion","getRegionParent","getBorderMargin","setBorderMargin","getBorderColor","setBorderColor","getBorderWidth","setBorderWidth","isDrawBorder","setDrawBorder","isDrawBackground","setDrawBackground","getBGColor","setBGColor","isDrawAnim","setDrawAnim","isAutoAnim","setAutoAnim","getBorderToSquare","setBorderToSquare","getBorderWidthToSquare","setBorderWidthToSquare","getTriAngleLength","setTriAngleLength","isSpecialToSquare","setSpecialToSquare","getLineDurationToSquare","setLineDurationToSquare","getBitmapToSquare","setBitmapToSquare","getLineMarginTopToSquare","setLineMarginTopToSquare","getLineMarginLeftToSquare","setLineMarginLeftToSquare","getLineColorToSquare","setLineColorToSquare","getLineWidthToHexagon","setLineWidthToHexagon","getLineMarginToHexagon","setLineMarginToHexagon","isLineAnimDirection","setLineAnimDirection","getLineColorToHexagon","setLineColorToHexagon","getBitmapToAnnulus","setBitmapToAnnulus","getLineColorToAnnulus","setLineColorToAnnulus","getLineOffsetSpeedToAnnulus","setLineOffsetSpeedToAnnulus","getAnnulusDraws","setAnnulusDraws","getAnnulusColors","setAnnulusColors","getAnnulusLengths","setAnnulusLengths","getAnnulusWidths","setAnnulusWidths","getAnnulusMargins","setAnnulusMargins","refPaintToAnnulus","sin","getRegionMarginLeft","getRegionMarginTop","calcShapeRegion","calcShapeRegion","makeShape","makeBackground","makeAnim","drawAnim","resetAnim","startAnim","stopAnim","animSwitch","isAnimRunning","refLineColorToSquare","refLineColorToHexagon","refLineColorToAnnulus","initAnim"));
        ignoreStaticMap.put("ScanShapeView.CornerEffect", Utils.asList("getRadius"));
        ignoreStaticMap.put("SignView", Utils.asList("onDraw","onTouchEvent","_resetCanvas","clearCanvas","snapshotByView","getPath","setPath","getPaint","setPaint","setDrawCallBack"));
        ignoreStaticMap.put("StateLayout", Utils.asList("reset","init","setListener","showIng","showFailed","showSuccess","showEmptyData","showType","notifyDataSetChanged","gone","visible","register","unregister","unregister","getTag","setTag","getData","setData","getData","setData","getView","getCurrentType","getCurrentView"));
        ignoreStaticMap.put("StateLayout.Global", Utils.asList("register","unregister"));
        ignoreStaticMap.put("StateLayout.TypeAdapter", Utils.asList("onCreateView","onBindView"));
        ignoreStaticMap.put("ViewAssist", Utils.asList("showIng","showFailed","showSuccess","showEmptyData","showType","notifyDataSetChanged","gone","visible","register","unregister","unregister","reset","getWrapper","getTag","setTag","getData","setData","getData","setData","getAdapter","getView","getCurrentType","getCurrentView","setListener"));
        ignoreStaticMap.put("WrapView", Utils.asList("initAttrs","onMeasure","onLayout","calc","refreshDraw","getRowLine","getMaxLine","setMaxLine","getRowTopMargin","setRowTopMargin","getViewLeftMargin","setViewLeftMargin","getRowFristLeftMargin","setRowFristLeftMargin","setRowViewMargin"));

        return ignoreStaticMap;
    }

    /**
     * 获取忽略指定方法 @param 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, ArrayList<String>> getIgnoreParamMap() {
        Map<String, ArrayList<String>> ignoreParamMap = new HashMap<>();
        ignoreParamMap.put("AdjustHeightGridView", Utils.asList("onMeasure"));
        ignoreParamMap.put("AdjustHeightListView", Utils.asList("onMeasure"));
        ignoreParamMap.put("AdjustHeightRecyclerView", Utils.asList("onMeasure"));
        ignoreParamMap.put("AdjustHeightWebView", Utils.asList("onMeasure"));
        ignoreParamMap.put("CornerLabelView", Utils.asList("onMeasure","onDraw"));
        ignoreParamMap.put("CustomGallery", Utils.asList("onMeasure","onFling","onTouchEvent","onInterceptTouchEvent"));
        ignoreParamMap.put("CustomHorizontalScrollView", Utils.asList("onMeasure","onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent"));
        ignoreParamMap.put("CustomNestedScrollView", Utils.asList("onMeasure","onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent"));
        ignoreParamMap.put("CustomRecyclerView", Utils.asList("onMeasure","onScrolled","onScrollStateChanged","onTouchEvent","onInterceptTouchEvent"));
        ignoreParamMap.put("CustomScrollView", Utils.asList("onMeasure","onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent"));
        ignoreParamMap.put("CustomViewPager", Utils.asList("onMeasure","onTouchEvent","onInterceptTouchEvent"));
        ignoreParamMap.put("CustomViewPager.OnDirectionListener", Utils.asList("onPageScrolled","onPageScrollStateChanged"));
        ignoreParamMap.put("CustomWebView", Utils.asList("onMeasure","onScrollChanged","onTouchEvent","onInterceptTouchEvent"));
        ignoreParamMap.put("FlowLikeView", Utils.asList("onMeasure","onSizeChanged"));
        ignoreParamMap.put("FlowLikeView.AnimationEndListener", Utils.asList("onAnimationEnd"));
        ignoreParamMap.put("FlowLikeView.CurveEvaluator", Utils.asList("evaluate"));
        ignoreParamMap.put("FlowLikeView.CurveUpdateLister", Utils.asList("onAnimationUpdate"));
        ignoreParamMap.put("LimitLayout", Utils.asList("onMeasure"));
        ignoreParamMap.put("LineTextView", Utils.asList("onDraw"));
        ignoreParamMap.put("LoadProgressBar", Utils.asList("onDraw"));
        ignoreParamMap.put("RightIconEditText", Utils.asList("setCompoundDrawables","onTouchEvent"));
        ignoreParamMap.put("ScanShapeView", Utils.asList("onDraw"));
        ignoreParamMap.put("SignView", Utils.asList("onDraw","onTouchEvent"));
        ignoreParamMap.put("StateLayout", Utils.asList("setGlobal","setListener","showType","setTag","setData","getData","setData","getView"));
        ignoreParamMap.put("StateLayout.Listener", Utils.asList("onRemove","onNotFound","onChange"));
        ignoreParamMap.put("StateLayout.TypeAdapter", Utils.asList("onCreateView","onBindView"));
        ignoreParamMap.put("ViewAssist", Utils.asList("setTag","setData","getData","setData","getAdapter","getView","setListener"));
        ignoreParamMap.put("ViewAssist.Adapter", Utils.asList("onCreateView","onBindView"));
        ignoreParamMap.put("ViewAssist.Listener", Utils.asList("onRemove","onNotFound","onChange"));
        ignoreParamMap.put("WrapView", Utils.asList("onMeasure","onLayout"));

        return ignoreParamMap;
    }

    /**
     * 获取忽略指定方法 @return 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, ArrayList<String>> getIgnoreReturnMap() {
        Map<String, ArrayList<String>> ignoreReturnMap = new HashMap<>();
        
        return ignoreReturnMap;
    }

    /**
     * 获取忽略指定方法非 public 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, ArrayList<String>> getIgnoreUnPublicMap() {
        Map<String, ArrayList<String>> ignoreUnPublicMap = new HashMap<>();
        ignoreUnPublicMap.put("AdjustHeightGridView", Utils.asList("onMeasure"));
        ignoreUnPublicMap.put("AdjustHeightListView", Utils.asList("onMeasure"));
        ignoreUnPublicMap.put("AdjustHeightRecyclerView", Utils.asList("onMeasure"));
        ignoreUnPublicMap.put("AdjustHeightWebView", Utils.asList("onMeasure"));
        ignoreUnPublicMap.put("CornerLabelView", Utils.asList("initAttrs","onMeasure","onDraw","calcPath"));
        ignoreUnPublicMap.put("CornerLabelView.Painter", Utils.asList("init","draw"));
        ignoreUnPublicMap.put("CustomGallery", Utils.asList("initAttrs","onMeasure","isScrollingLeft"));
        ignoreUnPublicMap.put("CustomHorizontalScrollView", Utils.asList("initAttrs","onMeasure","onScrollChanged","computeScrollDeltaToGetChildRectOnScreen"));
        ignoreUnPublicMap.put("CustomHorizontalScrollView.ScrollCallBack", Utils.asList("onScrollChanged"));
        ignoreUnPublicMap.put("CustomNestedScrollView", Utils.asList("initAttrs","onMeasure","onScrollChanged","computeScrollDeltaToGetChildRectOnScreen"));
        ignoreUnPublicMap.put("CustomNestedScrollView.ScrollCallBack", Utils.asList("onScrollChanged"));
        ignoreUnPublicMap.put("CustomRecyclerView", Utils.asList("initAttrs","onMeasure"));
        ignoreUnPublicMap.put("CustomRecyclerView.ScrollCallBack", Utils.asList("onScrollStateChanged","onScrollChanged"));
        ignoreUnPublicMap.put("CustomScrollView", Utils.asList("initAttrs","onMeasure","onScrollChanged","computeScrollDeltaToGetChildRectOnScreen"));
        ignoreUnPublicMap.put("CustomScrollView.ScrollCallBack", Utils.asList("onScrollChanged"));
        ignoreUnPublicMap.put("CustomViewPager", Utils.asList("initAttrs","onMeasure"));
        ignoreUnPublicMap.put("CustomWebView", Utils.asList("initAttrs","onMeasure","onScrollChanged"));
        ignoreUnPublicMap.put("CustomWebView.ScrollCallBack", Utils.asList("onScrollChanged"));
        ignoreUnPublicMap.put("FlowLikeView", Utils.asList("initAttrs","onMeasure","onSizeChanged","generateCTRLPointF","generateCurveAnimation","generateEnterAnimation","startAnimation","resetLayoutParams"));
        ignoreUnPublicMap.put("LimitLayout", Utils.asList("initAttrs","onMeasure"));
        ignoreUnPublicMap.put("LineTextView", Utils.asList("onDraw"));
        ignoreUnPublicMap.put("LineTextView.OnNewLineCallBack", Utils.asList("onNewLine"));
        ignoreUnPublicMap.put("LoadProgressBar", Utils.asList("initAttrs","init","onDraw","drawProgressText","drawProgressText"));
        ignoreUnPublicMap.put("RightIconEditText", Utils.asList("finalize","init","drawOperate"));
        ignoreUnPublicMap.put("ScanShapeView", Utils.asList("init","handlerCornerPathEffect","onDraw","refPaintToAnnulus","sin","getRegionMarginLeft","getRegionMarginTop","calcShapeRegion","calcShapeRegion","makeShape","makeBackground","makeAnim","drawAnim","resetAnim","animSwitch","refLineColorToSquare","refLineColorToHexagon","refLineColorToAnnulus","initAnim"));
        ignoreUnPublicMap.put("SignView", Utils.asList("onDraw","_resetCanvas"));
        ignoreUnPublicMap.put("StateLayout", Utils.asList("init"));
        ignoreUnPublicMap.put("StateLayout.Listener", Utils.asList("onRemove","onNotFound","onChange"));
        ignoreUnPublicMap.put("ViewAssist.Adapter", Utils.asList("onCreateView","onBindView"));
        ignoreUnPublicMap.put("ViewAssist.Listener", Utils.asList("onRemove","onNotFound","onChange"));
        ignoreUnPublicMap.put("WrapView", Utils.asList("initAttrs","onMeasure","onLayout","calc"));

        return ignoreUnPublicMap;
    }

    /**
     * 获取忽略无修饰符变量处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, ArrayList<String>> getIgnoreModifierVariableMap() {
        Map<String, ArrayList<String>> ignoreModifierVariableMap = new HashMap<>();
        
        return ignoreModifierVariableMap;
    }

    /**
     * 获取忽略指定方法 return void 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, ArrayList<String>> getIgnoreReturnVoidMap() {
        Map<String, ArrayList<String>> ignoreReturnVoidMap = new HashMap<>();
        ignoreReturnVoidMap.put("CornerLabelView", Utils.asList("initAttrs - void"));
        ignoreReturnVoidMap.put("CornerLabelView.Painter", Utils.asList("init - void","draw - void"));
        ignoreReturnVoidMap.put("CustomGallery", Utils.asList("initAttrs - void"));
        ignoreReturnVoidMap.put("CustomHorizontalScrollView", Utils.asList("initAttrs - void"));
        ignoreReturnVoidMap.put("CustomHorizontalScrollView.ScrollCallBack", Utils.asList("onScrollChanged - void"));
        ignoreReturnVoidMap.put("CustomNestedScrollView", Utils.asList("initAttrs - void"));
        ignoreReturnVoidMap.put("CustomNestedScrollView.ScrollCallBack", Utils.asList("onScrollChanged - void"));
        ignoreReturnVoidMap.put("CustomRecyclerView", Utils.asList("initAttrs - void"));
        ignoreReturnVoidMap.put("CustomRecyclerView.ScrollCallBack", Utils.asList("onScrollStateChanged - void","onScrollChanged - void"));
        ignoreReturnVoidMap.put("CustomScrollView", Utils.asList("initAttrs - void"));
        ignoreReturnVoidMap.put("CustomScrollView.ScrollCallBack", Utils.asList("onScrollChanged - void"));
        ignoreReturnVoidMap.put("CustomViewPager", Utils.asList("initAttrs - void"));
        ignoreReturnVoidMap.put("CustomViewPager.OnDirectionListener", Utils.asList("onSlideDirection - void"));
        ignoreReturnVoidMap.put("CustomWebView", Utils.asList("initAttrs - void"));
        ignoreReturnVoidMap.put("CustomWebView.ScrollCallBack", Utils.asList("onScrollChanged - void"));
        ignoreReturnVoidMap.put("FlowLikeView", Utils.asList("initAttrs - void","startAnimation - void","resetLayoutParams - void","like - void"));
        ignoreReturnVoidMap.put("LimitLayout", Utils.asList("initAttrs - void"));
        ignoreReturnVoidMap.put("LineTextView.OnNewLineCallBack", Utils.asList("onNewLine - void"));
        ignoreReturnVoidMap.put("LoadProgressBar", Utils.asList("initAttrs - void","drawProgressText - void","drawProgressText - void"));
        ignoreReturnVoidMap.put("RightIconEditText", Utils.asList("init - void","drawOperate - void"));
        ignoreReturnVoidMap.put("ScanShapeView", Utils.asList("init - void","handlerCornerPathEffect - void","destroy - void","refPaintToAnnulus - void","makeBackground - void","makeAnim - void","drawAnim - void","resetAnim - void","startAnim - void","stopAnim - void","animSwitch - void","refLineColorToSquare - void","refLineColorToHexagon - void","refLineColorToAnnulus - void","initAnim - void"));
        ignoreReturnVoidMap.put("SignView", Utils.asList("_resetCanvas - void"));
        ignoreReturnVoidMap.put("StateLayout", Utils.asList("init - void"));
        ignoreReturnVoidMap.put("ViewAssist", Utils.asList("showType - void"));
        ignoreReturnVoidMap.put("WrapView", Utils.asList("initAttrs - void","refreshDraw - void"));

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