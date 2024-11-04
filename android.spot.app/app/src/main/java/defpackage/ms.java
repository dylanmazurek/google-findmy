package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ms extends ls {
    public mw a;
    public boolean b;

    public ms(int i, int i2) {
        super(i, i2);
    }

    public final int d() {
        mw mwVar = this.a;
        if (mwVar == null) {
            return -1;
        }
        return mwVar.e;
    }

    public ms(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ms(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public ms(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }
}
