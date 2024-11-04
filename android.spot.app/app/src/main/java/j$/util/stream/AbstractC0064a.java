package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0064a implements AutoCloseable {
    private final AbstractC0064a a;
    private final AbstractC0064a b;
    protected final int c;
    private AbstractC0064a d;
    private int e;
    private int f;
    private Spliterator g;
    private boolean h;
    private boolean i;
    private boolean j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0064a(Spliterator spliterator, int i, boolean z) {
        this.b = null;
        this.g = spliterator;
        this.a = this;
        int i2 = R0.g & i;
        this.c = i2;
        this.f = (~(i2 << 1)) & R0.l;
        this.e = 0;
        this.j = z;
    }

    private Spliterator n(int i) {
        int i2;
        int i3;
        AbstractC0064a abstractC0064a = this.a;
        Spliterator spliterator = abstractC0064a.g;
        if (spliterator != null) {
            abstractC0064a.g = null;
            if (abstractC0064a.j && abstractC0064a.i) {
                AbstractC0064a abstractC0064a2 = abstractC0064a.d;
                int i4 = 1;
                while (abstractC0064a != this) {
                    int i5 = abstractC0064a2.c;
                    if (abstractC0064a2.l()) {
                        if (R0.SHORT_CIRCUIT.r(i5)) {
                            i5 &= ~R0.s;
                        }
                        spliterator = abstractC0064a2.k(abstractC0064a, spliterator, new C0074f(13)).spliterator();
                        if (spliterator.hasCharacteristics(64)) {
                            i2 = (~R0.r) & i5;
                            i3 = R0.q;
                        } else {
                            i2 = (~R0.q) & i5;
                            i3 = R0.r;
                        }
                        i5 = i2 | i3;
                        i4 = 0;
                    }
                    abstractC0064a2.e = i4;
                    abstractC0064a2.f = R0.k(i5, abstractC0064a.f);
                    i4++;
                    AbstractC0064a abstractC0064a3 = abstractC0064a2;
                    abstractC0064a2 = abstractC0064a2.d;
                    abstractC0064a = abstractC0064a3;
                }
            }
            if (i != 0) {
                this.f = R0.k(i, this.f);
            }
            return spliterator;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Spliterator spliterator, F0 f0) {
        f0.getClass();
        if (!R0.SHORT_CIRCUIT.r(this.f)) {
            f0.i(spliterator.getExactSizeIfKnown());
            spliterator.forEachRemaining(f0);
            f0.h();
        } else {
            AbstractC0064a abstractC0064a = this;
            while (abstractC0064a.e > 0) {
                abstractC0064a = abstractC0064a.b;
            }
            f0.i(spliterator.getExactSizeIfKnown());
            abstractC0064a.f(spliterator, f0);
            f0.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final H b(Spliterator spliterator, C0074f c0074f) {
        if (this.a.j) {
            return d(this, spliterator, c0074f);
        }
        C j = j(e(spliterator), c0074f);
        p(spliterator, j);
        return j.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object c(U0 u0) {
        if (!this.h) {
            this.h = true;
            if (this.a.j) {
                return u0.b(this, n(u0.c()));
            }
            return u0.a(this, n(u0.c()));
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.h = true;
        this.g = null;
        this.a.getClass();
    }

    abstract H d(AbstractC0064a abstractC0064a, Spliterator spliterator, C0074f c0074f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long e(Spliterator spliterator) {
        if (R0.SIZED.r(this.f)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }

    abstract boolean f(Spliterator spliterator, F0 f0);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int g() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h() {
        return R0.ORDERED.r(this.f);
    }

    public final boolean i() {
        return this.a.j;
    }

    abstract C j(long j, IntFunction intFunction);

    H k(AbstractC0064a abstractC0064a, Spliterator spliterator, C0074f c0074f) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    abstract boolean l();

    abstract F0 m(int i, F0 f0);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Spliterator o() {
        AbstractC0064a abstractC0064a = this.a;
        if (this == abstractC0064a) {
            if (!this.h) {
                this.h = true;
                Spliterator spliterator = abstractC0064a.g;
                if (spliterator != null) {
                    abstractC0064a.g = null;
                    return spliterator;
                }
                throw new IllegalStateException("source already consumed or closed");
            }
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final F0 p(Spliterator spliterator, F0 f0) {
        f0.getClass();
        a(spliterator, q(f0));
        return f0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final F0 q(F0 f0) {
        f0.getClass();
        AbstractC0064a abstractC0064a = this;
        while (abstractC0064a.e > 0) {
            AbstractC0064a abstractC0064a2 = abstractC0064a.b;
            f0 = abstractC0064a.m(abstractC0064a2.f, f0);
            abstractC0064a = abstractC0064a2;
        }
        return f0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0064a(AbstractC0064a abstractC0064a, int i) {
        if (!abstractC0064a.h) {
            abstractC0064a.h = true;
            abstractC0064a.d = this;
            this.b = abstractC0064a;
            this.c = R0.h & i;
            this.f = R0.k(i, abstractC0064a.f);
            AbstractC0064a abstractC0064a2 = abstractC0064a.a;
            this.a = abstractC0064a2;
            if (l()) {
                abstractC0064a2.i = true;
            }
            this.e = abstractC0064a.e + 1;
            return;
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }
}
