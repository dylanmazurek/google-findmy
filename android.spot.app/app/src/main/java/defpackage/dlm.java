package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class dlm {
    private final Queue a = new ArrayDeque(20);

    public abstract dlx a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dlx b() {
        dlx dlxVar = (dlx) this.a.poll();
        if (dlxVar == null) {
            return a();
        }
        return dlxVar;
    }

    public final void c(dlx dlxVar) {
        if (this.a.size() < 20) {
            this.a.offer(dlxVar);
        }
    }
}
