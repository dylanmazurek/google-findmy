package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hj extends gr {
    final /* synthetic */ ho d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj(ho hoVar, Context context, ha haVar, View view) {
        super(context, haVar, view, false);
        this.d = hoVar;
        if (!haVar.m.o()) {
            View view2 = hoVar.h;
            this.a = view2 == null ? (View) hoVar.f : view2;
        }
        e(hoVar.n);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gr
    public final void c() {
        ho hoVar = this.d;
        hoVar.k = null;
        hoVar.l = 0;
        super.c();
    }
}
