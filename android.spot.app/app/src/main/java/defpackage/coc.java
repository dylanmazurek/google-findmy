package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class coc implements bvj {
    final /* synthetic */ ViewPager a;
    private final Rect b = new Rect();

    public coc(ViewPager viewPager) {
        this.a = viewPager;
    }

    @Override // defpackage.bvj
    public final bya a(View view, bya byaVar) {
        bxs bxpVar;
        bya f = bwn.f(view, byaVar);
        if (f.r()) {
            return f;
        }
        Rect rect = this.b;
        rect.left = f.b();
        rect.top = f.d();
        rect.right = f.c();
        rect.bottom = f.a();
        int childCount = this.a.getChildCount();
        for (int i = 0; i < childCount; i++) {
            bya d = bwn.d(this.a.getChildAt(i), f);
            rect.left = Math.min(d.b(), rect.left);
            rect.top = Math.min(d.d(), rect.top);
            rect.right = Math.min(d.c(), rect.right);
            rect.bottom = Math.min(d.a(), rect.bottom);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            bxpVar = new bxr(f);
        } else if (Build.VERSION.SDK_INT >= 29) {
            bxpVar = new bxq(f);
        } else {
            bxpVar = new bxp(f);
        }
        bxpVar.c(brq.c(rect));
        return bxpVar.a();
    }
}
