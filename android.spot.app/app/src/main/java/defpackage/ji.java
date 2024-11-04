package defpackage;

import android.graphics.Canvas;
import android.os.Build;
import android.text.StaticLayout;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ji {
    private static Method a;
    private static Method b;
    private static boolean c;

    public static qy c(ag agVar, boolean z) {
        cgq cgqVar;
        if (z) {
            cgqVar = agVar.E();
        } else {
            cgqVar = null;
        }
        if (cgqVar == null) {
            cgqVar = agVar.D;
        }
        if (cgqVar != null) {
            return (qy) new ddh(cgqVar).q(qy.class);
        }
        throw new IllegalStateException("view model not found");
    }

    public static void d(Canvas canvas, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            aqw.a.a(canvas, z);
            return;
        }
        if (!c) {
            try {
                if (Build.VERSION.SDK_INT == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    a = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    b = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    a = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    b = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method = a;
                if (method != null) {
                    method.setAccessible(true);
                }
                Method method2 = b;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            c = true;
        }
        try {
            if (z) {
                Method method3 = a;
                if (method3 != null) {
                    method3.invoke(canvas, null);
                    return;
                }
                return;
            }
            Method method4 = b;
            if (method4 != null) {
                method4.invoke(canvas, null);
            }
        } catch (IllegalAccessException | InvocationTargetException unused2) {
        }
    }

    public boolean b(TextView textView) {
        return ((Boolean) jj.d(textView, "getHorizontallyScrolling", false)).booleanValue();
    }

    public void a(StaticLayout.Builder builder, TextView textView) {
    }
}
