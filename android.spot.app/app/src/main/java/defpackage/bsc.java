package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bsc {
    public static ColorFilter a(Drawable drawable) {
        return drawable.getColorFilter();
    }

    public static void b(Drawable drawable, Resources.Theme theme) {
        drawable.applyTheme(theme);
    }

    public static void c(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    public static void d(Drawable drawable, float f, float f2) {
        drawable.setHotspot(f, f2);
    }

    public static void e(Drawable drawable, int i, int i2, int i3, int i4) {
        drawable.setHotspotBounds(i, i2, i3, i4);
    }

    public static void f(Drawable drawable, int i) {
        drawable.setTint(i);
    }

    public static void g(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    public static void h(Drawable drawable, PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }

    public static boolean i(Drawable drawable) {
        return drawable.canApplyTheme();
    }

    public static final IOException j(File file, IOException iOException) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return r(file, iOException);
        }
        if (parentFile.exists()) {
            if (parentFile.isFile()) {
                if (parentFile.canRead()) {
                    if (parentFile.canWrite()) {
                        return r(file, iOException);
                    }
                    return r(file, iOException);
                }
                if (parentFile.canWrite()) {
                    return r(file, iOException);
                }
                return r(file, iOException);
            }
            if (parentFile.canRead()) {
                if (parentFile.canWrite()) {
                    return r(file, iOException);
                }
                return r(file, iOException);
            }
            if (parentFile.canWrite()) {
                return r(file, iOException);
            }
            return r(file, iOException);
        }
        return r(file, iOException);
    }

    public static final jvt k(Uri uri) {
        return iqh.s(uri.toString());
    }

    public static /* synthetic */ String l(int i) {
        if (i != 1) {
            return "ERROR_STATUS_CODE";
        }
        return "AUTH_TOKEN";
    }

    public static void m(boolean z) {
        n(z, "");
    }

    public static void n(boolean z, String str) {
        if (z) {
        } else {
            throw new IllegalArgumentException(str);
        }
    }

    public static void o(String str) {
        if (!TextUtils.isEmpty(str)) {
        } else {
            throw new IllegalArgumentException("Must not be null or empty");
        }
    }

    public static void p(Collection collection) {
        if (!collection.isEmpty()) {
        } else {
            throw new IllegalArgumentException("Must not be empty.");
        }
    }

    public static void q(Object obj) {
        amr.p(obj, "Argument must not be null");
    }

    private static final IOException r(File file, IOException iOException) {
        StringBuilder sb = new StringBuilder("Inoperable file:");
        try {
            sb.append(" canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + ']');
        } catch (IOException unused) {
            sb.append(" failed to attach additional metadata");
        }
        return new IOException(sb.toString(), iOException);
    }
}
