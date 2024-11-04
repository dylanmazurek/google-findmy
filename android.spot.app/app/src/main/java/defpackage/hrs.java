package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hrs implements jxc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ hrs(hqa hqaVar, AtomicInteger atomicInteger, int i, int i2) {
        this.d = i2;
        this.b = hqaVar;
        this.c = atomicInteger;
        this.a = i;
    }

    @Override // defpackage.jxc
    public final jyz a() {
        long j;
        if (this.d != 0) {
            if (((AtomicInteger) this.c).getAndDecrement() <= 0) {
                return jyv.a;
            }
            int i = this.a;
            hqa hqaVar = (hqa) this.b;
            return hqaVar.n(i, (hpp) hqaVar.b.a());
        }
        final hrv hrvVar = (hrv) this.b;
        hrl hrlVar = (hrl) hrvVar.c.a();
        if (true != hrlVar.b()) {
            j = -1;
        } else {
            j = 1000;
        }
        if (j == -1) {
            return jyv.a;
        }
        Object obj = this.c;
        final int i2 = this.a;
        jyz E = ivc.E(null);
        jer jerVar = hrlVar.a;
        jyz g = jwb.g(jys.q(E), RuntimeException.class, new hkn(9), hrvVar.a);
        final String str = (String) obj;
        final long j2 = 1000;
        return jwu.h(g, new jxd() { // from class: hru
            /* JADX WARN: Removed duplicated region for block: B:100:0x032a  */
            /* JADX WARN: Removed duplicated region for block: B:103:0x0356  */
            /* JADX WARN: Removed duplicated region for block: B:106:0x036d  */
            /* JADX WARN: Removed duplicated region for block: B:109:0x038d  */
            /* JADX WARN: Removed duplicated region for block: B:112:0x03a3  */
            /* JADX WARN: Removed duplicated region for block: B:118:0x03c8  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x01d2  */
            /* JADX WARN: Removed duplicated region for block: B:59:0x0214  */
            /* JADX WARN: Removed duplicated region for block: B:91:0x02c2  */
            /* JADX WARN: Removed duplicated region for block: B:94:0x02dc  */
            /* JADX WARN: Removed duplicated region for block: B:97:0x0310  */
            @Override // defpackage.jxd
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final defpackage.jyz a(java.lang.Object r27) {
                /*
                    Method dump skipped, instructions count: 1036
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.hru.a(java.lang.Object):jyz");
            }
        }, hrvVar.a);
    }

    public /* synthetic */ hrs(hrv hrvVar, int i, String str, int i2) {
        this.d = i2;
        this.b = hrvVar;
        this.a = i;
        this.c = str;
    }
}
