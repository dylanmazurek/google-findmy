package defpackage;

import com.google.ar.core.AugmentedFace;
import com.google.ar.core.AugmentedImage;
import com.google.ar.core.DepthPoint;
import com.google.ar.core.Earth;
import com.google.ar.core.InstantPlacementPoint;
import com.google.ar.core.MagicalSurfacePoint;
import com.google.ar.core.Plane;
import com.google.ar.core.Point;
import com.google.ar.core.StreetscapeGeometry;
import com.google.ar.core.Trackable;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum jda {
    BASE_TRACKABLE(1095893248, Trackable.class),
    UNKNOWN_TO_JAVA(-1, null),
    PLANE(1095893249, Plane.class),
    POINT(1095893250, Point.class),
    AUGMENTED_IMAGE(1095893252, AugmentedImage.class),
    FACE(1095893253, AugmentedFace.class),
    STREETSCAPE_GEOMETRY(1095893251, StreetscapeGeometry.class),
    EARTH(1095893257, Earth.class),
    DEPTH_POINT(1095893265, DepthPoint.class),
    INSTANT_PLACEMENT_POINT(1095893266, InstantPlacementPoint.class),
    MAGICAL_SURFACE_POINT(1095893267, MagicalSurfacePoint.class);

    public final int l;
    private final Class n;

    jda(int i, Class cls) {
        this.l = i;
        this.n = cls;
    }

    public static jda a(Class cls) {
        for (jda jdaVar : values()) {
            Class cls2 = jdaVar.n;
            if (cls2 != null && cls2.equals(cls)) {
                return jdaVar;
            }
        }
        return UNKNOWN_TO_JAVA;
    }
}
