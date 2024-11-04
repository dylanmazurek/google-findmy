package defpackage;

import android.content.res.Configuration;
import android.os.SystemClock;
import com.google.android.gms.findmydevice.spot.GetFindMyDeviceSettingsResponse;
import j$.util.Objects;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ah implements buc {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ah(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [jzb, java.lang.Object] */
    @Override // defpackage.buc
    public final void a(Object obj) {
        boolean z = true;
        switch (this.b) {
            case 0:
                ((aj) this.a).e.C();
                return;
            case 1:
                ((aj) this.a).e.C();
                return;
            case 2:
                Configuration configuration = (Configuration) obj;
                be beVar = (be) this.a;
                if (beVar.aa()) {
                    beVar.q(configuration, false);
                    return;
                }
                return;
            case 3:
                Integer num = (Integer) obj;
                be beVar2 = (be) this.a;
                if (beVar2.aa() && num.intValue() == 80) {
                    beVar2.t(false);
                    return;
                }
                return;
            case 4:
                hwh hwhVar = (hwh) obj;
                be beVar3 = (be) this.a;
                if (beVar3.aa()) {
                    beVar3.u(hwhVar.a, false);
                    return;
                }
                return;
            case 5:
                hwh hwhVar2 = (hwh) obj;
                be beVar4 = (be) this.a;
                if (beVar4.aa()) {
                    beVar4.z(hwhVar2.a, false);
                    return;
                }
                return;
            case 6:
                elc elcVar = (elc) obj;
                if (((efa) ((eey) this.a).b).i.c() != elcVar.g) {
                    z = false;
                }
                hwx.J(z);
                elcVar.g = null;
                return;
            case 7:
                ((egh) this.a).f();
                return;
            case 8:
                ejg ejgVar = (ejg) this.a;
                if (ejgVar.j.g()) {
                    ejgVar.j.c().cancel(false);
                    ejgVar.j = jdl.a;
                }
                ejgVar.k = 0;
                ejgVar.f();
                return;
            case 9:
                if (((Boolean) obj).booleanValue()) {
                    Object obj2 = this.a;
                    ejo ejoVar = (ejo) obj2;
                    ejn a = ejoVar.a();
                    if (a == ejn.UNKNOWN) {
                        iuu.q(ejoVar.c(), new dup(obj2, 6), (Executor) ejoVar.f.a());
                        return;
                    } else {
                        if (!a.equals(ejoVar.h.d())) {
                            ejoVar.h.i(a);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 10:
                ((elo) this.a).f();
                return;
            case 11:
                ((Boolean) obj).booleanValue();
                Object obj3 = this.a;
                emk emkVar = (emk) obj3;
                synchronized (emkVar.b) {
                    if (((emk) obj3).c.g() && ((emk) obj3).f.o(((emi) ((emk) obj3).c.c()).a) && ((emk) obj3).f.e().g()) {
                        lqd lqdVar = ((lqc) ((emk) obj3).f.e().c()).d;
                        if (lqdVar == null) {
                            lqdVar = lqd.d;
                        }
                        ((emk) obj3).a(lqdVar);
                        return;
                    }
                    emkVar.e();
                    return;
                }
            case 12:
                iff iffVar = (iff) obj;
                Object obj4 = this.a;
                synchronized (((epl) obj4).b) {
                    epo epoVar = ((epl) obj4).c;
                    if (epoVar == null) {
                        return;
                    }
                    if (iffVar.a.g()) {
                        epoVar.b(Math.pow(10.0d, (((epl) obj4).a - ((Integer) iffVar.a.c()).intValue()) / 20.0d), SystemClock.elapsedRealtime());
                    }
                    if (!((epl) obj4).d.equals(iffVar.b) || !((epl) obj4).e.equals(iffVar.c)) {
                        ((epl) obj4).d = iffVar.b;
                        ((epl) obj4).e = iffVar.c;
                        ((epl) obj4).b();
                    }
                    return;
                }
            case 13:
                ((esf) this.a).c();
                return;
            case 14:
                etq etqVar = (etq) this.a;
                if (Objects.equals(etqVar.d.b(), ((GetFindMyDeviceSettingsResponse) obj).i)) {
                    if (etqVar.o()) {
                        etqVar.k();
                        return;
                    } else {
                        etqVar.f.i(etp.a(etn.TURN_ON_LOCATION));
                        return;
                    }
                }
                etqVar.f.i(etp.b(etn.TERMINATED, etk.SUCCESS));
                return;
            case 15:
                ((etq) this.a).l(true);
                return;
            case 16:
                jer i = jer.i((Integer) obj);
                hai haiVar = (hai) this.a;
                haiVar.f = i;
                haiVar.b(haiVar.e);
                return;
            case 17:
                ((hec) this.a).i = (String) obj;
                return;
            case 18:
                ((iay) obj).f((fze) this.a);
                return;
            case 19:
                Object obj5 = this.a;
                ((emk) ((kgf) obj5).a).g(new cui(obj5, (Map) obj, 15, (byte[]) null));
                return;
            default:
                ((njz) obj).m((ihy) this.a);
                return;
        }
    }
}
