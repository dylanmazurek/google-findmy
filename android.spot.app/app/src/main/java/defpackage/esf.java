package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class esf {
    public static final jnk a = jnk.l("com/google/android/apps/adm/integrations/spot/ringing/BleRingingHandlerImpl");
    public final ele b;
    public final lqz c;
    public final Object d = new Object();
    public jer e;
    public jer f;
    public final dxf g;
    public final ilv h;
    public final dhx i;
    private final elo j;

    public esf(ilv ilvVar, ele eleVar, ddg ddgVar, dxf dxfVar, dhx dhxVar, lqz lqzVar) {
        jdl jdlVar = jdl.a;
        this.e = jdlVar;
        this.f = jdlVar;
        this.h = ilvVar;
        elo eloVar = (elo) ((jiy) ddgVar.a).get(esm.class);
        eloVar.getClass();
        this.j = eloVar;
        this.b = eleVar;
        this.g = dxfVar;
        this.i = dhxVar;
        this.c = lqzVar;
        ilvVar.h(new ah(this, 13));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [android.content.ServiceConnection, java.lang.Object] */
    public final void a(buc bucVar) {
        synchronized (this.d) {
            if (this.e.g()) {
                Object c = this.e.c();
                synchronized (((esk) c).b) {
                    if (((esk) c).c.g()) {
                        bucVar.a(((esk) c).c.c());
                    } else {
                        ((esk) c).d = bucVar;
                    }
                }
            } else {
                jer i = jer.i(new esk(bucVar, this.j));
                this.e = i;
                ?? c2 = i.c();
                synchronized (((esk) c2).b) {
                    elo eloVar = ((esk) c2).f;
                    if (!((Context) eloVar.a).bindService(new Intent((Context) eloVar.a, (Class<?>) eloVar.b), (ServiceConnection) c2, 1)) {
                        ((jni) ((jni) esk.a.f()).j("com/google/android/apps/adm/integrations/spot/ringing/RingerServiceConnection", "bind", 55, "RingerServiceConnection.java")).r("Could not bind to RingerService");
                    } else {
                        ((esk) c2).e = true;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.content.ServiceConnection, java.lang.Object] */
    public final void b() {
        synchronized (this.d) {
            if (this.e.g()) {
                ?? c = this.e.c();
                synchronized (((esk) c).b) {
                    if (((esk) c).c.g()) {
                        ((Context) ((esk) c).f.a).unbindService(c);
                        ((esk) c).c = jdl.a;
                        ((esk) c).e = false;
                    }
                }
                jdl jdlVar = jdl.a;
                this.e = jdlVar;
                this.f = jdlVar;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, esl] */
    public final boolean c() {
        synchronized (this.d) {
            if (this.e.g()) {
                if (this.f.g()) {
                    this.f.c().d();
                    this.f = jdl.a;
                } else {
                    b();
                }
                return true;
            }
            return false;
        }
    }
}
