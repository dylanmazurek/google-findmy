package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0068c extends AbstractC0072e {
    protected final AtomicReference h;
    protected volatile boolean i;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0068c(AbstractC0064a abstractC0064a, Spliterator spliterator) {
        super(abstractC0064a, spliterator);
        this.h = new AtomicReference(null);
    }

    @Override // j$.util.stream.AbstractC0072e
    public final Object b() {
        CountedCompleter completer;
        completer = getCompleter();
        if (((AbstractC0072e) completer) == null) {
            Object obj = this.h.get();
            if (obj == null) {
                return f();
            }
            return obj;
        }
        return super.b();
    }

    @Override // j$.util.stream.AbstractC0072e, java.util.concurrent.CountedCompleter
    public final void compute() {
        Object obj;
        Spliterator trySplit;
        CountedCompleter completer;
        Spliterator spliterator = this.b;
        long estimateSize = spliterator.estimateSize();
        long j = this.c;
        if (j == 0) {
            j = AbstractC0072e.e(estimateSize);
            this.c = j;
        }
        AtomicReference atomicReference = this.h;
        boolean z = false;
        AbstractC0068c abstractC0068c = this;
        while (true) {
            obj = atomicReference.get();
            if (obj != null) {
                break;
            }
            boolean z2 = abstractC0068c.i;
            if (!z2) {
                completer = abstractC0068c.getCompleter();
                while (true) {
                    AbstractC0068c abstractC0068c2 = (AbstractC0068c) ((AbstractC0072e) completer);
                    if (z2 || abstractC0068c2 == null) {
                        break;
                    }
                    z2 = abstractC0068c2.i;
                    completer = abstractC0068c2.getCompleter();
                }
            }
            if (z2) {
                obj = abstractC0068c.f();
                break;
            }
            if (estimateSize <= j || (trySplit = spliterator.trySplit()) == null) {
                break;
            }
            AbstractC0068c abstractC0068c3 = (AbstractC0068c) abstractC0068c.c(trySplit);
            abstractC0068c.d = abstractC0068c3;
            AbstractC0068c abstractC0068c4 = (AbstractC0068c) abstractC0068c.c(spliterator);
            abstractC0068c.e = abstractC0068c4;
            abstractC0068c.setPendingCount(1);
            if (z) {
                spliterator = trySplit;
                abstractC0068c = abstractC0068c3;
                abstractC0068c3 = abstractC0068c4;
            } else {
                abstractC0068c = abstractC0068c4;
            }
            z = !z;
            abstractC0068c3.fork();
            estimateSize = spliterator.estimateSize();
        }
        obj = abstractC0068c.a();
        abstractC0068c.d(obj);
        abstractC0068c.tryComplete();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0072e
    public final void d(Object obj) {
        CountedCompleter completer;
        completer = getCompleter();
        if (((AbstractC0072e) completer) == null) {
            if (obj != null) {
                AtomicReference atomicReference = this.h;
                while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
                }
                return;
            }
            return;
        }
        super.d(obj);
    }

    protected abstract Object f();

    @Override // j$.util.stream.AbstractC0072e, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        return b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0068c(AbstractC0068c abstractC0068c, Spliterator spliterator) {
        super(abstractC0068c, spliterator);
        this.h = abstractC0068c.h;
    }
}
