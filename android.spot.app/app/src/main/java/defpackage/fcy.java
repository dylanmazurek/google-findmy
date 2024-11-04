package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.sqlite.SQLiteException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fcy extends fcl {
    public boolean a;
    public final fct b;
    public final fcr d;
    public final fdd e;
    public long f;
    public boolean g;
    private final fdp h;
    private final fdo i;
    private final fdd j;
    private final fdv k;

    /* JADX INFO: Access modifiers changed from: protected */
    public fcy(fcn fcnVar) {
        super(fcnVar);
        this.i = new fdo(fcnVar);
        this.b = new fct(fcnVar);
        this.h = new fdp(fcnVar);
        this.d = new fcr(fcnVar);
        G();
        this.k = new fdv();
        this.j = new fcv(this, fcnVar);
        this.e = new fcw(this, fcnVar);
    }

    private final void N() {
        if (this.j.e()) {
            y("All hits dispatched or no network/service. Going to power save mode");
        }
        this.j.c();
        fdf m = m();
        if (m.b) {
            m.d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0118 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void O() {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fcy.O():void");
    }

    public final void K() {
        H();
        fbm.b();
        this.g = true;
        this.d.b();
        L();
    }

    public final void L() {
        long min;
        long abs;
        fbm.b();
        H();
        if (!this.g) {
            k();
            long j = 0;
            if (b() > 0) {
                if (this.b.Q()) {
                    this.i.c();
                    N();
                    return;
                }
                if (!((Boolean) fdh.y.x()).booleanValue()) {
                    fdo fdoVar = this.i;
                    fdoVar.b();
                    if (!fdoVar.c) {
                        Context a = fdoVar.a();
                        bqx.h(a, fdoVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"), 4);
                        IntentFilter intentFilter = new IntentFilter("com.google.analytics.RADIO_POWERED");
                        intentFilter.addCategory(a.getPackageName());
                        bqx.h(a, fdoVar, intentFilter, 4);
                        fdoVar.d = fdoVar.d();
                        fdoVar.b.h().z("Registering connectivity change receiver. Network connected", Boolean.valueOf(fdoVar.d));
                        fdoVar.c = true;
                    }
                    fdo fdoVar2 = this.i;
                    if (!fdoVar2.c) {
                        fdoVar2.b.h().B("Connectivity unknown. Receiver not registered");
                    }
                    if (!fdoVar2.d) {
                        N();
                        O();
                        return;
                    }
                }
                O();
                long b = b();
                long c = o().c();
                if (c != 0) {
                    G();
                    min = b - Math.abs(System.currentTimeMillis() - c);
                    if (min <= 0) {
                        k();
                        min = Math.min(fdc.c(), b);
                    }
                } else {
                    k();
                    min = Math.min(fdc.c(), b);
                }
                z("Dispatch scheduled (ms)", Long.valueOf(min));
                if (this.j.e()) {
                    fdd fddVar = this.j;
                    if (fddVar.d == 0) {
                        abs = 0;
                    } else {
                        fcn fcnVar = fddVar.b;
                        abs = Math.abs(System.currentTimeMillis() - fddVar.d);
                    }
                    long j2 = min + abs;
                    fdd fddVar2 = this.j;
                    long max = Math.max(1L, j2);
                    if (fddVar2.e()) {
                        if (max < 0) {
                            fddVar2.c();
                            return;
                        }
                        fcn fcnVar2 = fddVar2.b;
                        long abs2 = max - Math.abs(System.currentTimeMillis() - fddVar2.d);
                        if (abs2 >= 0) {
                            j = abs2;
                        }
                        fddVar2.b().removeCallbacks(fddVar2.c);
                        if (!fddVar2.b().postDelayed(fddVar2.c, j)) {
                            fddVar2.b.h().v("Failed to adjust delayed post. time", Long.valueOf(j));
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.j.d(min);
                return;
            }
        }
        this.i.c();
        N();
    }

    public final boolean M(String str) {
        if (fme.b(f()).w(str) == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.fcl
    protected final void a() {
        this.b.I();
        this.h.I();
        this.d.I();
    }

    public final long b() {
        k();
        long longValue = ((Long) fdh.d.x()).longValue();
        fdw p = p();
        p.H();
        if (p.d) {
            p().H();
            return r0.e * 1000;
        }
        return longValue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x052e, code lost:            r28.b.P();        r28.b.O();     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0092, code lost:            y("Store is empty, nothing to dispatch");        N();     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x009a, code lost:            r28.b.P();        r28.b.O();     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x00a6, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x00a7, code lost:            v("Failed to commit local dispatch transaction", r0);     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d4, code lost:            w("Database contains successfully uploaded hit", java.lang.Long.valueOf(r8), java.lang.Integer.valueOf(r0.size()));        N();     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e8, code lost:            r28.b.P();        r28.b.O();     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f4, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f5, code lost:            v("Failed to commit local dispatch transaction", r0);     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x04f4 A[Catch: all -> 0x056e, LOOP:4: B:119:0x04ee->B:121:0x04f4, LOOP_END, TRY_LEAVE, TryCatch #10 {all -> 0x056e, blocks: (B:24:0x007e, B:26:0x0086, B:299:0x0092, B:28:0x00af, B:29:0x00bc, B:30:0x00c0, B:32:0x00c6, B:36:0x00d4, B:45:0x00fe, B:47:0x0106, B:48:0x010e, B:50:0x0114, B:52:0x0123, B:54:0x0131, B:58:0x0143, B:67:0x015d, B:69:0x0165, B:71:0x017b, B:74:0x0198, B:77:0x01d2, B:82:0x01ec, B:83:0x0217, B:85:0x021d, B:87:0x0234, B:89:0x023b, B:90:0x02a0, B:92:0x02ab, B:96:0x0247, B:98:0x0261, B:99:0x026b, B:101:0x0271, B:102:0x0273, B:105:0x0289, B:107:0x028f, B:108:0x0294, B:118:0x04e8, B:119:0x04ee, B:121:0x04f4, B:123:0x0503, B:124:0x0528, B:139:0x050d, B:145:0x02bd, B:147:0x02c3, B:149:0x02d0, B:168:0x035a, B:172:0x03ae, B:173:0x03bc, B:175:0x03d3, B:176:0x03dd, B:199:0x037a, B:196:0x0385, B:203:0x0380, B:187:0x0391, B:183:0x039c, B:184:0x039f, B:191:0x0397, B:217:0x03a0, B:112:0x029b, B:222:0x03e2, B:223:0x03f1, B:225:0x03f7, B:227:0x040a, B:230:0x04d2, B:234:0x0418, B:236:0x042d, B:266:0x0433, B:238:0x0439, B:247:0x0464, B:258:0x0484, B:259:0x0487, B:255:0x047d, B:267:0x0488, B:269:0x048f, B:270:0x049a, B:272:0x04b0, B:273:0x04bb, B:280:0x04c1, B:275:0x04c7, B:283:0x01ad, B:286:0x01b6, B:289:0x01bf, B:292:0x01c8, B:307:0x0555), top: B:23:0x007e, outer: #7, inners: #14, #15, #18 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x052e A[EDGE_INSN: B:126:0x052e->B:127:0x052e BREAK  A[LOOP:0: B:23:0x007e->B:133:0x0549], EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x053f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x058c A[Catch: Exception -> 0x05b4, TryCatch #7 {Exception -> 0x05b4, blocks: (B:6:0x003a, B:8:0x004f, B:9:0x0055, B:12:0x005f, B:13:0x0580, B:15:0x058c, B:16:0x058f, B:18:0x0595, B:22:0x0066, B:302:0x009a, B:305:0x00a7, B:42:0x00aa, B:38:0x00e8, B:41:0x00f5, B:60:0x014b, B:63:0x0158, B:127:0x052e, B:132:0x053f, B:130:0x053a, B:136:0x054f, B:141:0x0515, B:144:0x0521, B:315:0x056f, B:316:0x0579, B:319:0x057b, B:309:0x055d, B:312:0x0569, B:26:0x0086, B:299:0x0092, B:28:0x00af, B:24:0x007e, B:29:0x00bc, B:30:0x00c0, B:32:0x00c6, B:36:0x00d4, B:45:0x00fe, B:47:0x0106, B:48:0x010e, B:50:0x0114, B:52:0x0123, B:54:0x0131, B:58:0x0143, B:67:0x015d, B:69:0x0165, B:71:0x017b, B:74:0x0198, B:77:0x01d2, B:82:0x01ec, B:83:0x0217, B:85:0x021d, B:87:0x0234, B:89:0x023b, B:90:0x02a0, B:92:0x02ab, B:96:0x0247, B:98:0x0261, B:99:0x026b, B:101:0x0271, B:102:0x0273, B:105:0x0289, B:107:0x028f, B:108:0x0294, B:118:0x04e8, B:119:0x04ee, B:121:0x04f4, B:123:0x0503, B:124:0x0528, B:139:0x050d, B:145:0x02bd, B:147:0x02c3, B:149:0x02d0, B:168:0x035a, B:172:0x03ae, B:173:0x03bc, B:175:0x03d3, B:176:0x03dd, B:199:0x037a, B:196:0x0385, B:203:0x0380, B:187:0x0391, B:183:0x039c, B:184:0x039f, B:191:0x0397, B:217:0x03a0, B:112:0x029b, B:222:0x03e2, B:223:0x03f1, B:225:0x03f7, B:227:0x040a, B:230:0x04d2, B:234:0x0418, B:236:0x042d, B:266:0x0433, B:238:0x0439, B:247:0x0464, B:258:0x0484, B:259:0x0487, B:255:0x047d, B:267:0x0488, B:269:0x048f, B:270:0x049a, B:272:0x04b0, B:273:0x04bb, B:280:0x04c1, B:275:0x04c7, B:283:0x01ad, B:286:0x01b6, B:289:0x01bf, B:292:0x01c8, B:307:0x0555), top: B:5:0x003a, inners: #1, #2, #4, #10, #11, #13, #16, #17, #19, #20, #25, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03ae A[Catch: all -> 0x056e, TryCatch #10 {all -> 0x056e, blocks: (B:24:0x007e, B:26:0x0086, B:299:0x0092, B:28:0x00af, B:29:0x00bc, B:30:0x00c0, B:32:0x00c6, B:36:0x00d4, B:45:0x00fe, B:47:0x0106, B:48:0x010e, B:50:0x0114, B:52:0x0123, B:54:0x0131, B:58:0x0143, B:67:0x015d, B:69:0x0165, B:71:0x017b, B:74:0x0198, B:77:0x01d2, B:82:0x01ec, B:83:0x0217, B:85:0x021d, B:87:0x0234, B:89:0x023b, B:90:0x02a0, B:92:0x02ab, B:96:0x0247, B:98:0x0261, B:99:0x026b, B:101:0x0271, B:102:0x0273, B:105:0x0289, B:107:0x028f, B:108:0x0294, B:118:0x04e8, B:119:0x04ee, B:121:0x04f4, B:123:0x0503, B:124:0x0528, B:139:0x050d, B:145:0x02bd, B:147:0x02c3, B:149:0x02d0, B:168:0x035a, B:172:0x03ae, B:173:0x03bc, B:175:0x03d3, B:176:0x03dd, B:199:0x037a, B:196:0x0385, B:203:0x0380, B:187:0x0391, B:183:0x039c, B:184:0x039f, B:191:0x0397, B:217:0x03a0, B:112:0x029b, B:222:0x03e2, B:223:0x03f1, B:225:0x03f7, B:227:0x040a, B:230:0x04d2, B:234:0x0418, B:236:0x042d, B:266:0x0433, B:238:0x0439, B:247:0x0464, B:258:0x0484, B:259:0x0487, B:255:0x047d, B:267:0x0488, B:269:0x048f, B:270:0x049a, B:272:0x04b0, B:273:0x04bb, B:280:0x04c1, B:275:0x04c7, B:283:0x01ad, B:286:0x01b6, B:289:0x01bf, B:292:0x01c8, B:307:0x0555), top: B:23:0x007e, outer: #7, inners: #14, #15, #18 }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03bc A[Catch: all -> 0x056e, TryCatch #10 {all -> 0x056e, blocks: (B:24:0x007e, B:26:0x0086, B:299:0x0092, B:28:0x00af, B:29:0x00bc, B:30:0x00c0, B:32:0x00c6, B:36:0x00d4, B:45:0x00fe, B:47:0x0106, B:48:0x010e, B:50:0x0114, B:52:0x0123, B:54:0x0131, B:58:0x0143, B:67:0x015d, B:69:0x0165, B:71:0x017b, B:74:0x0198, B:77:0x01d2, B:82:0x01ec, B:83:0x0217, B:85:0x021d, B:87:0x0234, B:89:0x023b, B:90:0x02a0, B:92:0x02ab, B:96:0x0247, B:98:0x0261, B:99:0x026b, B:101:0x0271, B:102:0x0273, B:105:0x0289, B:107:0x028f, B:108:0x0294, B:118:0x04e8, B:119:0x04ee, B:121:0x04f4, B:123:0x0503, B:124:0x0528, B:139:0x050d, B:145:0x02bd, B:147:0x02c3, B:149:0x02d0, B:168:0x035a, B:172:0x03ae, B:173:0x03bc, B:175:0x03d3, B:176:0x03dd, B:199:0x037a, B:196:0x0385, B:203:0x0380, B:187:0x0391, B:183:0x039c, B:184:0x039f, B:191:0x0397, B:217:0x03a0, B:112:0x029b, B:222:0x03e2, B:223:0x03f1, B:225:0x03f7, B:227:0x040a, B:230:0x04d2, B:234:0x0418, B:236:0x042d, B:266:0x0433, B:238:0x0439, B:247:0x0464, B:258:0x0484, B:259:0x0487, B:255:0x047d, B:267:0x0488, B:269:0x048f, B:270:0x049a, B:272:0x04b0, B:273:0x04bb, B:280:0x04c1, B:275:0x04c7, B:283:0x01ad, B:286:0x01b6, B:289:0x01bf, B:292:0x01c8, B:307:0x0555), top: B:23:0x007e, outer: #7, inners: #14, #15, #18 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0595 A[Catch: Exception -> 0x05b4, TRY_LEAVE, TryCatch #7 {Exception -> 0x05b4, blocks: (B:6:0x003a, B:8:0x004f, B:9:0x0055, B:12:0x005f, B:13:0x0580, B:15:0x058c, B:16:0x058f, B:18:0x0595, B:22:0x0066, B:302:0x009a, B:305:0x00a7, B:42:0x00aa, B:38:0x00e8, B:41:0x00f5, B:60:0x014b, B:63:0x0158, B:127:0x052e, B:132:0x053f, B:130:0x053a, B:136:0x054f, B:141:0x0515, B:144:0x0521, B:315:0x056f, B:316:0x0579, B:319:0x057b, B:309:0x055d, B:312:0x0569, B:26:0x0086, B:299:0x0092, B:28:0x00af, B:24:0x007e, B:29:0x00bc, B:30:0x00c0, B:32:0x00c6, B:36:0x00d4, B:45:0x00fe, B:47:0x0106, B:48:0x010e, B:50:0x0114, B:52:0x0123, B:54:0x0131, B:58:0x0143, B:67:0x015d, B:69:0x0165, B:71:0x017b, B:74:0x0198, B:77:0x01d2, B:82:0x01ec, B:83:0x0217, B:85:0x021d, B:87:0x0234, B:89:0x023b, B:90:0x02a0, B:92:0x02ab, B:96:0x0247, B:98:0x0261, B:99:0x026b, B:101:0x0271, B:102:0x0273, B:105:0x0289, B:107:0x028f, B:108:0x0294, B:118:0x04e8, B:119:0x04ee, B:121:0x04f4, B:123:0x0503, B:124:0x0528, B:139:0x050d, B:145:0x02bd, B:147:0x02c3, B:149:0x02d0, B:168:0x035a, B:172:0x03ae, B:173:0x03bc, B:175:0x03d3, B:176:0x03dd, B:199:0x037a, B:196:0x0385, B:203:0x0380, B:187:0x0391, B:183:0x039c, B:184:0x039f, B:191:0x0397, B:217:0x03a0, B:112:0x029b, B:222:0x03e2, B:223:0x03f1, B:225:0x03f7, B:227:0x040a, B:230:0x04d2, B:234:0x0418, B:236:0x042d, B:266:0x0433, B:238:0x0439, B:247:0x0464, B:258:0x0484, B:259:0x0487, B:255:0x047d, B:267:0x0488, B:269:0x048f, B:270:0x049a, B:272:0x04b0, B:273:0x04bb, B:280:0x04c1, B:275:0x04c7, B:283:0x01ad, B:286:0x01b6, B:289:0x01bf, B:292:0x01c8, B:307:0x0555), top: B:5:0x003a, inners: #1, #2, #4, #10, #11, #13, #16, #17, #19, #20, #25, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0385 A[Catch: all -> 0x056e, TRY_LEAVE, TryCatch #10 {all -> 0x056e, blocks: (B:24:0x007e, B:26:0x0086, B:299:0x0092, B:28:0x00af, B:29:0x00bc, B:30:0x00c0, B:32:0x00c6, B:36:0x00d4, B:45:0x00fe, B:47:0x0106, B:48:0x010e, B:50:0x0114, B:52:0x0123, B:54:0x0131, B:58:0x0143, B:67:0x015d, B:69:0x0165, B:71:0x017b, B:74:0x0198, B:77:0x01d2, B:82:0x01ec, B:83:0x0217, B:85:0x021d, B:87:0x0234, B:89:0x023b, B:90:0x02a0, B:92:0x02ab, B:96:0x0247, B:98:0x0261, B:99:0x026b, B:101:0x0271, B:102:0x0273, B:105:0x0289, B:107:0x028f, B:108:0x0294, B:118:0x04e8, B:119:0x04ee, B:121:0x04f4, B:123:0x0503, B:124:0x0528, B:139:0x050d, B:145:0x02bd, B:147:0x02c3, B:149:0x02d0, B:168:0x035a, B:172:0x03ae, B:173:0x03bc, B:175:0x03d3, B:176:0x03dd, B:199:0x037a, B:196:0x0385, B:203:0x0380, B:187:0x0391, B:183:0x039c, B:184:0x039f, B:191:0x0397, B:217:0x03a0, B:112:0x029b, B:222:0x03e2, B:223:0x03f1, B:225:0x03f7, B:227:0x040a, B:230:0x04d2, B:234:0x0418, B:236:0x042d, B:266:0x0433, B:238:0x0439, B:247:0x0464, B:258:0x0484, B:259:0x0487, B:255:0x047d, B:267:0x0488, B:269:0x048f, B:270:0x049a, B:272:0x04b0, B:273:0x04bb, B:280:0x04c1, B:275:0x04c7, B:283:0x01ad, B:286:0x01b6, B:289:0x01bf, B:292:0x01c8, B:307:0x0555), top: B:23:0x007e, outer: #7, inners: #14, #15, #18 }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x037a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03e2 A[Catch: all -> 0x056e, TryCatch #10 {all -> 0x056e, blocks: (B:24:0x007e, B:26:0x0086, B:299:0x0092, B:28:0x00af, B:29:0x00bc, B:30:0x00c0, B:32:0x00c6, B:36:0x00d4, B:45:0x00fe, B:47:0x0106, B:48:0x010e, B:50:0x0114, B:52:0x0123, B:54:0x0131, B:58:0x0143, B:67:0x015d, B:69:0x0165, B:71:0x017b, B:74:0x0198, B:77:0x01d2, B:82:0x01ec, B:83:0x0217, B:85:0x021d, B:87:0x0234, B:89:0x023b, B:90:0x02a0, B:92:0x02ab, B:96:0x0247, B:98:0x0261, B:99:0x026b, B:101:0x0271, B:102:0x0273, B:105:0x0289, B:107:0x028f, B:108:0x0294, B:118:0x04e8, B:119:0x04ee, B:121:0x04f4, B:123:0x0503, B:124:0x0528, B:139:0x050d, B:145:0x02bd, B:147:0x02c3, B:149:0x02d0, B:168:0x035a, B:172:0x03ae, B:173:0x03bc, B:175:0x03d3, B:176:0x03dd, B:199:0x037a, B:196:0x0385, B:203:0x0380, B:187:0x0391, B:183:0x039c, B:184:0x039f, B:191:0x0397, B:217:0x03a0, B:112:0x029b, B:222:0x03e2, B:223:0x03f1, B:225:0x03f7, B:227:0x040a, B:230:0x04d2, B:234:0x0418, B:236:0x042d, B:266:0x0433, B:238:0x0439, B:247:0x0464, B:258:0x0484, B:259:0x0487, B:255:0x047d, B:267:0x0488, B:269:0x048f, B:270:0x049a, B:272:0x04b0, B:273:0x04bb, B:280:0x04c1, B:275:0x04c7, B:283:0x01ad, B:286:0x01b6, B:289:0x01bf, B:292:0x01c8, B:307:0x0555), top: B:23:0x007e, outer: #7, inners: #14, #15, #18 }] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04e8 A[EDGE_INSN: B:232:0x04e8->B:118:0x04e8 BREAK  A[LOOP:5: B:223:0x03f1->B:233:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:233:? A[LOOP:5: B:223:0x03f1->B:233:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ec A[Catch: all -> 0x056e, TryCatch #10 {all -> 0x056e, blocks: (B:24:0x007e, B:26:0x0086, B:299:0x0092, B:28:0x00af, B:29:0x00bc, B:30:0x00c0, B:32:0x00c6, B:36:0x00d4, B:45:0x00fe, B:47:0x0106, B:48:0x010e, B:50:0x0114, B:52:0x0123, B:54:0x0131, B:58:0x0143, B:67:0x015d, B:69:0x0165, B:71:0x017b, B:74:0x0198, B:77:0x01d2, B:82:0x01ec, B:83:0x0217, B:85:0x021d, B:87:0x0234, B:89:0x023b, B:90:0x02a0, B:92:0x02ab, B:96:0x0247, B:98:0x0261, B:99:0x026b, B:101:0x0271, B:102:0x0273, B:105:0x0289, B:107:0x028f, B:108:0x0294, B:118:0x04e8, B:119:0x04ee, B:121:0x04f4, B:123:0x0503, B:124:0x0528, B:139:0x050d, B:145:0x02bd, B:147:0x02c3, B:149:0x02d0, B:168:0x035a, B:172:0x03ae, B:173:0x03bc, B:175:0x03d3, B:176:0x03dd, B:199:0x037a, B:196:0x0385, B:203:0x0380, B:187:0x0391, B:183:0x039c, B:184:0x039f, B:191:0x0397, B:217:0x03a0, B:112:0x029b, B:222:0x03e2, B:223:0x03f1, B:225:0x03f7, B:227:0x040a, B:230:0x04d2, B:234:0x0418, B:236:0x042d, B:266:0x0433, B:238:0x0439, B:247:0x0464, B:258:0x0484, B:259:0x0487, B:255:0x047d, B:267:0x0488, B:269:0x048f, B:270:0x049a, B:272:0x04b0, B:273:0x04bb, B:280:0x04c1, B:275:0x04c7, B:283:0x01ad, B:286:0x01b6, B:289:0x01bf, B:292:0x01c8, B:307:0x0555), top: B:23:0x007e, outer: #7, inners: #14, #15, #18 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.fdg r29) {
        /*
            Method dump skipped, instructions count: 1482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fcy.c(fdg):void");
    }

    public final void d() {
        fdk fdkVar;
        if (!this.g) {
            k();
            if (fdc.i() && !this.d.e()) {
                k();
                if (this.k.c(((Long) fdh.B.x()).longValue())) {
                    this.k.b();
                    y("Connecting to service");
                    fcr fcrVar = this.d;
                    fbm.b();
                    fcrVar.H();
                    if (fcrVar.b == null) {
                        fcq fcqVar = fcrVar.a;
                        fcr fcrVar2 = fcqVar.b;
                        fbm.b();
                        Intent intent = new Intent("com.google.android.gms.analytics.service.START");
                        intent.setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.analytics.service.AnalyticsService"));
                        Context f = fcqVar.b.f();
                        intent.putExtra("app_package_name", f.getPackageName());
                        flr a = flr.a();
                        synchronized (fcqVar) {
                            fdkVar = null;
                            fcqVar.c = null;
                            fcqVar.a = true;
                            boolean c = a.c(f, intent, fcqVar.b.a, 129);
                            fcqVar.b.z("Bind to service requested", Boolean.valueOf(c));
                            if (!c) {
                                fcqVar.a = false;
                            } else {
                                try {
                                    fcqVar.b.k();
                                    fcqVar.wait(((Long) fdh.A.x()).longValue());
                                } catch (InterruptedException unused) {
                                    fcqVar.b.B("Wait for service connect was interrupted");
                                }
                                fcqVar.a = false;
                                fdk fdkVar2 = fcqVar.c;
                                fcqVar.c = null;
                                if (fdkVar2 == null) {
                                    fcqVar.b.u("Successfully bound to service but never got onServiceConnected callback");
                                }
                                fdkVar = fdkVar2;
                            }
                        }
                        if (fdkVar != null) {
                            fcrVar.b = fdkVar;
                            fcrVar.d();
                        } else {
                            return;
                        }
                    }
                    y("Connected to service");
                    this.k.a();
                    e();
                }
            }
        }
    }

    public final void e() {
        fbm.b();
        k();
        fbm.b();
        H();
        k();
        k();
        if (!fdc.i()) {
            B("Service client disabled. Can't dispatch local hits to device AnalyticsService");
        }
        if (!this.d.e()) {
            y("Service not connected");
            return;
        }
        if (this.b.Q()) {
            return;
        }
        y("Dispatching local hits to device AnalyticsService");
        while (true) {
            try {
                fct fctVar = this.b;
                k();
                List e = fctVar.e(fdc.e());
                if (e.isEmpty()) {
                    L();
                    return;
                }
                while (!e.isEmpty()) {
                    fdj fdjVar = (fdj) e.get(0);
                    if (!this.d.K(fdjVar)) {
                        L();
                        return;
                    }
                    e.remove(fdjVar);
                    try {
                        this.b.M(fdjVar.c);
                    } catch (SQLiteException e2) {
                        v("Failed to remove hit that was send for delivery", e2);
                        N();
                        return;
                    }
                }
            } catch (SQLiteException e3) {
                v("Failed to read hits from store", e3);
                N();
                return;
            }
        }
    }
}
