package defpackage;

import com.google.android.apps.adm.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ehh implements jyj {
    final /* synthetic */ jer a;
    final /* synthetic */ ehk b;
    final /* synthetic */ int c;

    public ehh(ehk ehkVar, jer jerVar, int i) {
        this.a = jerVar;
        this.c = i;
        this.b = ehkVar;
    }

    @Override // defpackage.jyj
    public final void a(Throwable th) {
        this.b.i.m(R.string.lock_result_fail);
        this.b.f.l(new ehj(jdl.a, false, false));
        ((jni) ((jni) ((jni) ehk.a.f()).i(th)).j("com/google/android/apps/adm/integrations/android/securedevice/SecureDeviceViewModel$2", "onFailure", (char) 213, "SecureDeviceViewModel.java")).r("Secure device failed");
    }

    @Override // defpackage.jyj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        lpo lpoVar;
        boolean z;
        boolean z2;
        ehk ehkVar = this.b;
        lqd lqdVar = ehkVar.b;
        jer b = ehkVar.c.b(new dvh(19));
        jer b2 = this.b.c.b(new dvh(20));
        if (((Boolean) b2.b(new dvh(17)).e(false)).booleanValue() && ((Boolean) b.b(new dvh(18)).e(true)).booleanValue()) {
            b = jer.i(" ");
        }
        jer jerVar = this.a;
        if (jerVar.g()) {
            ljh k = lpe.d.k();
            Object c = jerVar.c();
            if (!k.b.y()) {
                k.t();
            }
            ((lpe) k.b).a = (String) c;
            if (b.g()) {
                String str = (String) b.c();
                if (!k.b.y()) {
                    k.t();
                }
                ((lpe) k.b).b = str;
            }
            if (b2.g()) {
                String str2 = (String) b2.c();
                if (!k.b.y()) {
                    k.t();
                }
                ((lpe) k.b).c = str2;
            }
            ljh k2 = lpo.c.k();
            if (!k2.b.y()) {
                k2.t();
            }
            lpo lpoVar2 = (lpo) k2.b;
            lpe lpeVar = (lpe) k.q();
            lpeVar.getClass();
            lpoVar2.b = lpeVar;
            lpoVar2.a = 3;
            lpoVar = (lpo) k2.q();
        } else {
            ljh k3 = loz.c.k();
            if (b.g()) {
                String str3 = (String) b.c();
                if (!k3.b.y()) {
                    k3.t();
                }
                ((loz) k3.b).a = str3;
            }
            if (b2.g()) {
                String str4 = (String) b2.c();
                if (!k3.b.y()) {
                    k3.t();
                }
                ((loz) k3.b).b = str4;
            }
            ljh k4 = lpo.c.k();
            if (!k4.b.y()) {
                k4.t();
            }
            lpo lpoVar3 = (lpo) k4.b;
            loz lozVar = (loz) k3.q();
            lozVar.getClass();
            lpoVar3.b = lozVar;
            lpoVar3.a = 2;
            lpoVar = (lpo) k4.q();
        }
        apc apcVar = ehkVar.h;
        Object obj2 = apcVar.b;
        lnb lnbVar = lnb.LOCK_REQUESTED;
        ljh k5 = lmu.i.k();
        ljh k6 = lmx.f.k();
        boolean g = jerVar.g();
        if (!k6.b.y()) {
            k6.t();
        }
        lmx lmxVar = (lmx) k6.b;
        lmxVar.a |= 1;
        lmxVar.b = g;
        if (b.g() && !((String) b.c()).trim().isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!k6.b.y()) {
            k6.t();
        }
        lmx lmxVar2 = (lmx) k6.b;
        lmxVar2.a = 2 | lmxVar2.a;
        lmxVar2.c = z;
        if (b2.g() && !((String) b2.c()).isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!k6.b.y()) {
            k6.t();
        }
        ljn ljnVar = k6.b;
        lmx lmxVar3 = (lmx) ljnVar;
        lmxVar3.a |= 4;
        lmxVar3.d = z2;
        if (!ljnVar.y()) {
            k6.t();
        }
        int i = this.c;
        lmx lmxVar4 = (lmx) k6.b;
        lmxVar4.e = i - 1;
        lmxVar4.a |= 8;
        if (!k5.b.y()) {
            k5.t();
        }
        lmu lmuVar = (lmu) k5.b;
        lmx lmxVar5 = (lmx) k6.q();
        lmxVar5.getClass();
        lmuVar.b = lmxVar5;
        lmuVar.a |= 1;
        ((dxf) obj2).c(lnbVar, jer.i((lmu) k5.q()), lqdVar);
        ((ees) apcVar.a).b(lqdVar, lpoVar);
        this.b.f.l(new ehj(jdl.a, true, false));
        this.b.i.m(R.string.lock_result_success);
    }
}
