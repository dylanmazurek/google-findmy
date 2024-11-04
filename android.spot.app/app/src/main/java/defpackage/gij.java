package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gij implements gyp {
    static final long a = TimeUnit.HOURS.toMillis(24);
    private final goj b;
    private final ghf c;
    private final Set d;
    private final gok e;
    private final ddg f;

    public gij(goj gojVar, ddg ddgVar, gok gokVar, ghf ghfVar, Set set) {
        this.b = gojVar;
        this.f = ddgVar;
        this.e = gokVar;
        this.c = ghfVar;
        this.d = set;
    }

    private final void g(goa goaVar) {
        gwf b;
        if (goaVar == null) {
            b = null;
        } else {
            b = goaVar.b();
        }
        long b2 = lsv.a.a().b();
        if (b2 > 0) {
            ddg ddgVar = this.f;
            kuv kuvVar = new kuv((char[]) null, (byte[]) null);
            kuvVar.y("thread_stored_timestamp");
            kuvVar.z("<= ?", Long.valueOf(fma.i().toEpochMilli() - b2));
            ((gla) ddgVar.a).e(goaVar, jis.q(kuvVar.x()));
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((gxb) it.next()).b();
            }
        }
        long a2 = lsv.a.a().a();
        if (a2 > 0) {
            ddg ddgVar2 = this.f;
            kuv kuvVar2 = new kuv((char[]) null, (byte[]) null);
            kuvVar2.y("_id");
            kuvVar2.y(" NOT IN (SELECT ");
            kuvVar2.y("_id");
            kuvVar2.y(" FROM ");
            kuvVar2.y("threads");
            kuvVar2.y(" ORDER BY ");
            kuvVar2.y("last_notification_version");
            kuvVar2.y(" DESC");
            kuvVar2.z(" LIMIT ?)", Long.valueOf(a2));
            ((gla) ddgVar2.a).e(goaVar, jis.q(kuvVar2.x()));
        }
        ((gkt) this.e.d(b)).b(lwe.a.a().a());
    }

    private final void h(goa goaVar) {
        ghg b = this.c.b(lde.PERIODIC_LOG);
        if (goaVar != null) {
            b.e(goaVar);
        }
        b.a();
    }

    @Override // defpackage.gyp
    public final long a() {
        return a;
    }

    @Override // defpackage.gyp
    public final gfx b(Bundle bundle) {
        List<goa> b = this.b.b();
        if (!b.isEmpty()) {
            for (goa goaVar : b) {
                h(goaVar);
                g(goaVar);
            }
        } else {
            h(null);
        }
        g(null);
        return gfx.a;
    }

    @Override // defpackage.gyp
    public final String c() {
        return "PERIODIC_TASK";
    }

    @Override // defpackage.gyp
    public final boolean d() {
        return true;
    }

    @Override // defpackage.gyp
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.gyp
    public final /* synthetic */ void f() {
    }
}
