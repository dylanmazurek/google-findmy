package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.a0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC0065a0 extends AbstractC0069c0 implements j$.util.M {
    @Override // j$.util.M
    public final void forEachRemaining(Object obj) {
        if (this.a == null) {
            return;
        }
        if (this.d == null) {
            Spliterator spliterator = this.c;
            if (spliterator == null) {
                ArrayDeque b = b();
                while (true) {
                    G g = (G) AbstractC0069c0.a(b);
                    if (g != null) {
                        g.d(obj);
                    } else {
                        this.a = null;
                        return;
                    }
                }
            } else {
                ((j$.util.M) spliterator).forEachRemaining(obj);
                return;
            }
        }
        do {
        } while (tryAdvance(obj));
    }

    @Override // j$.util.M
    public final boolean tryAdvance(Object obj) {
        G g;
        if (!c()) {
            return false;
        }
        boolean tryAdvance = ((j$.util.M) this.d).tryAdvance(obj);
        if (!tryAdvance) {
            if (this.c == null && (g = (G) AbstractC0069c0.a(this.e)) != null) {
                j$.util.M spliterator = g.spliterator();
                this.d = spliterator;
                return spliterator.tryAdvance(obj);
            }
            this.a = null;
        }
        return tryAdvance;
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }
}
