package j$.util;

import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

/* renamed from: j$.util.h */
/* loaded from: classes2.dex */
final class C0053h implements Iterator, InterfaceC0113t {
    public final /* synthetic */ int a = 0;
    private final Iterator b;

    public C0053h(C0054i c0054i) {
        this.b = c0054i.a.iterator();
    }

    @Override // java.util.Iterator, j$.util.InterfaceC0113t
    public final void forEachRemaining(Consumer consumer) {
        switch (this.a) {
            case 0:
                AbstractC0118y.h(this.b, consumer);
                return;
            default:
                AbstractC0118y.h(this.b, new C0057l(consumer));
                return;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                return this.b.hasNext();
            default:
                return this.b.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                return this.b.next();
            default:
                return new C0058m((Map.Entry) this.b.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public C0053h(C0060o c0060o) {
        this.b = c0060o.a.iterator();
    }
}
