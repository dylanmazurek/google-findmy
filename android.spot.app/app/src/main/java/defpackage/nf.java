package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nf extends cf {
    public int b;

    public nf() {
        this.b = 0;
        this.a = 8388627;
    }

    public nf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
    }

    public nf(cf cfVar) {
        super(cfVar);
        this.b = 0;
    }

    public nf(nf nfVar) {
        super((cf) nfVar);
        this.b = 0;
        this.b = nfVar.b;
    }

    public nf(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.b = 0;
    }

    public nf(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.b = 0;
        this.leftMargin = marginLayoutParams.leftMargin;
        this.topMargin = marginLayoutParams.topMargin;
        this.rightMargin = marginLayoutParams.rightMargin;
        this.bottomMargin = marginLayoutParams.bottomMargin;
    }
}
