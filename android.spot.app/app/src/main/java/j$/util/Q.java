package j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class Q implements InterfaceC0117x, IntConsumer, InterfaceC0113t {
    boolean a = false;
    int b;
    final /* synthetic */ F c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Q(F f) {
        this.c = f;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.a = true;
        this.b = i;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.lang.a.b(this, intConsumer);
    }

    @Override // java.util.Iterator, j$.util.InterfaceC0113t
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            IntConsumer intConsumer = (IntConsumer) consumer;
            intConsumer.getClass();
            while (hasNext()) {
                if (!this.a && !hasNext()) {
                    throw new NoSuchElementException();
                }
                this.a = false;
                intConsumer.accept(this.b);
            }
            return;
        }
        consumer.getClass();
        if (!c0.a) {
            C0116w c0116w = new C0116w(consumer);
            while (hasNext()) {
                if (!this.a && !hasNext()) {
                    throw new NoSuchElementException();
                }
                this.a = false;
                c0116w.accept(this.b);
            }
            return;
        }
        c0.a(Q.class, "{0} calling PrimitiveIterator.OfInt.forEachRemainingInt(action::accept)");
        throw null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.a) {
            this.c.tryAdvance((IntConsumer) this);
        }
        return this.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!c0.a) {
            if (!this.a && !hasNext()) {
                throw new NoSuchElementException();
            }
            this.a = false;
            return Integer.valueOf(this.b);
        }
        c0.a(Q.class, "{0} calling PrimitiveIterator.OfInt.nextInt()");
        throw null;
    }
}
