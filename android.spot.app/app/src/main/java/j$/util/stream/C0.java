package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public abstract class C0 implements F0 {
    protected final F0 a;

    public C0(F0 f0) {
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
    public void h() {
        this.a.h();
    }

    @Override // j$.util.stream.F0
    public void i(long j) {
        this.a.i(j);
    }

    @Override // j$.util.stream.F0
    public boolean n() {
        return this.a.n();
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ void accept(int i) {
        D.h();
        throw null;
    }
}
