package defpackage;

import android.content.Context;
import android.os.LocaleList;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gvv implements gvl {
    private static final joo b = joo.m("GnpSdk");
    public final hri a;
    private final Context c;
    private final gnv d;
    private final jer e;
    private final jer f;
    private final jer g;
    private final jzc h;
    private final mko i;

    public gvv(Context context, gnv gnvVar, jer jerVar, jer jerVar2, jer jerVar3, hri hriVar, jzc jzcVar, mko mkoVar) {
        this.c = context;
        this.d = gnvVar;
        this.e = jerVar2;
        this.f = jerVar3;
        this.g = jerVar;
        this.a = hriVar;
        this.h = jzcVar;
        this.i = mkoVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0390  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final defpackage.lfg c() {
        /*
            Method dump skipped, instructions count: 944
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gvv.c():lfg");
    }

    private final String d() {
        LocaleList locales;
        Locale locale;
        if (a.g()) {
            locales = this.c.getResources().getConfiguration().getLocales();
            locale = locales.get(0);
            return locale.toLanguageTag();
        }
        return this.c.getResources().getConfiguration().locale.toLanguageTag();
    }

    @Override // defpackage.gvl
    public final jyz a(gwf gwfVar, final jjr jjrVar, gny gnyVar) {
        jer jerVar;
        jyz E;
        jyz E2;
        final ljh k = lfh.g.k();
        String d = d();
        if (!k.b.y()) {
            k.t();
        }
        lfh lfhVar = (lfh) k.b;
        d.getClass();
        lfhVar.a |= 1;
        lfhVar.b = d;
        String id = TimeZone.getDefault().getID();
        if (!k.b.y()) {
            k.t();
        }
        lfh lfhVar2 = (lfh) k.b;
        id.getClass();
        lfhVar2.a |= 8;
        lfhVar2.d = id;
        lfg c = c();
        if (!k.b.y()) {
            k.t();
        }
        lfh lfhVar3 = (lfh) k.b;
        c.getClass();
        lfhVar3.e = c;
        lfhVar3.a |= 32;
        if (gnyVar.a()) {
            if (((grn) this.i).b().booleanValue()) {
                jerVar = this.g;
                if (!jerVar.g()) {
                    throw new IllegalStateException("Registration data provider must be provided for GNP unified registrations");
                }
            } else {
                jerVar = this.f;
            }
        } else if (gnyVar.b()) {
            jerVar = this.e;
        } else {
            throw new IllegalStateException("Unsupported targetType for RequestUtilImpl");
        }
        jer jerVar2 = jerVar;
        try {
            if (jerVar2.g()) {
                E = ((hri) jerVar2.c()).s(gwfVar);
            } else {
                E = ivc.E(null);
            }
        } catch (Exception e) {
            ((jol) ((jol) ((jol) b.f()).i(e)).j("com/google/android/libraries/notifications/platform/internal/util/request/impl/RequestUtilImpl", "getAccountLanguageCode", 'v', "RequestUtilImpl.java")).r("Failed getting language code");
            E = ivc.E(null);
        }
        final jyz jyzVar = E;
        if (gwfVar.b()) {
            E2 = ivc.E(null);
        } else {
            try {
                if (jerVar2.g()) {
                    E2 = ((hri) jerVar2.c()).r(gwfVar);
                } else {
                    E2 = ivc.E(null);
                }
            } catch (Exception e2) {
                ((jol) ((jol) ((jol) b.f()).i(e2)).j("com/google/android/libraries/notifications/platform/internal/util/request/impl/RequestUtilImpl", "getDevicePayload", (char) 322, "RequestUtilImpl.java")).r("Failed getting device payload");
                E2 = ivc.E(null);
            }
        }
        final jyz jyzVar2 = E2;
        return ivc.T(jyzVar, E2).a(new Callable() { // from class: gvq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                long j;
                String str = (String) ivc.M(jyzVar);
                lia liaVar = (lia) ivc.M(jyzVar2);
                boolean isEmpty = TextUtils.isEmpty(str);
                ljh ljhVar = k;
                if (!isEmpty) {
                    if (!ljhVar.b.y()) {
                        ljhVar.t();
                    }
                    lfh lfhVar4 = (lfh) ljhVar.b;
                    lfh lfhVar5 = lfh.g;
                    str.getClass();
                    lfhVar4.a |= 4;
                    lfhVar4.c = str;
                }
                if (liaVar != null) {
                    if (!ljhVar.b.y()) {
                        ljhVar.t();
                    }
                    lfh lfhVar6 = (lfh) ljhVar.b;
                    lfh lfhVar7 = lfh.g;
                    lfhVar6.f = liaVar;
                    lfhVar6.a |= 64;
                }
                jjr jjrVar2 = jjrVar;
                boolean contains = jjrVar2.contains(gwo.b);
                lfg lfgVar = ((lfh) ljhVar.b).e;
                if (lfgVar == null) {
                    lfgVar = lfg.s;
                }
                lgj lgjVar = lfgVar.p;
                if (lgjVar == null) {
                    lgjVar = lgj.b;
                }
                ljh ljhVar2 = (ljh) lgjVar.z(5);
                ljhVar2.w(lgjVar);
                frx.aE(ljhVar2, 2, contains);
                lfg lfgVar2 = ((lfh) ljhVar.b).e;
                if (lfgVar2 == null) {
                    lfgVar2 = lfg.s;
                }
                ljh ljhVar3 = (ljh) lfgVar2.z(5);
                ljhVar3.w(lfgVar2);
                if (!ljhVar3.b.y()) {
                    ljhVar3.t();
                }
                lfg lfgVar3 = (lfg) ljhVar3.b;
                lgj lgjVar2 = (lgj) ljhVar2.q();
                lgjVar2.getClass();
                lfgVar3.p = lgjVar2;
                lfgVar3.a |= 4096;
                if (!ljhVar.b.y()) {
                    ljhVar.t();
                }
                lfh lfhVar8 = (lfh) ljhVar.b;
                lfg lfgVar4 = (lfg) ljhVar3.q();
                lfgVar4.getClass();
                lfhVar8.e = lfgVar4;
                lfhVar8.a |= 32;
                boolean contains2 = jjrVar2.contains(gwo.a);
                lfg lfgVar5 = ((lfh) ljhVar.b).e;
                if (lfgVar5 == null) {
                    lfgVar5 = lfg.s;
                }
                lgj lgjVar3 = lfgVar5.p;
                if (lgjVar3 == null) {
                    lgjVar3 = lgj.b;
                }
                ljh ljhVar4 = (ljh) lgjVar3.z(5);
                ljhVar4.w(lgjVar3);
                frx.aE(ljhVar4, 3, !contains2);
                lfg lfgVar6 = ((lfh) ljhVar.b).e;
                if (lfgVar6 == null) {
                    lfgVar6 = lfg.s;
                }
                ljh ljhVar5 = (ljh) lfgVar6.z(5);
                ljhVar5.w(lfgVar6);
                if (!ljhVar5.b.y()) {
                    ljhVar5.t();
                }
                lfg lfgVar7 = (lfg) ljhVar5.b;
                lgj lgjVar4 = (lgj) ljhVar4.q();
                lgjVar4.getClass();
                lfgVar7.p = lgjVar4;
                lfgVar7.a |= 4096;
                if (!ljhVar.b.y()) {
                    ljhVar.t();
                }
                lfh lfhVar9 = (lfh) ljhVar.b;
                lfg lfgVar8 = (lfg) ljhVar5.q();
                lfgVar8.getClass();
                lfhVar9.e = lfgVar8;
                lfhVar9.a |= 32;
                lfg lfgVar9 = ((lfh) ljhVar.b).e;
                if (lfgVar9 == null) {
                    lfgVar9 = lfg.s;
                }
                gvv gvvVar = gvv.this;
                ljh ljhVar6 = (ljh) lfgVar9.z(5);
                ljhVar6.w(lfgVar9);
                lgj t = gvvVar.a.t();
                lgj lgjVar5 = ((lfg) ljhVar6.b).p;
                if (lgjVar5 == null) {
                    lgjVar5 = lgj.b;
                }
                ArrayList arrayList = new ArrayList();
                int max = Math.max(t.a.size(), lgjVar5.a.size());
                for (int i = 0; i < max; i++) {
                    long j2 = 0;
                    if (i < t.a.size()) {
                        j = t.a.a(i);
                    } else {
                        j = 0;
                    }
                    if (i < lgjVar5.a.size()) {
                        j2 = lgjVar5.a.a(i);
                    }
                    arrayList.add(Long.valueOf(j | j2));
                }
                ljh k2 = lgj.b.k();
                k2.H(arrayList);
                lgj lgjVar6 = (lgj) k2.q();
                if (!ljhVar6.b.y()) {
                    ljhVar6.t();
                }
                lfg lfgVar10 = (lfg) ljhVar6.b;
                lgjVar6.getClass();
                lfgVar10.p = lgjVar6;
                lfgVar10.a |= 4096;
                lgs u = gvvVar.a.u();
                if (!ljhVar6.b.y()) {
                    ljhVar6.t();
                }
                lfg lfgVar11 = (lfg) ljhVar6.b;
                u.getClass();
                lfgVar11.q = u;
                lfgVar11.a |= 8192;
                if (!ljhVar.b.y()) {
                    ljhVar.t();
                }
                lfh lfhVar10 = (lfh) ljhVar.b;
                lfg lfgVar12 = (lfg) ljhVar6.q();
                lfgVar12.getClass();
                lfhVar10.e = lfgVar12;
                lfhVar10.a |= 32;
                return (lfh) ljhVar.q();
            }
        }, this.h);
    }

    @Override // defpackage.gvl
    public final lcy b() {
        lfg c = c();
        ljh k = lcx.q.k();
        float f = c.b;
        if (!k.b.y()) {
            k.t();
        }
        ljn ljnVar = k.b;
        lcx lcxVar = (lcx) ljnVar;
        lcxVar.a |= 1;
        lcxVar.b = f;
        String str = c.e;
        if (!ljnVar.y()) {
            k.t();
        }
        ljn ljnVar2 = k.b;
        lcx lcxVar2 = (lcx) ljnVar2;
        str.getClass();
        lcxVar2.a |= 8;
        lcxVar2.e = str;
        int i = c.i;
        if (!ljnVar2.y()) {
            k.t();
        }
        ljn ljnVar3 = k.b;
        lcx lcxVar3 = (lcx) ljnVar3;
        lcxVar3.a |= 128;
        lcxVar3.i = i;
        if (!ljnVar3.y()) {
            k.t();
        }
        ljn ljnVar4 = k.b;
        lcx lcxVar4 = (lcx) ljnVar4;
        int i2 = 3;
        lcxVar4.c = 3;
        lcxVar4.a |= 2;
        String str2 = c.d;
        if (!ljnVar4.y()) {
            k.t();
        }
        lcx lcxVar5 = (lcx) k.b;
        str2.getClass();
        lcxVar5.a |= 4;
        lcxVar5.d = str2;
        gvr gvrVar = gvr.a;
        lfb b2 = lfb.b(c.n);
        if (b2 == null) {
            b2 = lfb.APP_BLOCK_STATE_UNKNOWN;
        }
        lcu lcuVar = (lcu) gvrVar.e(b2);
        if (!k.b.y()) {
            k.t();
        }
        lcx lcxVar6 = (lcx) k.b;
        lcxVar6.m = lcuVar.d;
        lcxVar6.a |= 1024;
        if (true != frx.aM(this.c)) {
            i2 = 2;
        }
        if (!k.b.y()) {
            k.t();
        }
        lcx lcxVar7 = (lcx) k.b;
        lcxVar7.p = i2 - 1;
        lcxVar7.a |= 8192;
        if (!c.f.isEmpty()) {
            String str3 = c.f;
            if (!k.b.y()) {
                k.t();
            }
            lcx lcxVar8 = (lcx) k.b;
            str3.getClass();
            lcxVar8.a |= 16;
            lcxVar8.f = str3;
        }
        if (!c.g.isEmpty()) {
            String str4 = c.g;
            if (!k.b.y()) {
                k.t();
            }
            lcx lcxVar9 = (lcx) k.b;
            str4.getClass();
            lcxVar9.a |= 32;
            lcxVar9.g = str4;
        }
        if (!c.h.isEmpty()) {
            String str5 = c.h;
            if (!k.b.y()) {
                k.t();
            }
            lcx lcxVar10 = (lcx) k.b;
            str5.getClass();
            lcxVar10.a |= 64;
            lcxVar10.h = str5;
        }
        if (!c.j.isEmpty()) {
            String str6 = c.j;
            if (!k.b.y()) {
                k.t();
            }
            lcx lcxVar11 = (lcx) k.b;
            str6.getClass();
            lcxVar11.a |= 256;
            lcxVar11.j = str6;
        }
        if (!c.o.isEmpty()) {
            String str7 = c.o;
            if (!k.b.y()) {
                k.t();
            }
            lcx lcxVar12 = (lcx) k.b;
            str7.getClass();
            lcxVar12.a |= 2048;
            lcxVar12.n = str7;
        }
        for (lfd lfdVar : c.l) {
            ljh k2 = lbz.e.k();
            String str8 = lfdVar.b;
            if (!k2.b.y()) {
                k2.t();
            }
            lbz lbzVar = (lbz) k2.b;
            str8.getClass();
            lbzVar.a |= 1;
            lbzVar.b = str8;
            gvt gvtVar = gvt.a;
            lfc b3 = lfc.b(lfdVar.d);
            if (b3 == null) {
                b3 = lfc.IMPORTANCE_UNSPECIFIED;
            }
            lby lbyVar = (lby) gvtVar.e(b3);
            if (!k2.b.y()) {
                k2.t();
            }
            lbz lbzVar2 = (lbz) k2.b;
            lbzVar2.d = lbyVar.h;
            lbzVar2.a |= 4;
            if (!lfdVar.c.isEmpty()) {
                String str9 = lfdVar.c;
                if (!k2.b.y()) {
                    k2.t();
                }
                lbz lbzVar3 = (lbz) k2.b;
                str9.getClass();
                lbzVar3.a |= 2;
                lbzVar3.c = str9;
            }
            if (!k.b.y()) {
                k.t();
            }
            lcx lcxVar13 = (lcx) k.b;
            lbz lbzVar4 = (lbz) k2.q();
            lbzVar4.getClass();
            lcxVar13.b();
            lcxVar13.k.add(lbzVar4);
        }
        for (lff lffVar : c.m) {
            ljh k3 = lbx.d.k();
            String str10 = lffVar.b;
            if (!k3.b.y()) {
                k3.t();
            }
            lbx lbxVar = (lbx) k3.b;
            str10.getClass();
            lbxVar.a |= 1;
            lbxVar.b = str10;
            gvs gvsVar = gvs.a;
            lfe b4 = lfe.b(lffVar.c);
            if (b4 == null) {
                b4 = lfe.CHANNEL_GROUP_UNKNOWN;
            }
            lbw lbwVar = (lbw) gvsVar.e(b4);
            if (!k3.b.y()) {
                k3.t();
            }
            lbx lbxVar2 = (lbx) k3.b;
            lbxVar2.c = lbwVar.d;
            lbxVar2.a |= 2;
            k.G((lbx) k3.q());
        }
        ljh k4 = lcy.f.k();
        String d = d();
        if (!k4.b.y()) {
            k4.t();
        }
        lcy lcyVar = (lcy) k4.b;
        d.getClass();
        lcyVar.a |= 1;
        lcyVar.d = d;
        String id = TimeZone.getDefault().getID();
        if (!k4.b.y()) {
            k4.t();
        }
        ljn ljnVar5 = k4.b;
        lcy lcyVar2 = (lcy) ljnVar5;
        id.getClass();
        lcyVar2.b = 4;
        lcyVar2.c = id;
        if (!ljnVar5.y()) {
            k4.t();
        }
        lcy lcyVar3 = (lcy) k4.b;
        lcx lcxVar14 = (lcx) k.q();
        lcxVar14.getClass();
        lcyVar3.e = lcxVar14;
        lcyVar3.a |= 2;
        return (lcy) k4.q();
    }
}
