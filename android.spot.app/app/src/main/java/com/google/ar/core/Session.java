package com.google.ar.core;

import android.content.Context;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.OisSample;
import android.media.Image;
import android.net.Uri;
import android.os.Build;
import com.google.ar.core.Config;
import com.google.ar.core.HostCloudAnchorFuture;
import com.google.ar.core.ResolveCloudAnchorFuture;
import com.google.ar.core.VpsAvailabilityFuture;
import com.google.ar.core.exceptions.FatalException;
import defpackage.a;
import defpackage.jck;
import defpackage.jcz;
import defpackage.jda;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Session {
    private static final String TAG = "ARCore-Session";
    final jck faceCache;
    final long nativeSymbolTableHandle;
    public long nativeWrapperHandle;
    private SharedCamera sharedCamera;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public enum Feature {
        FRONT_CAMERA(1),
        SHARED_CAMERA(1000),
        DO_NOT_USE_ACTIVE_DEPTH_SENSOR(5),
        MOTION_TRACKING_ODOMETRY(6),
        HIT_TEST_WITH_DEPTH(7),
        SHAREABLE_CAMERA(13),
        DEPTH_IMAGE_USES_GEO_FACADES(14);

        final int nativeCode;

        Feature(int i) {
            this.nativeCode = i;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public enum FeatureMapQuality {
        INSUFFICIENT(0),
        SUFFICIENT(1),
        GOOD(2);

        final int nativeCode;

        FeatureMapQuality(int i) {
            this.nativeCode = i;
        }

        static FeatureMapQuality forNumber(int i) {
            for (FeatureMapQuality featureMapQuality : values()) {
                if (featureMapQuality.nativeCode == i) {
                    return featureMapQuality;
                }
            }
            throw new FatalException(a.ae(i, "Unexpected value for native FeatureMapQuality, value="));
        }
    }

    protected Session() {
        this.faceCache = new jck();
        this.sharedCamera = null;
        this.nativeWrapperHandle = 0L;
        this.nativeSymbolTableHandle = 0L;
    }

    @Deprecated
    public static Session createForSharedCamera(Context context) {
        return new Session(context, EnumSet.of(Feature.SHARED_CAMERA));
    }

    public static ByteBuffer directByteBufferOrDefault(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());
        }
        return byteBuffer.order(ByteOrder.nativeOrder());
    }

    public static void loadDynamicSymbolsAfterSessionCreate() {
        if (Build.VERSION.SDK_INT >= 24) {
            ArImage.nativeLoadSymbols();
            ImageMetadata.nativeLoadSymbols();
        }
    }

    private native long[] nativeAcquireAllAnchors(long j);

    private native long nativeAcquireEarth(long j);

    private native int nativeCheckModuleAvailability(long j, int i);

    private native void nativeCloseSession(long j);

    private native void nativeConfigure(long j, long j2);

    private native long nativeCreateAnchor(long j, Pose pose);

    private native long nativeCreateAugmentedRegion(long j, float[] fArr);

    private static native long nativeCreateSessionAndWrapperWithFeatures(Context context, int[] iArr);

    private static native long nativeCreateSessionAndWrapperWithSettings(Context context, String str);

    private static native long nativeCreateSessionAndWrapperWithSettingsProto(Context context, byte[] bArr, String str);

    public static native long nativeCreateSessionWrapperFromHandle(long j, long j2);

    private native void nativeEnableIncognitoMode(long j);

    private native int nativeEstimateFeatureMapQualityForHosting(long j, Pose pose);

    private native long nativeGetCameraConfig(long j);

    private native void nativeGetConfig(long j, long j2);

    private native void nativeGetDebugSessionIdLongs(long j, long[] jArr);

    private native int nativeGetFrameDelay(long j);

    private native long[] nativeGetHeldInjectedImageTimestamps(long j);

    private native int nativeGetPlaybackStatus(long j);

    private native void nativeGetRandomAccessStats(long j, long j2);

    private native int nativeGetRecordingStatus(long j);

    private native long[] nativeGetSupportedCameraConfigs(long j);

    private native long[] nativeGetSupportedCameraConfigsWithFilter(long j, long j2);

    private native long nativeGetSymbolTable(long j);

    private native long nativeHostCloudAnchor(long j, long j2);

    private native long[] nativeHostCloudAnchorAsync(long j, long j2, int i, HostCloudAnchorFuture.CallbackWrapper callbackWrapper);

    private native long nativeHostCloudAnchorWithTtl(long j, long j2, int i);

    private native void nativeInject(long j, long j2, int i, int i2, ByteBuffer byteBuffer, int i3, int i4, ByteBuffer byteBuffer2, int i5, int i6, ByteBuffer byteBuffer3, int i7, int i8, long j3, long j4, long[] jArr, float[] fArr, float[] fArr2, int i9);

    private native boolean nativeIsSupported(long j, long j2);

    private native void nativePause(long j);

    private native void nativeRequestModuleInstallDeferred(long j, int[] iArr);

    private native void nativeRequestModuleInstallImmediate(long j, int[] iArr);

    private native long nativeResolveCloudAnchor(long j, String str);

    private native long[] nativeResolveCloudAnchorAsync(long j, String str, ResolveCloudAnchorFuture.CallbackWrapper callbackWrapper);

    private native void nativeResume(long j);

    private native void nativeSetAnalyticsPolicy(long j, String str);

    private native int nativeSetCameraConfig(long j, long j2);

    private native void nativeSetCameraTextureName(long j, int i);

    private native void nativeSetCameraTextureNames(long j, int[] iArr);

    private native void nativeSetDisplayGeometry(long j, int i, int i2, int i3);

    private native void nativeSetPlaybackDataset(long j, String str);

    private native void nativeSetPlaybackDatasetUri(long j, String str);

    private native void nativeStartRecording(long j, long j2);

    private native void nativeStopRecording(long j);

    private native void nativeUpdate(long j, long j2);

    private void pauseSharedCameraIfInUse() {
        SharedCamera sharedCamera = this.sharedCamera;
        if (sharedCamera != null) {
            sharedCamera.pause();
        }
    }

    static void throwExceptionFromArStatus(int i) {
        throwExceptionFromArStatus(null, i, null, null);
    }

    public ModuleAvailability checkModuleAvailability(Module module) {
        return ModuleAvailability.forNumber(nativeCheckModuleAvailability(this.nativeWrapperHandle, module.nativeCode));
    }

    public VpsAvailabilityFuture checkVpsAvailabilityAsync(double d, double d2, Consumer consumer) {
        VpsAvailabilityFuture.CallbackWrapper callbackWrapper;
        if (consumer != null) {
            callbackWrapper = new VpsAvailabilityFuture.CallbackWrapper(consumer);
        } else {
            callbackWrapper = null;
        }
        long[] nativeCheckVpsAvailabilityAsync = nativeCheckVpsAvailabilityAsync(this.nativeWrapperHandle, d, d2, callbackWrapper);
        return new VpsAvailabilityFuture(this, nativeCheckVpsAvailabilityAsync[0], nativeCheckVpsAvailabilityAsync[1]);
    }

    public void close() {
        nativeCloseSession(this.nativeWrapperHandle);
    }

    public void configure(Config config) {
        nativeConfigure(this.nativeWrapperHandle, config.nativeHandle);
    }

    public Collection convertNativeAnchorsToCollection(long[] jArr) {
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(new Anchor(j, this));
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public List convertNativeCameraConfigsToCollection(long[] jArr) {
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(new CameraConfig(this, j));
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public Collection convertNativeTrackDataToCollection(long[] jArr) {
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(new TrackData(j, this));
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public Collection convertNativeTrackablesToCollection(Class cls, long[] jArr) {
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            Trackable createTrackable = createTrackable(j);
            if (createTrackable != null) {
                arrayList.add((Trackable) cls.cast(createTrackable));
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public Anchor createAnchor(Pose pose) {
        return new Anchor(nativeCreateAnchor(this.nativeWrapperHandle, pose), this);
    }

    public AugmentedRegion createAugmentedRegion(float[] fArr) {
        return new AugmentedRegion(nativeCreateAugmentedRegion(this.nativeWrapperHandle, fArr), this);
    }

    public Trackable createTrackable(long j) {
        jda jdaVar;
        int internalGetType = TrackableBase.internalGetType(this.nativeWrapperHandle, j);
        jda[] values = jda.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i < length) {
                jdaVar = values[i];
                if (jdaVar.l == internalGetType) {
                    break;
                }
                i++;
            } else {
                jdaVar = null;
                break;
            }
        }
        if (jdaVar != null) {
            switch (jdaVar.ordinal()) {
                case 0:
                case 1:
                    return null;
                case 2:
                    return new Plane(j, this);
                case 3:
                    return new Point(j, this);
                case 4:
                    return new AugmentedImage(j, this);
                case 5:
                    return this.faceCache.a(j, this);
                case 6:
                    return new StreetscapeGeometry(j, this);
                case 7:
                    return getEarth();
                case 8:
                    return new DepthPoint(j, this);
                case 9:
                    return new InstantPlacementPoint(j, this);
                case 10:
                    return new MagicalSurfacePoint(j, this);
                default:
                    throw null;
            }
        }
        TrackableBase.internalReleaseNativeHandle(this.nativeSymbolTableHandle, j);
        return null;
    }

    public void enableIncognitoMode() {
        nativeEnableIncognitoMode(this.nativeWrapperHandle);
    }

    public FeatureMapQuality estimateFeatureMapQualityForHosting(Pose pose) {
        return FeatureMapQuality.forNumber(nativeEstimateFeatureMapQualityForHosting(this.nativeWrapperHandle, pose));
    }

    protected void finalize() {
        long j = this.nativeWrapperHandle;
        if (j != 0) {
            nativeDestroySessionWrapper(j);
            this.nativeWrapperHandle = 0L;
        }
        super.finalize();
    }

    public Collection getAllAnchors() {
        return convertNativeAnchorsToCollection(nativeAcquireAllAnchors(this.nativeWrapperHandle));
    }

    public Collection getAllTrackables(Class cls) {
        jda a = jda.a(cls);
        if (a == jda.UNKNOWN_TO_JAVA) {
            return Collections.emptyList();
        }
        return convertNativeTrackablesToCollection(cls, nativeAcquireAllTrackables(this.nativeWrapperHandle, a.l));
    }

    public CameraConfig getCameraConfig() {
        return new CameraConfig(this, nativeGetCameraConfig(this.nativeWrapperHandle));
    }

    public List getCaptureMetadata(String str) {
        String str2 = Build.DEVICE;
        int i = Build.VERSION.SDK_INT;
        boolean equals = Build.DEVICE.equals("generic_x86");
        if (true == equals) {
            i = 33;
        }
        if (true == equals) {
            str2 = "oriole";
        }
        return CaptureMetadataEntry.getCaptureMetadataForPixelAndEmulatorDevices(str, str2, i);
    }

    public Config getConfig() {
        Config config = new Config(this);
        getConfig(config);
        return config;
    }

    public UUID getDebugSessionId() {
        long[] jArr = new long[2];
        nativeGetDebugSessionIdLongs(this.nativeWrapperHandle, jArr);
        return new UUID(jArr[0], jArr[1]);
    }

    public Earth getEarth() {
        long nativeAcquireEarth = nativeAcquireEarth(this.nativeWrapperHandle);
        if (nativeAcquireEarth != 0) {
            return new Earth(nativeAcquireEarth, this);
        }
        return null;
    }

    public int getFrameDelay() {
        return nativeGetFrameDelay(this.nativeWrapperHandle);
    }

    public List getHeldInjectedImageTimestamps() {
        long[] nativeGetHeldInjectedImageTimestamps = nativeGetHeldInjectedImageTimestamps(this.nativeWrapperHandle);
        ArrayList arrayList = new ArrayList();
        for (long j : nativeGetHeldInjectedImageTimestamps) {
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public PlaybackStatus getPlaybackStatus() {
        return PlaybackStatus.forNumber(nativeGetPlaybackStatus(this.nativeWrapperHandle));
    }

    public RecordingStatus getRecordingStatus() {
        return RecordingStatus.forNumber(nativeGetRecordingStatus(this.nativeWrapperHandle));
    }

    public SharedCamera getSharedCamera() {
        SharedCamera sharedCamera = this.sharedCamera;
        if (sharedCamera != null) {
            return sharedCamera;
        }
        throw new IllegalStateException("Shared camera is not in use, please create session using new Session(context, EnumSet.of(Session.Feature.SHARED_CAMERA)).");
    }

    @Deprecated
    public List getSupportedCameraConfigs() {
        return convertNativeCameraConfigsToCollection(nativeGetSupportedCameraConfigs(this.nativeWrapperHandle));
    }

    @Deprecated
    public Anchor hostCloudAnchor(Anchor anchor) {
        return new Anchor(nativeHostCloudAnchor(this.nativeWrapperHandle, anchor.nativeHandle), this);
    }

    public HostCloudAnchorFuture hostCloudAnchorAsync(Anchor anchor, int i, BiConsumer biConsumer) {
        HostCloudAnchorFuture.CallbackWrapper callbackWrapper;
        if (biConsumer != null) {
            callbackWrapper = new HostCloudAnchorFuture.CallbackWrapper(biConsumer);
        } else {
            callbackWrapper = null;
        }
        long[] nativeHostCloudAnchorAsync = nativeHostCloudAnchorAsync(this.nativeWrapperHandle, anchor.nativeHandle, i, callbackWrapper);
        return new HostCloudAnchorFuture(this, nativeHostCloudAnchorAsync[0], nativeHostCloudAnchorAsync[1]);
    }

    @Deprecated
    public Anchor hostCloudAnchorWithTtl(Anchor anchor, int i) {
        return new Anchor(nativeHostCloudAnchorWithTtl(this.nativeWrapperHandle, anchor.nativeHandle, i), this);
    }

    public void inject(Image image, CaptureResult captureResult) {
        Session session;
        long[] jArr;
        float[] fArr;
        float[] fArr2;
        int i;
        CaptureResult.Key key;
        int length;
        long timestamp;
        float xshift;
        float yshift;
        if (image.getFormat() == 35) {
            Image.Plane[] planes = image.getPlanes();
            int i2 = 0;
            Image.Plane plane = planes[0];
            Image.Plane plane2 = planes[1];
            Image.Plane plane3 = planes[2];
            long longValue = ((Long) captureResult.get(CaptureResult.SENSOR_EXPOSURE_TIME)).longValue();
            long longValue2 = ((Long) captureResult.get(CaptureResult.SENSOR_ROLLING_SHUTTER_SKEW)).longValue();
            Integer num = (Integer) captureResult.get(CaptureResult.LENS_OPTICAL_STABILIZATION_MODE);
            if (num != null && num.intValue() == 1) {
                key = CaptureResult.STATISTICS_OIS_SAMPLES;
                OisSample[] oisSampleArr = (OisSample[]) captureResult.get(key);
                if (oisSampleArr != null) {
                    int length2 = oisSampleArr.length;
                    long[] jArr2 = new long[length2];
                    float[] fArr3 = new float[length2];
                    float[] fArr4 = new float[length2];
                    while (true) {
                        length = oisSampleArr.length;
                        if (i2 >= length) {
                            break;
                        }
                        timestamp = oisSampleArr[i2].getTimestamp();
                        jArr2[i2] = timestamp;
                        xshift = oisSampleArr[i2].getXshift();
                        fArr3[i2] = xshift;
                        yshift = oisSampleArr[i2].getYshift();
                        fArr4[i2] = yshift;
                        i2++;
                    }
                    session = this;
                    fArr2 = fArr4;
                    jArr = jArr2;
                    fArr = fArr3;
                    i = length;
                    nativeInject(session.nativeWrapperHandle, image.getTimestamp(), image.getWidth(), image.getHeight(), plane.getBuffer(), plane.getRowStride(), plane.getPixelStride(), plane2.getBuffer(), plane2.getRowStride(), plane2.getPixelStride(), plane3.getBuffer(), plane3.getRowStride(), plane3.getPixelStride(), longValue, longValue2, jArr, fArr, fArr2, i);
                    return;
                }
            }
            session = this;
            jArr = null;
            fArr = null;
            fArr2 = null;
            i = 0;
            nativeInject(session.nativeWrapperHandle, image.getTimestamp(), image.getWidth(), image.getHeight(), plane.getBuffer(), plane.getRowStride(), plane.getPixelStride(), plane2.getBuffer(), plane2.getRowStride(), plane2.getPixelStride(), plane3.getBuffer(), plane3.getRowStride(), plane3.getPixelStride(), longValue, longValue2, jArr, fArr, fArr2, i);
            return;
        }
        throw new IllegalArgumentException("Image must be in YUV_420_888 format.");
    }

    public boolean isDepthModeSupported(Config.DepthMode depthMode) {
        return nativeIsDepthModeSupported(this.nativeWrapperHandle, depthMode.nativeCode);
    }

    public boolean isDepthModeSupportedPrivate(Config.DepthMode depthMode) {
        return nativeIsDepthModeSupportedPrivate(this.nativeWrapperHandle, depthMode.nativeCode);
    }

    public boolean isGeospatialModeSupported(Config.GeospatialMode geospatialMode) {
        return nativeIsGeospatialModeSupported(this.nativeWrapperHandle, geospatialMode.nativeCode);
    }

    public boolean isImageStabilizationModeSupported(Config.ImageStabilizationMode imageStabilizationMode) {
        return nativeIsImageStabilizationModeSupported(this.nativeWrapperHandle, imageStabilizationMode.nativeCode);
    }

    public boolean isSegmentationModeSupported(Config.SegmentationMode segmentationMode) {
        return nativeIsSegmentationModeSupported(this.nativeWrapperHandle, segmentationMode.nativeCode);
    }

    public boolean isSemanticModeSupported(Config.SemanticMode semanticMode) {
        return nativeIsSemanticModeSupported(this.nativeWrapperHandle, semanticMode.nativeCode);
    }

    boolean isSharedCameraUsed() {
        if (this.sharedCamera != null) {
            return true;
        }
        return false;
    }

    @Deprecated
    public boolean isSupported(Config config) {
        return nativeIsSupported(this.nativeWrapperHandle, config.nativeHandle);
    }

    public native long[] nativeAcquireAllTrackables(long j, int i);

    public native long[] nativeCheckVpsAvailabilityAsync(long j, double d, double d2, VpsAvailabilityFuture.CallbackWrapper callbackWrapper);

    public native void nativeDestroySessionWrapper(long j);

    public native long nativeGetSessionNativeHandle(long j);

    public native boolean nativeIsDepthModeSupported(long j, int i);

    public native boolean nativeIsDepthModeSupportedPrivate(long j, int i);

    public native boolean nativeIsGeospatialModeSupported(long j, int i);

    public native boolean nativeIsImageStabilizationModeSupported(long j, int i);

    public native boolean nativeIsSegmentationModeSupported(long j, int i);

    public native boolean nativeIsSemanticModeSupported(long j, int i);

    public native long nativeReleaseSessionOwnership(long j);

    public void pause() {
        pauseSharedCameraIfInUse();
        nativePause(this.nativeWrapperHandle);
    }

    public void requestModuleInstallDeferred(List list) {
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Module) it.next()).nativeCode;
            i++;
        }
        nativeRequestModuleInstallDeferred(this.nativeWrapperHandle, iArr);
    }

    public void requestModuleInstallImmediate(List list) {
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Module) it.next()).nativeCode;
            i++;
        }
        nativeRequestModuleInstallImmediate(this.nativeWrapperHandle, iArr);
    }

    @Deprecated
    public Anchor resolveCloudAnchor(String str) {
        return new Anchor(nativeResolveCloudAnchor(this.nativeWrapperHandle, str), this);
    }

    public ResolveCloudAnchorFuture resolveCloudAnchorAsync(String str, BiConsumer biConsumer) {
        ResolveCloudAnchorFuture.CallbackWrapper callbackWrapper;
        if (biConsumer != null) {
            callbackWrapper = new ResolveCloudAnchorFuture.CallbackWrapper(this, biConsumer);
        } else {
            callbackWrapper = null;
        }
        long[] nativeResolveCloudAnchorAsync = nativeResolveCloudAnchorAsync(this.nativeWrapperHandle, str, callbackWrapper);
        return new ResolveCloudAnchorFuture(this, nativeResolveCloudAnchorAsync[0], nativeResolveCloudAnchorAsync[1]);
    }

    public void resume() {
        nativeResume(this.nativeWrapperHandle);
    }

    public void setAnalyticsPolicy(String str) {
        nativeSetAnalyticsPolicy(this.nativeWrapperHandle, str);
    }

    public void setCameraConfig(CameraConfig cameraConfig) {
        nativeSetCameraConfig(this.nativeWrapperHandle, cameraConfig.nativeHandle);
    }

    public void setCameraTextureName(int i) {
        nativeSetCameraTextureName(this.nativeWrapperHandle, i);
    }

    public void setCameraTextureNames(int[] iArr) {
        if (iArr != null && iArr.length != 0) {
            nativeSetCameraTextureNames(this.nativeWrapperHandle, iArr);
            return;
        }
        throw new IllegalArgumentException("textureIds must be an array with at least 1 entry.");
    }

    public void setDisplayGeometry(int i, int i2, int i3) {
        nativeSetDisplayGeometry(this.nativeWrapperHandle, i, i2, i3);
    }

    @Deprecated
    public void setPlaybackDataset(String str) {
        nativeSetPlaybackDataset(this.nativeWrapperHandle, str);
    }

    public void setPlaybackDatasetUri(Uri uri) {
        nativeSetPlaybackDatasetUri(this.nativeWrapperHandle, uri.toString());
    }

    public void startRecording(RecordingConfig recordingConfig) {
        if (recordingConfig != null) {
            nativeStartRecording(this.nativeWrapperHandle, recordingConfig.nativeHandle);
            return;
        }
        throw new IllegalArgumentException();
    }

    public void stopRecording() {
        nativeStopRecording(this.nativeWrapperHandle);
    }

    public Frame update() {
        Frame frame = new Frame(this);
        nativeUpdate(this.nativeWrapperHandle, frame.nativeHandle);
        return frame;
    }

    public Session(long j) {
        this.faceCache = new jck();
        this.sharedCamera = null;
        this.nativeWrapperHandle = j;
        this.nativeSymbolTableHandle = nativeGetSymbolTable(j);
    }

    static void throwExceptionFromArStatus(String str, int i, String[] strArr, int[] iArr) {
        int i2;
        for (jcz jczVar : jcz.values()) {
            if (jczVar.G == i) {
                Class cls = jczVar.H;
                if (cls == null) {
                    return;
                }
                if (strArr == null || iArr == null || (i2 = strArr.length) != iArr.length) {
                    i2 = 0;
                }
                String str2 = jczVar.I;
                if (str2 == null && str == null) {
                    throw ((Exception) cls.getConstructor(null).newInstance(null));
                }
                if (str2 != null) {
                    str = str == null ? str2 : str2.concat(str);
                }
                Exception exc = (Exception) cls.getConstructor(String.class).newInstance(str);
                StackTraceElement[] stackTrace = exc.getStackTrace();
                StackTraceElement[] stackTraceElementArr = new StackTraceElement[stackTrace.length + i2];
                int i3 = 0;
                while (i3 < i2) {
                    stackTraceElementArr[i3] = new StackTraceElement("ARCore", "native", strArr[i3], iArr[i3]);
                    i3++;
                }
                for (StackTraceElement stackTraceElement : stackTrace) {
                    stackTraceElementArr[i3] = stackTraceElement;
                    i3++;
                }
                exc.setStackTrace(stackTraceElementArr);
                throw exc;
            }
        }
        throw new FatalException("Unexpected error code: " + i);
    }

    public void getConfig(Config config) {
        nativeGetConfig(this.nativeWrapperHandle, config.nativeHandle);
    }

    public List getSupportedCameraConfigs(CameraConfigFilter cameraConfigFilter) {
        if (cameraConfigFilter != null) {
            long[] nativeGetSupportedCameraConfigsWithFilter = nativeGetSupportedCameraConfigsWithFilter(this.nativeWrapperHandle, cameraConfigFilter.nativeHandle);
            ArrayList arrayList = new ArrayList(nativeGetSupportedCameraConfigsWithFilter.length);
            for (long j : nativeGetSupportedCameraConfigsWithFilter) {
                arrayList.add(new CameraConfig(this, j));
            }
            return DesugarCollections.unmodifiableList(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public Session(Context context) {
        this(context, EnumSet.noneOf(Feature.class));
    }

    @Deprecated
    public Session(Context context, String str) {
        this.faceCache = new jck();
        this.sharedCamera = null;
        System.loadLibrary("arcore_sdk_jni");
        long nativeCreateSessionAndWrapperWithSettings = nativeCreateSessionAndWrapperWithSettings(context, str);
        this.nativeWrapperHandle = nativeCreateSessionAndWrapperWithSettings;
        this.nativeSymbolTableHandle = nativeGetSymbolTable(nativeCreateSessionAndWrapperWithSettings);
        if (str.contains("camera_stack,java")) {
            this.sharedCamera = new SharedCamera(this);
        }
        loadDynamicSymbolsAfterSessionCreate();
    }

    public Session(Context context, Set set) {
        this.faceCache = new jck();
        this.sharedCamera = null;
        System.loadLibrary("arcore_sdk_jni");
        int[] iArr = new int[set.size() + 1];
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Feature) it.next()).nativeCode;
            i++;
        }
        iArr[i] = 0;
        long nativeCreateSessionAndWrapperWithFeatures = nativeCreateSessionAndWrapperWithFeatures(context, iArr);
        this.nativeWrapperHandle = nativeCreateSessionAndWrapperWithFeatures;
        this.nativeSymbolTableHandle = nativeGetSymbolTable(nativeCreateSessionAndWrapperWithFeatures);
        if (set.contains(Feature.SHARED_CAMERA)) {
            this.sharedCamera = new SharedCamera(this);
        }
        loadDynamicSymbolsAfterSessionCreate();
    }

    public Session(Context context, byte[] bArr, String str, boolean z) {
        this.faceCache = new jck();
        this.sharedCamera = null;
        System.loadLibrary("arcore_sdk_jni");
        long nativeCreateSessionAndWrapperWithSettingsProto = nativeCreateSessionAndWrapperWithSettingsProto(context, bArr, str);
        this.nativeWrapperHandle = nativeCreateSessionAndWrapperWithSettingsProto;
        this.nativeSymbolTableHandle = nativeGetSymbolTable(nativeCreateSessionAndWrapperWithSettingsProto);
        if (z) {
            this.sharedCamera = new SharedCamera(this);
        }
        loadDynamicSymbolsAfterSessionCreate();
    }
}
