package j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* renamed from: j$.util.stream.k0 */
/* loaded from: classes2.dex */
public abstract class AbstractC0085k0 extends CountedCompleter {
    protected final H a;
    protected final int b;

    public AbstractC0085k0(H h) {
        this.a = h;
        this.b = 0;
    }

    abstract void a();

    abstract AbstractC0085k0 b(int i, int i2);

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        AbstractC0085k0 abstractC0085k0 = this;
        while (abstractC0085k0.a.q() != 0) {
            abstractC0085k0.setPendingCount(abstractC0085k0.a.q() - 1);
            int i = 0;
            int i2 = 0;
            while (i < abstractC0085k0.a.q() - 1) {
                AbstractC0085k0 b = abstractC0085k0.b(i, abstractC0085k0.b + i2);
                i2 = (int) (i2 + b.a.k());
                b.fork();
                i++;
            }
            abstractC0085k0 = abstractC0085k0.b(i, abstractC0085k0.b + i2);
        }
        abstractC0085k0.a();
        abstractC0085k0.propagateCompletion();
    }

    public AbstractC0085k0(AbstractC0085k0 abstractC0085k0, H h, int i) {
        super(abstractC0085k0);
        this.a = h;
        this.b = i;
    }
}
