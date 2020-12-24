package javadoc.dev_utils.check.dev_widget;

import dev.utils.common.ArrayUtils;
import javadoc.dev_utils.check.dev.ICheckConfig;

import java.util.HashMap;
import java.util.List;
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
    public Map<String, List<String>> getIgnoreAnnotateMap() {
        Map<String, List<String>> ignoreAnnotateMap = new HashMap<>();
        ignoreAnnotateMap.put("AdjustHeightGridView", ArrayUtils.asListArgs("onMeasure"));
        ignoreAnnotateMap.put("AdjustHeightListView", ArrayUtils.asListArgs("onMeasure"));
        ignoreAnnotateMap.put("AdjustHeightRecyclerView", ArrayUtils.asListArgs("onMeasure"));
        ignoreAnnotateMap.put("AdjustHeightWebView", ArrayUtils.asListArgs("onMeasure"));
        ignoreAnnotateMap.put("CornerLabelView", ArrayUtils.asListArgs("onMeasure","onDraw"));
        ignoreAnnotateMap.put("CustomGallery", ArrayUtils.asListArgs("onMeasure","onFling","onTouchEvent","onInterceptTouchEvent"));
        ignoreAnnotateMap.put("CustomHorizontalScrollView", ArrayUtils.asListArgs("onMeasure","onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent"));
        ignoreAnnotateMap.put("CustomNestedScrollView", ArrayUtils.asListArgs("onMeasure","onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent"));
        ignoreAnnotateMap.put("CustomRecyclerView", ArrayUtils.asListArgs("onMeasure","onScrolled","onScrollStateChanged","onTouchEvent","onInterceptTouchEvent"));
        ignoreAnnotateMap.put("CustomScrollView", ArrayUtils.asListArgs("onMeasure","onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent"));
        ignoreAnnotateMap.put("CustomViewPager", ArrayUtils.asListArgs("onMeasure","onTouchEvent","onInterceptTouchEvent"));
        ignoreAnnotateMap.put("CustomViewPager.OnDirectionListener", ArrayUtils.asListArgs("onPageScrolled","onPageScrollStateChanged"));
        ignoreAnnotateMap.put("CustomWebView", ArrayUtils.asListArgs("onMeasure","onScrollChanged","onTouchEvent","onInterceptTouchEvent"));
        ignoreAnnotateMap.put("FlowLikeView", ArrayUtils.asListArgs("onMeasure","onSizeChanged"));
        ignoreAnnotateMap.put("FlowLikeView.AnimationEndListener", ArrayUtils.asListArgs("onAnimationEnd"));
        ignoreAnnotateMap.put("FlowLikeView.CurveEvaluator", ArrayUtils.asListArgs("evaluate"));
        ignoreAnnotateMap.put("FlowLikeView.CurveUpdateLister", ArrayUtils.asListArgs("onAnimationUpdate"));
        ignoreAnnotateMap.put("LimitLayout", ArrayUtils.asListArgs("onMeasure"));
        ignoreAnnotateMap.put("LineTextView", ArrayUtils.asListArgs("onDraw"));
        ignoreAnnotateMap.put("LoadProgressBar", ArrayUtils.asListArgs("onDraw"));
        ignoreAnnotateMap.put("RadiusAttrs", ArrayUtils.asListArgs("onSaveInstanceState","onRestoreInstanceState"));
        ignoreAnnotateMap.put("RadiusLayout", ArrayUtils.asListArgs("onSizeChanged","draw","onSaveInstanceState","onRestoreInstanceState"));
        ignoreAnnotateMap.put("RightIconEditText", ArrayUtils.asListArgs("setCompoundDrawables","onTouchEvent","finalize"));
        ignoreAnnotateMap.put("ScanShapeView", ArrayUtils.asListArgs("onDraw"));
        ignoreAnnotateMap.put("ScanShapeView.CornerEffect", ArrayUtils.asListArgs("getRadius"));
        ignoreAnnotateMap.put("SignView", ArrayUtils.asListArgs("onDraw","onTouchEvent"));
        ignoreAnnotateMap.put("StateLayout", ArrayUtils.asListArgs("setGlobal","setListener","showIng","showFailed","showSuccess","showEmptyData","showType","notifyDataSetChanged","gone","visible","getTag","setTag","getData","setData","getData","setData","getView","getCurrentType","getCurrentView"));
        ignoreAnnotateMap.put("StateLayout.Listener", ArrayUtils.asListArgs("onRemove","onNotFound","onChange"));
        ignoreAnnotateMap.put("StateLayout.TypeAdapter", ArrayUtils.asListArgs("onCreateView","onBindView"));
        ignoreAnnotateMap.put("ViewAssist", ArrayUtils.asListArgs("showIng","showFailed","showSuccess","showEmptyData","notifyDataSetChanged","gone","visible","getWrapper","getTag","setTag","getData","setData","getData","setData","getAdapter","getView","getCurrentType","getCurrentView","setListener"));
        ignoreAnnotateMap.put("ViewAssist.Adapter", ArrayUtils.asListArgs("onCreateView","onBindView"));
        ignoreAnnotateMap.put("ViewAssist.Listener", ArrayUtils.asListArgs("onRemove","onNotFound","onChange"));
        ignoreAnnotateMap.put("WrapView", ArrayUtils.asListArgs("onMeasure","onLayout"));

        return ignoreAnnotateMap;
    }

    /**
     * 获取忽略指定方法参数 final 修饰符配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreFinalMap() {
        Map<String, List<String>> ignoreFinalMap = new HashMap<>();
        ignoreFinalMap.put("AdjustHeightGridView", ArrayUtils.asListArgs("onMeasure"));
        ignoreFinalMap.put("AdjustHeightListView", ArrayUtils.asListArgs("onMeasure"));
        ignoreFinalMap.put("AdjustHeightRecyclerView", ArrayUtils.asListArgs("onMeasure"));
        ignoreFinalMap.put("AdjustHeightWebView", ArrayUtils.asListArgs("onMeasure"));
        ignoreFinalMap.put("CornerLabelView", ArrayUtils.asListArgs("initAttrs","onMeasure","onDraw","setPaddingTop","setPaddingCenter","setPaddingBottom","setFillColor","setFillShader","triangle","setText1","setTextColor1","setTextHeight1","setTextBold1","setText2","setTextColor2","setTextHeight2","setTextBold2"));
        ignoreFinalMap.put("CornerLabelView.Painter", ArrayUtils.asListArgs("draw"));
        ignoreFinalMap.put("CustomGallery", ArrayUtils.asListArgs("initAttrs","onMeasure","onFling","onTouchEvent","onInterceptTouchEvent","isScrollingLeft","setMaxWidth","setMaxHeight","setSlide"));
        ignoreFinalMap.put("CustomHorizontalScrollView", ArrayUtils.asListArgs("initAttrs","onMeasure","onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent","setMaxWidth","setMaxHeight","setSlide","setScrollCallback"));
        ignoreFinalMap.put("CustomNestedScrollView", ArrayUtils.asListArgs("initAttrs","onMeasure","onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent","setMaxWidth","setMaxHeight","setSlide","setScrollCallback"));
        ignoreFinalMap.put("CustomRecyclerView", ArrayUtils.asListArgs("initAttrs","onMeasure","onScrolled","onScrollStateChanged","onTouchEvent","onInterceptTouchEvent","setMaxWidth","setMaxHeight","setSlide","setScrollCallback"));
        ignoreFinalMap.put("CustomScrollView", ArrayUtils.asListArgs("initAttrs","onMeasure","onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent","setMaxWidth","setMaxHeight","setSlide","setScrollCallback"));
        ignoreFinalMap.put("CustomViewPager", ArrayUtils.asListArgs("initAttrs","onMeasure","onTouchEvent","onInterceptTouchEvent","setMaxWidth","setMaxHeight","setSlide"));
        ignoreFinalMap.put("CustomWebView", ArrayUtils.asListArgs("initAttrs","onMeasure","onScrollChanged","onTouchEvent","onInterceptTouchEvent","setMaxWidth","setMaxHeight","setSlide","setScrollCallback"));
        ignoreFinalMap.put("FlowLikeView", ArrayUtils.asListArgs("initAttrs","onMeasure","onSizeChanged","generateCTRLPointF","generateCurveAnimation","generateEnterAnimation","startAnimation","setDrawables","setIconWidth","setIconHeight","setAnimDuration"));
        ignoreFinalMap.put("FlowLikeView.AnimationEndListener", ArrayUtils.asListArgs("onAnimationEnd"));
        ignoreFinalMap.put("FlowLikeView.CurveEvaluator", ArrayUtils.asListArgs("evaluate"));
        ignoreFinalMap.put("FlowLikeView.CurveUpdateLister", ArrayUtils.asListArgs("onAnimationUpdate"));
        ignoreFinalMap.put("LimitLayout", ArrayUtils.asListArgs("initAttrs","onMeasure","setMaxWidth","setMaxHeight"));
        ignoreFinalMap.put("LineTextView", ArrayUtils.asListArgs("onDraw","setNewLineCallback"));
        ignoreFinalMap.put("LoadProgressBar", ArrayUtils.asListArgs("initAttrs","onDraw","drawProgressText","drawProgressText","setMax","setProgress","setProgressColor","setOuterRingColor","setInsideCircleWidth","setOuterRingWidth","setCanvasNumber","setNumberTextSize","setNumberTextColor","setProgressStyle"));
        ignoreFinalMap.put("RadiusAttrs", ArrayUtils.asListArgs("onSizeChanged","setRadius","setRadiusLeftTop","setRadiusLeftBottom","setRadiusRightTop","setRadiusRightBottom","setRadiusLeft","setRadiusRight","setRadiusTop","setRadiusBottom","onSaveInstanceState","onRestoreInstanceState"));
        ignoreFinalMap.put("RadiusLayout", ArrayUtils.asListArgs("initAttrs","onSizeChanged","draw","onRestoreInstanceState","setRadius","setRadiusLeftTop","setRadiusLeftBottom","setRadiusRightTop","setRadiusRightBottom","setRadiusLeft","setRadiusRight","setRadiusTop","setRadiusBottom"));
        ignoreFinalMap.put("RightIconEditText", ArrayUtils.asListArgs("setCompoundDrawables","onTouchEvent","setRangeMultiple","setDrawRightIcon","setRightIcon","setTextWatcher","init"));
        ignoreFinalMap.put("ScanShapeView", ArrayUtils.asListArgs("onDraw","setShapeType","setCornerEffect","setRegion","setRegion","setRegion","getRegion","setBorderMargin","setBorderColor","setBorderWidth","setDrawBorder","setDrawBackground","setBGColor","setDrawAnim","setAutoAnim","setBorderToSquare","setBorderWidthToSquare","setTriAngleLength","setSpecialToSquare","setLineDurationToSquare","setBitmapToSquare","setLineMarginTopToSquare","setLineMarginLeftToSquare","setLineColorToSquare","setLineWidthToHexagon","setLineMarginToHexagon","setLineAnimDirection","setLineColorToHexagon","setBitmapToAnnulus","setLineColorToAnnulus","setLineOffsetSpeedToAnnulus","setAnnulusDraws","setAnnulusColors","setAnnulusLengths","setAnnulusWidths","setAnnulusMargins","sin","calcShapeRegion","makeShape","makeBackground","makeAnim","drawAnim","resetAnim","animSwitch"));
        ignoreFinalMap.put("SignView", ArrayUtils.asListArgs("onDraw","onTouchEvent","_resetCanvas","setPath","setPaint","setDrawCallback"));
        ignoreFinalMap.put("StateLayout", ArrayUtils.asListArgs("setGlobal","setListener","showType","register","unregister","unregister","setTag","setData","getData","setData","getView"));
        ignoreFinalMap.put("StateLayout.Global", ArrayUtils.asListArgs("register","unregister"));
        ignoreFinalMap.put("StateLayout.TypeAdapter", ArrayUtils.asListArgs("onCreateView","onBindView"));
        ignoreFinalMap.put("ViewAssist", ArrayUtils.asListArgs("wrap","wrap","showType","register","unregister","unregister","setTag","setData","getData","setData","getAdapter","getView","setListener"));
        ignoreFinalMap.put("WrapView", ArrayUtils.asListArgs("initAttrs","onMeasure","onLayout","setMaxLine","setRowTopMargin","setViewLeftMargin","setRowViewMargin"));

        return ignoreFinalMap;
    }

    /**
     * 获取忽略指定方法 static 修饰符配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreStaticMap() {
        Map<String, List<String>> ignoreStaticMap = new HashMap<>();
        ignoreStaticMap.put("AdjustHeightGridView", ArrayUtils.asListArgs("onMeasure"));
        ignoreStaticMap.put("AdjustHeightListView", ArrayUtils.asListArgs("onMeasure"));
        ignoreStaticMap.put("AdjustHeightRecyclerView", ArrayUtils.asListArgs("onMeasure"));
        ignoreStaticMap.put("AdjustHeightWebView", ArrayUtils.asListArgs("onMeasure"));
        ignoreStaticMap.put("CornerLabelView", ArrayUtils.asListArgs("initAttrs","onMeasure","onDraw","calcPath","getPainter1","getPainter2","setPaddingTop","setPaddingCenter","setPaddingBottom","setFillColor","setFillShader","left","right","top","bottom","triangle","setText1","setTextColor1","setTextHeight1","setTextBold1","setText2","setTextColor2","setTextHeight2","setTextBold2","refresh"));
        ignoreStaticMap.put("CornerLabelView.Painter", ArrayUtils.asListArgs("init","draw","getPaint","getText","getTextColor","getTextHeight","isTextBold"));
        ignoreStaticMap.put("CustomGallery", ArrayUtils.asListArgs("initAttrs","onMeasure","onFling","onTouchEvent","onInterceptTouchEvent","isScrollingLeft","getMaxWidth","setMaxWidth","getMaxHeight","setMaxHeight","isSlide","setSlide","toggleSlide"));
        ignoreStaticMap.put("CustomHorizontalScrollView", ArrayUtils.asListArgs("initAttrs","onMeasure","onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent","getMaxWidth","setMaxWidth","getMaxHeight","setMaxHeight","isSlide","setSlide","toggleSlide","setScrollCallback"));
        ignoreStaticMap.put("CustomNestedScrollView", ArrayUtils.asListArgs("initAttrs","onMeasure","onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent","getMaxWidth","setMaxWidth","getMaxHeight","setMaxHeight","isSlide","setSlide","toggleSlide","setScrollCallback"));
        ignoreStaticMap.put("CustomRecyclerView", ArrayUtils.asListArgs("initAttrs","onMeasure","onScrolled","onScrollStateChanged","onTouchEvent","onInterceptTouchEvent","getMaxWidth","setMaxWidth","getMaxHeight","setMaxHeight","isSlide","setSlide","toggleSlide","setScrollCallback"));
        ignoreStaticMap.put("CustomScrollView", ArrayUtils.asListArgs("initAttrs","onMeasure","onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent","getMaxWidth","setMaxWidth","getMaxHeight","setMaxHeight","isSlide","setSlide","toggleSlide","setScrollCallback"));
        ignoreStaticMap.put("CustomViewPager", ArrayUtils.asListArgs("initAttrs","onMeasure","onTouchEvent","onInterceptTouchEvent","getMaxWidth","setMaxWidth","getMaxHeight","setMaxHeight","isSlide","setSlide","toggleSlide"));
        ignoreStaticMap.put("CustomWebView", ArrayUtils.asListArgs("initAttrs","onMeasure","onScrollChanged","onTouchEvent","onInterceptTouchEvent","getMaxWidth","setMaxWidth","getMaxHeight","setMaxHeight","isSlide","setSlide","toggleSlide","setScrollCallback"));
        ignoreStaticMap.put("FlowLikeView", ArrayUtils.asListArgs("initAttrs","onMeasure","onSizeChanged","generateCTRLPointF","generateCurveAnimation","generateEnterAnimation","startAnimation","resetLayoutParams","like","getDrawables","setDrawables","setDrawablesById","getIconWidth","setIconWidth","getIconHeight","setIconHeight","getAnimDuration","setAnimDuration"));
        ignoreStaticMap.put("FlowLikeView.AnimationEndListener", ArrayUtils.asListArgs("onAnimationEnd"));
        ignoreStaticMap.put("FlowLikeView.CurveEvaluator", ArrayUtils.asListArgs("evaluate"));
        ignoreStaticMap.put("FlowLikeView.CurveUpdateLister", ArrayUtils.asListArgs("onAnimationUpdate"));
        ignoreStaticMap.put("LimitLayout", ArrayUtils.asListArgs("initAttrs","onMeasure","getMaxWidth","setMaxWidth","getMaxHeight","setMaxHeight"));
        ignoreStaticMap.put("LineTextView", ArrayUtils.asListArgs("onDraw","isNewLine","setNewLineCallback"));
        ignoreStaticMap.put("LoadProgressBar", ArrayUtils.asListArgs("initAttrs","init","onDraw","drawProgressText","drawProgressText","reset","getMax","setMax","getProgress","setProgress","getProgressColor","setProgressColor","getOuterRingColor","setOuterRingColor","getInsideCircleWidth","setInsideCircleWidth","getOuterRingWidth","setOuterRingWidth","isCanvasNumber","setCanvasNumber","getNumberTextSize","setNumberTextSize","getNumberTextColor","setNumberTextColor","getProgressStyle","setProgressStyle"));
        ignoreStaticMap.put("RadiusAttrs", ArrayUtils.asListArgs("resetRadius","onSizeChanged","getPath","setRadius","setRadiusLeftTop","setRadiusLeftBottom","setRadiusRightTop","setRadiusRightBottom","setRadiusLeft","setRadiusRight","setRadiusTop","setRadiusBottom","getRadius","getRadiusLeftTop","getRadiusLeftBottom","getRadiusRightTop","getRadiusRightBottom","onSaveInstanceState","onRestoreInstanceState"));
        ignoreStaticMap.put("RadiusLayout", ArrayUtils.asListArgs("initAttrs","onSizeChanged","draw","onSaveInstanceState","onRestoreInstanceState","setRadius","setRadiusLeftTop","setRadiusLeftBottom","setRadiusRightTop","setRadiusRightBottom","setRadiusLeft","setRadiusRight","setRadiusTop","setRadiusBottom","getRadius","getRadiusLeftTop","getRadiusLeftBottom","getRadiusRightTop","getRadiusRightBottom"));
        ignoreStaticMap.put("RightIconEditText", ArrayUtils.asListArgs("setCompoundDrawables","onTouchEvent","finalize","getRangeMultiple","setRangeMultiple","isDrawRightIcon","setDrawRightIcon","getRightIcon","setRightIcon","setTextWatcher","init","drawOperate"));
        ignoreStaticMap.put("ScanShapeView", ArrayUtils.asListArgs("init","handlerCornerPathEffect","onDraw","destroy","getShapeType","setShapeType","getCornerRadius","setCornerEffect","setRegion","setRegion","setRegion","getRegionLeft","getRegionTop","getRegionWidth","getRegionHeight","getRegion","getRegion","getRegionParent","getBorderMargin","setBorderMargin","getBorderColor","setBorderColor","getBorderWidth","setBorderWidth","isDrawBorder","setDrawBorder","isDrawBackground","setDrawBackground","getBGColor","setBGColor","isDrawAnim","setDrawAnim","isAutoAnim","setAutoAnim","getBorderToSquare","setBorderToSquare","getBorderWidthToSquare","setBorderWidthToSquare","getTriAngleLength","setTriAngleLength","isSpecialToSquare","setSpecialToSquare","getLineDurationToSquare","setLineDurationToSquare","getBitmapToSquare","setBitmapToSquare","getLineMarginTopToSquare","setLineMarginTopToSquare","getLineMarginLeftToSquare","setLineMarginLeftToSquare","getLineColorToSquare","setLineColorToSquare","getLineWidthToHexagon","setLineWidthToHexagon","getLineMarginToHexagon","setLineMarginToHexagon","isLineAnimDirection","setLineAnimDirection","getLineColorToHexagon","setLineColorToHexagon","getBitmapToAnnulus","setBitmapToAnnulus","getLineColorToAnnulus","setLineColorToAnnulus","getLineOffsetSpeedToAnnulus","setLineOffsetSpeedToAnnulus","getAnnulusDraws","setAnnulusDraws","getAnnulusColors","setAnnulusColors","getAnnulusLengths","setAnnulusLengths","getAnnulusWidths","setAnnulusWidths","getAnnulusMargins","setAnnulusMargins","refPaintToAnnulus","sin","getRegionMarginLeft","getRegionMarginTop","calcShapeRegion","calcShapeRegion","makeShape","makeBackground","makeAnim","drawAnim","resetAnim","startAnim","stopAnim","animSwitch","isAnimRunning","refLineColorToSquare","refLineColorToHexagon","refLineColorToAnnulus","initAnim"));
        ignoreStaticMap.put("ScanShapeView.CornerEffect", ArrayUtils.asListArgs("getRadius"));
        ignoreStaticMap.put("SignView", ArrayUtils.asListArgs("onDraw","onTouchEvent","_resetCanvas","clearCanvas","snapshotByView","getPath","setPath","getPaint","setPaint","setDrawCallback"));
        ignoreStaticMap.put("StateLayout", ArrayUtils.asListArgs("reset","init","setListener","showIng","showFailed","showSuccess","showEmptyData","showType","notifyDataSetChanged","gone","visible","register","unregister","unregister","getTag","setTag","getData","setData","getData","setData","getView","getCurrentType","getCurrentView"));
        ignoreStaticMap.put("StateLayout.Global", ArrayUtils.asListArgs("register","unregister"));
        ignoreStaticMap.put("StateLayout.TypeAdapter", ArrayUtils.asListArgs("onCreateView","onBindView"));
        ignoreStaticMap.put("ViewAssist", ArrayUtils.asListArgs("showIng","showFailed","showSuccess","showEmptyData","showType","notifyDataSetChanged","gone","visible","register","unregister","unregister","reset","getWrapper","getTag","setTag","getData","setData","getData","setData","getAdapter","getView","getCurrentType","getCurrentView","setListener"));
        ignoreStaticMap.put("WrapView", ArrayUtils.asListArgs("initAttrs","onMeasure","onLayout","calc","refreshDraw","getRowLine","getMaxLine","setMaxLine","getRowTopMargin","setRowTopMargin","getViewLeftMargin","setViewLeftMargin","setRowViewMargin"));

        return ignoreStaticMap;
    }

    /**
     * 获取忽略指定方法 @param 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreParamMap() {
        Map<String, List<String>> ignoreParamMap = new HashMap<>();
        ignoreParamMap.put("AdjustHeightGridView", ArrayUtils.asListArgs("onMeasure"));
        ignoreParamMap.put("AdjustHeightListView", ArrayUtils.asListArgs("onMeasure"));
        ignoreParamMap.put("AdjustHeightRecyclerView", ArrayUtils.asListArgs("onMeasure"));
        ignoreParamMap.put("AdjustHeightWebView", ArrayUtils.asListArgs("onMeasure"));
        ignoreParamMap.put("CornerLabelView", ArrayUtils.asListArgs("onMeasure","onDraw"));
        ignoreParamMap.put("CustomGallery", ArrayUtils.asListArgs("onMeasure","onFling","onTouchEvent","onInterceptTouchEvent"));
        ignoreParamMap.put("CustomHorizontalScrollView", ArrayUtils.asListArgs("onMeasure","onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent"));
        ignoreParamMap.put("CustomNestedScrollView", ArrayUtils.asListArgs("onMeasure","onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent"));
        ignoreParamMap.put("CustomRecyclerView", ArrayUtils.asListArgs("onMeasure","onScrolled","onScrollStateChanged","onTouchEvent","onInterceptTouchEvent"));
        ignoreParamMap.put("CustomScrollView", ArrayUtils.asListArgs("onMeasure","onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent"));
        ignoreParamMap.put("CustomViewPager", ArrayUtils.asListArgs("onMeasure","onTouchEvent","onInterceptTouchEvent"));
        ignoreParamMap.put("CustomViewPager.OnDirectionListener", ArrayUtils.asListArgs("onPageScrolled","onPageScrollStateChanged"));
        ignoreParamMap.put("CustomWebView", ArrayUtils.asListArgs("onMeasure","onScrollChanged","onTouchEvent","onInterceptTouchEvent"));
        ignoreParamMap.put("FlowLikeView", ArrayUtils.asListArgs("onMeasure","onSizeChanged"));
        ignoreParamMap.put("FlowLikeView.AnimationEndListener", ArrayUtils.asListArgs("onAnimationEnd"));
        ignoreParamMap.put("FlowLikeView.CurveEvaluator", ArrayUtils.asListArgs("evaluate"));
        ignoreParamMap.put("FlowLikeView.CurveUpdateLister", ArrayUtils.asListArgs("onAnimationUpdate"));
        ignoreParamMap.put("LimitLayout", ArrayUtils.asListArgs("onMeasure"));
        ignoreParamMap.put("LineTextView", ArrayUtils.asListArgs("onDraw"));
        ignoreParamMap.put("LoadProgressBar", ArrayUtils.asListArgs("onDraw"));
        ignoreParamMap.put("RadiusAttrs", ArrayUtils.asListArgs("onSaveInstanceState","onRestoreInstanceState"));
        ignoreParamMap.put("RadiusLayout", ArrayUtils.asListArgs("onSizeChanged","draw","onRestoreInstanceState"));
        ignoreParamMap.put("RightIconEditText", ArrayUtils.asListArgs("setCompoundDrawables","onTouchEvent"));
        ignoreParamMap.put("ScanShapeView", ArrayUtils.asListArgs("onDraw"));
        ignoreParamMap.put("SignView", ArrayUtils.asListArgs("onDraw","onTouchEvent"));
        ignoreParamMap.put("StateLayout", ArrayUtils.asListArgs("setGlobal","setListener","showType","setTag","setData","getData","setData","getView"));
        ignoreParamMap.put("StateLayout.Listener", ArrayUtils.asListArgs("onRemove","onNotFound","onChange"));
        ignoreParamMap.put("StateLayout.TypeAdapter", ArrayUtils.asListArgs("onCreateView","onBindView"));
        ignoreParamMap.put("ViewAssist", ArrayUtils.asListArgs("setTag","setData","getData","setData","getAdapter","getView","setListener"));
        ignoreParamMap.put("ViewAssist.Adapter", ArrayUtils.asListArgs("onCreateView","onBindView"));
        ignoreParamMap.put("ViewAssist.Listener", ArrayUtils.asListArgs("onRemove","onNotFound","onChange"));
        ignoreParamMap.put("WrapView", ArrayUtils.asListArgs("onMeasure","onLayout"));

        return ignoreParamMap;
    }

    /**
     * 获取忽略指定方法 @return 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreReturnMap() {
        Map<String, List<String>> ignoreReturnMap = new HashMap<>();
        
        return ignoreReturnMap;
    }

    /**
     * 获取忽略指定方法非 public 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreUnPublicMap() {
        Map<String, List<String>> ignoreUnPublicMap = new HashMap<>();
        ignoreUnPublicMap.put("AdjustHeightGridView", ArrayUtils.asListArgs("onMeasure"));
        ignoreUnPublicMap.put("AdjustHeightListView", ArrayUtils.asListArgs("onMeasure"));
        ignoreUnPublicMap.put("AdjustHeightRecyclerView", ArrayUtils.asListArgs("onMeasure"));
        ignoreUnPublicMap.put("AdjustHeightWebView", ArrayUtils.asListArgs("onMeasure"));
        ignoreUnPublicMap.put("CornerLabelView", ArrayUtils.asListArgs("initAttrs","onMeasure","onDraw","calcPath"));
        ignoreUnPublicMap.put("CornerLabelView.Painter", ArrayUtils.asListArgs("init","draw"));
        ignoreUnPublicMap.put("CustomGallery", ArrayUtils.asListArgs("initAttrs","onMeasure","isScrollingLeft"));
        ignoreUnPublicMap.put("CustomHorizontalScrollView", ArrayUtils.asListArgs("initAttrs","onMeasure","onScrollChanged","computeScrollDeltaToGetChildRectOnScreen"));
        ignoreUnPublicMap.put("CustomHorizontalScrollView.ScrollCallback", ArrayUtils.asListArgs("onScrollChanged"));
        ignoreUnPublicMap.put("CustomNestedScrollView", ArrayUtils.asListArgs("initAttrs","onMeasure","onScrollChanged","computeScrollDeltaToGetChildRectOnScreen"));
        ignoreUnPublicMap.put("CustomNestedScrollView.ScrollCallback", ArrayUtils.asListArgs("onScrollChanged"));
        ignoreUnPublicMap.put("CustomRecyclerView", ArrayUtils.asListArgs("initAttrs","onMeasure"));
        ignoreUnPublicMap.put("CustomRecyclerView.ScrollCallback", ArrayUtils.asListArgs("onScrollStateChanged","onScrollChanged"));
        ignoreUnPublicMap.put("CustomScrollView", ArrayUtils.asListArgs("initAttrs","onMeasure","onScrollChanged","computeScrollDeltaToGetChildRectOnScreen"));
        ignoreUnPublicMap.put("CustomScrollView.ScrollCallback", ArrayUtils.asListArgs("onScrollChanged"));
        ignoreUnPublicMap.put("CustomViewPager", ArrayUtils.asListArgs("initAttrs","onMeasure"));
        ignoreUnPublicMap.put("CustomWebView", ArrayUtils.asListArgs("initAttrs","onMeasure","onScrollChanged"));
        ignoreUnPublicMap.put("CustomWebView.ScrollCallback", ArrayUtils.asListArgs("onScrollChanged"));
        ignoreUnPublicMap.put("FlowLikeView", ArrayUtils.asListArgs("initAttrs","onMeasure","onSizeChanged","generateCTRLPointF","generateCurveAnimation","generateEnterAnimation","startAnimation","resetLayoutParams"));
        ignoreUnPublicMap.put("LimitLayout", ArrayUtils.asListArgs("initAttrs","onMeasure"));
        ignoreUnPublicMap.put("LineTextView", ArrayUtils.asListArgs("onDraw"));
        ignoreUnPublicMap.put("LineTextView.OnNewLineCallback", ArrayUtils.asListArgs("onNewLine"));
        ignoreUnPublicMap.put("LoadProgressBar", ArrayUtils.asListArgs("initAttrs","init","onDraw","drawProgressText","drawProgressText"));
        ignoreUnPublicMap.put("RadiusAttrs", ArrayUtils.asListArgs("resetRadius"));
        ignoreUnPublicMap.put("RadiusLayout", ArrayUtils.asListArgs("initAttrs","onSizeChanged","onSaveInstanceState","onRestoreInstanceState"));
        ignoreUnPublicMap.put("RightIconEditText", ArrayUtils.asListArgs("finalize","init","drawOperate"));
        ignoreUnPublicMap.put("ScanShapeView", ArrayUtils.asListArgs("init","handlerCornerPathEffect","onDraw","refPaintToAnnulus","sin","getRegionMarginLeft","getRegionMarginTop","calcShapeRegion","calcShapeRegion","makeShape","makeBackground","makeAnim","drawAnim","resetAnim","animSwitch","refLineColorToSquare","refLineColorToHexagon","refLineColorToAnnulus","initAnim"));
        ignoreUnPublicMap.put("SignView", ArrayUtils.asListArgs("onDraw","_resetCanvas"));
        ignoreUnPublicMap.put("StateLayout", ArrayUtils.asListArgs("init"));
        ignoreUnPublicMap.put("StateLayout.Listener", ArrayUtils.asListArgs("onRemove","onNotFound","onChange"));
        ignoreUnPublicMap.put("ViewAssist.Adapter", ArrayUtils.asListArgs("onCreateView","onBindView"));
        ignoreUnPublicMap.put("ViewAssist.Listener", ArrayUtils.asListArgs("onRemove","onNotFound","onChange"));
        ignoreUnPublicMap.put("WrapView", ArrayUtils.asListArgs("initAttrs","onMeasure","onLayout","calc"));

        return ignoreUnPublicMap;
    }

    /**
     * 获取忽略无修饰符变量处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreModifierVariableMap() {
        Map<String, List<String>> ignoreModifierVariableMap = new HashMap<>();
        
        return ignoreModifierVariableMap;
    }

    /**
     * 获取忽略指定方法 return void 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreReturnVoidMap() {
        Map<String, List<String>> ignoreReturnVoidMap = new HashMap<>();
        ignoreReturnVoidMap.put("CornerLabelView", ArrayUtils.asListArgs("initAttrs - void"));
        ignoreReturnVoidMap.put("CornerLabelView.Painter", ArrayUtils.asListArgs("init - void","draw - void"));
        ignoreReturnVoidMap.put("CustomGallery", ArrayUtils.asListArgs("initAttrs - void"));
        ignoreReturnVoidMap.put("CustomHorizontalScrollView", ArrayUtils.asListArgs("initAttrs - void"));
        ignoreReturnVoidMap.put("CustomHorizontalScrollView.ScrollCallback", ArrayUtils.asListArgs("onScrollChanged - void"));
        ignoreReturnVoidMap.put("CustomNestedScrollView", ArrayUtils.asListArgs("initAttrs - void"));
        ignoreReturnVoidMap.put("CustomNestedScrollView.ScrollCallback", ArrayUtils.asListArgs("onScrollChanged - void"));
        ignoreReturnVoidMap.put("CustomRecyclerView", ArrayUtils.asListArgs("initAttrs - void"));
        ignoreReturnVoidMap.put("CustomRecyclerView.ScrollCallback", ArrayUtils.asListArgs("onScrollStateChanged - void","onScrollChanged - void"));
        ignoreReturnVoidMap.put("CustomScrollView", ArrayUtils.asListArgs("initAttrs - void"));
        ignoreReturnVoidMap.put("CustomScrollView.ScrollCallback", ArrayUtils.asListArgs("onScrollChanged - void"));
        ignoreReturnVoidMap.put("CustomViewPager", ArrayUtils.asListArgs("initAttrs - void"));
        ignoreReturnVoidMap.put("CustomViewPager.OnDirectionListener", ArrayUtils.asListArgs("onSlideDirection - void"));
        ignoreReturnVoidMap.put("CustomWebView", ArrayUtils.asListArgs("initAttrs - void"));
        ignoreReturnVoidMap.put("CustomWebView.ScrollCallback", ArrayUtils.asListArgs("onScrollChanged - void"));
        ignoreReturnVoidMap.put("FlowLikeView", ArrayUtils.asListArgs("initAttrs - void","startAnimation - void","resetLayoutParams - void","like - void"));
        ignoreReturnVoidMap.put("LimitLayout", ArrayUtils.asListArgs("initAttrs - void"));
        ignoreReturnVoidMap.put("LineTextView.OnNewLineCallback", ArrayUtils.asListArgs("onNewLine - void"));
        ignoreReturnVoidMap.put("LoadProgressBar", ArrayUtils.asListArgs("initAttrs - void","drawProgressText - void","drawProgressText - void"));
        ignoreReturnVoidMap.put("RadiusAttrs", ArrayUtils.asListArgs("resetRadius - void","onSizeChanged - void","setRadius - void","setRadiusLeftTop - void","setRadiusLeftBottom - void","setRadiusRightTop - void","setRadiusRightBottom - void","setRadiusLeft - void","setRadiusRight - void","setRadiusTop - void","setRadiusBottom - void"));
        ignoreReturnVoidMap.put("RadiusLayout", ArrayUtils.asListArgs("initAttrs - void"));
        ignoreReturnVoidMap.put("RightIconEditText", ArrayUtils.asListArgs("init - void","drawOperate - void"));
        ignoreReturnVoidMap.put("ScanShapeView", ArrayUtils.asListArgs("init - void","handlerCornerPathEffect - void","destroy - void","refPaintToAnnulus - void","makeBackground - void","makeAnim - void","drawAnim - void","resetAnim - void","startAnim - void","stopAnim - void","animSwitch - void","refLineColorToSquare - void","refLineColorToHexagon - void","refLineColorToAnnulus - void","initAnim - void"));
        ignoreReturnVoidMap.put("SignView", ArrayUtils.asListArgs("_resetCanvas - void"));
        ignoreReturnVoidMap.put("StateLayout", ArrayUtils.asListArgs("init - void"));
        ignoreReturnVoidMap.put("ViewAssist", ArrayUtils.asListArgs("showType - void"));
        ignoreReturnVoidMap.put("WrapView", ArrayUtils.asListArgs("initAttrs - void","refreshDraw - void"));

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