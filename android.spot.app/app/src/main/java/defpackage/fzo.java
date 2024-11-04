package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.util.Base64;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fzo {
    public static volatile fzo a;

    public fzo() {
    }

    public static boolean a(Context context) {
        if ("com.google.android.gms".equals(context.getPackageName())) {
            return true;
        }
        return false;
    }

    public static jyz b(fxs fxsVar) {
        gam gamVar = new gam(fxsVar, null);
        fxsVar.l(jxv.a, new fgb(gamVar, 3));
        return gamVar;
    }

    public static long c() {
        return fma.i().toEpochMilli();
    }

    public static ldg d(ghq ghqVar) {
        ljh k = ldg.c.k();
        k.getClass();
        if (ghqVar instanceof ght) {
            int a2 = ghqVar.a();
            if (!k.b.y()) {
                k.t();
            }
            ldg ldgVar = (ldg) k.b;
            ldgVar.a = 1;
            ldgVar.b = Integer.valueOf(a2);
        } else if (ghqVar instanceof ghs) {
            ljh k2 = ldf.d.k();
            k2.getClass();
            String str = ((ghs) ghqVar).b;
            if (!k2.b.y()) {
                k2.t();
            }
            ljn ljnVar = k2.b;
            ldf ldfVar = (ldf) ljnVar;
            ldfVar.a = 1 | ldfVar.a;
            ldfVar.b = str;
            int a3 = ghqVar.a();
            if (!ljnVar.y()) {
                k2.t();
            }
            ldf ldfVar2 = (ldf) k2.b;
            ldfVar2.a |= 2;
            ldfVar2.c = a3;
            ljn q = k2.q();
            q.getClass();
            ldf ldfVar3 = (ldf) q;
            if (!k.b.y()) {
                k.t();
            }
            ldg ldgVar2 = (ldg) k.b;
            ldgVar2.b = ldfVar3;
            ldgVar2.a = 2;
        }
        ljn q2 = k.q();
        q2.getClass();
        return (ldg) q2;
    }

    public static int e(Bundle bundle) {
        return a.w(bundle.getInt("chime.richCollapsedView"));
    }

    public static jad f(kxq kxqVar) {
        if (kxqVar.a.isEmpty()) {
            return null;
        }
        jaa jaaVar = ((kxr) kxqVar.a.get(0)).a;
        if (jaaVar == null) {
            jaaVar = jaa.e;
        }
        ljv<jad> ljvVar = jaaVar.c;
        if (ljvVar.isEmpty()) {
            return null;
        }
        for (jad jadVar : ljvVar) {
            if ((jadVar.a & 1) != 0) {
                jab jabVar = jadVar.b;
                if (jabVar == null) {
                    jabVar = jab.b;
                }
                if (jabVar.a) {
                    return jadVar;
                }
            }
        }
        return (jad) ljvVar.get(0);
    }

    public static void g(InputStream inputStream) {
        try {
            inputStream.close();
        } catch (IOException unused) {
        }
    }

    public static /* synthetic */ aaj h() {
        bgm bgmVar = gex.a;
        bgm bgmVar2 = gex.d;
        bgm bgmVar3 = gex.e;
        bgm bgmVar4 = gex.f;
        bgm bgmVar5 = gex.g;
        bgm bgmVar6 = gex.h;
        bgm bgmVar7 = gex.i;
        bgm bgmVar8 = gex.m;
        bgm bgmVar9 = gex.n;
        bgm bgmVar10 = gex.o;
        bgm bgmVar11 = gex.a;
        bgm bgmVar12 = gex.b;
        bgm bgmVar13 = gex.c;
        bgm bgmVar14 = gex.j;
        bgm bgmVar15 = gex.k;
        bgm bgmVar16 = gex.l;
        bgmVar2.getClass();
        bgmVar3.getClass();
        bgmVar4.getClass();
        bgmVar5.getClass();
        bgmVar6.getClass();
        bgmVar7.getClass();
        bgmVar8.getClass();
        bgmVar9.getClass();
        bgmVar10.getClass();
        bgmVar11.getClass();
        bgmVar12.getClass();
        bgmVar13.getClass();
        bgmVar14.getClass();
        bgmVar15.getClass();
        bgmVar16.getClass();
        return new aaj(bgmVar2, bgmVar3, bgmVar4, bgmVar5, bgmVar6, bgmVar7, bgmVar8, bgmVar9, bgmVar10, bgmVar11, bgmVar12, bgmVar13, bgmVar14, bgmVar15, bgmVar16);
    }

    public static void i(zw zwVar, aae aaeVar, aaj aajVar, mol molVar, abi abiVar, int i) {
        int i2;
        aae aaeVar2;
        aaj h;
        long g;
        aae aaeVar3;
        aaj aajVar2;
        int i3;
        int i4;
        int i5 = i & 14;
        abi b = abiVar.b(-419716824);
        if (i5 == 0) {
            if (true != b.B(zwVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        int i6 = i2 | 48;
        if ((i & 896) == 0) {
            i6 = i2 | 176;
        }
        if ((i & 7168) == 0) {
            if (true != b.D(molVar)) {
                i3 = 1024;
            } else {
                i3 = 2048;
            }
            i6 |= i3;
        }
        if ((i6 & 5851) == 1170 && b.G()) {
            b.r();
            aaeVar3 = aaeVar;
            aajVar2 = aajVar;
        } else {
            b.s();
            if ((i & 1) != 0 && !b.E()) {
                b.r();
                aaeVar2 = aaeVar;
                h = aajVar;
            } else {
                aaeVar2 = gep.a;
                h = h();
            }
            b.m();
            b.u(-816036754);
            long j = zwVar.a;
            b.u(-1957259157);
            boolean A = b.A(j);
            abp abpVar = (abp) b;
            Object P = abpVar.P();
            if (A || P == abh.a) {
                g = jw.g(aqx.d(j), aqx.c(j), aqx.b(j), 0.4f, aqx.f(j));
                P = new zp(j, g);
                abpVar.Z(P);
            }
            abpVar.U();
            abpVar.U();
            dd.g(zwVar, aaeVar2, h, alg.e(-1736562732, new xx((zp) P, molVar, 8), b), b, (i6 & 14) | 3072 | (i6 & 112));
            aaeVar3 = aaeVar2;
            aajVar2 = h;
        }
        afv d = b.d();
        if (d != null) {
            ((aeu) d).d = new aaa(zwVar, aaeVar3, aajVar2, molVar, i, 3);
        }
    }

    public static gwf j(String str) {
        str.getClass();
        byte[] decode = Base64.decode(str, 10);
        gxa gxaVar = gxa.c;
        int length = decode.length;
        lja ljaVar = lja.a;
        lkz lkzVar = lkz.a;
        ljn m = ljn.m(gxaVar, decode, 0, length, lja.a);
        ljn.A(m);
        gxa gxaVar2 = (gxa) m;
        gxaVar2.getClass();
        return frx.aB(gxaVar2);
    }

    public static gxa k(gwf gwfVar) {
        gwfVar.getClass();
        ljh k = gxa.c.k();
        k.getClass();
        if (gwfVar instanceof gwh) {
            ljh k2 = gwx.b.k();
            k2.getClass();
            String a2 = gwfVar.a();
            if (!k2.b.y()) {
                k2.t();
            }
            ((gwx) k2.b).a = a2;
            ljn q = k2.q();
            q.getClass();
            gwx gwxVar = (gwx) q;
            if (!k.b.y()) {
                k.t();
            }
            gxa gxaVar = (gxa) k.b;
            gxaVar.b = gwxVar;
            gxaVar.a = 1;
        } else if (gwfVar instanceof gwg) {
            ljh k3 = gww.b.k();
            k3.getClass();
            String str = ((gwg) gwfVar).a;
            if (!k3.b.y()) {
                k3.t();
            }
            ((gww) k3.b).a = str;
            ljn q2 = k3.q();
            q2.getClass();
            gww gwwVar = (gww) q2;
            if (!k.b.y()) {
                k.t();
            }
            gxa gxaVar2 = (gxa) k.b;
            gxaVar2.b = gwwVar;
            gxaVar2.a = 4;
        } else if (gwfVar instanceof gws) {
            ljh k4 = gwz.a.k();
            k4.getClass();
            ljn q3 = k4.q();
            q3.getClass();
            gwz gwzVar = (gwz) q3;
            if (!k.b.y()) {
                k.t();
            }
            gxa gxaVar3 = (gxa) k.b;
            gxaVar3.b = gwzVar;
            gxaVar3.a = 2;
        } else if (gwfVar instanceof gwq) {
            ljh k5 = gwy.a.k();
            k5.getClass();
            ljn q4 = k5.q();
            q4.getClass();
            gwy gwyVar = (gwy) q4;
            if (!k.b.y()) {
                k.t();
            }
            gxa gxaVar4 = (gxa) k.b;
            gxaVar4.b = gwyVar;
            gxaVar4.a = 3;
        }
        ljn q5 = k.q();
        q5.getClass();
        return (gxa) q5;
    }

    public static String l(gwf gwfVar) {
        return frx.F(k(gwfVar));
    }

    public static String m(gwf gwfVar, int i) {
        String str;
        if (gwfVar != null) {
            int i2 = mpo.a;
            int hashCode = new mox(gwfVar.getClass()).hashCode();
            int hashCode2 = gwfVar.a().hashCode();
            StringBuilder sb = new StringBuilder();
            sb.append(hashCode);
            sb.append(hashCode2);
            str = sb.toString();
        } else {
            str = "no_account";
        }
        return "GNP_SDK_JOB::" + str + "::" + i;
    }

    public static void n(cqm cqmVar, Long l) {
        cqmVar.c.add("GNP_SDK_JOB");
        if (l != null) {
            cqmVar.c(l.longValue(), TimeUnit.MILLISECONDS);
        }
    }

    public static /* synthetic */ Object o(gsb gsbVar, gry gryVar, Bundle bundle, mmx mmxVar, int i) {
        if ((i & 4) != 0) {
            bundle = new Bundle();
        }
        return gsbVar.b(gryVar, null, bundle, null, mmxVar);
    }

    public static String q(gri griVar) {
        String host = new URL(r(griVar)).getHost();
        host.getClass();
        return host;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.CharSequence, java.lang.Object] */
    public static String r(gri griVar) {
        ?? r0 = grj.a.a;
        int length = r0.length();
        String str = r0;
        if (length == 0) {
            int ordinal = griVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                if (ordinal == 5) {
                                    str = "https://dev-notifications-pa.corp.googleapis.com:443";
                                } else {
                                    throw new mku();
                                }
                            } else {
                                str = "https://staging-qual-qa-notifications-pa.sandbox.googleapis.com:443";
                            }
                        } else {
                            str = "https://staging-notifications-pa.sandbox.googleapis.com:443";
                        }
                    } else {
                        str = "https://autopush-qual-playground-notifications-pa.sandbox.googleapis.com:443";
                    }
                } else {
                    str = "https://autopush-notifications-pa.sandbox.googleapis.com:443";
                }
            } else {
                str = "https://notifications-pa.googleapis.com:443";
            }
        }
        return str;
    }

    public static gri s(int i) {
        return gri.a;
    }

    public static Object t(mnb mnbVar, mol molVar, mmx mmxVar) {
        if (!lux.a.a().a()) {
            mnbVar = mnc.a;
        }
        return mpp.l(mnbVar, new myn(molVar, (mmx) null, 1), mmxVar);
    }

    public static /* synthetic */ String u(int i) {
        if (i != 1) {
            if (i != 2) {
                return "null";
            }
            return "API_CALL";
        }
        return "UNKNOWN";
    }

    public static gpe v(int i) {
        if (i != 1) {
            if (i != 2) {
                return gpe.PRIORITY_UNKNOWN;
            }
            return gpe.PRIORITY_NORMAL;
        }
        return gpe.PRIORITY_HIGH;
    }

    public static void w(gov govVar, Intent intent, gnd gndVar, long j) {
        int threadPriority = Process.getThreadPriority(0);
        try {
            Process.setThreadPriority(govVar.a(intent));
            govVar.b(intent, gndVar, j);
        } finally {
            Process.setThreadPriority(threadPriority);
        }
    }

    public fzo(char[] cArr) {
    }

    public fzo(gll gllVar) {
        gllVar.getClass();
    }
}
