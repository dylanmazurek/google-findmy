package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dkv {
    final Executor a;
    final dso b;

    public dkv(dso dsoVar, Executor executor) {
        this.b = dsoVar;
        this.a = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dkv) {
            return this.b.equals(((dkv) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
