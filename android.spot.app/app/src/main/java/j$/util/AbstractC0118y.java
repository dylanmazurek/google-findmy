package j$.util;

import j$.util.Comparator;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;

/* renamed from: j$.util.y */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC0118y {
    public static void a(C c, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            c.forEachRemaining((DoubleConsumer) consumer);
        } else if (!c0.a) {
            consumer.getClass();
            c.forEachRemaining((DoubleConsumer) new C0114u(consumer));
        } else {
            c0.a(c.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
            throw null;
        }
    }

    public static void b(F f, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            f.forEachRemaining((IntConsumer) consumer);
        } else if (!c0.a) {
            consumer.getClass();
            f.forEachRemaining((IntConsumer) new C0116w(consumer));
        } else {
            c0.a(f.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
            throw null;
        }
    }

    public static long c(Spliterator spliterator) {
        if ((spliterator.characteristics() & 64) == 0) {
            return -1L;
        }
        return spliterator.estimateSize();
    }

    public static boolean d(Spliterator spliterator, int i) {
        if ((spliterator.characteristics() & i) == i) {
            return true;
        }
        return false;
    }

    public static Spliterator e(java.util.SortedSet sortedSet) {
        return new C0119z(sortedSet, sortedSet);
    }

    public static boolean f(C c, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            return c.tryAdvance((DoubleConsumer) consumer);
        }
        if (!c0.a) {
            consumer.getClass();
            return c.tryAdvance((DoubleConsumer) new C0114u(consumer));
        }
        c0.a(c.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
        throw null;
    }

    public static boolean g(F f, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            return f.tryAdvance((IntConsumer) consumer);
        }
        if (!c0.a) {
            consumer.getClass();
            return f.tryAdvance((IntConsumer) new C0116w(consumer));
        }
        c0.a(f.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
        throw null;
    }

    public static void h(Iterator it, Consumer consumer) {
        if (it instanceof InterfaceC0113t) {
            ((InterfaceC0113t) it).forEachRemaining(consumer);
            return;
        }
        consumer.getClass();
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    public static /* synthetic */ java.util.Comparator i(java.util.Comparator comparator, java.util.Comparator comparator2) {
        if (comparator instanceof Comparator) {
            return ((Comparator) comparator).thenComparing(comparator2);
        }
        return Comparator.CC.$default$thenComparing(comparator, comparator2);
    }

    public int characteristics() {
        return 16448;
    }

    public long estimateSize() {
        return 0L;
    }

    public void forEachRemaining(Object obj) {
        obj.getClass();
    }

    public boolean tryAdvance(Object obj) {
        obj.getClass();
        return false;
    }

    public Spliterator trySplit() {
        return null;
    }
}
