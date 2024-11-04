package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hrv extends hrr implements hpg {
    public final jzd a;
    public final hnb b;
    public final lqz c;
    public final hpd d;
    public final hry e;
    private final boolean f;
    private final hrq g;

    public hrv(hpe hpeVar, hrq hrqVar, jzd jzdVar, lqz lqzVar, hry hryVar, hnb hnbVar, mko mkoVar, Executor executor, jer jerVar) {
        new AtomicReference(hrm.a);
        new ConcurrentHashMap();
        this.g = hrqVar;
        this.b = hnbVar;
        this.d = hpeVar.a(executor, lqzVar, mkoVar);
        this.a = jzdVar;
        this.c = lqzVar;
        this.e = hryVar;
        this.f = ((Boolean) jerVar.e(Boolean.FALSE)).booleanValue();
    }

    @Override // defpackage.hpg
    public final void Y() {
        if (this.f) {
            a();
        }
    }

    @Override // defpackage.hrr
    public final void a() {
        hrp hrpVar = new hrp() { // from class: hrt
            @Override // defpackage.hrp
            public final void a(int i, String str) {
                hrv hrvVar = hrv.this;
                if (hrvVar.b.a) {
                    ivc.C();
                } else {
                    ivc.J(new hrs(hrvVar, i, str, 0), hrvVar.a);
                }
            }
        };
        hrq hrqVar = this.g;
        hrqVar.d = hrpVar;
        if (hrqVar.c.getAndSet(true)) {
            return;
        }
        ivc.J(new eli(hrqVar, 9), hrqVar.b);
    }
}
