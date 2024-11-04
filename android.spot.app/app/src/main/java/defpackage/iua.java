package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class iua {
    protected iub j;
    protected final List k = new ArrayList();

    public iua(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            this.k.add(new ity());
        }
    }

    public static final float f(int i, int i2, int i3) {
        return bpv.d((i - i2) / i3, 0.0f, 1.0f);
    }

    public abstract void a();

    public abstract void b(cni cniVar);

    public abstract void c();

    public abstract void d();

    public abstract void e();
}
