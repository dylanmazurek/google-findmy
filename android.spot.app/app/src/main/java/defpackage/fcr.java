package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fcr extends fcl {
    public final fcq a;
    public fdk b;
    private final fdd d;
    private final fdv e;

    /* JADX INFO: Access modifiers changed from: protected */
    public fcr(fcn fcnVar) {
        super(fcnVar);
        this.e = new fdv();
        this.a = new fcq(this);
        this.d = new fcp(this, fcnVar);
    }

    public final boolean K(fdj fdjVar) {
        String h;
        fma.aR(fdjVar);
        fbm.b();
        H();
        fdk fdkVar = this.b;
        if (fdkVar == null) {
            return false;
        }
        if (fdjVar.f) {
            k();
            h = fdc.f();
        } else {
            k();
            h = fdc.h();
        }
        List emptyList = Collections.emptyList();
        try {
            Map map = fdjVar.a;
            long j = fdjVar.d;
            Parcel a = fdkVar.a();
            a.writeMap(map);
            a.writeLong(j);
            a.writeString(h);
            a.writeTypedList(emptyList);
            fdkVar.c(1, a);
            d();
            return true;
        } catch (RemoteException unused) {
            y("Failed to send hits to AnalyticsService");
            return false;
        }
    }

    public final void b() {
        fbm.b();
        H();
        try {
            flr.a().b(f(), this.a);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        if (this.b != null) {
            this.b = null;
            c();
        }
    }

    public final void c() {
        fcj i = i();
        i.H();
        fbm.b();
        fcy fcyVar = i.a;
        fbm.b();
        fcyVar.H();
        fcyVar.y("Service disconnected");
    }

    public final void d() {
        this.e.b();
        k();
        this.d.d(((Long) fdh.z.x()).longValue());
    }

    public final boolean e() {
        fbm.b();
        H();
        if (this.b != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.fcl
    protected final void a() {
    }
}
