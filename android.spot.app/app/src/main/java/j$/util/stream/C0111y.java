package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* renamed from: j$.util.stream.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0111y implements F0 {
    boolean a;
    boolean b;
    final /* synthetic */ EnumC0112z c;
    final /* synthetic */ Predicate d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0111y(EnumC0112z enumC0112z, Predicate predicate) {
        boolean z;
        this.c = enumC0112z;
        this.d = predicate;
        z = enumC0112z.b;
        this.b = !z;
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
    public final boolean n() {
        return this.a;
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ void accept(int i) {
        D.h();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        boolean z;
        boolean z2;
        if (this.a) {
            return;
        }
        boolean test = this.d.test(obj);
        EnumC0112z enumC0112z = this.c;
        z = enumC0112z.a;
        if (test == z) {
            this.a = true;
            z2 = enumC0112z.b;
            this.b = z2;
        }
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ void i(long j) {
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ void h() {
    }
}
