package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* renamed from: j$.util.stream.v0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0106v0 extends AbstractC0072e {
    private final D h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0106v0(D d, AbstractC0064a abstractC0064a, Spliterator spliterator) {
        super(abstractC0064a, spliterator);
        this.h = d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0072e
    public final Object a() {
        AbstractC0064a abstractC0064a = this.a;
        InterfaceC0102t0 n = this.h.n();
        abstractC0064a.p(this.b, n);
        return n;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0072e
    public final AbstractC0072e c(Spliterator spliterator) {
        return new C0106v0(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0072e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC0072e abstractC0072e = this.d;
        if (abstractC0072e != null) {
            InterfaceC0102t0 interfaceC0102t0 = (InterfaceC0102t0) ((C0106v0) abstractC0072e).b();
            interfaceC0102t0.e((InterfaceC0102t0) ((C0106v0) this.e).b());
            d(interfaceC0102t0);
        }
        super.onCompletion(countedCompleter);
    }

    C0106v0(C0106v0 c0106v0, Spliterator spliterator) {
        super(c0106v0, spliterator);
        this.h = c0106v0.h;
    }
}
