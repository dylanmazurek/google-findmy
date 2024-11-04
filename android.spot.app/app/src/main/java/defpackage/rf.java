package defpackage;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rf {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Drawable drawable) {
        if (drawable instanceof AnimatedVectorDrawable) {
            ((AnimatedVectorDrawable) drawable).start();
        }
    }

    public static long b(ws wsVar) {
        return (wsVar.f() + wsVar.g()) * 1000000;
    }

    public static final boolean c(List list) {
        List list2;
        long j;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() != 0 && list.size() != 1) {
            list2 = new ArrayList();
            Object obj = list.get(0);
            int O = mkm.O(list);
            int i = 0;
            while (i < O) {
                i++;
                Object obj2 = list.get(i);
                bfh bfhVar = (bfh) obj2;
                bfh bfhVar2 = (bfh) obj;
                list2.add(new aqk(a.k(Math.abs(aqk.b(bfhVar2.b().c()) - aqk.b(bfhVar.b().c())), Math.abs(aqk.c(bfhVar2.b().c()) - aqk.c(bfhVar.b().c())))));
                obj = obj2;
            }
        } else {
            list2 = mlx.a;
        }
        if (list2.size() == 1) {
            j = ((aqk) mkm.W(list2)).a;
        } else if (!list2.isEmpty()) {
            Object W = mkm.W(list2);
            int O2 = mkm.O(list2);
            if (O2 > 0) {
                int i2 = 1;
                while (true) {
                    W = new aqk(aqk.e(((aqk) W).a, ((aqk) list2.get(i2)).a));
                    if (i2 == O2) {
                        break;
                    }
                    i2++;
                }
            }
            j = ((aqk) W).a;
        } else {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        if (aqk.c(j) < aqk.b(j)) {
            return true;
        }
        return false;
    }

    public static final boolean d(bfh bfhVar) {
        bfe e = bfhVar.e();
        bfn bfnVar = bfj.a;
        if (bej.b(e, bfj.f) == null && bej.b(bfhVar.e(), bfj.e) == null) {
            return false;
        }
        return true;
    }

    public static final void e(View view) {
        try {
            if (!bdk.c) {
                bdk.c = true;
                if (Build.VERSION.SDK_INT < 28) {
                    bdk.a = View.class.getDeclaredMethod("updateDisplayListIfDirty", null);
                    bdk.b = View.class.getDeclaredField("mRecreateDisplayList");
                } else {
                    bdk.a = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                    bdk.b = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                }
                Method method = bdk.a;
                if (method != null) {
                    method.setAccessible(true);
                }
                Field field = bdk.b;
                if (field != null) {
                    field.setAccessible(true);
                }
            }
            Field field2 = bdk.b;
            if (field2 != null) {
                field2.setBoolean(view, true);
            }
            Method method2 = bdk.a;
            if (method2 != null) {
                method2.invoke(view, null);
            }
        } catch (Throwable unused) {
            bdk.d = true;
        }
    }
}
