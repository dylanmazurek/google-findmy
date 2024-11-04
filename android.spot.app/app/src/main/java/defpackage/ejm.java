package defpackage;

import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ejm implements eho {
    public static final /* synthetic */ int a = 0;
    private static final lpo b;
    private final dvt c;
    private final dvn d;
    private final ele e;
    private final dxf f;
    private final elo g;
    private final ilv h;
    private final dhx i;

    static {
        ljh k = lpo.c.k();
        lpm lpmVar = lpm.a;
        if (!k.b.y()) {
            k.t();
        }
        lpo lpoVar = (lpo) k.b;
        lpmVar.getClass();
        lpoVar.b = lpmVar;
        lpoVar.a = 31;
        b = (lpo) k.q();
    }

    public ejm(ilv ilvVar, dvt dvtVar, elo eloVar, dvn dvnVar, dxf dxfVar, ele eleVar, dhx dhxVar) {
        this.h = ilvVar;
        this.c = dvtVar;
        this.g = eloVar;
        this.d = dvnVar;
        this.f = dxfVar;
        this.e = eleVar;
        this.i = dhxVar;
    }

    @Override // defpackage.eho
    public final void a(lqd lqdVar) {
        jer jerVar = this.h.d(lqdVar).l;
        if (jerVar.g()) {
            this.d.d((String) jerVar.c());
        }
        dvt dvtVar = this.c;
        ilv ilvVar = this.h;
        String b2 = dvtVar.b();
        ilvVar.k(lqdVar, new ejl(b2, 0), false);
        this.f.c(lnb.RING_REMOTE_INSTRUCTION_ISSUED, jdl.a, lqdVar);
        this.c.d(lqdVar, b, b2, lua.f());
    }

    @Override // defpackage.eho
    public final /* synthetic */ void b(lqd lqdVar, lpo lpoVar) {
        bsg.h(this, lqdVar);
    }

    @Override // defpackage.eho
    public final boolean d(lqd lqdVar, boolean z) {
        this.h.k(lqdVar, new ell(1), true);
        this.i.m(R.string.ring_result_fail);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x011c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011d A[RETURN] */
    @Override // defpackage.eho
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(defpackage.lqy r10) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejm.e(lqy):boolean");
    }
}
