package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.g0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0077g0 extends CountedCompleter implements F0 {
    protected final Spliterator a;
    protected final AbstractC0064a b;
    protected final long c;
    protected long d;
    protected long e;
    protected int f;
    protected int g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0077g0(Spliterator spliterator, AbstractC0064a abstractC0064a, int i) {
        this.a = spliterator;
        this.b = abstractC0064a;
        this.c = AbstractC0072e.e(spliterator.estimateSize());
        this.d = 0L;
        this.e = i;
    }

    abstract AbstractC0077g0 a(Spliterator spliterator, long j, long j2);

    public /* synthetic */ void accept(double d) {
        D.d();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.a;
        AbstractC0077g0 abstractC0077g0 = this;
        while (spliterator.estimateSize() > abstractC0077g0.c && (trySplit = spliterator.trySplit()) != null) {
            abstractC0077g0.setPendingCount(1);
            long estimateSize = trySplit.estimateSize();
            abstractC0077g0.a(trySplit, abstractC0077g0.d, estimateSize).fork();
            abstractC0077g0 = abstractC0077g0.a(spliterator, abstractC0077g0.d + estimateSize, abstractC0077g0.e - estimateSize);
        }
        abstractC0077g0.b.p(spliterator, abstractC0077g0);
        abstractC0077g0.propagateCompletion();
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ void h() {
    }

    @Override // j$.util.stream.F0
    public final void i(long j) {
        long j2 = this.e;
        if (j <= j2) {
            int i = (int) this.d;
            this.f = i;
            this.g = i + ((int) j2);
            return;
        }
        throw new IllegalStateException("size passed to Sink.begin exceeds array length");
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ boolean n() {
        return false;
    }

    public /* synthetic */ void accept(int i) {
        D.h();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0077g0(AbstractC0077g0 abstractC0077g0, Spliterator spliterator, long j, long j2, int i) {
        super(abstractC0077g0);
        this.a = spliterator;
        this.b = abstractC0077g0.b;
        this.c = abstractC0077g0.c;
        this.d = j;
        this.e = j2;
        if (j < 0 || j2 < 0 || (j + j2) - 1 >= i) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)));
        }
    }
}
