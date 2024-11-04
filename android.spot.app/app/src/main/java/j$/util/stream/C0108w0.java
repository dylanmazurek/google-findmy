package j$.util.stream;

import java.util.function.Function;
import java.util.function.Predicate;

/* renamed from: j$.util.stream.w0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0108w0 extends C0 {
    public final /* synthetic */ int b;
    final /* synthetic */ AbstractC0064a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0108w0(AbstractC0064a abstractC0064a, F0 f0, int i) {
        super(f0);
        this.b = i;
        this.c = abstractC0064a;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                if (((Predicate) ((C0105v) this.c).l).test(obj)) {
                    this.a.accept((F0) obj);
                    return;
                }
                return;
            case 1:
                this.a.accept((F0) ((Function) ((C0105v) this.c).l).apply(obj));
                return;
            case 2:
                this.a.accept(((C0110x0) this.c).k.applyAsInt(obj));
                return;
            default:
                this.a.accept(((y0) this.c).k.applyAsDouble(obj));
                return;
        }
    }

    @Override // j$.util.stream.C0, j$.util.stream.F0
    public void i(long j) {
        switch (this.b) {
            case 0:
                this.a.i(-1L);
                return;
            default:
                super.i(j);
                return;
        }
    }
}
