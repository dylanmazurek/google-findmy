package defpackage;

import android.util.Pair;
import j$.util.Collection;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.function.ToDoubleFunction;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class epo {
    public static final /* synthetic */ int a = 0;
    private static final long b = TimeUnit.SECONDS.toMillis(2);
    private final Queue c = new ArrayDeque();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized double a(long j) {
        Pair pair = (Pair) this.c.peek();
        while (pair != null && j - ((Long) pair.first).longValue() >= b) {
            this.c.remove();
            pair = (Pair) this.c.peek();
        }
        return Collection.EL.stream(this.c).mapToDouble(new ToDoubleFunction() { // from class: epn
            @Override // java.util.function.ToDoubleFunction
            public final double applyAsDouble(Object obj) {
                int i = epo.a;
                double doubleValue = ((Double) ((Pair) obj).second).doubleValue();
                if (doubleValue > 20.0d) {
                    return 0.0d;
                }
                if (doubleValue < 0.5d) {
                    return 1.0d;
                }
                return Math.pow(1.0d - ((doubleValue - 0.5d) / 19.5d), 2.0d);
            }
        }).average().orElse(0.0d);
    }

    public final synchronized void b(double d, long j) {
        this.c.add(Pair.create(Long.valueOf(j), Double.valueOf(d)));
    }
}
