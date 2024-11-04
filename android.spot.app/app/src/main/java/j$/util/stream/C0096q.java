package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: j$.util.stream.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0096q extends AbstractC0068c {
    private final C0090n j;
    private final boolean k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0096q(C0090n c0090n, boolean z, AbstractC0064a abstractC0064a, Spliterator spliterator) {
        super(abstractC0064a, spliterator);
        this.k = z;
        this.j = c0090n;
    }

    private void g(Object obj) {
        CountedCompleter completer;
        CountedCompleter completer2;
        CountedCompleter completer3;
        AbstractC0072e abstractC0072e = this;
        while (abstractC0072e != null) {
            completer = abstractC0072e.getCompleter();
            AbstractC0072e abstractC0072e2 = (AbstractC0072e) completer;
            if (abstractC0072e2 != null && abstractC0072e2.d != abstractC0072e) {
                completer2 = getCompleter();
                AbstractC0072e abstractC0072e3 = (AbstractC0068c) ((AbstractC0072e) completer2);
                AbstractC0072e abstractC0072e4 = this;
                while (abstractC0072e3 != null) {
                    if (abstractC0072e3.d == abstractC0072e4) {
                        AbstractC0068c abstractC0068c = (AbstractC0068c) abstractC0072e3.e;
                        if (!abstractC0068c.i) {
                            abstractC0068c.i = true;
                        }
                    }
                    completer3 = abstractC0072e3.getCompleter();
                    AbstractC0072e abstractC0072e5 = (AbstractC0068c) ((AbstractC0072e) completer3);
                    abstractC0072e4 = abstractC0072e3;
                    abstractC0072e3 = abstractC0072e5;
                }
                return;
            }
            abstractC0072e = abstractC0072e2;
        }
        AtomicReference atomicReference = this.h;
        while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0072e
    public final Object a() {
        AbstractC0064a abstractC0064a = this.a;
        V0 v0 = (V0) this.j.d.get();
        abstractC0064a.p(this.b, v0);
        Object obj = v0.get();
        if (!this.k) {
            if (obj != null) {
                AtomicReference atomicReference = this.h;
                while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
                }
            }
            return null;
        }
        if (obj == null) {
            return null;
        }
        g(obj);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0072e
    public final AbstractC0072e c(Spliterator spliterator) {
        return new C0096q(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0068c
    protected final Object f() {
        return this.j.b;
    }

    @Override // j$.util.stream.AbstractC0072e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        if (this.k) {
            C0096q c0096q = (C0096q) this.d;
            C0096q c0096q2 = null;
            while (true) {
                if (c0096q != c0096q2) {
                    Object b = c0096q.b();
                    if (b != null && this.j.c.test(b)) {
                        d(b);
                        g(b);
                        break;
                    } else {
                        c0096q2 = c0096q;
                        c0096q = (C0096q) this.e;
                    }
                } else {
                    break;
                }
            }
        }
        super.onCompletion(countedCompleter);
    }

    C0096q(C0096q c0096q, Spliterator spliterator) {
        super(c0096q, spliterator);
        this.k = c0096q.k;
        this.j = c0096q.j;
    }
}
