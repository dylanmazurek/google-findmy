package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0072e extends CountedCompleter {
    private static final int g;
    protected final AbstractC0064a a;
    protected Spliterator b;
    protected long c;
    protected AbstractC0072e d;
    protected AbstractC0072e e;
    private Object f;

    static {
        int commonPoolParallelism;
        commonPoolParallelism = ForkJoinPool.getCommonPoolParallelism();
        g = commonPoolParallelism << 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0072e(AbstractC0064a abstractC0064a, Spliterator spliterator) {
        super(null);
        this.a = abstractC0064a;
        this.b = spliterator;
        this.c = 0L;
    }

    public static long e(long j) {
        long j2 = j / g;
        if (j2 <= 0) {
            return 1L;
        }
        return j2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object a();

    /* JADX INFO: Access modifiers changed from: protected */
    public Object b() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract AbstractC0072e c(Spliterator spliterator);

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.b;
        long estimateSize = spliterator.estimateSize();
        long j = this.c;
        if (j == 0) {
            j = e(estimateSize);
            this.c = j;
        }
        boolean z = false;
        AbstractC0072e abstractC0072e = this;
        while (estimateSize > j && (trySplit = spliterator.trySplit()) != null) {
            AbstractC0072e c = abstractC0072e.c(trySplit);
            abstractC0072e.d = c;
            AbstractC0072e c2 = abstractC0072e.c(spliterator);
            abstractC0072e.e = c2;
            abstractC0072e.setPendingCount(1);
            if (z) {
                spliterator = trySplit;
                abstractC0072e = c;
                c = c2;
            } else {
                abstractC0072e = c2;
            }
            z = !z;
            c.fork();
            estimateSize = spliterator.estimateSize();
        }
        abstractC0072e.d(abstractC0072e.a());
        abstractC0072e.tryComplete();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(Object obj) {
        this.f = obj;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return this.f;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        this.b = null;
        this.e = null;
        this.d = null;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    protected final void setRawResult(Object obj) {
        if (obj == null) {
        } else {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0072e(AbstractC0072e abstractC0072e, Spliterator spliterator) {
        super(abstractC0072e);
        this.b = spliterator;
        this.a = abstractC0072e.a;
        this.c = abstractC0072e.c;
    }
}
