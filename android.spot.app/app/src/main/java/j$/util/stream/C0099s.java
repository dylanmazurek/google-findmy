package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0099s extends CountedCompleter {
    private Spliterator a;
    private final F0 b;
    private final AbstractC0064a c;
    private long d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0099s(AbstractC0064a abstractC0064a, Spliterator spliterator, F0 f0) {
        super(null);
        this.b = f0;
        this.c = abstractC0064a;
        this.a = spliterator;
        this.d = 0L;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.a;
        long estimateSize = spliterator.estimateSize();
        long j = this.d;
        if (j == 0) {
            j = AbstractC0072e.e(estimateSize);
            this.d = j;
        }
        boolean r = R0.SHORT_CIRCUIT.r(this.c.g());
        F0 f0 = this.b;
        boolean z = false;
        C0099s c0099s = this;
        while (true) {
            if (r && f0.n()) {
                break;
            }
            if (estimateSize <= j || (trySplit = spliterator.trySplit()) == null) {
                break;
            }
            C0099s c0099s2 = new C0099s(c0099s, trySplit);
            c0099s.addToPendingCount(1);
            if (z) {
                spliterator = trySplit;
            } else {
                C0099s c0099s3 = c0099s;
                c0099s = c0099s2;
                c0099s2 = c0099s3;
            }
            z = !z;
            c0099s.fork();
            c0099s = c0099s2;
            estimateSize = spliterator.estimateSize();
        }
        c0099s.c.a(spliterator, f0);
        c0099s.a = null;
        c0099s.propagateCompletion();
    }

    C0099s(C0099s c0099s, Spliterator spliterator) {
        super(c0099s);
        this.a = spliterator;
        this.b = c0099s.b;
        this.d = c0099s.d;
        this.c = c0099s.c;
    }
}
