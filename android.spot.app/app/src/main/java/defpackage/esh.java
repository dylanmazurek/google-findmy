package defpackage;

import com.google.android.apps.adm.integrations.spot.ringing.RingerService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class esh implements esl, ifi {
    final String a;
    public final String b;
    final kyh c;
    public ifk d;
    public ifj e;
    public long f;
    public jer g;
    public final /* synthetic */ RingerService h;

    public esh(RingerService ringerService, String str, String str2, kyh kyhVar) {
        this.h = ringerService;
        this.a = str;
        this.b = str2;
        this.c = kyhVar;
    }

    @Override // defpackage.ifi
    public final void a(ifj ifjVar, long j, jer jerVar) {
        throw null;
    }

    public final ifj b() {
        ifj ifjVar;
        synchronized (this.h.a) {
            ifjVar = this.e;
        }
        return ifjVar;
    }

    public final void c(jer jerVar) {
        synchronized (this.h.a) {
            this.g = jerVar;
        }
    }

    @Override // defpackage.esl
    public final void d() {
        boolean z;
        synchronized (this.h.a) {
            if (this.d != null) {
                z = true;
            } else {
                z = false;
            }
            hwx.U(z);
            if (this.e != ifj.STOPPED && e()) {
                ((ifo) this.d).e(false);
            }
        }
    }

    public final boolean e() {
        if (this.h.e.g() && this.h.e.c() == this) {
            return true;
        }
        return false;
    }

    public final boolean f(String str, kyh kyhVar) {
        if (this.a.equals(str) && this.c == kyhVar) {
            return true;
        }
        return false;
    }
}
