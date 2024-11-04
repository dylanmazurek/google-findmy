package defpackage;

import java.util.concurrent.ExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class jtz implements Runnable {
    final /* synthetic */ jzm a;
    final /* synthetic */ jub b;

    public jtz(jub jubVar, jzm jzmVar) {
        this.a = jzmVar;
        this.b = jubVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!this.a.isCancelled()) {
                if (ivc.M(this.a) == jub.a) {
                    return;
                }
            }
        } catch (ExecutionException unused) {
        }
        this.b.o(this.a);
    }
}
