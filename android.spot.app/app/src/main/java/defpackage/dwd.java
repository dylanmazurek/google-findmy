package defpackage;

import android.content.Context;
import android.os.Build;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dwd implements lsh {
    private final mko a;
    private final /* synthetic */ int b;

    public dwd(mko mkoVar, int i) {
        this.b = i;
        this.a = mkoVar;
    }

    @Override // defpackage.mko, defpackage.mkn
    public final /* synthetic */ Object a() {
        long j;
        fbr fbrVar;
        switch (this.b) {
            case 0:
                return new elo(((lry) this.a).b(), (byte[]) null);
            case 1:
                bym bymVar = new bym((short[]) null);
                return new dvn(bymVar);
            case 2:
                Context b = ((lry) this.a).b();
                StringBuilder sb = new StringBuilder("fmd/");
                if (Build.VERSION.SDK_INT >= 28) {
                    j = fma.bG(b).getLongVersionCode();
                } else {
                    j = fma.bG(b).versionCode;
                }
                sb.append(j);
                dft dftVar = new dft(new elo(new dvo(new izp(b, sb.toString()))));
                dfi dfiVar = dftVar.e;
                if (dfiVar != null) {
                    dfiVar.a();
                }
                dfm[] dfmVarArr = dftVar.d;
                for (int i = 0; i < 4; i++) {
                    dfm dfmVar = dfmVarArr[i];
                    if (dfmVar != null) {
                        dfmVar.a = true;
                        dfmVar.interrupt();
                    }
                }
                dftVar.e = new dfi(dftVar.b, dftVar.c, dftVar.g);
                dftVar.e.start();
                for (int i2 = 0; i2 < 4; i2++) {
                    dfm dfmVar2 = new dfm(dftVar.c, dftVar.h, dftVar.g);
                    dftVar.d[i2] = dfmVar2;
                    dfmVar2.start();
                }
                return dftVar;
            case 3:
                Context b2 = ((lry) this.a).b();
                fbb a = fcn.e(b2).a();
                String string = b2.getString(R.string.ga_trackingId);
                synchronized (a) {
                    fbrVar = new fbr(a.a, string);
                    fbrVar.I();
                }
                return fbrVar;
            case 4:
                return new ksr(((lry) this.a).b(), (char[]) null);
            case 5:
                return new fex((Context) this.a.a(), "FIND_MY_DEVICE_CLEARCUT").a();
            case 6:
                Context context = (Context) this.a.a();
                hqk hqkVar = new hqk(null);
                fma fmaVar = new fma();
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    return new ktn(new huu(applicationContext, "common", fmaVar, new hot((Object) hqk.a(applicationContext)), hqkVar, new hot((Object) hqk.a(applicationContext))));
                }
                throw new NullPointerException("Null context");
            case 7:
                return ffc.k((Context) this.a.a(), "FIND_MY_DEVICE_CLEARCUT").a();
            case 8:
                return fyf.a((Context) this.a.a());
            case 9:
                return new bym((fbr) this.a.a());
            case 10:
                return new bym((Object) ((lry) this.a).b(), (byte[]) null);
            case 11:
                return new elo(((lry) this.a).b());
            case 12:
                return new bym(((lry) this.a).b(), (byte[]) null);
            case 13:
                return new dyz(((lsk) this.a).a());
            case 14:
                return new edr((edc) this.a.a());
            case 15:
                return new eem((ewf) this.a.a());
            case 16:
                return new efm(((eer) this.a).a());
            case 17:
                return new ehn((ewf) this.a.a());
            case 18:
                return new ddg(((lsk) this.a).a());
            case 19:
                return new eio(((lsk) this.a).a());
            default:
                return new elx(((ely) this.a).a());
        }
    }
}
