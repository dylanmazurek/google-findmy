package defpackage;

import android.app.Notification;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpu {
    private static Method a;
    private static boolean b;
    private static Method c;
    private static boolean d;

    public static Notification.Builder a(Notification.Builder builder, String str) {
        return builder.addPerson(str);
    }

    public static Notification.Builder b(Notification.Builder builder, String str) {
        return builder.setCategory(str);
    }

    public static Notification.Builder c(Notification.Builder builder, int i) {
        return builder.setColor(i);
    }

    public static Notification.Builder d(Notification.Builder builder, Notification notification) {
        return builder.setPublicVersion(notification);
    }

    public static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
        return builder.setSound(uri, (AudioAttributes) obj);
    }

    public static Notification.Builder f(Notification.Builder builder, int i) {
        return builder.setVisibility(i);
    }

    public static int g(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return bsd.a(drawable);
        }
        if (!d) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", null);
                c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            d = true;
        }
        Method method = c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, null)).intValue();
            } catch (Exception unused2) {
                c = null;
                return 0;
            }
        }
        return 0;
    }

    public static Drawable h(Drawable drawable) {
        if (drawable instanceof bsj) {
            return ((bsj) drawable).c;
        }
        return drawable;
    }

    public static Drawable i(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 23 && !(drawable instanceof bsi)) {
            return new bsk(drawable);
        }
        return drawable;
    }

    public static void j(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        if (Build.VERSION.SDK_INT >= 23) {
            drawable.clearColorFilter();
            return;
        }
        drawable.clearColorFilter();
        if (drawable instanceof InsetDrawable) {
            j(((InsetDrawable) drawable).getDrawable());
            return;
        }
        if (drawable instanceof bsj) {
            j(((bsj) drawable).c);
            return;
        }
        if ((drawable instanceof DrawableContainer) && (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
            int childCount = drawableContainerState.getChildCount();
            for (int i = 0; i < childCount; i++) {
                Drawable child = drawableContainerState.getChild(i);
                if (child != null) {
                    j(child);
                }
            }
        }
    }

    public static boolean k(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return bsd.b(drawable, i);
        }
        if (!b) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            b = true;
        }
        Method method = a;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i));
                return true;
            } catch (Exception unused2) {
                a = null;
            }
        }
        return false;
    }

    public static int[] l() {
        return new int[]{1, 2, 3, 4, 5, 6};
    }

    public static Paint.Join m(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 1) {
                return Paint.Join.BEVEL;
            }
            return Paint.Join.ROUND;
        }
        return Paint.Join.MITER;
    }
}
