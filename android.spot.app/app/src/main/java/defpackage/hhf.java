package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.ContextThemeWrapper;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class hhf {
    protected abstract int a();

    protected abstract int b();

    public abstract int c();

    protected abstract boolean d();

    public final Context f(Context context) {
        int a;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{a()});
        try {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(new ContextThemeWrapper(context, obtainStyledAttributes.getResourceId(0, b())), c());
            if (d() && iqb.c() && (a = iqb.a(contextThemeWrapper, iqb.a)) != 0) {
                contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, a);
            }
            return contextThemeWrapper;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
