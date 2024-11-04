package j$.util.stream;

import j$.util.Spliterator;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes2.dex */
final class H0 extends A0 {
    private final Comparator k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public H0(A0 a0, Comparator comparator) {
        super(a0, R0.o | R0.n);
        comparator.getClass();
        this.k = comparator;
    }

    @Override // j$.util.stream.AbstractC0064a
    public final H k(AbstractC0064a abstractC0064a, Spliterator spliterator, C0074f c0074f) {
        R0 r0 = R0.SORTED;
        abstractC0064a.getClass();
        r0.getClass();
        Object[] j = abstractC0064a.b(spliterator, c0074f).j(c0074f);
        Arrays.sort(j, this.k);
        return new J(j);
    }

    @Override // j$.util.stream.AbstractC0064a
    final boolean l() {
        return true;
    }

    @Override // j$.util.stream.AbstractC0064a
    public final F0 m(int i, F0 f0) {
        f0.getClass();
        R0.SORTED.r(i);
        boolean r = R0.SIZED.r(i);
        Comparator comparator = this.k;
        if (r) {
            return new G0(f0, comparator);
        }
        return new G0(f0, comparator);
    }
}
