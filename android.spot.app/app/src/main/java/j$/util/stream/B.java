package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
final class B extends AbstractC0068c {
    private final A j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public B(A a, AbstractC0064a abstractC0064a, Spliterator spliterator) {
        super(abstractC0064a, spliterator);
        this.j = a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0072e
    public final Object a() {
        boolean z;
        AbstractC0064a abstractC0064a = this.a;
        C0111y c0111y = (C0111y) this.j.b.get();
        abstractC0064a.p(this.b, c0111y);
        boolean z2 = c0111y.b;
        z = this.j.a.b;
        if (z2 == z) {
            Boolean valueOf = Boolean.valueOf(z2);
            AtomicReference atomicReference = this.h;
            while (!atomicReference.compareAndSet(null, valueOf) && atomicReference.get() == null) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0072e
    public final AbstractC0072e c(Spliterator spliterator) {
        return new B(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0068c
    protected final Object f() {
        boolean z;
        z = this.j.a.b;
        return Boolean.valueOf(!z);
    }

    B(B b, Spliterator spliterator) {
        super(b, spliterator);
        this.j = b.j;
    }
}
