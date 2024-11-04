package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gbl {
    public final ljh c;
    public final fzo d = gbo.d;
    public gbo a = null;
    public final ljj b = (ljj) gbs.h.k();

    public gbl(bym bymVar) {
        this.c = (ljh) bymVar.a;
        a(((juv) ((ljh) bymVar.a).b).c);
    }

    private final void c(int i) {
        ljj ljjVar = this.b;
        long j = ((gbs) ljjVar.b).g + i;
        if (!ljjVar.b.y()) {
            ljjVar.t();
        }
        gbs gbsVar = (gbs) ljjVar.b;
        gbsVar.a |= 16;
        gbsVar.g = j;
    }

    public final void a(int i) {
        ljj ljjVar = this.b;
        long j = ((gbs) ljjVar.b).f + i;
        if (!ljjVar.b.y()) {
            ljjVar.t();
        }
        gbs gbsVar = (gbs) ljjVar.b;
        gbsVar.a |= 8;
        gbsVar.f = j;
    }

    public final void b(gbn gbnVar) {
        boolean z;
        gbo gboVar = this.a;
        if (gboVar == null) {
            z = true;
        } else {
            z = false;
        }
        hwx.X(z, "CVE %s has already been built.", gboVar);
        this.b.ap(gbnVar.b, gbnVar.a);
        c(gbnVar.b.f());
        c(gbnVar.b.hashCode());
        c(gbnVar.a.hashCode());
    }
}
