package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class jgn implements Supplier {
    private final /* synthetic */ int a;

    public /* synthetic */ jgn(int i) {
        this.a = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return new jiu();
                    }
                    return new jck((char[]) null);
                }
                return new jjp();
            }
            return jdl.a;
        }
        return new jin();
    }
}
