package defpackage;

import android.accounts.Account;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class dvr implements bmh {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ dvr(dvt dvtVar, String str, Account account, int i) {
        this.d = i;
        this.a = dvtVar;
        this.b = str;
        this.c = account;
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.bmh
    public final Object a(final bmf bmfVar) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                jbh jbhVar = new jbh((kyf) this.b, bmfVar);
                int i2 = jbn.a;
                jbh jbhVar2 = new jbh(jbu.b(), jbhVar);
                Object obj = this.a;
                jxp jxpVar = ((jbw) obj).a;
                if (!jxpVar.e(jxn.OPEN, jxn.WILL_CREATE_VALUE_AND_CLOSER)) {
                    int ordinal = ((jxn) jxpVar.b.get()).ordinal();
                    if (ordinal != 1) {
                        if (ordinal != 2 && ordinal != 3 && ordinal != 4) {
                            if (ordinal != 5) {
                                throw new AssertionError(jxpVar.b);
                            }
                            throw new IllegalStateException("Cannot call finishToValueAndCloser() twice");
                        }
                        throw new IllegalStateException("Cannot call finishToValueAndCloser() after calling finishToFuture()");
                    }
                    throw new IllegalStateException("Cannot call finishToValueAndCloser() after deriving another step");
                }
                igh ighVar = (igh) this.c;
                jxpVar.d.c(new hka(jxpVar, jbhVar2, 19, (char[]) null), ighVar.b);
                bmfVar.a(new ide(obj, 7), ighVar.b);
                return "[SharedGattConnectionManagerInternal]";
            }
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            bmfVar.a(new col(atomicBoolean, 2, null), cps.a);
            this.a.execute(new ci((Object) atomicBoolean, (Object) bmfVar, this.b, 3, (byte[]) null));
            return this.c;
        }
        ljh k = lqn.c.k();
        ljh k2 = lqt.h.k();
        if (!k2.b.y()) {
            k2.t();
        }
        ljn ljnVar = k2.b;
        ((lqt) ljnVar).d = 2;
        String str = dvt.b;
        if (!ljnVar.y()) {
            k2.t();
        }
        lqt lqtVar = (lqt) k2.b;
        str.getClass();
        lqtVar.f = str;
        lqt lqtVar2 = (lqt) k2.q();
        if (!k.b.y()) {
            k.t();
        }
        Object obj2 = this.c;
        Object obj3 = this.b;
        Object obj4 = this.a;
        lqn lqnVar = (lqn) k.b;
        lqtVar2.getClass();
        lqnVar.b = lqtVar2;
        lqnVar.a |= 1;
        dvt dvtVar = (dvt) obj4;
        dvp dvpVar = new dvp((lqn) k.q(), (String) obj3, (lkx) lqo.b.z(7), dvtVar.h.h((Account) obj2), new dfv() { // from class: dvq
            @Override // defpackage.dfv
            public final void b(Object obj5) {
                bmf.this.c((lqo) obj5);
            }
        }, new exi(bmfVar, 1));
        dvpVar.l = new dfk(10000, 3);
        dvtVar.c.a(dvpVar);
        bmfVar.a(new col(dvpVar, 17, null), dvtVar.g);
        return "fdmClient.listDevices";
    }

    public /* synthetic */ dvr(igh ighVar, kyf kyfVar, jbw jbwVar, int i) {
        this.d = i;
        this.c = ighVar;
        this.b = kyfVar;
        this.a = jbwVar;
    }

    public /* synthetic */ dvr(Executor executor, mnw mnwVar, int i) {
        this.d = i;
        this.a = executor;
        this.c = "setForegroundAsync";
        this.b = mnwVar;
    }
}
