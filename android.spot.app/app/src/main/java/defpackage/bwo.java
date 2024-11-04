package defpackage;

import android.view.ViewConfiguration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bwo implements bui {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ bwo(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.bui
    public final Object a() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                return ((hcc) this.a).b.a();
            }
            return Integer.valueOf(((ViewConfiguration) this.a).getScaledMaximumFlingVelocity());
        }
        return Integer.valueOf(((ViewConfiguration) this.a).getScaledMinimumFlingVelocity());
    }
}
