package defpackage;

import android.content.Context;
import com.google.android.gms.facs.cache.FacsCacheCallOptions;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class huy {
    public volatile hux b;
    private final kub d;
    private final hri e;
    public final Object a = new Object();
    private jyz c = ivc.E(null);

    public huy(hri hriVar, hot hotVar) {
        this.e = hriVar;
        this.d = lug.a.a().e((Context) hotVar.a) ? new kub((byte[]) null) : null;
    }

    public static jyz c(jyz jyzVar) {
        return iuu.o(jyzVar, new hkn(13), jxv.a);
    }

    public final jyz a(jxc jxcVar) {
        kub kubVar = this.d;
        if (kubVar != null) {
            return kubVar.b(jxcVar, jxv.a);
        }
        jyz g = iuu.E(this.c).g(jxcVar, jxv.a);
        this.c = c(g);
        return g;
    }

    public final jyz b(jyz jyzVar) {
        return iuu.o(jyzVar, new huw(this, 1), jxv.a);
    }

    public final jyz d(hvb hvbVar) {
        jyz e;
        hri hriVar = this.e;
        int ordinal = hvbVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                Object obj = hriVar.b;
                FacsCacheCallOptions d = hriVar.d();
                fjy fjyVar = new fjy();
                fjyVar.a = new fep(d, 7);
                fjyVar.c = 1803;
                e = hri.e(((fhq) obj).f(fjyVar.a()));
            } else {
                throw new AssertionError(hvbVar);
            }
        } else {
            Object obj2 = hriVar.b;
            FacsCacheCallOptions d2 = hriVar.d();
            fjy fjyVar2 = new fjy();
            fjyVar2.a = new fep(d2, 6);
            fjyVar2.c = 1801;
            e = hri.e(((fhq) obj2).f(fjyVar2.a()));
        }
        return jbx.d(e).e(new hkn(14), jxv.a).f(new etl(8), jxv.a);
    }

    public final boolean e() {
        if (this.b == null) {
            return true;
        }
        return false;
    }
}
