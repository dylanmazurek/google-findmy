package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gjs implements gjk {
    public static final /* synthetic */ int a = 0;
    private static final joo b = joo.m("GnpSdk");
    private final gjq c;
    private final gjy d;
    private final ghf e;
    private final mko f;
    private final gok g;
    private final gok h;
    private final hri i;
    private final apc j;
    private final apc k;
    private final apc l;
    private final apc m;

    public gjs(gjq gjqVar, hri hriVar, apc apcVar, gok gokVar, apc apcVar2, apc apcVar3, apc apcVar4, gok gokVar2, gjy gjyVar, ghf ghfVar, mko mkoVar) {
        this.c = gjqVar;
        this.i = hriVar;
        this.m = apcVar;
        this.h = gokVar;
        this.l = apcVar2;
        this.k = apcVar3;
        this.j = apcVar4;
        this.g = gokVar2;
        this.d = gjyVar;
        this.e = ghfVar;
        this.f = mkoVar;
    }

    private final void j(goa goaVar, gyl gylVar, lcr lcrVar) {
        if (gylVar.a()) {
            ghg a2 = this.e.a(lcrVar);
            a2.e(goaVar);
            Throwable th = gylVar.c;
            if (th != null) {
                ((ghn) a2).A = th.getClass().getSimpleName();
            }
            a2.a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0123, code lost:            if (r9.equals("com.google.android.libraries.notifications.NOTIFICATION_CLICKED") == false) goto L52;     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a0  */
    @Override // defpackage.gjk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.gjj a(defpackage.goa r18, java.util.List r19, defpackage.lgq r20) {
        /*
            Method dump skipped, instructions count: 669
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gjs.a(goa, java.util.List, lgq):gjj");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, gjn] */
    /* JADX WARN: Type inference failed for: r2v0, types: [gur, java.lang.Object] */
    @Override // defpackage.gjk
    public final gjj b(goa goaVar, List list, lgq lgqVar) {
        Object n;
        try {
            apc apcVar = this.m;
            lfj b2 = apcVar.a.b(goaVar);
            ljh k = led.f.k();
            String str = ((gnv) apcVar.b).a;
            if (!k.b.y()) {
                k.t();
            }
            ljn ljnVar = k.b;
            led ledVar = (led) ljnVar;
            str.getClass();
            ledVar.a |= 1;
            ledVar.b = str;
            if (!ljnVar.y()) {
                k.t();
            }
            led ledVar2 = (led) k.b;
            ljv ljvVar = ledVar2.c;
            if (!ljvVar.c()) {
                ledVar2.c = ljn.p(ljvVar);
            }
            lhv.g(list, ledVar2.c);
            ljh k2 = ldp.d.k();
            if (!k2.b.y()) {
                k2.t();
            }
            ldp ldpVar = (ldp) k2.b;
            b2.getClass();
            ldpVar.b = b2;
            ldpVar.a |= 1;
            lfh b3 = apcVar.c.b(goaVar.b);
            if (!k2.b.y()) {
                k2.t();
            }
            ldp ldpVar2 = (ldp) k2.b;
            b3.getClass();
            ldpVar2.c = b3;
            ldpVar2.a |= 2;
            ldp ldpVar3 = (ldp) k2.q();
            if (!k.b.y()) {
                k.t();
            }
            led ledVar3 = (led) k.b;
            ldpVar3.getClass();
            ljv ljvVar2 = ledVar3.d;
            if (!ljvVar2.c()) {
                ledVar3.d = ljn.p(ljvVar2);
            }
            ledVar3.d.add(ldpVar3);
            if (!k.b.y()) {
                k.t();
            }
            led ledVar4 = (led) k.b;
            lgqVar.getClass();
            ledVar4.e = lgqVar;
            ledVar4.a |= 2;
            led ledVar5 = (led) k.q();
            hri hriVar = this.i;
            ledVar5.getClass();
            n = mpp.n(mnc.a, new gyk(hriVar, goaVar, ledVar5, (mmx) null, 2));
            gyl gylVar = (gyl) n;
            j(goaVar, gylVar, lcr.FAILED_TO_SUBSCRIBE_TO_TOPICS);
            return gjj.a(ledVar5, gylVar);
        } catch (gsl e) {
            gji c = gjj.c();
            c.e = e;
            c.b(true);
            return c.a();
        }
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [gur, java.lang.Object] */
    @Override // defpackage.gjk
    public final gjj c(goa goaVar, List list, lgq lgqVar) {
        Object n;
        try {
            gok gokVar = this.h;
            ljh k = lef.f.k();
            String str = ((gnv) gokVar.a).a;
            if (!k.b.y()) {
                k.t();
            }
            ljn ljnVar = k.b;
            lef lefVar = (lef) ljnVar;
            str.getClass();
            lefVar.a |= 1;
            lefVar.b = str;
            if (!ljnVar.y()) {
                k.t();
            }
            lef lefVar2 = (lef) k.b;
            ljv ljvVar = lefVar2.c;
            if (!ljvVar.c()) {
                lefVar2.c = ljn.p(ljvVar);
            }
            lhv.g(list, lefVar2.c);
            lfj b2 = gokVar.b.b(goaVar);
            if (!k.b.y()) {
                k.t();
            }
            lef lefVar3 = (lef) k.b;
            b2.getClass();
            ljv ljvVar2 = lefVar3.d;
            if (!ljvVar2.c()) {
                lefVar3.d = ljn.p(ljvVar2);
            }
            lefVar3.d.add(b2);
            if (!k.b.y()) {
                k.t();
            }
            lef lefVar4 = (lef) k.b;
            lgqVar.getClass();
            lefVar4.e = lgqVar;
            lefVar4.a |= 2;
            lef lefVar5 = (lef) k.q();
            hri hriVar = this.i;
            lefVar5.getClass();
            n = mpp.n(mnc.a, new gyk(hriVar, goaVar, lefVar5, (mmx) null, 3));
            gyl gylVar = (gyl) n;
            j(goaVar, gylVar, lcr.FAILED_TO_UNSUBSCRIBE_FROM_TOPICS);
            return gjj.a(lefVar5, gylVar);
        } catch (gsl e) {
            gji c = gjj.c();
            c.e = e;
            c.b(true);
            return c.a();
        }
    }

    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, gjn] */
    /* JADX WARN: Type inference failed for: r4v3, types: [gur, java.lang.Object] */
    @Override // defpackage.gjk
    public final gjj d(goa goaVar, Long l, lgd lgdVar, lgq lgqVar) {
        if (new ljt(ltb.a.a().a().a, gxe.b).contains(lgdVar)) {
            gji c = gjj.c();
            c.e = new gjr(lgdVar);
            c.b(false);
            return c.a();
        }
        try {
            apc apcVar = this.l;
            String str = goaVar.b;
            ljh k = leh.l.k();
            String str2 = ((gnv) apcVar.c).a;
            if (!k.b.y()) {
                k.t();
            }
            leh lehVar = (leh) k.b;
            str2.getClass();
            lehVar.a |= 1;
            lehVar.b = str2;
            lfk c2 = apcVar.a.c(goaVar);
            if (!k.b.y()) {
                k.t();
            }
            ljn ljnVar = k.b;
            leh lehVar2 = (leh) ljnVar;
            c2.getClass();
            lehVar2.c = c2;
            lehVar2.a |= 2;
            if (!ljnVar.y()) {
                k.t();
            }
            leh lehVar3 = (leh) k.b;
            lehVar3.f = lgdVar.p;
            lehVar3.a |= 32;
            lfh b2 = apcVar.b.b(str);
            if (!k.b.y()) {
                k.t();
            }
            ljn ljnVar2 = k.b;
            leh lehVar4 = (leh) ljnVar2;
            b2.getClass();
            lehVar4.e = b2;
            lehVar4.a |= 16;
            if (!ljnVar2.y()) {
                k.t();
            }
            leh lehVar5 = (leh) k.b;
            lgqVar.getClass();
            lehVar5.g = lgqVar;
            lehVar5.a |= 64;
            if (l.longValue() > 0) {
                long longValue = l.longValue();
                if (!k.b.y()) {
                    k.t();
                }
                leh lehVar6 = (leh) k.b;
                lehVar6.a |= 4;
                lehVar6.d = longValue;
            }
            leh lehVar7 = (leh) k.q();
            gyl q = this.i.q(goaVar, lehVar7);
            j(goaVar, q, lcr.FAILED_TO_FETCH_LATEST_NOTIFICATIONS);
            return gjj.a(lehVar7, q);
        } catch (gsl e) {
            gji c3 = gjj.c();
            c3.e = e;
            c3.b(true);
            return c3.a();
        }
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, gjn] */
    /* JADX WARN: Type inference failed for: r5v4, types: [gur, java.lang.Object] */
    @Override // defpackage.gjk
    public final gjj e(goa goaVar, long j, List list, lgd lgdVar, lgq lgqVar) {
        Object n;
        jis a2;
        lek lekVar;
        if (new ljt(ltb.a.a().b().a, gxe.b).contains(lgdVar)) {
            gji c = gjj.c();
            c.e = new gjr(lgdVar);
            c.b(false);
            return c.a();
        }
        try {
            apc apcVar = this.k;
            ljh k = lej.j.k();
            String str = ((gnv) apcVar.c).a;
            if (!k.b.y()) {
                k.t();
            }
            lej lejVar = (lej) k.b;
            str.getClass();
            lejVar.a |= 1;
            lejVar.b = str;
            lfk c2 = apcVar.a.c(goaVar);
            if (!k.b.y()) {
                k.t();
            }
            lej lejVar2 = (lej) k.b;
            c2.getClass();
            lejVar2.c = c2;
            lejVar2.a |= 2;
            lfh b2 = apcVar.b.b(goaVar.b);
            if (!k.b.y()) {
                k.t();
            }
            ljn ljnVar = k.b;
            lej lejVar3 = (lej) ljnVar;
            b2.getClass();
            lejVar3.f = b2;
            lejVar3.a |= 32;
            if (!ljnVar.y()) {
                k.t();
            }
            ljn ljnVar2 = k.b;
            lej lejVar4 = (lej) ljnVar2;
            lejVar4.g = lgdVar.p;
            lejVar4.a |= 64;
            if (!ljnVar2.y()) {
                k.t();
            }
            ljn ljnVar3 = k.b;
            lej lejVar5 = (lej) ljnVar3;
            lejVar5.e = 1;
            lejVar5.a |= 16;
            if (!ljnVar3.y()) {
                k.t();
            }
            ljn ljnVar4 = k.b;
            lej lejVar6 = (lej) ljnVar4;
            lejVar6.a |= 4;
            lejVar6.d = j;
            if (!ljnVar4.y()) {
                k.t();
            }
            lej lejVar7 = (lej) k.b;
            ljv ljvVar = lejVar7.h;
            if (!ljvVar.c()) {
                lejVar7.h = ljn.p(ljvVar);
            }
            lhv.g(list, lejVar7.h);
            if (!k.b.y()) {
                k.t();
            }
            lej lejVar8 = (lej) k.b;
            lgqVar.getClass();
            lejVar8.i = lgqVar;
            lejVar8.a |= 128;
            lej lejVar9 = (lej) k.q();
            if (lur.c()) {
                ljh k2 = leh.l.k();
                String str2 = lejVar9.b;
                if (!k2.b.y()) {
                    k2.t();
                }
                leh lehVar = (leh) k2.b;
                str2.getClass();
                lehVar.a |= 1;
                lehVar.b = str2;
                lfk lfkVar = lejVar9.c;
                if (lfkVar == null) {
                    lfkVar = lfk.f;
                }
                if (!k2.b.y()) {
                    k2.t();
                }
                leh lehVar2 = (leh) k2.b;
                lfkVar.getClass();
                lehVar2.c = lfkVar;
                lehVar2.a |= 2;
                lfh lfhVar = lejVar9.f;
                if (lfhVar == null) {
                    lfhVar = lfh.g;
                }
                if (!k2.b.y()) {
                    k2.t();
                }
                ljn ljnVar5 = k2.b;
                leh lehVar3 = (leh) ljnVar5;
                lfhVar.getClass();
                lehVar3.e = lfhVar;
                lehVar3.a |= 16;
                lgd b3 = lgd.b(lejVar9.g);
                if (b3 == null) {
                    b3 = lgd.FETCH_REASON_UNSPECIFIED;
                }
                if (!ljnVar5.y()) {
                    k2.t();
                }
                ljn ljnVar6 = k2.b;
                leh lehVar4 = (leh) ljnVar6;
                lehVar4.f = b3.p;
                lehVar4.a |= 32;
                ljv ljvVar2 = lejVar9.h;
                if (!ljnVar6.y()) {
                    k2.t();
                }
                leh lehVar5 = (leh) k2.b;
                ljv ljvVar3 = lehVar5.j;
                if (!ljvVar3.c()) {
                    lehVar5.j = ljn.p(ljvVar3);
                }
                lhv.g(ljvVar2, lehVar5.j);
                lgq lgqVar2 = lejVar9.i;
                if (lgqVar2 == null) {
                    lgqVar2 = lgq.c;
                }
                if (!k2.b.y()) {
                    k2.t();
                }
                ljn ljnVar7 = k2.b;
                leh lehVar6 = (leh) ljnVar7;
                lgqVar2.getClass();
                lehVar6.g = lgqVar2;
                lehVar6.a |= 64;
                long j2 = lejVar9.d;
                if (!ljnVar7.y()) {
                    k2.t();
                }
                ljn ljnVar8 = k2.b;
                leh lehVar7 = (leh) ljnVar8;
                lehVar7.a |= 4;
                lehVar7.d = j2;
                if (!ljnVar8.y()) {
                    k2.t();
                }
                ljn ljnVar9 = k2.b;
                leh lehVar8 = (leh) ljnVar9;
                lehVar8.i = 2;
                lehVar8.a |= 128;
                if (!ljnVar9.y()) {
                    k2.t();
                }
                leh lehVar9 = (leh) k2.b;
                ljr ljrVar = lehVar9.h;
                if (!ljrVar.c()) {
                    lehVar9.h = ljn.n(ljrVar);
                }
                lehVar9.h.g(1);
                ljh k3 = lgy.b.k();
                k3.I(3);
                k3.I(2);
                if (!k2.b.y()) {
                    k2.t();
                }
                leh lehVar10 = (leh) k2.b;
                lgy lgyVar = (lgy) k3.q();
                lgyVar.getClass();
                lehVar10.k = lgyVar;
                lehVar10.a |= 512;
                gyl q = this.i.q(goaVar, (leh) k2.q());
                gyj b4 = gyl.b();
                if (q.a()) {
                    b4.c = q.c;
                    b4.a = q.a;
                    b4.c(q.d);
                    b4.b(q.e);
                } else {
                    lei leiVar = (lei) q.b;
                    if (leiVar == null) {
                        lekVar = null;
                    } else {
                        ljh k4 = lek.d.k();
                        long j3 = leiVar.c;
                        if (!k4.b.y()) {
                            k4.t();
                        }
                        lek lekVar2 = (lek) k4.b;
                        lekVar2.a |= 1;
                        lekVar2.c = j3;
                        if (!((jer) ((lsi) this.f).b).g()) {
                            ((jol) ((jol) b.g()).j("com/google/android/libraries/notifications/internal/rpc/impl/ChimeRpcHelperImpl", "getFrontendNotificationThreadList", 274, "ChimeRpcHelperImpl.java")).r("FetchEncryptionHandler is not present");
                            a2 = jis.o(leiVar.a);
                        } else {
                            a2 = grl.a((grk) ((jer) ((lsi) this.f).b).c(), leiVar.a);
                        }
                        ArrayList arrayList = new ArrayList(a2);
                        Collections.sort(arrayList, new bfr(8));
                        if (!k4.b.y()) {
                            k4.t();
                        }
                        lek lekVar3 = (lek) k4.b;
                        ljv ljvVar4 = lekVar3.b;
                        if (!ljvVar4.c()) {
                            lekVar3.b = ljn.p(ljvVar4);
                        }
                        lhv.g(arrayList, lekVar3.b);
                        lekVar = (lek) k4.q();
                    }
                    b4.b = lekVar;
                    b4.a = q.a;
                }
                gyl a3 = b4.a();
                j(goaVar, a3, lcr.FAILED_TO_FETCH_UPDATED_NOTIFICATIONS);
                return gjj.a(lejVar9, a3);
            }
            hri hriVar = this.i;
            lejVar9.getClass();
            n = mpp.n(mnc.a, new gyk(hriVar, goaVar, lejVar9, (mmx) null, 5));
            gyl gylVar = (gyl) n;
            j(goaVar, gylVar, lcr.FAILED_TO_FETCH_UPDATED_NOTIFICATIONS);
            return gjj.a(lejVar9, gylVar);
        } catch (gsl e) {
            gji c3 = gjj.c();
            c3.e = e;
            c3.b(true);
            return c3.a();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, gsk] */
    /* JADX WARN: Type inference failed for: r3v3, types: [gur, java.lang.Object] */
    @Override // defpackage.gjk
    public final gjj f(goa goaVar, lgq lgqVar) {
        Object n;
        try {
            apc apcVar = this.j;
            ljh k = lep.g.k();
            String str = ((gnv) apcVar.a).a;
            if (!k.b.y()) {
                k.t();
            }
            lep lepVar = (lep) k.b;
            str.getClass();
            lepVar.a |= 1;
            lepVar.b = str;
            lfj b2 = apcVar.b.b(goaVar);
            if (!k.b.y()) {
                k.t();
            }
            lep lepVar2 = (lep) k.b;
            b2.getClass();
            lepVar2.c = b2;
            lepVar2.a |= 2;
            ljh k2 = lez.c.k();
            ljh k3 = ley.d.k();
            long parseLong = Long.parseLong(((gnv) apcVar.a).b);
            if (!k3.b.y()) {
                k3.t();
            }
            ley leyVar = (ley) k3.b;
            leyVar.a |= 1;
            leyVar.b = parseLong;
            String c = apcVar.c.c();
            if (!k3.b.y()) {
                k3.t();
            }
            ley leyVar2 = (ley) k3.b;
            leyVar2.a |= 2;
            leyVar2.c = c;
            if (!k2.b.y()) {
                k2.t();
            }
            lez lezVar = (lez) k2.b;
            ley leyVar3 = (ley) k3.q();
            leyVar3.getClass();
            lezVar.b = leyVar3;
            lezVar.a |= 1;
            if (!k.b.y()) {
                k.t();
            }
            lep lepVar3 = (lep) k.b;
            lez lezVar2 = (lez) k2.q();
            lezVar2.getClass();
            lepVar3.d = lezVar2;
            lepVar3.a |= 4;
            if (!k.b.y()) {
                k.t();
            }
            ljn ljnVar = k.b;
            lep lepVar4 = (lep) ljnVar;
            lgqVar.getClass();
            lepVar4.e = lgqVar;
            lepVar4.a |= 8;
            String str2 = goaVar.n;
            if (str2 != null) {
                if (!ljnVar.y()) {
                    k.t();
                }
                lep lepVar5 = (lep) k.b;
                lepVar5.a |= 16;
                lepVar5.f = str2;
            }
            lep lepVar6 = (lep) k.q();
            hri hriVar = this.i;
            lepVar6.getClass();
            n = mpp.n(mnc.a, new gyk(hriVar, goaVar, lepVar6, (mmx) null, 6));
            gyl gylVar = (gyl) n;
            j(goaVar, gylVar, lcr.FAILED_TO_UNREGISTER);
            return gjj.a(lepVar6, gylVar);
        } catch (gsl e) {
            gji c2 = gjj.c();
            c2.e = e;
            c2.b(true);
            return c2.a();
        }
    }

    /* JADX WARN: Type inference failed for: r11v6, types: [gur, java.lang.Object] */
    @Override // defpackage.gjk
    public final gjj g(goa goaVar, gge ggeVar, boolean z, lgq lgqVar) {
        Object n;
        int i;
        try {
            gok gokVar = this.g;
            ljh k = ler.f.k();
            String str = ((gnv) gokVar.a).a;
            if (!k.b.y()) {
                k.t();
            }
            ljn ljnVar = k.b;
            ler lerVar = (ler) ljnVar;
            str.getClass();
            lerVar.a |= 1;
            lerVar.b = str;
            if (!ljnVar.y()) {
                k.t();
            }
            ler lerVar2 = (ler) k.b;
            lgqVar.getClass();
            lerVar2.e = lgqVar;
            lerVar2.a |= 8;
            for (ggc ggcVar : ggeVar.a) {
                ljh k2 = lex.d.k();
                ggd ggdVar = ggcVar.a;
                ljh k3 = ldv.d.k();
                String str2 = ggdVar.a;
                if (!k3.b.y()) {
                    k3.t();
                }
                ldv ldvVar = (ldv) k3.b;
                str2.getClass();
                ldvVar.a |= 1;
                ldvVar.b = str2;
                if (!TextUtils.isEmpty(ggdVar.b)) {
                    String str3 = ggdVar.b;
                    if (!k3.b.y()) {
                        k3.t();
                    }
                    ldv ldvVar2 = (ldv) k3.b;
                    str3.getClass();
                    ldvVar2.a |= 2;
                    ldvVar2.c = str3;
                }
                ldv ldvVar3 = (ldv) k3.q();
                if (!k2.b.y()) {
                    k2.t();
                }
                ljn ljnVar2 = k2.b;
                lex lexVar = (lex) ljnVar2;
                ldvVar3.getClass();
                lexVar.b = ldvVar3;
                lexVar.a |= 1;
                int i2 = ggcVar.b;
                int i3 = i2 - 1;
                if (i2 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            i = 1;
                        } else {
                            i = 2;
                        }
                    } else {
                        i = 3;
                    }
                    if (!ljnVar2.y()) {
                        k2.t();
                    }
                    lex lexVar2 = (lex) k2.b;
                    lexVar2.c = i - 1;
                    lexVar2.a |= 2;
                    lex lexVar3 = (lex) k2.q();
                    if (!k.b.y()) {
                        k.t();
                    }
                    ler lerVar3 = (ler) k.b;
                    lexVar3.getClass();
                    ljv ljvVar = lerVar3.c;
                    if (!ljvVar.c()) {
                        lerVar3.c = ljn.p(ljvVar);
                    }
                    lerVar3.c.add(lexVar3);
                } else {
                    throw null;
                }
            }
            if (z) {
                lfj b2 = gokVar.b.b(goaVar);
                if (!k.b.y()) {
                    k.t();
                }
                ler lerVar4 = (ler) k.b;
                b2.getClass();
                lerVar4.d = b2;
                lerVar4.a |= 4;
            }
            ler lerVar5 = (ler) k.q();
            hri hriVar = this.i;
            lerVar5.getClass();
            n = mpp.n(mnc.a, new gyk(hriVar, goaVar, lerVar5, (mmx) null, 7));
            gyl gylVar = (gyl) n;
            j(goaVar, gylVar, lcr.FAILED_TO_UPDATE_PREFS);
            return gjj.a(lerVar5, gylVar);
        } catch (gsl e) {
            gji c = gjj.c();
            c.e = e;
            c.b(true);
            return c.a();
        }
    }

    @Override // defpackage.gjk
    public final gjj h(goa goaVar, lgp lgpVar, lgq lgqVar) {
        Object n;
        if (new ljt(lsy.a.a().a().a, gxf.b).contains(lgpVar)) {
            gji c = gjj.c();
            c.e = new gjr(lgpVar);
            c.b(false);
            return c.a();
        }
        try {
            let a2 = this.d.a(goaVar, lgpVar, lgqVar);
            hri hriVar = this.i;
            a2.getClass();
            n = mpp.n(mnc.a, new gyk(hriVar, goaVar, a2, (mmx) null, 8));
            gyl gylVar = (gyl) n;
            j(goaVar, gylVar, lcr.FAILED_TO_REGISTER);
            return gjj.a(a2, gylVar);
        } catch (gsl e) {
            gji c2 = gjj.c();
            c2.e = e;
            c2.b(true);
            return c2.a();
        }
    }

    @Override // defpackage.gjk
    public final void i(String str, lgz lgzVar) {
        Object n;
        ljh k = lev.d.k();
        if (!k.b.y()) {
            k.t();
        }
        ljn ljnVar = k.b;
        lev levVar = (lev) ljnVar;
        str.getClass();
        levVar.a |= 1;
        levVar.b = str;
        if (!ljnVar.y()) {
            k.t();
        }
        lev levVar2 = (lev) k.b;
        lgzVar.getClass();
        levVar2.c = lgzVar;
        levVar2.a |= 2;
        lev levVar3 = (lev) k.q();
        hri hriVar = this.i;
        levVar3.getClass();
        n = mpp.n(mnc.a, new gys(hriVar, levVar3, (mmx) null, 1));
        gyl gylVar = (gyl) n;
        j(null, gylVar, lcr.FAILED_TO_UPDATE_THREAD_STATE_BY_TOKEN);
        gjj.a(levVar3, gylVar);
    }
}
