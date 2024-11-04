package defpackage;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;
import java.io.InputStream;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class gfa implements jei {
    private final /* synthetic */ int a;

    public /* synthetic */ gfa(int i) {
        this.a = i;
    }

    @Override // defpackage.jei
    public final Object a(Object obj) {
        String str;
        boolean z = true;
        switch (this.a) {
            case 0:
                return new gez((String) obj, 0);
            case 1:
                return fma.o(true);
            case 2:
                return jdl.a;
            case 3:
                kxq kxqVar = ((gfs) obj).a;
                if (kxqVar == null) {
                    return kxq.b;
                }
                return kxqVar;
            case 4:
                return jer.i((InputStream) obj);
            case 5:
                return jdl.a;
            case 6:
                PseudonymousIdToken pseudonymousIdToken = (PseudonymousIdToken) obj;
                if (pseudonymousIdToken == null || (str = pseudonymousIdToken.a) == null) {
                    return "";
                }
                return str;
            case 7:
                return (mlh) ((gna) obj).c();
            case 8:
                Log.e(hba.a, "Failed to load GoogleOwners.", (Exception) obj);
                int i = jis.d;
                return jmi.a;
            case 9:
                jin jinVar = new jin();
                Iterator<E> it = ((jis) obj).iterator();
                while (it.hasNext()) {
                    jinVar.h(hfm.a.a((hjw) it.next()));
                }
                return jinVar.g();
            case 10:
                if (SystemClock.elapsedRealtime() - ((Long) obj).longValue() >= 5000) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 11:
                return Boolean.valueOf(((hco) obj).a());
            case 12:
                return Boolean.valueOf(((hdl) obj).c);
            case 13:
                kxn kxnVar = ((fpp) obj).a;
                if (kxnVar == null) {
                    return kxn.c;
                }
                return kxnVar;
            case 14:
                kxm kxmVar = ((kxn) obj).b;
                if (kxmVar == null) {
                    return kxm.c;
                }
                return kxmVar;
            case 15:
                return ((hap) obj).b;
            case 16:
                return ((hjy) obj).a();
            case 17:
                return ((hjy) obj).b();
            case 18:
                return ((jer) obj).f();
            case 19:
                gfn gfnVar = (gfn) obj;
                return hkl.g(jbx.d(jbx.d(gfnVar.d()).e(new ewy(gfnVar, 8), jxv.a)).b(Exception.class, new eji(gfnVar, 9), jxv.a).e(new ewy(gfnVar, 10), jxv.a));
            default:
                gfn gfnVar2 = (gfn) obj;
                return jbx.d(jbx.d(gfnVar2.d()).f(new eji(gfnVar2, 12), jxv.a).e(new gfa(3), jxv.a)).b(Exception.class, new eji(gfnVar2, 13), jxv.a).e(new ewy(gfnVar2, 11), jxv.a);
        }
    }
}
