package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class kof implements kqf, kqe {
    private final Executor c;
    private final Map b = new HashMap();
    public Queue a = new ArrayDeque();

    public kof(Executor executor) {
        this.c = executor;
    }

    public final synchronized Set a() {
        throw null;
    }

    @Override // defpackage.kqf
    public final void b(Class cls, njz njzVar) {
        c(cls, this.c, njzVar);
    }

    public final synchronized void c(Class cls, Executor executor, njz njzVar) {
        kne.y(njzVar);
        kne.y(executor);
        if (!this.b.containsKey(cls)) {
            this.b.put(cls, new ConcurrentHashMap());
        }
        ((ConcurrentHashMap) this.b.get(cls)).put(njzVar, executor);
    }
}
