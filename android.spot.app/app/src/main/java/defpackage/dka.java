package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dka extends WeakReference {
    final dir a;
    final boolean b;
    dlf c;

    public dka(dir dirVar, dkz dkzVar, ReferenceQueue referenceQueue) {
        super(dkzVar, referenceQueue);
        bsc.q(dirVar);
        this.a = dirVar;
        this.c = null;
        this.b = dkzVar.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.c = null;
        clear();
    }
}
