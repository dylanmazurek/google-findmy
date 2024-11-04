package defpackage;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bhg implements bhh {
    public static boolean a;
    public static Constructor b;

    @Override // defpackage.bhh
    public StaticLayout a(bhi bhiVar) {
        StaticLayout staticLayout = null;
        if (!a) {
            a = true;
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                b = StaticLayout.class.getConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
            } catch (NoSuchMethodException unused) {
                b = null;
                Log.e("StaticLayoutFactory", "unable to collect necessary constructor.");
            }
        }
        Constructor constructor = b;
        if (constructor != null) {
            try {
                staticLayout = (StaticLayout) constructor.newInstance(bhiVar.a, 0, Integer.valueOf(bhiVar.b), bhiVar.c, Integer.valueOf(bhiVar.d), bhiVar.f, bhiVar.e, Float.valueOf(1.0f), Float.valueOf(0.0f), false, bhiVar.h, Integer.valueOf(bhiVar.i), Integer.valueOf(bhiVar.g));
            } catch (IllegalAccessException unused2) {
                b = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
            } catch (InstantiationException unused3) {
                b = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
            } catch (InvocationTargetException unused4) {
                b = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
            }
        }
        if (staticLayout != null) {
            return staticLayout;
        }
        return new StaticLayout(bhiVar.a, 0, bhiVar.b, bhiVar.c, bhiVar.d, bhiVar.f, 1.0f, 0.0f, false, bhiVar.h, bhiVar.i);
    }

    @Override // defpackage.bhh
    public final boolean b(StaticLayout staticLayout) {
        return false;
    }
}
