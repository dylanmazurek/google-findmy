package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kvj extends lyt {
    private final jak a;
    private final String b;
    private final Executor c;

    public kvj(final njz njzVar, final kts ktsVar, Executor executor) {
        this.b = ktsVar.c.getAuthority();
        this.c = ktsVar.e;
        this.a = new jak(new jxc() { // from class: kvh
            /* JADX WARN: Removed duplicated region for block: B:41:0x01a0 A[Catch: all -> 0x0246, TryCatch #4 {all -> 0x0246, blocks: (B:3:0x000c, B:5:0x003f, B:6:0x004b, B:8:0x004f, B:9:0x005b, B:12:0x006d, B:14:0x007a, B:15:0x008b, B:17:0x0098, B:18:0x009a, B:20:0x009e, B:21:0x00a6, B:23:0x00aa, B:24:0x00b2, B:25:0x0123, B:27:0x012a, B:29:0x0132, B:31:0x0135, B:32:0x013d, B:35:0x013e, B:37:0x0149, B:43:0x014d, B:41:0x01a0, B:47:0x017f, B:49:0x018e, B:50:0x01a4, B:56:0x01a8, B:59:0x01b1, B:62:0x020f, B:73:0x01c9, B:68:0x01d9, B:70:0x01eb, B:65:0x01fd, B:52:0x0213, B:83:0x007f, B:85:0x0057, B:86:0x0047), top: B:2:0x000c, inners: #6, #8 }] */
            /* JADX WARN: Removed duplicated region for block: B:62:0x020f A[Catch: all -> 0x0246, TryCatch #4 {all -> 0x0246, blocks: (B:3:0x000c, B:5:0x003f, B:6:0x004b, B:8:0x004f, B:9:0x005b, B:12:0x006d, B:14:0x007a, B:15:0x008b, B:17:0x0098, B:18:0x009a, B:20:0x009e, B:21:0x00a6, B:23:0x00aa, B:24:0x00b2, B:25:0x0123, B:27:0x012a, B:29:0x0132, B:31:0x0135, B:32:0x013d, B:35:0x013e, B:37:0x0149, B:43:0x014d, B:41:0x01a0, B:47:0x017f, B:49:0x018e, B:50:0x01a4, B:56:0x01a8, B:59:0x01b1, B:62:0x020f, B:73:0x01c9, B:68:0x01d9, B:70:0x01eb, B:65:0x01fd, B:52:0x0213, B:83:0x007f, B:85:0x0057, B:86:0x0047), top: B:2:0x000c, inners: #6, #8 }] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, mjx] */
            /* JADX WARN: Type inference failed for: r0v4, types: [mko, java.lang.Object] */
            @Override // defpackage.jxc
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final defpackage.jyz a() {
                /*
                    Method dump skipped, instructions count: 594
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.kvh.a():jyz");
            }
        }, executor);
    }

    @Override // defpackage.lyt
    public final lyv a(mbg mbgVar, lys lysVar) {
        if (gao.a.compareAndSet(false, true)) {
            lja a = lja.a();
            lja ljaVar = mkc.a;
            a.getClass();
            mkc.a = a;
        }
        Executor executor = lysVar.c;
        jyz c = this.a.c();
        emc emcVar = new emc(mbgVar, lysVar, 18);
        if (executor == null) {
            executor = this.c;
        }
        return new kvi(iuu.o(c, emcVar, executor));
    }

    @Override // defpackage.lyt
    public final String b() {
        return this.b;
    }
}
