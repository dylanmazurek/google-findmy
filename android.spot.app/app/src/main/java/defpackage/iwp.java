package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iwp extends iuu {
    private static float I(float f) {
        return (float) Math.sin((f * 3.141592653589793d) / 2.0d);
    }

    private static float b(float f) {
        return (float) (1.0d - Math.cos((f * 3.141592653589793d) / 2.0d));
    }

    @Override // defpackage.iuu
    public final void g(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float I;
        float b;
        RectF f2 = f(tabLayout, view);
        RectF f3 = f(tabLayout, view2);
        if (f2.left < f3.left) {
            I = b(f);
            b = I(f);
        } else {
            I = I(f);
            b = b(f);
        }
        drawable.setBounds(inc.b((int) f2.left, (int) f3.left, I), drawable.getBounds().top, inc.b((int) f2.right, (int) f3.right, b), drawable.getBounds().bottom);
    }
}
