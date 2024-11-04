package defpackage;

import android.accounts.Account;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class enk implements ihm {
    public final Account a;
    public final evy b;
    public final ewg c;
    public final ihr d;
    public final dxf e;
    private final Executor f;
    private final Executor g;

    public enk(Account account, evy evyVar, dxf dxfVar, ewg ewgVar, ihr ihrVar, Executor executor, Executor executor2) {
        this.a = account;
        this.b = evyVar;
        this.e = dxfVar;
        this.c = ewgVar;
        this.d = ihrVar;
        this.f = executor;
        this.g = executor2;
    }

    @Override // defpackage.ihm
    public final jyz a(kxx kxxVar, ihn ihnVar, ihw ihwVar) {
        kyr kyrVar;
        ljh k = lqd.d.k();
        ljh k2 = lqu.c.k();
        if (kxxVar.a == 10) {
            kyrVar = (kyr) kxxVar.b;
        } else {
            kyrVar = kyr.b;
        }
        kxv kxvVar = kyrVar.a;
        if (kxvVar == null) {
            kxvVar = kxv.b;
        }
        if (!k2.b.y()) {
            k2.t();
        }
        lqu lquVar = (lqu) k2.b;
        kxvVar.getClass();
        lquVar.b = kxvVar;
        lquVar.a |= 1;
        if (!k.b.y()) {
            k.t();
        }
        lqd lqdVar = (lqd) k.b;
        lqu lquVar2 = (lqu) k2.q();
        lquVar2.getClass();
        lqdVar.b = lquVar2;
        lqdVar.a = 3;
        lqf lqfVar = lqf.SPOT_DEVICE;
        if (!k.b.y()) {
            k.t();
        }
        ((lqd) k.b).c = lqfVar.a();
        lqd lqdVar2 = (lqd) k.q();
        this.e.c(lnb.SHARING_FINALIZATION_START, jdl.a, lqdVar2);
        ewg ewgVar = this.c;
        ewgVar.getClass();
        jbx b = iuu.s(new dzw(ewgVar, 11), this.g).f(new hxk(this, kxxVar, ihnVar, ihwVar, 1), this.f).e(new emc(this, lqdVar2, 2, null), this.g).b(Throwable.class, new ejc(this, lqdVar2, 7), this.g);
        ewg ewgVar2 = this.c;
        ewgVar2.getClass();
        b.c(new dzw(ewgVar2, 12), this.g);
        return b;
    }
}
