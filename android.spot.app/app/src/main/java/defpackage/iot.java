package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iot extends ion {
    final /* synthetic */ iov a;

    public iot(iov iovVar) {
        this.a = iovVar;
    }

    @Override // defpackage.ion
    public final void b(View view, int i) {
        if (i == 5) {
            this.a.cancel();
        }
    }

    @Override // defpackage.ion
    public final void a(View view, float f) {
    }
}
