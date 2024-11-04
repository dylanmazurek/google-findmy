package defpackage;

import android.content.Context;
import android.os.StrictMode;
import java.io.File;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.chromium.net.ExperimentalCronetEngine;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dxg implements lsh {
    private final mko a;
    private final mko b;
    private final mko c;
    private final mko d;
    private final mko e;
    private final mko f;
    private final mko g;
    private final mko h;
    private final /* synthetic */ int i;

    public dxg(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, mko mkoVar6, mko mkoVar7, mko mkoVar8, int i) {
        this.i = i;
        this.a = mkoVar;
        this.b = mkoVar2;
        this.c = mkoVar3;
        this.d = mkoVar4;
        this.e = mkoVar5;
        this.f = mkoVar6;
        this.g = mkoVar7;
        this.h = mkoVar8;
    }

    @Override // defpackage.mko, defpackage.mkn
    public final /* synthetic */ Object a() {
        ExperimentalCronetEngine build;
        int i;
        switch (this.i) {
            case 0:
                Context context = (Context) this.a.a();
                ffc ffcVar = (ffc) this.b.a();
                ffc ffcVar2 = (ffc) this.c.a();
                elz elzVar = (elz) this.d.a();
                mko mkoVar = this.f;
                return new dxf(context, ffcVar, ffcVar2, elzVar, (eld) this.e.a(), (ktn) mkoVar.a(), ((dxh) this.g).a(), (jzd) this.h.a());
            case 1:
                return new dvt((dft) this.g.a(), ((dum) this.b).a(), (elo) this.c.a(), (evy) this.d.a(), (ewc) this.a.a(), (dvn) this.h.a(), lsg.c(this.e), (Executor) this.f.a());
            case 2:
                return new dzx((bym) this.d.a(), (ewg) this.h.a(), ((dvv) this.b).b(), (apc) this.e.a(), (ilv) this.c.a(), ((ezm) this.g).a(), (ele) this.f.a(), (jzd) this.a.a());
            case 3:
                mko mkoVar2 = this.h;
                mko mkoVar3 = this.b;
                lsm b = lsn.b(mkoVar2);
                mko mkoVar4 = this.c;
                mko mkoVar5 = this.a;
                mko mkoVar6 = this.g;
                return new efb(this.d, this.e, this.f, mkoVar6, mkoVar5, b, mkoVar4, mkoVar3);
            case 4:
                ilv ilvVar = (ilv) this.c.a();
                dvt dvtVar = (dvt) this.a.a();
                elo eloVar = (elo) this.e.a();
                dvn dvnVar = (dvn) this.d.a();
                dxf dxfVar = (dxf) this.h.a();
                return new ejm(ilvVar, dvtVar, eloVar, dvnVar, dxfVar, (ele) this.f.a(), (dhx) this.b.a());
            case 5:
                return new elw((ilv) this.c.a(), (dvt) this.a.a(), (elo) this.e.a(), (dvn) this.d.a(), (dxf) this.h.a(), (ele) this.f.a(), (fma) this.g.a(), (dhx) this.b.a());
            case 6:
                return new emz((emx) this.h.a(), (ewg) this.b.a(), (ele) this.c.a(), ((igp) this.a).a(), (ici) this.e.a(), (emt) this.d.a(), (Executor) this.g.a(), (jzd) this.f.a());
            case 7:
                return new eod((dxf) this.d.a(), (ewg) this.h.a(), (dhx) this.a.a(), (ejo) this.b.a(), ((iag) this.e).a(), (elo) this.f.a(), (ele) this.c.a(), (Executor) this.g.a());
            case 8:
                return new etq((evy) this.d.a(), (dxf) this.h.a(), ((lry) this.a).b(), (dhx) this.e.a(), ((epx) this.f).a(), ((fnx) this.c).a(), (Executor) this.b.a(), (Executor) this.g.a());
            case 9:
                return new gga(lsg.c(this.a), (ddg) this.h.a(), (ddg) this.b.a(), (gvi) this.f.a(), (ghf) this.c.a(), (fma) this.e.a(), (Random) this.g.a(), ((dvu) this.d).b());
            case 10:
                ((goq) this.e).b();
                return new ghe((gkr) this.d.a(), (ddg) this.h.a(), (glu) this.g.a(), (ghf) this.a.a(), (Set) ((lsi) this.c).b, ((gie) this.f).a(), (jzc) this.b.a());
            case 11:
                git gitVar = (git) this.d.a();
                mko mkoVar7 = this.h;
                goj b2 = ((goq) this.f).b();
                ddg ddgVar = (ddg) mkoVar7.a();
                gil gilVar = (gil) this.g.a();
                ghf ghfVar = (ghf) this.a.a();
                Set set = (Set) ((lsi) this.c).b;
                return new glo(gitVar, b2, ddgVar, gilVar, ghfVar, set, this.e);
            case 12:
                return new glz(((lry) this.a).b(), (gnv) this.b.a(), (ghu) this.d.a(), (gmc) this.g.a(), lsg.c(this.e), (gls) this.c.a(), (ghf) this.h.a(), this.f);
            case 13:
                mko mkoVar8 = this.b;
                gqi a = ((gqk) this.f).a();
                gnv gnvVar = (gnv) mkoVar8.a();
                mko mkoVar9 = this.d;
                gri a2 = ((grh) this.e).a();
                grt grtVar = (grt) mkoVar9.a();
                ((lry) this.h).b();
                ((gvb) this.g).a();
                mko mkoVar10 = this.c;
                mnb b3 = ((dvu) this.a).b();
                ((gre) mkoVar10).b();
                return new gva(a, gnvVar, a2, grtVar, b3);
            case 14:
                mko mkoVar11 = this.a;
                Context b4 = ((lry) this.h).b();
                gnv gnvVar2 = (gnv) mkoVar11.a();
                Object obj = ((lsi) this.e).b;
                return new gvv(b4, gnvVar2, ((gwt) this.g).b(), (jer) obj, ((dvv) this.b).b(), ((gus) this.d).a(), (jzc) this.c.a(), this.f);
            case 15:
                Context b5 = ((lry) this.b).b();
                frx frxVar = (frx) this.e.a();
                hcd hcdVar = (hcd) this.d.a();
                jer jerVar = (jer) ((lsi) this.a).b;
                jer jerVar2 = (jer) ((lsi) this.f).b;
                jer jerVar3 = (jer) ((lsi) this.h).b;
                gee geeVar = (gee) this.g.a();
                ExecutorService executorService = (ExecutorService) jerVar3.e(Executors.newCachedThreadPool(hog.Q()));
                hcb hcbVar = new hcb((byte[]) null);
                Context applicationContext = b5.getApplicationContext();
                if (applicationContext != null) {
                    hcbVar.a = applicationContext;
                    hcbVar.c = heb.a().a();
                    hcbVar.f = new hdz(null);
                    hcbVar.h = new hib(1);
                    if (frxVar != null) {
                        hcbVar.i = frxVar;
                        if (hcdVar != null) {
                            mko mkoVar12 = this.c;
                            hcbVar.b = hcdVar;
                            hcbVar.d = new hfr(b5, (hjy) mkoVar12.a(), true);
                            hcbVar.e = new hiv(b5);
                            hcbVar.g(executorService);
                            if (geeVar != null) {
                                hcbVar.g = geeVar;
                                if (jerVar.g()) {
                                    hcbVar.f = (hdz) jerVar.c();
                                }
                                if (jerVar2.g()) {
                                    hcbVar.c = (heb) jerVar2.c();
                                }
                                return hcbVar.a();
                            }
                            throw new NullPointerException("Null vePrimitives");
                        }
                        throw new NullPointerException("Null accountsModel");
                    }
                    throw new NullPointerException("Null accountConverter");
                }
                throw new NullPointerException("Null applicationContext");
            case 16:
                mko mkoVar13 = this.f;
                mko mkoVar14 = this.e;
                hpe a3 = ((hpf) this.c).a();
                Context b6 = ((lry) mkoVar14).b();
                Executor executor = (Executor) mkoVar13.a();
                mko mkoVar15 = this.a;
                return new hqp(a3, b6, executor, ((hqj) this.b).a(), this.g, lsg.c(mkoVar15), this.d, this.h);
            default:
                Context context2 = (Context) this.h.a();
                mko mkoVar16 = this.g;
                Object obj2 = ((lsi) this.c).b;
                Set a4 = ((lsp) mkoVar16).a();
                Set set2 = (Set) obj2;
                jer jerVar4 = (jer) ((lsi) this.d).b;
                jer jerVar5 = (jer) ((lsi) this.a).b;
                mko mkoVar17 = this.b;
                mko mkoVar18 = this.e;
                mko mkoVar19 = this.f;
                jax c = jbu.c("CronetConfigurationModule#provideCronetEngine");
                try {
                    StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                    try {
                        try {
                            ExperimentalCronetEngine.Builder aj = hwx.aj(context2, a4, set2, jerVar4, jerVar5, mkoVar17);
                            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
                            if (jerVar4.g()) {
                                kud kudVar = (kud) jerVar4.c();
                                if (kudVar.j()) {
                                    if (kudVar.k()) {
                                        i = 3;
                                    } else {
                                        i = 2;
                                    }
                                } else {
                                    i = 0;
                                }
                                if (i != 0) {
                                    File file = new File(context2.getCacheDir(), kudVar.g());
                                    file.mkdirs();
                                    if (file.isDirectory()) {
                                        aj.setStoragePath(file.getAbsolutePath());
                                        aj.enableHttpCache(i, kudVar.a());
                                    }
                                }
                                hwx.am(jerVar4, aj);
                            }
                            hwx.ak(jerVar4, aj);
                            build = aj.build();
                            hwx.al(jerVar4, build, mkoVar18, mkoVar19);
                        } catch (IllegalStateException e) {
                            if (jerVar4.g() && ((kud) jerVar4.c()).l()) {
                                StrictMode.setThreadPolicy(threadPolicy);
                                ExperimentalCronetEngine.Builder aj2 = hwx.aj(context2, a4, set2, jerVar4, jerVar5, mkoVar17);
                                StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
                                hwx.am(jerVar4, aj2);
                                hwx.ak(jerVar4, aj2);
                                build = aj2.build();
                                hwx.al(jerVar4, build, mkoVar18, mkoVar19);
                            } else {
                                throw e;
                            }
                        }
                        c.close();
                        build.getClass();
                        return build;
                    } finally {
                        StrictMode.setThreadPolicy(threadPolicy);
                    }
                } finally {
                }
        }
    }

    public dxg(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, mko mkoVar6, mko mkoVar7, mko mkoVar8, int i, byte[] bArr) {
        this.i = i;
        this.g = mkoVar;
        this.b = mkoVar2;
        this.c = mkoVar3;
        this.d = mkoVar4;
        this.a = mkoVar5;
        this.h = mkoVar6;
        this.e = mkoVar7;
        this.f = mkoVar8;
    }

    public dxg(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, mko mkoVar6, mko mkoVar7, mko mkoVar8, int i, char[] cArr) {
        this.i = i;
        this.d = mkoVar;
        this.h = mkoVar2;
        this.b = mkoVar3;
        this.e = mkoVar4;
        this.c = mkoVar5;
        this.g = mkoVar6;
        this.f = mkoVar7;
        this.a = mkoVar8;
    }

    public dxg(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, mko mkoVar6, mko mkoVar7, mko mkoVar8, int i, float[] fArr) {
        this.i = i;
        this.h = mkoVar;
        this.b = mkoVar2;
        this.c = mkoVar3;
        this.a = mkoVar4;
        this.e = mkoVar5;
        this.d = mkoVar6;
        this.g = mkoVar7;
        this.f = mkoVar8;
    }

    public dxg(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, mko mkoVar6, mko mkoVar7, mko mkoVar8, int i, int[] iArr) {
        this.i = i;
        this.c = mkoVar;
        this.a = mkoVar2;
        this.e = mkoVar3;
        this.d = mkoVar4;
        this.h = mkoVar5;
        this.g = mkoVar6;
        this.f = mkoVar7;
        this.b = mkoVar8;
    }

    public dxg(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, mko mkoVar6, mko mkoVar7, mko mkoVar8, int i, short[] sArr) {
        this.i = i;
        this.d = mkoVar;
        this.e = mkoVar2;
        this.f = mkoVar3;
        this.g = mkoVar4;
        this.a = mkoVar5;
        this.h = mkoVar6;
        this.c = mkoVar7;
        this.b = mkoVar8;
    }

    public dxg(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, mko mkoVar6, mko mkoVar7, mko mkoVar8, int i, boolean[] zArr) {
        this.i = i;
        this.c = mkoVar;
        this.a = mkoVar2;
        this.e = mkoVar3;
        this.d = mkoVar4;
        this.h = mkoVar5;
        this.f = mkoVar6;
        this.g = mkoVar7;
        this.b = mkoVar8;
    }

    public dxg(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, mko mkoVar6, mko mkoVar7, mko mkoVar8, int i, byte[][] bArr) {
        this.i = i;
        this.d = mkoVar;
        this.h = mkoVar2;
        this.a = mkoVar3;
        this.b = mkoVar4;
        this.e = mkoVar5;
        this.f = mkoVar6;
        this.c = mkoVar7;
        this.g = mkoVar8;
    }

    public dxg(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, mko mkoVar6, mko mkoVar7, mko mkoVar8, int i, char[][] cArr) {
        this.i = i;
        this.d = mkoVar;
        this.h = mkoVar2;
        this.a = mkoVar3;
        this.e = mkoVar4;
        this.f = mkoVar5;
        this.c = mkoVar6;
        this.b = mkoVar7;
        this.g = mkoVar8;
    }

    public dxg(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, mko mkoVar6, mko mkoVar7, mko mkoVar8, int i, float[][] fArr) {
        this.i = i;
        this.a = mkoVar;
        this.b = mkoVar2;
        this.d = mkoVar3;
        this.g = mkoVar4;
        this.e = mkoVar5;
        this.c = mkoVar6;
        this.h = mkoVar7;
        this.f = mkoVar8;
    }

    public dxg(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, mko mkoVar6, mko mkoVar7, mko mkoVar8, int i, int[][] iArr) {
        this.i = i;
        this.e = mkoVar;
        this.d = mkoVar2;
        this.h = mkoVar3;
        this.g = mkoVar4;
        this.a = mkoVar5;
        this.c = mkoVar6;
        this.f = mkoVar7;
        this.b = mkoVar8;
    }

    public dxg(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, mko mkoVar6, mko mkoVar7, mko mkoVar8, int i, short[][] sArr) {
        this.i = i;
        this.a = mkoVar;
        this.h = mkoVar2;
        this.b = mkoVar3;
        this.f = mkoVar4;
        this.c = mkoVar5;
        this.e = mkoVar6;
        this.g = mkoVar7;
        this.d = mkoVar8;
    }

    public dxg(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, mko mkoVar6, mko mkoVar7, mko mkoVar8, int i, boolean[][] zArr) {
        this.i = i;
        this.d = mkoVar;
        this.f = mkoVar2;
        this.h = mkoVar3;
        this.g = mkoVar4;
        this.a = mkoVar5;
        this.c = mkoVar6;
        this.b = mkoVar7;
        this.e = mkoVar8;
    }

    public dxg(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, mko mkoVar6, mko mkoVar7, mko mkoVar8, int i, byte[][][] bArr) {
        this.i = i;
        this.f = mkoVar;
        this.b = mkoVar2;
        this.e = mkoVar3;
        this.d = mkoVar4;
        this.h = mkoVar5;
        this.g = mkoVar6;
        this.a = mkoVar7;
        this.c = mkoVar8;
    }

    public dxg(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, mko mkoVar6, mko mkoVar7, mko mkoVar8, int i, char[][][] cArr) {
        this.i = i;
        this.h = mkoVar;
        this.a = mkoVar2;
        this.g = mkoVar3;
        this.e = mkoVar4;
        this.b = mkoVar5;
        this.d = mkoVar6;
        this.c = mkoVar7;
        this.f = mkoVar8;
    }

    public dxg(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, mko mkoVar6, mko mkoVar7, mko mkoVar8, int i, int[][][] iArr) {
        this.i = i;
        this.c = mkoVar;
        this.e = mkoVar2;
        this.f = mkoVar3;
        this.b = mkoVar4;
        this.g = mkoVar5;
        this.a = mkoVar6;
        this.d = mkoVar7;
        this.h = mkoVar8;
    }

    public dxg(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, mko mkoVar6, mko mkoVar7, mko mkoVar8, int i, short[][][] sArr) {
        this.i = i;
        this.b = mkoVar;
        this.e = mkoVar2;
        this.d = mkoVar3;
        this.c = mkoVar4;
        this.a = mkoVar5;
        this.f = mkoVar6;
        this.h = mkoVar7;
        this.g = mkoVar8;
    }

    public dxg(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, mko mkoVar6, mko mkoVar7, mko mkoVar8, int i, boolean[][][] zArr) {
        this.i = i;
        this.h = mkoVar;
        this.g = mkoVar2;
        this.c = mkoVar3;
        this.d = mkoVar4;
        this.a = mkoVar5;
        this.b = mkoVar6;
        this.e = mkoVar7;
        this.f = mkoVar8;
    }
}
