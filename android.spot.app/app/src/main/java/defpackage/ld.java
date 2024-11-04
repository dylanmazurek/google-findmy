package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ld extends ky implements kz {
    public static Method a;
    public kz b;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                a = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    public ld(Context context, int i) {
        super(context, null, i, null);
    }

    @Override // defpackage.ky
    public final kb p(Context context, boolean z) {
        lc lcVar = new lc(context, z);
        lcVar.e = this;
        return lcVar;
    }
}
