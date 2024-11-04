package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class knf implements fim {
    public static final AtomicReference a = new AtomicReference();

    @Override // defpackage.fim
    public final void a(boolean z) {
        synchronized (knh.a) {
            Iterator it = new ArrayList(knh.b.values()).iterator();
            while (it.hasNext()) {
                knh knhVar = (knh) it.next();
                if (knhVar.d.get()) {
                    Iterator it2 = knhVar.g.iterator();
                    while (it2.hasNext()) {
                        ((njz) it2.next()).f(z);
                    }
                }
            }
        }
    }
}
