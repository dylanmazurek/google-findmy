package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iwq extends iuu {
    @Override // defpackage.iuu
    public final void g(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float a;
        if (f >= 0.5f) {
            view = view2;
        }
        RectF f2 = f(tabLayout, view);
        if (f < 0.5f) {
            a = inc.a(1.0f, 0.0f, 0.0f, 0.5f, f);
        } else {
            a = inc.a(0.0f, 1.0f, 0.5f, 1.0f, f);
        }
        drawable.setBounds((int) f2.left, drawable.getBounds().top, (int) f2.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (a * 255.0f));
    }
}
