package j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class S implements InterfaceC0115v, DoubleConsumer, InterfaceC0113t {
    boolean a = false;
    double b;
    final /* synthetic */ C c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public S(C c) {
        this.c = c;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.a = true;
        this.b = d;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.lang.a.a(this, doubleConsumer);
    }

    @Override // java.util.Iterator, j$.util.InterfaceC0113t
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            DoubleConsumer doubleConsumer = (DoubleConsumer) consumer;
            doubleConsumer.getClass();
            while (hasNext()) {
                if (!this.a && !hasNext()) {
                    throw new NoSuchElementException();
                }
                this.a = false;
                doubleConsumer.accept(this.b);
            }
            return;
        }
        consumer.getClass();
        if (!c0.a) {
            C0114u c0114u = new C0114u(consumer);
            while (hasNext()) {
                if (!this.a && !hasNext()) {
                    throw new NoSuchElementException();
                }
                this.a = false;
                c0114u.accept(this.b);
            }
            return;
        }
        c0.a(S.class, "{0} calling PrimitiveIterator.OfDouble.forEachRemainingDouble(action::accept)");
        throw null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.a) {
            this.c.tryAdvance((DoubleConsumer) this);
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
            return Double.valueOf(this.b);
        }
        c0.a(S.class, "{0} calling PrimitiveIterator.OfDouble.nextLong()");
        throw null;
    }
}
