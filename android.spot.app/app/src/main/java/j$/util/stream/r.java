package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class r implements U0, V0 {
    final C0076g a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(C0076g c0076g) {
        this.a = c0076g;
    }

    @Override // j$.util.stream.U0
    public final Object a(AbstractC0064a abstractC0064a, Spliterator spliterator) {
        abstractC0064a.a(spliterator, abstractC0064a.q(this));
        return null;
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ void accept(double d) {
        D.d();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.U0
    public final Object b(AbstractC0064a abstractC0064a, Spliterator spliterator) {
        new C0099s(abstractC0064a, spliterator, abstractC0064a.q(this)).invoke();
        return null;
    }

    @Override // j$.util.stream.U0
    public final int c() {
        return R0.p;
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ void accept(int i) {
        D.h();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.a.accept(obj);
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ void i(long j) {
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ void h() {
    }
}
