package defpackage;

import android.accounts.Account;
import android.content.ContentResolver;
import java.util.UUID;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dvt {
    public static final jnk a = jnk.l("com/google/android/apps/adm/api/FmdClient");
    public static final String b = UUID.randomUUID().toString();
    public final dft c;
    public final evy d;
    public final dvn e;
    public final lqz f;
    public final Executor g;
    public final bso h;
    public final elo i;
    private final ewc j;

    public dvt(dft dftVar, bso bsoVar, elo eloVar, evy evyVar, ewc ewcVar, dvn dvnVar, lqz lqzVar, Executor executor) {
        dftVar.getClass();
        this.c = dftVar;
        this.h = bsoVar;
        eloVar.getClass();
        this.i = eloVar;
        evyVar.getClass();
        this.d = evyVar;
        ewcVar.getClass();
        this.j = ewcVar;
        dvnVar.getClass();
        this.e = dvnVar;
        this.f = lqzVar;
        this.g = executor;
    }

    public final jer a(String str) {
        return this.e.a(str).b(new dvh(2));
    }

    public final String b() {
        return UUID.randomUUID().toString();
    }

    public final void c(lqd lqdVar, lpo lpoVar) {
        e(lqdVar, lpoVar, b(), jdl.a);
    }

    public final void d(lqd lqdVar, lpo lpoVar, String str, long j) {
        jer jerVar;
        if (j > 0) {
            jerVar = jer.i(Long.valueOf(j));
        } else {
            jerVar = jdl.a;
        }
        e(lqdVar, lpoVar, str, jerVar);
    }

    public final void e(lqd lqdVar, lpo lpoVar, String str, jer jerVar) {
        f(lqdVar, lpoVar, str, jerVar, false);
    }

    public final void f(final lqd lqdVar, final lpo lpoVar, final String str, jer jerVar, boolean z) {
        Account b2 = this.d.b();
        b2.getClass();
        String d = this.j.d();
        jnk jnkVar = a;
        jni jniVar = (jni) ((jni) jnkVar.e()).j("com/google/android/apps/adm/api/FmdClient", "executeActionInternal", 192, "FmdClient.java");
        String name = lpk.a(lpoVar.a).name();
        lqf b3 = lqf.b(lqdVar.c);
        if (b3 == null) {
            b3 = lqf.UNRECOGNIZED;
        }
        jniVar.z("Executing action [requestTrackingId: %s]%s for device of type %s", str, name, b3);
        ljh k = lqj.e.k();
        if (!k.b.y()) {
            k.t();
        }
        ljn ljnVar = k.b;
        lqj lqjVar = (lqj) ljnVar;
        lqdVar.getClass();
        lqjVar.b = lqdVar;
        lqjVar.a |= 1;
        if (!ljnVar.y()) {
            k.t();
        }
        lqj lqjVar2 = (lqj) k.b;
        lpoVar.getClass();
        lqjVar2.c = lpoVar;
        lqjVar2.a |= 2;
        ljh k2 = lqt.h.k();
        if (!k2.b.y()) {
            k2.t();
        }
        ljn ljnVar2 = k2.b;
        ((lqt) ljnVar2).d = 2;
        String str2 = b;
        if (!ljnVar2.y()) {
            k2.t();
        }
        ljn ljnVar3 = k2.b;
        str2.getClass();
        ((lqt) ljnVar3).f = str2;
        if (!ljnVar3.y()) {
            k2.t();
        }
        ljn ljnVar4 = k2.b;
        str.getClass();
        ((lqt) ljnVar4).e = str;
        if (!ljnVar4.y()) {
            k2.t();
        }
        lqt lqtVar = (lqt) k2.b;
        lqtVar.a |= 1;
        lqtVar.g = true;
        ljh k3 = lqm.b.k();
        if (!k3.b.y()) {
            k3.t();
        }
        ((lqm) k3.b).a = d;
        lqm lqmVar = (lqm) k3.q();
        if (!k2.b.y()) {
            k2.t();
        }
        lqt lqtVar2 = (lqt) k2.b;
        lqmVar.getClass();
        lqtVar2.c = lqmVar;
        lqtVar2.b = 4;
        lqt lqtVar3 = (lqt) k2.q();
        if (!k.b.y()) {
            k.t();
        }
        lqj lqjVar3 = (lqj) k.b;
        lqtVar3.getClass();
        lqjVar3.d = lqtVar3;
        lqjVar3.a = 4 | lqjVar3.a;
        lqj lqjVar4 = (lqj) k.q();
        String str3 = null;
        if (z) {
            elo eloVar = this.i;
            String b4 = fyo.b((ContentResolver) eloVar.a, "fmd:execute_privileged_action_url", "/nova/nbe_execute_privileged_action");
            if (b4 != null) {
                str3 = String.valueOf(eloVar.i()).concat(b4);
            }
        } else {
            elo eloVar2 = this.i;
            String b5 = fyo.b((ContentResolver) eloVar2.a, "fmd:execute_action_url", "/nova/nbe_execute_action");
            if (b5 != null) {
                str3 = String.valueOf(eloVar2.i()).concat(b5);
            }
        }
        String str4 = str3;
        if (str4 == null) {
            dfy dfyVar = new dfy(new IllegalStateException("execute action URL is null"));
            ((jni) ((jni) ((jni) jnkVar.f()).i(dfyVar)).j("com/google/android/apps/adm/api/FmdClient", "executeActionInternal", 216, "FmdClient.java")).u("Execute action URL is null [requestTrackingId: %s]", str);
            ((eao) this.f.a()).a(str, dfyVar);
            return;
        }
        if (jerVar.g()) {
            this.e.b(lqjVar4, jer.i(new bxi(this, lpoVar, str, lqdVar, 4)), ((Long) jerVar.c()).longValue());
        } else {
            this.e.b(lqjVar4, jdl.a, 0L);
        }
        dvp dvpVar = new dvp(lqjVar4, str4, (lkx) lqk.a.z(7), this.h.h(b2), new exf(1), new dfu() { // from class: dvs
            @Override // defpackage.dfu
            public final void a(dfy dfyVar2) {
                jni jniVar2 = (jni) ((jni) ((jni) dvt.a.f()).i(dfyVar2)).j("com/google/android/apps/adm/api/FmdClient", "lambda$executeActionInternal$3", 254, "FmdClient.java");
                String name2 = lpk.a(lpoVar.a).name();
                lqf b6 = lqf.b(lqdVar.c);
                if (b6 == null) {
                    b6 = lqf.UNRECOGNIZED;
                }
                String str5 = str;
                dvt dvtVar = dvt.this;
                jniVar2.z("Error executing action %s [requestTrackingId: %s] for device of type %d", name2, str5, Integer.valueOf(b6.a()));
                ((eao) dvtVar.f.a()).a(str5, dfyVar2);
                dvtVar.e.d(str5);
            }
        });
        dvpVar.l = new dfk(10000, 0);
        this.c.a(dvpVar);
    }
}
