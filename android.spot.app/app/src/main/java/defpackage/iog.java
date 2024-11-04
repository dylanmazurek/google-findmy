package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iog implements ise {
    @Override // defpackage.ise
    public final void a(View view, bya byaVar, isf isfVar) {
        int i;
        isfVar.d += byaVar.a();
        int layoutDirection = view.getLayoutDirection();
        int b = byaVar.b();
        int c = byaVar.c();
        if (layoutDirection == 1) {
            i = c;
        } else {
            i = b;
        }
        isfVar.a += i;
        if (layoutDirection != 1) {
            b = c;
        }
        isfVar.c += b;
        isfVar.a(view);
    }
}
