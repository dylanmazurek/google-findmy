package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public abstract class B0 implements E0 {
    protected final F0 a;

    public B0(F0 f0) {
        f0.getClass();
        this.a = f0;
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ void accept(double d) {
        D.d();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.F0
    public final void h() {
        this.a.h();
    }

    @Override // j$.util.stream.F0
    public final void i(long j) {
        this.a.i(j);
    }

    @Override // j$.util.stream.E0
    public final /* synthetic */ void l(Integer num) {
        D.f(this, num);
    }

    @Override // j$.util.stream.F0
    public final boolean n() {
        return this.a.n();
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        l((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.lang.a.b(this, intConsumer);
    }
}
