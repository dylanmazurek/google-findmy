package defpackage;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cor extends cly {
    public final List a = new ArrayList(3);

    private static final void g(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    @Override // defpackage.cly
    public final void c(int i) {
        try {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((cly) it.next()).c(i);
            }
        } catch (ConcurrentModificationException e) {
            g(e);
        }
    }

    @Override // defpackage.cly
    public final void d(int i, float f, int i2) {
        try {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((cly) it.next()).d(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            g(e);
        }
    }

    @Override // defpackage.cly
    public final void e(int i) {
        try {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((cly) it.next()).e(i);
            }
        } catch (ConcurrentModificationException e) {
            g(e);
        }
    }

    public final void f(cly clyVar) {
        this.a.add(clyVar);
    }
}
