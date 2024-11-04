package defpackage;

import com.google.ar.core.exceptions.AnchorNotSupportedForHostingException;
import com.google.ar.core.exceptions.CameraNotAvailableException;
import com.google.ar.core.exceptions.CloudAnchorsNotConfiguredException;
import com.google.ar.core.exceptions.DataInvalidFormatException;
import com.google.ar.core.exceptions.DataUnsupportedVersionException;
import com.google.ar.core.exceptions.DeadlineExceededException;
import com.google.ar.core.exceptions.FatalException;
import com.google.ar.core.exceptions.FineLocationPermissionNotGrantedException;
import com.google.ar.core.exceptions.GooglePlayServicesLocationLibraryNotLinkedException;
import com.google.ar.core.exceptions.ImageInsufficientQualityException;
import com.google.ar.core.exceptions.MetadataNotFoundException;
import com.google.ar.core.exceptions.MissingGlContextException;
import com.google.ar.core.exceptions.NotTrackingException;
import com.google.ar.core.exceptions.NotYetAvailableException;
import com.google.ar.core.exceptions.PlaybackFailedException;
import com.google.ar.core.exceptions.RecordingFailedException;
import com.google.ar.core.exceptions.ResourceExhaustedException;
import com.google.ar.core.exceptions.SessionNotPausedException;
import com.google.ar.core.exceptions.SessionPausedException;
import com.google.ar.core.exceptions.SessionUnsupportedException;
import com.google.ar.core.exceptions.TextureNotSetException;
import com.google.ar.core.exceptions.UnavailableApkTooOldException;
import com.google.ar.core.exceptions.UnavailableArcoreNotInstalledException;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.ar.core.exceptions.UnavailableSdkTooOldException;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;
import com.google.ar.core.exceptions.UnsupportedConfigurationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum jcz {
    SUCCESS(0, null),
    ERROR_INVALID_ARGUMENT(-1, IllegalArgumentException.class),
    ERROR_FATAL(-2, FatalException.class),
    ERROR_SESSION_PAUSED(-3, SessionPausedException.class),
    ERROR_SESSION_NOT_PAUSED(-4, SessionNotPausedException.class),
    ERROR_NOT_TRACKING(-5, NotTrackingException.class),
    ERROR_TEXTURE_NOT_SET(-6, TextureNotSetException.class),
    ERROR_MISSING_GL_CONTEXT(-7, MissingGlContextException.class),
    ERROR_UNSUPPORTED_CONFIGURATION(-8, UnsupportedConfigurationException.class),
    ERROR_FINE_LOCATION_PERMISSION_NOT_GRANTED(-21, FineLocationPermissionNotGrantedException.class),
    ERROR_GOOGLE_PLAY_SERVICES_LOCATION_LIBRARY_NOT_LINKED(-22, GooglePlayServicesLocationLibraryNotLinkedException.class),
    ERROR_CAMERA_PERMISSION_NOT_GRANTED(-9, SecurityException.class, "Camera permission is not granted"),
    ERROR_DEADLINE_EXCEEDED(-10, DeadlineExceededException.class),
    ERROR_RESOURCE_EXHAUSTED(-11, ResourceExhaustedException.class),
    ERROR_NOT_YET_AVAILABLE(-12, NotYetAvailableException.class),
    ERROR_CAMERA_NOT_AVAILABLE(-13, CameraNotAvailableException.class),
    ERROR_ANCHOR_NOT_SUPPORTED_FOR_HOSTING(-16, AnchorNotSupportedForHostingException.class),
    ERROR_IMAGE_INSUFFICIENT_QUALITY(-17, ImageInsufficientQualityException.class),
    ERROR_DATA_INVALID_FORMAT(-18, DataInvalidFormatException.class),
    ERROR_DATA_UNSUPPORTED_VERSION(-19, DataUnsupportedVersionException.class),
    ERROR_ILLEGAL_STATE(-20, IllegalStateException.class),
    ERROR_RECORDING_FAILED(-23, RecordingFailedException.class),
    ERROR_PLAYBACK_FAILED(-24, PlaybackFailedException.class),
    ERROR_SESSION_UNSUPPORTED(-25, SessionUnsupportedException.class),
    ERROR_METADATA_NOT_FOUND(-26, MetadataNotFoundException.class),
    ERROR_CLOUD_ANCHORS_NOT_CONFIGURED(-14, CloudAnchorsNotConfiguredException.class),
    ERROR_INTERNET_PERMISSION_NOT_GRANTED(-15, SecurityException.class, "Internet permission is not granted"),
    UNAVAILABLE_ARCORE_NOT_INSTALLED(-100, UnavailableArcoreNotInstalledException.class),
    UNAVAILABLE_DEVICE_NOT_COMPATIBLE(-101, UnavailableDeviceNotCompatibleException.class),
    UNAVAILABLE_APK_TOO_OLD(-103, UnavailableApkTooOldException.class),
    UNAVAILABLE_SDK_TOO_OLD(-104, UnavailableSdkTooOldException.class),
    UNAVAILABLE_USER_DECLINED_INSTALLATION(-105, UnavailableUserDeclinedInstallationException.class);

    public final int G;
    public final Class H;
    public final String I;

    jcz(int i, Class cls) {
        this(i, cls, null);
    }

    jcz(int i, Class cls, String str) {
        this.G = i;
        this.H = cls;
        this.I = str;
    }
}
