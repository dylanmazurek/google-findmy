package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jxa extends jwy {
    @Override // defpackage.jwy
    public final int a(jxb jxbVar) {
        int i;
        synchronized (jxbVar) {
            i = jxbVar.remaining - 1;
            jxbVar.remaining = i;
        }
        return i;
    }

    @Override // defpackage.jwy
    public final void b(jxb jxbVar, Set set) {
        synchronized (jxbVar) {
            if (jxbVar.seenExceptions == null) {
                jxbVar.seenExceptions = set;
            }
        }
    }
}
