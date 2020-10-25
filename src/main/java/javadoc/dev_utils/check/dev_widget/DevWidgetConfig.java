package javadoc.dev_utils.check.dev_widget;

import javadoc.Utils;
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
        ignoreAnnotateMap.put("AdjustHeightGridView", Utils.asListArgs("onMeasure"));
        ignoreAnnotateMap.put("AdjustHeightListView", Utils.asListArgs("onMeasure"));
        ignoreAnnotateMap.put("AdjustHeightRecyclerView", Utils.asListArgs("onMeasure"));
        ignoreAnnotateMap.put("AdjustHeightWebView", Utils.asListArgs("onMeasure"));
        ignoreAnnotateMap.put("CornerLabelView", Utils.asListArgs("onMeasure","onDraw"));
        ignoreAnnotateMap.put("CustomGallery", Utils.asListArgs("onMeasure","onFling","onTouchEvent","onInterceptTouchEvent"));
        ignoreAnnotateMap.put("CustomHorizontalScrollView", Utils.asListArgs("onMeasure","onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent"));
        ignoreAnnotateMap.put("CustomNestedScrollView", Utils.asListArgs("onMeasure","onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent"));
        ignoreAnnotateMap.put("CustomRecyclerView", Utils.asListArgs("onMeasure","onScrolled","onScrollStateChanged","onTouchEvent","onInterceptTouchEvent"));
        ignoreAnnotateMap.put("CustomScrollView", Utils.asListArgs("onMeasure","onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent"));
        ignoreAnnotateMap.put("CustomViewPager", Utils.asListArgs("onMeasure","onTouchEvent","onInterceptTouchEvent"));
        ignoreAnnotateMap.put("CustomViewPager.OnDirectionListener", Utils.asListArgs("onPageScrolled","onPageScrollStateChanged"));
        ignoreAnnotateMap.put("CustomWebView", Utils.asListArgs("onMeasure","onScrollChanged","onTouchEvent","onInterceptTouchEvent"));
        ignoreAnnotateMap.put("FlowLikeView", Utils.asListArgs("onMeasure","onSizeChanged"));
        ignoreAnnotateMap.put("FlowLikeView.AnimationEndListener", Utils.asListArgs("onAnimationEnd"));
        ignoreAnnotateMap.put("FlowLikeView.CurveEvaluator", Utils.asListArgs("evaluate"));
        ignoreAnnotateMap.put("FlowLikeView.CurveUpdateLister", Utils.asListArgs("onAnimationUpdate"));
        ignoreAnnotateMap.put("LimitLayout", Utils.asListArgs("onMeasure"));
        ignoreAnnotateMap.put("LineTextView", Utils.asListArgs("onDraw"));
        ignoreAnnotateMap.put("LoadProgressBar", Utils.asListArgs("onDraw"));
        ignoreAnnotateMap.put("RadiusAttrs", Utils.asListArgs("onSaveInstanceState","onRestoreInstanceState"));
        ignoreAnnotateMap.put("RadiusLayout", Utils.asListArgs("onSizeChanged","draw","onSaveInstanceState","onRestoreInstanceState"));
        ignoreAnnotateMap.put("RightIconEditText", Utils.asListArgs("setCompoundDrawables","onTouchEvent","finalize"));
        ignoreAnnotateMap.put("ScanShapeView", Utils.asListArgs("onDraw"));
        ignoreAnnotateMap.put("ScanShapeView.CornerEffect", Utils.asListArgs("getRadius"));
        ignoreAnnotateMap.put("SignView", Utils.asListArgs("onDraw","onTouchEvent"));
        ignoreAnnotateMap.put("StateLayout", Utils.asListArgs("setGlobal","setListener","showIng","showFailed","showSuccess","showEmptyData","showType","notifyDataSetChanged","gone","visible","getTag","setTag","getData","setData","getData","setData","getView","getCurrentType","getCurrentView"));
        ignoreAnnotateMap.put("StateLayout.Listener", Utils.asListArgs("onRemove","onNotFound","onChange"));
        ignoreAnnotateMap.put("StateLayout.TypeAdapter", Utils.asListArgs("onCreateView","onBindView"));
        ignoreAnnotateMap.put("ViewAssist", Utils.asListArgs("showIng","showFailed","showSuccess","showEmptyData","notifyDataSetChanged","gone","visible","getWrapper","getTag","setTag","getData","setData","getData","setData","getAdapter","getView","getCurrentType","getCurrentView","setListener"));
        ignoreAnnotateMap.put("ViewAssist.Adapter", Utils.asListArgs("onCreateView","onBindView"));
        ignoreAnnotateMap.put("ViewAssist.Listener", Utils.asListArgs("onRemove","onNotFound","onChange"));
        ignoreAnnotateMap.put("WrapView", Utils.asListArgs("onMeasure","onLayout"));

        return ignoreAnnotateMap;
    }

    /**
     * 获取忽略指定方法参数 final 修饰符配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreFinalMap() {
        Map<String, List<String>> ignoreFinalMap = new HashMap<>();
        ignoreFinalMap.put("AdjustHeightGridView", Utils.asListArgs("onMeasure"));
        ignoreFinalMap.put("AdjustHeightListView", Utils.asListArgs("onMeasure"));
        ignoreFinalMap.put("AdjustHeightRecyclerView", Utils.asListArgs("onMeasure"));
        ignoreFinalMap.put("AdjustHeightWebView", Utils.asListArgs("onMeasure"));
        ignoreFinalMap.put("CornerLabelView", Utils.asListArgs("initAttrs","onMeasure","onDraw","setPaddingTop","setPaddingCenter","setPaddingBottom","setFillColor","setFillShader","triangle","setText1","setTextColor1","setTextHeight1","setTextBold1","setText2","setTextColor2","setTextHeight2","setTextBold2"));
        ignoreFinalMap.put("CornerLabelView.Painter", Utils.asListArgs("draw"));
        ignoreFinalMap.put("CustomGallery", Utils.asListArgs("initAttrs","onMeasure","onFling","onTouchEvent","onInterceptTouchEvent","isScrollingLeft","setMaxWidth","setMaxHeight","setSlide"));
        ignoreFinalMap.put("CustomHorizontalScrollView", Utils.asListArgs("initAttrs","onMeasure","onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent","setMaxWidth","setMaxHeight","setSlide","setScrollCallBack"));
        ignoreFinalMap.put("CustomNestedScrollView", Utils.asListArgs("initAttrs","onMeasure","onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent","setMaxWidth","setMaxHeight","setSlide","setScrollCallBack"));
        ignoreFinalMap.put("CustomRecyclerView", Utils.asListArgs("initAttrs","onMeasure","onScrolled","onScrollStateChanged","onTouchEvent","onInterceptTouchEvent","setMaxWidth","setMaxHeight","setSlide","setScrollCallBack"));
        ignoreFinalMap.put("CustomScrollView", Utils.asListArgs("initAttrs","onMeasure","onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent","setMaxWidth","setMaxHeight","setSlide","setScrollCallBack"));
        ignoreFinalMap.put("CustomViewPager", Utils.asListArgs("initAttrs","onMeasure","onTouchEvent","onInterceptTouchEvent","setMaxWidth","setMaxHeight","setSlide"));
        ignoreFinalMap.put("CustomWebView", Utils.asListArgs("initAttrs","onMeasure","onScrollChanged","onTouchEvent","onInterceptTouchEvent","setMaxWidth","setMaxHeight","setSlide","setScrollCallBack"));
        ignoreFinalMap.put("FlowLikeView", Utils.asListArgs("initAttrs","onMeasure","onSizeChanged","generateCTRLPointF","generateCurveAnimation","generateEnterAnimation","startAnimation","setDrawables","setIconWidth","setIconHeight","setAnimDuration"));
        ignoreFinalMap.put("FlowLikeView.AnimationEndListener", Utils.asListArgs("onAnimationEnd"));
        ignoreFinalMap.put("FlowLikeView.CurveEvaluator", Utils.asListArgs("evaluate"));
        ignoreFinalMap.put("FlowLikeView.CurveUpdateLister", Utils.asListArgs("onAnimationUpdate"));
        ignoreFinalMap.put("LimitLayout", Utils.asListArgs("initAttrs","onMeasure","setMaxWidth","setMaxHeight"));
        ignoreFinalMap.put("LineTextView", Utils.asListArgs("onDraw","setNewLineCallBack"));
        ignoreFinalMap.put("LoadProgressBar", Utils.asListArgs("initAttrs","onDraw","drawProgressText","drawProgressText","setMax","setProgress","setProgressColor","setOuterRingColor","setInsideCircleWidth","setOuterRingWidth","setCanvasNumber","setNumberTextSize","setNumberTextColor","setProgressStyle"));
        ignoreFinalMap.put("RadiusAttrs", Utils.asListArgs("onSizeChanged","setRadius","setRadiusLeftTop","setRadiusLeftBottom","setRadiusRightTop","setRadiusRightBottom","setRadiusLeft","setRadiusRight","setRadiusTop","setRadiusBottom","onSaveInstanceState","onRestoreInstanceState"));
        ignoreFinalMap.put("RadiusLayout", Utils.asListArgs("initAttrs","onSizeChanged","draw","onRestoreInstanceState","setRadius","setRadiusLeftTop","setRadiusLeftBottom","setRadiusRightTop","setRadiusRightBottom","setRadiusLeft","setRadiusRight","setRadiusTop","setRadiusBottom"));
        ignoreFinalMap.put("RightIconEditText", Utils.asListArgs("setCompoundDrawables","onTouchEvent","setRangeMultiple","setDrawRightIcon","setRightIcon","setTextWatcher","init"));
        ignoreFinalMap.put("ScanShapeView", Utils.asListArgs("onDraw","setShapeType","setCornerEffect","setRegion","setRegion","setRegion","getRegion","setBorderMargin","setBorderColor","setBorderWidth","setDrawBorder","setDrawBackground","setBGColor","setDrawAnim","setAutoAnim","setBorderToSquare","setBorderWidthToSquare","setTriAngleLength","setSpecialToSquare","setLineDurationToSquare","setBitmapToSquare","setLineMarginTopToSquare","setLineMarginLeftToSquare","setLineColorToSquare","setLineWidthToHexagon","setLineMarginToHexagon","setLineAnimDirection","setLineColorToHexagon","setBitmapToAnnulus","setLineColorToAnnulus","setLineOffsetSpeedToAnnulus","setAnnulusDraws","setAnnulusColors","setAnnulusLengths","setAnnulusWidths","setAnnulusMargins","sin","calcShapeRegion","makeShape","makeBackground","makeAnim","drawAnim","resetAnim","animSwitch"));
        ignoreFinalMap.put("SignView", Utils.asListArgs("onDraw","onTouchEvent","_resetCanvas","setPath","setPaint","setDrawCallBack"));
        ignoreFinalMap.put("StateLayout", Utils.asListArgs("setGlobal","setListener","showType","register","unregister","unregister","setTag","setData","getData","setData","getView"));
        ignoreFinalMap.put("StateLayout.Global", Utils.asListArgs("register","unregister"));
        ignoreFinalMap.put("StateLayout.TypeAdapter", Utils.asListArgs("onCreateView","onBindView"));
        ignoreFinalMap.put("ViewAssist", Utils.asListArgs("wrap","wrap","showType","register","unregister","unregister","setTag","setData","getData","setData","getAdapter","getView","setListener"));
        ignoreFinalMap.put("WrapView", Utils.asListArgs("initAttrs","onMeasure","onLayout","setMaxLine","setRowTopMargin","setViewLeftMargin","setRowViewMargin"));

        return ignoreFinalMap;
    }

    /**
     * 获取忽略指定方法 static 修饰符配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreStaticMap() {
        Map<String, List<String>> ignoreStaticMap = new HashMap<>();
        ignoreStaticMap.put("AdjustHeightGridView", Utils.asListArgs("onMeasure"));
        ignoreStaticMap.put("AdjustHeightListView", Utils.asListArgs("onMeasure"));
        ignoreStaticMap.put("AdjustHeightRecyclerView", Utils.asListArgs("onMeasure"));
        ignoreStaticMap.put("AdjustHeightWebView", Utils.asListArgs("onMeasure"));
        ignoreStaticMap.put("CornerLabelView", Utils.asListArgs("initAttrs","onMeasure","onDraw","calcPath","getPainter1","getPainter2","setPaddingTop","setPaddingCenter","setPaddingBottom","setFillColor","setFillShader","left","right","top","bottom","triangle","setText1","setTextColor1","setTextHeight1","setTextBold1","setText2","setTextColor2","setTextHeight2","setTextBold2","refresh"));
        ignoreStaticMap.put("CornerLabelView.Painter", Utils.asListArgs("init","draw","getPaint","getText","getTextColor","getTextHeight","isTextBold"));
        ignoreStaticMap.put("CustomGallery", Utils.asListArgs("initAttrs","onMeasure","onFling","onTouchEvent","onInterceptTouchEvent","isScrollingLeft","getMaxWidth","setMaxWidth","getMaxHeight","setMaxHeight","isSlide","setSlide","toggleSlide"));
        ignoreStaticMap.put("CustomHorizontalScrollView", Utils.asListArgs("initAttrs","onMeasure","onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent","getMaxWidth","setMaxWidth","getMaxHeight","setMaxHeight","isSlide","setSlide","toggleSlide","setScrollCallBack"));
        ignoreStaticMap.put("CustomNestedScrollView", Utils.asListArgs("initAttrs","onMeasure","onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent","getMaxWidth","setMaxWidth","getMaxHeight","setMaxHeight","isSlide","setSlide","toggleSlide","setScrollCallBack"));
        ignoreStaticMap.put("CustomRecyclerView", Utils.asListArgs("initAttrs","onMeasure","onScrolled","onScrollStateChanged","onTouchEvent","onInterceptTouchEvent","getMaxWidth","setMaxWidth","getMaxHeight","setMaxHeight","isSlide","setSlide","toggleSlide","setScrollCallBack"));
        ignoreStaticMap.put("CustomScrollView", Utils.asListArgs("initAttrs","onMeasure","onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent","getMaxWidth","setMaxWidth","getMaxHeight","setMaxHeight","isSlide","setSlide","toggleSlide","setScrollCallBack"));
        ignoreStaticMap.put("CustomViewPager", Utils.asListArgs("initAttrs","onMeasure","onTouchEvent","onInterceptTouchEvent","getMaxWidth","setMaxWidth","getMaxHeight","setMaxHeight","isSlide","setSlide","toggleSlide"));
        ignoreStaticMap.put("CustomWebView", Utils.asListArgs("initAttrs","onMeasure","onScrollChanged","onTouchEvent","onInterceptTouchEvent","getMaxWidth","setMaxWidth","getMaxHeight","setMaxHeight","isSlide","setSlide","toggleSlide","setScrollCallBack"));
        ignoreStaticMap.put("FlowLikeView", Utils.asListArgs("initAttrs","onMeasure","onSizeChanged","generateCTRLPointF","generateCurveAnimation","generateEnterAnimation","startAnimation","resetLayoutParams","like","getDrawables","setDrawables","setDrawablesById","getIconWidth","setIconWidth","getIconHeight","setIconHeight","getAnimDuration","setAnimDuration"));
        ignoreStaticMap.put("FlowLikeView.AnimationEndListener", Utils.asListArgs("onAnimationEnd"));
        ignoreStaticMap.put("FlowLikeView.CurveEvaluator", Utils.asListArgs("evaluate"));
        ignoreStaticMap.put("FlowLikeView.CurveUpdateLister", Utils.asListArgs("onAnimationUpdate"));
        ignoreStaticMap.put("LimitLayout", Utils.asListArgs("initAttrs","onMeasure","getMaxWidth","setMaxWidth","getMaxHeight","setMaxHeight"));
        ignoreStaticMap.put("LineTextView", Utils.asListArgs("onDraw","isNewLine","setNewLineCallBack"));
        ignoreStaticMap.put("LoadProgressBar", Utils.asListArgs("initAttrs","init","onDraw","drawProgressText","drawProgressText","reset","getMax","setMax","getProgress","setProgress","getProgressColor","setProgressColor","getOuterRingColor","setOuterRingColor","getInsideCircleWidth","setInsideCircleWidth","getOuterRingWidth","setOuterRingWidth","isCanvasNumber","setCanvasNumber","getNumberTextSize","setNumberTextSize","getNumberTextColor","setNumberTextColor","getProgressStyle","setProgressStyle"));
        ignoreStaticMap.put("RadiusAttrs", Utils.asListArgs("resetRadius","onSizeChanged","getPath","setRadius","setRadiusLeftTop","setRadiusLeftBottom","setRadiusRightTop","setRadiusRightBottom","setRadiusLeft","setRadiusRight","setRadiusTop","setRadiusBottom","getRadius","getRadiusLeftTop","getRadiusLeftBottom","getRadiusRightTop","getRadiusRightBottom","onSaveInstanceState","onRestoreInstanceState"));
        ignoreStaticMap.put("RadiusLayout", Utils.asListArgs("initAttrs","onSizeChanged","draw","onSaveInstanceState","onRestoreInstanceState","setRadius","setRadiusLeftTop","setRadiusLeftBottom","setRadiusRightTop","setRadiusRightBottom","setRadiusLeft","setRadiusRight","setRadiusTop","setRadiusBottom","getRadius","getRadiusLeftTop","getRadiusLeftBottom","getRadiusRightTop","getRadiusRightBottom"));
        ignoreStaticMap.put("RightIconEditText", Utils.asListArgs("setCompoundDrawables","onTouchEvent","finalize","getRangeMultiple","setRangeMultiple","isDrawRightIcon","setDrawRightIcon","getRightIcon","setRightIcon","setTextWatcher","init","drawOperate"));
        ignoreStaticMap.put("ScanShapeView", Utils.asListArgs("init","handlerCornerPathEffect","onDraw","destroy","getShapeType","setShapeType","getCornerRadius","setCornerEffect","setRegion","setRegion","setRegion","getRegionLeft","getRegionTop","getRegionWidth","getRegionHeight","getRegion","getRegion","getRegionParent","getBorderMargin","setBorderMargin","getBorderColor","setBorderColor","getBorderWidth","setBorderWidth","isDrawBorder","setDrawBorder","isDrawBackground","setDrawBackground","getBGColor","setBGColor","isDrawAnim","setDrawAnim","isAutoAnim","setAutoAnim","getBorderToSquare","setBorderToSquare","getBorderWidthToSquare","setBorderWidthToSquare","getTriAngleLength","setTriAngleLength","isSpecialToSquare","setSpecialToSquare","getLineDurationToSquare","setLineDurationToSquare","getBitmapToSquare","setBitmapToSquare","getLineMarginTopToSquare","setLineMarginTopToSquare","getLineMarginLeftToSquare","setLineMarginLeftToSquare","getLineColorToSquare","setLineColorToSquare","getLineWidthToHexagon","setLineWidthToHexagon","getLineMarginToHexagon","setLineMarginToHexagon","isLineAnimDirection","setLineAnimDirection","getLineColorToHexagon","setLineColorToHexagon","getBitmapToAnnulus","setBitmapToAnnulus","getLineColorToAnnulus","setLineColorToAnnulus","getLineOffsetSpeedToAnnulus","setLineOffsetSpeedToAnnulus","getAnnulusDraws","setAnnulusDraws","getAnnulusColors","setAnnulusColors","getAnnulusLengths","setAnnulusLengths","getAnnulusWidths","setAnnulusWidths","getAnnulusMargins","setAnnulusMargins","refPaintToAnnulus","sin","getRegionMarginLeft","getRegionMarginTop","calcShapeRegion","calcShapeRegion","makeShape","makeBackground","makeAnim","drawAnim","resetAnim","startAnim","stopAnim","animSwitch","isAnimRunning","refLineColorToSquare","refLineColorToHexagon","refLineColorToAnnulus","initAnim"));
        ignoreStaticMap.put("ScanShapeView.CornerEffect", Utils.asListArgs("getRadius"));
        ignoreStaticMap.put("SignView", Utils.asListArgs("onDraw","onTouchEvent","_resetCanvas","clearCanvas","snapshotByView","getPath","setPath","getPaint","setPaint","setDrawCallBack"));
        ignoreStaticMap.put("StateLayout", Utils.asListArgs("reset","init","setListener","showIng","showFailed","showSuccess","showEmptyData","showType","notifyDataSetChanged","gone","visible","register","unregister","unregister","getTag","setTag","getData","setData","getData","setData","getView","getCurrentType","getCurrentView"));
        ignoreStaticMap.put("StateLayout.Global", Utils.asListArgs("register","unregister"));
        ignoreStaticMap.put("StateLayout.TypeAdapter", Utils.asListArgs("onCreateView","onBindView"));
        ignoreStaticMap.put("ViewAssist", Utils.asListArgs("showIng","showFailed","showSuccess","showEmptyData","showType","notifyDataSetChanged","gone","visible","register","unregister","unregister","reset","getWrapper","getTag","setTag","getData","setData","getData","setData","getAdapter","getView","getCurrentType","getCurrentView","setListener"));
        ignoreStaticMap.put("WrapView", Utils.asListArgs("initAttrs","onMeasure","onLayout","calc","refreshDraw","getRowLine","getMaxLine","setMaxLine","getRowTopMargin","setRowTopMargin","getViewLeftMargin","setViewLeftMargin","setRowViewMargin"));

        return ignoreStaticMap;
    }

    /**
     * 获取忽略指定方法 @param 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreParamMap() {
        Map<String, List<String>> ignoreParamMap = new HashMap<>();
        ignoreParamMap.put("AdjustHeightGridView", Utils.asListArgs("onMeasure"));
        ignoreParamMap.put("AdjustHeightListView", Utils.asListArgs("onMeasure"));
        ignoreParamMap.put("AdjustHeightRecyclerView", Utils.asListArgs("onMeasure"));
        ignoreParamMap.put("AdjustHeightWebView", Utils.asListArgs("onMeasure"));
        ignoreParamMap.put("CornerLabelView", Utils.asListArgs("onMeasure","onDraw"));
        ignoreParamMap.put("CustomGallery", Utils.asListArgs("onMeasure","onFling","onTouchEvent","onInterceptTouchEvent"));
        ignoreParamMap.put("CustomHorizontalScrollView", Utils.asListArgs("onMeasure","onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent"));
        ignoreParamMap.put("CustomNestedScrollView", Utils.asListArgs("onMeasure","onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent"));
        ignoreParamMap.put("CustomRecyclerView", Utils.asListArgs("onMeasure","onScrolled","onScrollStateChanged","onTouchEvent","onInterceptTouchEvent"));
        ignoreParamMap.put("CustomScrollView", Utils.asListArgs("onMeasure","onScrollChanged","computeScrollDeltaToGetChildRectOnScreen","onTouchEvent","onInterceptTouchEvent"));
        ignoreParamMap.put("CustomViewPager", Utils.asListArgs("onMeasure","onTouchEvent","onInterceptTouchEvent"));
        ignoreParamMap.put("CustomViewPager.OnDirectionListener", Utils.asListArgs("onPageScrolled","onPageScrollStateChanged"));
        ignoreParamMap.put("CustomWebView", Utils.asListArgs("onMeasure","onScrollChanged","onTouchEvent","onInterceptTouchEvent"));
        ignoreParamMap.put("FlowLikeView", Utils.asListArgs("onMeasure","onSizeChanged"));
        ignoreParamMap.put("FlowLikeView.AnimationEndListener", Utils.asListArgs("onAnimationEnd"));
        ignoreParamMap.put("FlowLikeView.CurveEvaluator", Utils.asListArgs("evaluate"));
        ignoreParamMap.put("FlowLikeView.CurveUpdateLister", Utils.asListArgs("onAnimationUpdate"));
        ignoreParamMap.put("LimitLayout", Utils.asListArgs("onMeasure"));
        ignoreParamMap.put("LineTextView", Utils.asListArgs("onDraw"));
        ignoreParamMap.put("LoadProgressBar", Utils.asListArgs("onDraw"));
        ignoreParamMap.put("RadiusAttrs", Utils.asListArgs("onSaveInstanceState","onRestoreInstanceState"));
        ignoreParamMap.put("RadiusLayout", Utils.asListArgs("onSizeChanged","draw","onRestoreInstanceState"));
        ignoreParamMap.put("RightIconEditText", Utils.asListArgs("setCompoundDrawables","onTouchEvent"));
        ignoreParamMap.put("ScanShapeView", Utils.asListArgs("onDraw"));
        ignoreParamMap.put("SignView", Utils.asListArgs("onDraw","onTouchEvent"));
        ignoreParamMap.put("StateLayout", Utils.asListArgs("setGlobal","setListener","showType","setTag","setData","getData","setData","getView"));
        ignoreParamMap.put("StateLayout.Listener", Utils.asListArgs("onRemove","onNotFound","onChange"));
        ignoreParamMap.put("StateLayout.TypeAdapter", Utils.asListArgs("onCreateView","onBindView"));
        ignoreParamMap.put("ViewAssist", Utils.asListArgs("setTag","setData","getData","setData","getAdapter","getView","setListener"));
        ignoreParamMap.put("ViewAssist.Adapter", Utils.asListArgs("onCreateView","onBindView"));
        ignoreParamMap.put("ViewAssist.Listener", Utils.asListArgs("onRemove","onNotFound","onChange"));
        ignoreParamMap.put("WrapView", Utils.asListArgs("onMeasure","onLayout"));

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
        ignoreUnPublicMap.put("AdjustHeightGridView", Utils.asListArgs("onMeasure"));
        ignoreUnPublicMap.put("AdjustHeightListView", Utils.asListArgs("onMeasure"));
        ignoreUnPublicMap.put("AdjustHeightRecyclerView", Utils.asListArgs("onMeasure"));
        ignoreUnPublicMap.put("AdjustHeightWebView", Utils.asListArgs("onMeasure"));
        ignoreUnPublicMap.put("CornerLabelView", Utils.asListArgs("initAttrs","onMeasure","onDraw","calcPath"));
        ignoreUnPublicMap.put("CornerLabelView.Painter", Utils.asListArgs("init","draw"));
        ignoreUnPublicMap.put("CustomGallery", Utils.asListArgs("initAttrs","onMeasure","isScrollingLeft"));
        ignoreUnPublicMap.put("CustomHorizontalScrollView", Utils.asListArgs("initAttrs","onMeasure","onScrollChanged","computeScrollDeltaToGetChildRectOnScreen"));
        ignoreUnPublicMap.put("CustomHorizontalScrollView.ScrollCallBack", Utils.asListArgs("onScrollChanged"));
        ignoreUnPublicMap.put("CustomNestedScrollView", Utils.asListArgs("initAttrs","onMeasure","onScrollChanged","computeScrollDeltaToGetChildRectOnScreen"));
        ignoreUnPublicMap.put("CustomNestedScrollView.ScrollCallBack", Utils.asListArgs("onScrollChanged"));
        ignoreUnPublicMap.put("CustomRecyclerView", Utils.asListArgs("initAttrs","onMeasure"));
        ignoreUnPublicMap.put("CustomRecyclerView.ScrollCallBack", Utils.asListArgs("onScrollStateChanged","onScrollChanged"));
        ignoreUnPublicMap.put("CustomScrollView", Utils.asListArgs("initAttrs","onMeasure","onScrollChanged","computeScrollDeltaToGetChildRectOnScreen"));
        ignoreUnPublicMap.put("CustomScrollView.ScrollCallBack", Utils.asListArgs("onScrollChanged"));
        ignoreUnPublicMap.put("CustomViewPager", Utils.asListArgs("initAttrs","onMeasure"));
        ignoreUnPublicMap.put("CustomWebView", Utils.asListArgs("initAttrs","onMeasure","onScrollChanged"));
        ignoreUnPublicMap.put("CustomWebView.ScrollCallBack", Utils.asListArgs("onScrollChanged"));
        ignoreUnPublicMap.put("FlowLikeView", Utils.asListArgs("initAttrs","onMeasure","onSizeChanged","generateCTRLPointF","generateCurveAnimation","generateEnterAnimation","startAnimation","resetLayoutParams"));
        ignoreUnPublicMap.put("LimitLayout", Utils.asListArgs("initAttrs","onMeasure"));
        ignoreUnPublicMap.put("LineTextView", Utils.asListArgs("onDraw"));
        ignoreUnPublicMap.put("LineTextView.OnNewLineCallBack", Utils.asListArgs("onNewLine"));
        ignoreUnPublicMap.put("LoadProgressBar", Utils.asListArgs("initAttrs","init","onDraw","drawProgressText","drawProgressText"));
        ignoreUnPublicMap.put("RadiusAttrs", Utils.asListArgs("resetRadius"));
        ignoreUnPublicMap.put("RadiusLayout", Utils.asListArgs("initAttrs","onSizeChanged","onSaveInstanceState","onRestoreInstanceState"));
        ignoreUnPublicMap.put("RightIconEditText", Utils.asListArgs("finalize","init","drawOperate"));
        ignoreUnPublicMap.put("ScanShapeView", Utils.asListArgs("init","handlerCornerPathEffect","onDraw","refPaintToAnnulus","sin","getRegionMarginLeft","getRegionMarginTop","calcShapeRegion","calcShapeRegion","makeShape","makeBackground","makeAnim","drawAnim","resetAnim","animSwitch","refLineColorToSquare","refLineColorToHexagon","refLineColorToAnnulus","initAnim"));
        ignoreUnPublicMap.put("SignView", Utils.asListArgs("onDraw","_resetCanvas"));
        ignoreUnPublicMap.put("StateLayout", Utils.asListArgs("init"));
        ignoreUnPublicMap.put("StateLayout.Listener", Utils.asListArgs("onRemove","onNotFound","onChange"));
        ignoreUnPublicMap.put("ViewAssist.Adapter", Utils.asListArgs("onCreateView","onBindView"));
        ignoreUnPublicMap.put("ViewAssist.Listener", Utils.asListArgs("onRemove","onNotFound","onChange"));
        ignoreUnPublicMap.put("WrapView", Utils.asListArgs("initAttrs","onMeasure","onLayout","calc"));

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
        ignoreReturnVoidMap.put("CornerLabelView", Utils.asListArgs("initAttrs - void"));
        ignoreReturnVoidMap.put("CornerLabelView.Painter", Utils.asListArgs("init - void","draw - void"));
        ignoreReturnVoidMap.put("CustomGallery", Utils.asListArgs("initAttrs - void"));
        ignoreReturnVoidMap.put("CustomHorizontalScrollView", Utils.asListArgs("initAttrs - void"));
        ignoreReturnVoidMap.put("CustomHorizontalScrollView.ScrollCallBack", Utils.asListArgs("onScrollChanged - void"));
        ignoreReturnVoidMap.put("CustomNestedScrollView", Utils.asListArgs("initAttrs - void"));
        ignoreReturnVoidMap.put("CustomNestedScrollView.ScrollCallBack", Utils.asListArgs("onScrollChanged - void"));
        ignoreReturnVoidMap.put("CustomRecyclerView", Utils.asListArgs("initAttrs - void"));
        ignoreReturnVoidMap.put("CustomRecyclerView.ScrollCallBack", Utils.asListArgs("onScrollStateChanged - void","onScrollChanged - void"));
        ignoreReturnVoidMap.put("CustomScrollView", Utils.asListArgs("initAttrs - void"));
        ignoreReturnVoidMap.put("CustomScrollView.ScrollCallBack", Utils.asListArgs("onScrollChanged - void"));
        ignoreReturnVoidMap.put("CustomViewPager", Utils.asListArgs("initAttrs - void"));
        ignoreReturnVoidMap.put("CustomViewPager.OnDirectionListener", Utils.asListArgs("onSlideDirection - void"));
        ignoreReturnVoidMap.put("CustomWebView", Utils.asListArgs("initAttrs - void"));
        ignoreReturnVoidMap.put("CustomWebView.ScrollCallBack", Utils.asListArgs("onScrollChanged - void"));
        ignoreReturnVoidMap.put("FlowLikeView", Utils.asListArgs("initAttrs - void","startAnimation - void","resetLayoutParams - void","like - void"));
        ignoreReturnVoidMap.put("LimitLayout", Utils.asListArgs("initAttrs - void"));
        ignoreReturnVoidMap.put("LineTextView.OnNewLineCallBack", Utils.asListArgs("onNewLine - void"));
        ignoreReturnVoidMap.put("LoadProgressBar", Utils.asListArgs("initAttrs - void","drawProgressText - void","drawProgressText - void"));
        ignoreReturnVoidMap.put("RadiusAttrs", Utils.asListArgs("resetRadius - void","onSizeChanged - void","setRadius - void","setRadiusLeftTop - void","setRadiusLeftBottom - void","setRadiusRightTop - void","setRadiusRightBottom - void","setRadiusLeft - void","setRadiusRight - void","setRadiusTop - void","setRadiusBottom - void"));
        ignoreReturnVoidMap.put("RadiusLayout", Utils.asListArgs("initAttrs - void"));
        ignoreReturnVoidMap.put("RightIconEditText", Utils.asListArgs("init - void","drawOperate - void"));
        ignoreReturnVoidMap.put("ScanShapeView", Utils.asListArgs("init - void","handlerCornerPathEffect - void","destroy - void","refPaintToAnnulus - void","makeBackground - void","makeAnim - void","drawAnim - void","resetAnim - void","startAnim - void","stopAnim - void","animSwitch - void","refLineColorToSquare - void","refLineColorToHexagon - void","refLineColorToAnnulus - void","initAnim - void"));
        ignoreReturnVoidMap.put("SignView", Utils.asListArgs("_resetCanvas - void"));
        ignoreReturnVoidMap.put("StateLayout", Utils.asListArgs("init - void"));
        ignoreReturnVoidMap.put("ViewAssist", Utils.asListArgs("showType - void"));
        ignoreReturnVoidMap.put("WrapView", Utils.asListArgs("initAttrs - void","refreshDraw - void"));

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