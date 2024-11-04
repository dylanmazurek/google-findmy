package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class iht implements jxc {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ iht(ihu ihuVar, kzt kztVar, ihw ihwVar, int i) {
        this.d = i;
        this.a = ihuVar;
        this.b = kztVar;
        this.c = ihwVar;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [jxd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13, types: [jxd, java.lang.Object] */
    @Override // defpackage.jxc
    public final jyz a() {
        fxs n;
        iki ikiVar;
        jyz m;
        jyz h;
        jyz D;
        int i = this.d;
        if (i != 0) {
            int i2 = 1;
            if (i != 1) {
                if (i != 2) {
                    Object obj = this.a;
                    ilz ilzVar = (ilz) obj;
                    Uri uri = (Uri) ivc.M(ilzVar.b);
                    ikiVar = new iki((Closeable) ilzVar.l.n(uri, new iks(false, false)));
                    ?? r1 = this.b;
                    ?? r4 = this.c;
                    try {
                        try {
                            h = ivc.E(((ilz) obj).c(uri));
                        } catch (IOException e) {
                            if (!((ilz) obj).d.g()) {
                                D = ivc.D(e);
                            } else {
                                if (ilz.d(e)) {
                                    m = ivc.D(e);
                                } else {
                                    m = ((jck) ((ilz) obj).d.c()).m(e, ((ilz) obj).e);
                                }
                                h = jwu.h(m, jbn.c(new ibz(obj, uri, 13, null)), ((ilz) obj).c);
                            }
                        }
                        jyz jyzVar = h;
                        jyz h2 = jwu.h(jyzVar, r4, r1);
                        D = ilz.b(jwu.h(h2, jbn.c(new gfl(obj, jyzVar, h2, 14, (byte[]) null)), jxv.a), ikiVar.a(), ((ilz) obj).c);
                        ikiVar.close();
                        return D;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Object obj2 = this.a;
                ilp ilpVar = (ilp) obj2;
                Uri uri2 = (Uri) ivc.M(ilpVar.b);
                ikiVar = new iki((Closeable) ilpVar.g.n(uri2, new iks(false, false)));
                ?? r0 = this.b;
                ?? r5 = this.c;
                try {
                    jyz c = ((ilp) obj2).c(uri2, new ilm((ilp) obj2, i2));
                    jyz h3 = jwu.h(c, r5, r0);
                    jyz b = ilp.b(jwu.h(h3, jbn.c(new gfl(obj2, c, h3, 13, (byte[]) null)), jxv.a), ikiVar.a());
                    ikiVar.close();
                    return b;
                } finally {
                    try {
                        ikiVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            jer jerVar = ((iiy) ivc.M(this.c)).b;
            if (!jerVar.g()) {
                ((jni) ((jni) iey.a.f()).j("com/google/android/libraries/spot/ble/MulticomponentEddystoneBleTrackerProcess", "lambda$start$0", 129, "MulticomponentEddystoneBleTrackerProcess.java")).r("Tracking failed: missing account key");
                return jyv.a;
            }
            ?? r12 = this.b;
            return ((iey) this.a).c((hot) ivc.M(r12), (lim) jerVar.c(), true);
        }
        Object obj3 = this.b;
        lim limVar = ((kzt) obj3).a;
        kxx kxxVar = kxx.f;
        liq k = limVar.k();
        ljn l = kxxVar.l();
        ihu ihuVar = (ihu) this.a;
        lja ljaVar = ihuVar.b;
        try {
            llg b2 = lkz.a.b(l);
            b2.l(l, lir.p(k), ljaVar);
            b2.g(l);
            k.z(0);
            ljn.A(l);
            kxx kxxVar2 = (kxx) l;
            final eno enoVar = ihuVar.d;
            String str = kxxVar2.e;
            try {
                n = fma.o(fej.m((Context) enoVar.k.a));
            } catch (RemoteException | fhb | fhc e2) {
                n = fma.n(e2);
            }
            return iuu.p(iuu.o(iuu.p(fzo.b(n), new ejc(enoVar, str, 8), enoVar.g), new jei() { // from class: enn
                @Override // defpackage.jei
                public final Object a(Object obj4) {
                    Account account = (Account) obj4;
                    account.getClass();
                    eno enoVar2 = eno.this;
                    enh enhVar = enoVar2.j;
                    enhVar.a = account;
                    evy evyVar = enoVar2.c;
                    evyVar.getClass();
                    enhVar.c = evyVar;
                    enhVar.b = enoVar2.b;
                    ewg ewgVar = enoVar2.d;
                    ewgVar.getClass();
                    enhVar.d = ewgVar;
                    ele eleVar = enoVar2.e;
                    eleVar.getClass();
                    enhVar.e = eleVar;
                    jzd jzdVar = enoVar2.f;
                    jzdVar.getClass();
                    enhVar.f = jzdVar;
                    jzd jzdVar2 = enoVar2.g;
                    jzdVar2.getClass();
                    enhVar.g = jzdVar2;
                    jzd jzdVar3 = enoVar2.h;
                    jzdVar3.getClass();
                    enhVar.h = jzdVar3;
                    Executor executor = enoVar2.i;
                    executor.getClass();
                    enhVar.i = executor;
                    iqg.z(enhVar.a, Account.class);
                    iqg.z(enhVar.b, Context.class);
                    iqg.z(enhVar.c, evy.class);
                    iqg.z(enhVar.d, ewg.class);
                    iqg.z(enhVar.e, ele.class);
                    iqg.z(enhVar.f, jzd.class);
                    iqg.z(enhVar.g, jzd.class);
                    iqg.z(enhVar.h, jzd.class);
                    iqg.z(enhVar.i, Executor.class);
                    Account account2 = enhVar.a;
                    Context context = enhVar.b;
                    evy evyVar2 = enhVar.c;
                    ewg ewgVar2 = enhVar.d;
                    ele eleVar2 = enhVar.e;
                    jzd jzdVar4 = enhVar.f;
                    jzd jzdVar5 = enhVar.g;
                    jzd jzdVar6 = enhVar.h;
                    Executor executor2 = enhVar.i;
                    lsh b3 = lsi.b(context);
                    iae iaeVar = new iae(b3);
                    lsm b4 = lsq.b(fzf.a);
                    lsh lshVar = lsp.a;
                    List C = iqg.C(0);
                    List C2 = iqg.C(1);
                    mjo.N(kuc.a, C2);
                    lsp lspVar = new lsp(C, C2);
                    lsm lsmVar = eni.a;
                    lsm lsmVar2 = eni.a;
                    lsh lshVar2 = lsp.a;
                    ian ianVar = new ian(lsg.d(new hor(lsg.d(new dxg(b3, lspVar, lshVar2, lsmVar, lsmVar2, lsmVar2, lshVar2, lshVar2, 17, (boolean[][][]) null)), lsp.a, 14, null)));
                    lsh b5 = lsi.b(account2);
                    emb embVar = new emb(b5, 0);
                    emf emfVar = new emf(b4, embVar, lsg.d(new fev(b3, 0)));
                    lsh b6 = lsi.b(jzdVar4);
                    lsh b7 = lsi.b(jzdVar5);
                    iam iamVar = new iam(lsg.d(new hor(new iak(b3, b4, ianVar, emfVar, b6, b7, lsi.b(jzdVar6)), lsp.a, 13, null)), embVar);
                    lsm d = lsg.d(new dys((mko) iaeVar, (mko) b4, (mko) iamVar, 19, (char[][][]) null));
                    lsm d2 = lsg.d(new emb(iamVar, 4));
                    lsh b8 = lsi.b(evyVar2);
                    lsm d3 = lsg.d(new dwd(b3, 5));
                    lsm d4 = lsg.d(new dwd(b3, 7));
                    lsm lsmVar3 = eni.a;
                    lsh b9 = lsi.b(eleVar2);
                    fnx fnxVar = new fnx(b3);
                    lsm d5 = lsg.d(new dxg(b3, d3, d4, embVar, lsg.d(new dxi(lsmVar3, b9, lsg.d(new dys((mko) fnxVar, (mko) lsg.d(fke.a), (mko) b6, 15, (short[][][]) null)), eni.a, 0)), lsg.d(new dwd(b3, 6)), new dxh(lsg.d(new fev(lsg.d(new dwd(b3, 8)), 2)), b7), b7, 0));
                    lsh b10 = lsi.b(ewgVar2);
                    emb embVar2 = new emb(b5, 3);
                    lsm d6 = lsg.d(jal.a);
                    iag iagVar = new iag(iamVar, b7);
                    iix iixVar = new iix(fnxVar, embVar2);
                    iiz iizVar = new iiz(iixVar, b7);
                    ihs ihsVar = new ihs(new ihl(embVar2, d6, iagVar, fnxVar, iixVar, iixVar, iizVar, b7));
                    lsh b11 = lsi.b(executor2);
                    efv efvVar = new efv((mko) b5, (mko) b8, (mko) d5, (mko) b10, (mko) ihsVar, (mko) b7, (mko) b11, 2, (char[]) null);
                    dxi dxiVar = new dxi((mko) b5, (mko) b8, (mko) b10, (mko) b11, 12, (int[]) null);
                    iiw iiwVar = new iiw(b3);
                    return new ktn(jiy.l(kxw.FINALIZE_SHARING_APPLICATION_DATA, efvVar, kxw.TRIGGER_DEVICE_LIST_REFRESH_DATA, dxiVar, kxw.AGGREGATION_ATTEMPT_DATA, new dys(b6, new iim(new ijc(iiwVar), iizVar, iiwVar, b7), lsg.d(new fev(b3, 1)), 18)), new iap((enr) d.a(), jzdVar5), new kuv((mko) d2, (mko) b7), jzdVar5);
                }
            }, enoVar.g), new gfl(kxxVar2, obj3, this.c, 11), ihuVar.c);
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof ljy) {
                throw ((ljy) e3.getCause());
            }
            throw e3;
        } catch (ljy e4) {
            if (e4.a) {
                throw new ljy(e4);
            }
            throw e4;
        } catch (IOException e5) {
            if (e5.getCause() instanceof ljy) {
                throw ((ljy) e5.getCause());
            }
            throw new ljy(e5);
        } catch (llo e6) {
            throw e6.a();
        }
    }

    public /* synthetic */ iht(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }
}
