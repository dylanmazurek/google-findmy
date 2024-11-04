package defpackage;

import android.content.Intent;
import android.os.Process;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qq implements Runnable {
    private final /* synthetic */ int a;
    private final Object b;

    public qq(csy csyVar, int i) {
        this.a = i;
        this.b = csyVar;
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean isEmpty;
        boolean isEmpty2;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        Process.setThreadPriority(0);
                        this.b.run();
                        return;
                    }
                    cqc.b();
                    csy.e();
                    Object obj = this.b;
                    synchronized (((csy) obj).g) {
                        if (((csy) obj).h != null) {
                            cqc.b();
                            Objects.toString(((csy) obj).h);
                            if (((Intent) ((csy) obj).g.remove(0)).equals(((csy) obj).h)) {
                                ((csy) obj).h = null;
                            } else {
                                throw new IllegalStateException("Dequeue-d command is not the first.");
                            }
                        }
                        Object obj2 = ((csy) obj).j.a;
                        csr csrVar = ((csy) obj).f;
                        synchronized (csrVar.d) {
                            isEmpty = csrVar.c.isEmpty();
                        }
                        if (isEmpty && ((csy) obj).g.isEmpty()) {
                            synchronized (((cxd) obj2).b) {
                                isEmpty2 = ((cxd) obj2).a.isEmpty();
                            }
                            if (isEmpty2) {
                                cqc.b();
                                csx csxVar = ((csy) obj).i;
                                if (csxVar != null) {
                                    csxVar.a();
                                }
                            }
                        }
                        if (!((csy) obj).g.isEmpty()) {
                            ((csy) obj).c();
                        }
                    }
                    return;
                }
                if (((WeakReference) this.b).get() != null) {
                    ((qy) ((WeakReference) this.b).get()).j = false;
                    return;
                }
                return;
            }
            if (((WeakReference) this.b).get() != null) {
                ((qr) ((WeakReference) this.b).get()).q();
                return;
            }
            return;
        }
        if (((WeakReference) this.b).get() != null) {
            ((qy) ((WeakReference) this.b).get()).i = false;
        }
    }

    public qq(Runnable runnable, int i) {
        this.a = i;
        this.b = runnable;
    }

    public qq(qr qrVar, int i) {
        this.a = i;
        this.b = new WeakReference(qrVar);
    }

    public qq(qy qyVar, int i) {
        this.a = i;
        this.b = new WeakReference(qyVar);
    }

    public qq(qy qyVar, int i, byte[] bArr) {
        this.a = i;
        this.b = new WeakReference(qyVar);
    }
}
