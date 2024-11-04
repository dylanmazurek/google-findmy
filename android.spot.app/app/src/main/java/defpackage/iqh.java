package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class iqh {
    static void a(Outline outline, Path path) {
        outline.setPath(path);
    }

    public static ColorStateList b(Drawable drawable) {
        ColorStateList colorStateList;
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT >= 29 && jh$$ExternalSyntheticApiModelOutline0.m156m((Object) drawable)) {
            colorStateList = jh$$ExternalSyntheticApiModelOutline0.m((Object) drawable).getColorStateList();
            return colorStateList;
        }
        return null;
    }

    public static PorterDuffColorFilter c(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
        }
        return null;
    }

    public static Drawable d(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        int i = Build.VERSION.SDK_INT;
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            Drawable mutate = bpu.i(drawable).mutate();
            if (mode != null) {
                bsc.h(mutate, mode);
                return mutate;
            }
            return mutate;
        }
        if (i < 23) {
            drawable.mutate();
            return drawable;
        }
        return drawable;
    }

    public static void e(Outline outline, Path path) {
        if (Build.VERSION.SDK_INT >= 30) {
            a(outline, path);
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            try {
                iqg.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            iqg.a(outline, path);
        }
    }

    public static void f(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT == 21) {
            if (i != 0) {
                drawable.setColorFilter(i, PorterDuff.Mode.SRC_IN);
                return;
            } else {
                drawable.setColorFilter(null);
                return;
            }
        }
        if (i != 0) {
            bsc.f(drawable, i);
        } else {
            bsc.g(drawable, null);
        }
    }

    public static AttributeSet g(Context context, int i) {
        int next;
        try {
            XmlResourceParser xml = context.getResources().getXml(i);
            do {
                next = xml.next();
                if (next == 2) {
                    if (TextUtils.equals(xml.getName(), "badge")) {
                        return Xml.asAttributeSet(xml);
                    }
                    throw new XmlPullParserException(a.ag("badge", "Must have a <", "> start tag"));
                }
            } while (next != 1);
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException e) {
            Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x".concat(String.valueOf(Integer.toHexString(i))));
            notFoundException.initCause(e);
            throw notFoundException;
        }
    }

    public static boolean h() {
        String str;
        String str2 = Build.MANUFACTURER;
        if (str2 != null) {
            str = str2.toLowerCase(Locale.ENGLISH);
        } else {
            str = "";
        }
        return str.equals("meizu");
    }

    public static jax i(String str) {
        return jbu.d(str, jay.a, false);
    }

    public static Object j(Context context, Class cls) {
        Object applicationContext = context.getApplicationContext();
        if (applicationContext instanceof lsc) {
            try {
                return cls.cast(((lsc) applicationContext).r());
            } catch (ClassCastException e) {
                throw new IllegalStateException("Failed to get an entry point. Did you mark your interface with @SingletonEntryPoint?", e);
            }
        }
        throw new IllegalStateException("Given application context does not implement GeneratedComponentManager: ".concat(String.valueOf(String.valueOf(applicationContext.getClass()))));
    }

    public static int k(byte b) {
        return b & 255;
    }

    public static long l(byte b, byte b2, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8) {
        return ((b6 & 255) << 16) | ((b & 255) << 56) | ((b2 & 255) << 48) | ((b3 & 255) << 40) | ((b4 & 255) << 32) | ((b5 & 255) << 24) | ((b7 & 255) << 8) | (b8 & 255);
    }

    public static byte[] m(long j) {
        byte[] bArr = new byte[8];
        for (int i = 7; i >= 0; i--) {
            bArr[i] = (byte) (255 & j);
            j >>= 8;
        }
        return bArr;
    }

    public static int n(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static int o(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static List p(int... iArr) {
        int length = iArr.length;
        if (length == 0) {
            return Collections.emptyList();
        }
        return new jvy(iArr, 0, length);
    }

    public static int[] q(Collection collection) {
        if (collection instanceof jvy) {
            jvy jvyVar = (jvy) collection;
            return Arrays.copyOfRange(jvyVar.a, jvyVar.b, jvyVar.c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static int r(int i, int i2) {
        hwx.P(true, "min (%s) must be less than or equal to max (%s)", i2, 1073741823);
        return Math.min(Math.max(i, i2), 1073741823);
    }

    public static jvt s(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Charset charset = jvu.a;
        str.getClass();
        charset.getClass();
        int i = 0;
        int i2 = 0;
        while (i2 < str.length() && ":/\\?#".indexOf(str.charAt(i2)) < 0) {
            i2++;
        }
        if (i2 > 0 && str.startsWith(":", i2)) {
            String substring = str.substring(0, i2);
            int i3 = i2 + 1;
            str2 = substring;
            i = i3;
        } else {
            str2 = null;
        }
        if (str.startsWith("//", i)) {
            int i4 = i + 2;
            int i5 = i4;
            while (i5 < str.length() && "/\\?#".indexOf(str.charAt(i5)) < 0) {
                i5++;
            }
            int i6 = i5;
            str3 = str.substring(i4, i5);
            i = i6;
        } else {
            str3 = null;
        }
        int i7 = i;
        while (i7 < str.length() && "?#".indexOf(str.charAt(i7)) < 0) {
            i7++;
        }
        if (i7 > i) {
            str4 = str.substring(i, i7);
        } else {
            str4 = null;
        }
        if (str.startsWith("?", i7)) {
            int i8 = i7 + 1;
            while (i7 < str.length() && str.charAt(i7) != '#') {
                i7++;
            }
            str5 = str.substring(i8, i7);
        } else {
            str5 = null;
        }
        if (str.startsWith("#", i7)) {
            str6 = str.substring(i7 + 1);
        } else {
            str6 = null;
        }
        if ((str2 == null || str2.equals(jvt.b(str2))) && jvu.a.equals(charset)) {
            return new jvt(str2, str3, str4, str5, str6, charset, str);
        }
        return new jvt(str2, str3, str4, str5, str6, charset);
    }

    public static Collection t(Collection collection) {
        ArrayList G = hzc.G(collection);
        int size = G.size();
        for (int i = 0; i < size; i++) {
            G.get(i).getClass();
        }
        return G;
    }

    public static void u(boolean z, String str, int i, int i2) {
        if (z) {
            return;
        }
        throw new ArithmeticException("overflow: " + str + "(" + i + ", " + i2 + ")");
    }

    static void v(boolean z, String str, long j, long j2) {
        if (z) {
            return;
        }
        throw new ArithmeticException("overflow: " + str + "(" + j + ", " + j2 + ")");
    }

    public static void w(boolean z) {
        if (z) {
        } else {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public static long x(long j, long j2) {
        boolean z;
        boolean z2 = true;
        if ((j ^ j2) < 0) {
            z = true;
        } else {
            z = false;
        }
        long j3 = j + j2;
        if ((j ^ j3) < 0) {
            z2 = false;
        }
        v(z | z2, "checkedAdd", j, j2);
        return j3;
    }

    public static long y(long j, long j2) {
        boolean z;
        boolean z2;
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(j) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j2);
        long j3 = j * j2;
        if (numberOfLeadingZeros > 65) {
            return j3;
        }
        if (numberOfLeadingZeros >= 64) {
            z = true;
        } else {
            z = false;
        }
        v(z, "checkedMultiply", j, j2);
        v(true, "checkedMultiply", j, j2);
        if (j != 0 && j3 / j != j2) {
            z2 = false;
        } else {
            z2 = true;
        }
        v(z2, "checkedMultiply", j, j2);
        return j3;
    }

    public static long z(long j, long j2) {
        boolean z;
        boolean z2 = true;
        if ((j ^ j2) >= 0) {
            z = true;
        } else {
            z = false;
        }
        long j3 = j - j2;
        if ((j ^ j3) < 0) {
            z2 = false;
        }
        v(z | z2, "checkedSubtract", j, j2);
        return j3;
    }
}
