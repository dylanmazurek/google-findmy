package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xs implements awh {
    private final /* synthetic */ int d;
    public static final xs c = new xs(2);
    public static final xs b = new xs(1);
    public static final xs a = new xs(0);

    public xs(int i) {
        this.d = i;
    }

    @Override // defpackage.awh
    public final awi a(awj awjVar, List list, long j) {
        int i;
        int i2 = this.d;
        if (i2 != 0) {
            if (i2 != 1) {
                int i3 = 0;
                if (bld.j(j)) {
                    i = bld.b(j);
                } else {
                    i = 0;
                }
                if (bld.i(j)) {
                    i3 = bld.a(j);
                }
                return nq.i(awjVar, i, i3, wo.j);
            }
            return nq.i(awjVar, bld.d(j), bld.c(j), wo.g);
        }
        return nq.i(awjVar, bld.d(j), bld.c(j), wo.h);
    }
}
