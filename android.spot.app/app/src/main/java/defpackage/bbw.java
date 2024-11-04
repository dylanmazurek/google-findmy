package defpackage;

import android.view.Choreographer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bbw implements Choreographer.FrameCallback {
    final /* synthetic */ msd a;
    final /* synthetic */ moh b;

    public bbw(msd msdVar, moh mohVar) {
        this.a = msdVar;
        this.b = mohVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object n;
        try {
            n = this.b.a(Long.valueOf(j));
        } catch (Throwable th) {
            n = mjo.n(th);
        }
        this.a.p(n);
    }
}
