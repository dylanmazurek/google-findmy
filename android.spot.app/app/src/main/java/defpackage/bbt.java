package defpackage;

import android.os.Looper;
import android.view.Choreographer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbt extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ Object initialValue() {
        Choreographer choreographer = Choreographer.getInstance();
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            bbv bbvVar = new bbv(choreographer, bpw.f(myLooper));
            return bbvVar.plus(bbvVar.j);
        }
        throw new IllegalStateException("no Looper on this thread");
    }
}
