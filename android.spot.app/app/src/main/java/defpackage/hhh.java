package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hhh extends lj {
    private final Context a;
    private final jis e;
    private final hjp f;
    private final int g;

    public hhh(Context context, jis jisVar, hjp hjpVar, int i) {
        context.getClass();
        this.a = context;
        this.e = jisVar;
        this.f = hjpVar;
        this.g = i;
    }

    @Override // defpackage.lj
    public final int a() {
        return ((jmi) this.e).c;
    }

    @Override // defpackage.lj
    public final /* bridge */ /* synthetic */ mh f(ViewGroup viewGroup, int i) {
        hgv hgvVar = new hgv(this.a, this.f, viewGroup);
        View view = hgvVar.b;
        int[] iArr = bwn.a;
        int paddingStart = view.getPaddingStart();
        int i2 = this.g;
        View view2 = hgvVar.b;
        view.setPaddingRelative(paddingStart + i2, view2.getPaddingTop(), view2.getPaddingEnd() + i2, hgvVar.b.getPaddingBottom());
        return hgvVar;
    }

    @Override // defpackage.lj
    public final /* synthetic */ void k(mh mhVar, int i) {
        hgv hgvVar = (hgv) mhVar;
        hgu hguVar = (hgu) this.e.get(i);
        hgvVar.v.a = jer.i(Integer.valueOf(hguVar.e));
        hgvVar.v.b(hgvVar.u);
        Drawable drawable = hguVar.b;
        if (drawable != null) {
            hgvVar.r.setImageDrawable(hog.N(drawable, hgvVar.t));
        } else {
            ImageView imageView = hgvVar.r;
            imageView.setImageDrawable(hog.O(imageView.getContext(), hguVar.c, hgvVar.t));
        }
        hgvVar.s.setText(hguVar.d);
        hgvVar.b.setOnClickListener(new hgq(hgvVar, hguVar, 5, null));
    }

    @Override // defpackage.lj
    public final /* synthetic */ void n(mh mhVar) {
        hgv hgvVar = (hgv) mhVar;
        hgvVar.v.cU(hgvVar.u);
        hgvVar.v.a = jdl.a;
    }
}
