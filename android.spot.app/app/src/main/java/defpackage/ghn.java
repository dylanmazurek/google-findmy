package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ghn implements ghg {
    public static final joo a = joo.m("GnpSdk");
    static final List b = Arrays.asList(lde.SHOWN, lde.SHOWN_REPLACED, lde.SHOWN_FORCED);
    public ghq C;
    public final int E;
    private final gpx K;
    public final ghf c;
    public final lde d;
    public final lcr e;
    public final gnv f;
    public final gri g;
    public final gur h;
    public final gjn i;
    public final gls j;
    public String k = null;
    public int F = 0;
    public final List l = new ArrayList();
    public int G = 0;
    public lct m = null;
    public gxz n = null;
    public int H = 0;
    public String o = null;
    public goa p = null;
    public String q = null;
    public String r = null;
    public String s = null;
    public lcj t = null;
    public glq u = null;
    public glr v = null;
    public final List w = new ArrayList();
    public ghh z = null;
    public int I = 0;
    public int J = 0;
    public String A = null;
    public boolean B = false;
    public boolean D = false;
    public Long x = Long.valueOf(TimeUnit.MILLISECONDS.toMicros(fma.i().toEpochMilli()));
    public final Long y = Long.valueOf(SystemClock.elapsedRealtime());

    public ghn(ghf ghfVar, lde ldeVar, lcr lcrVar, int i, gnv gnvVar, gri griVar, gur gurVar, gjn gjnVar, gls glsVar, gpx gpxVar) {
        this.c = ghfVar;
        this.d = ldeVar;
        this.e = lcrVar;
        this.E = i;
        this.f = gnvVar;
        this.g = griVar;
        this.h = gurVar;
        this.i = gjnVar;
        this.j = glsVar;
        this.K = gpxVar;
    }

    @Override // defpackage.ghg
    public final void a() {
        this.K.b(new Runnable() { // from class: ghl
            /* JADX WARN: Removed duplicated region for block: B:181:0x0639  */
            /* JADX WARN: Removed duplicated region for block: B:216:? A[RETURN, SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 1950
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ghl.run():void");
            }
        });
    }

    @Override // defpackage.ghg
    public final void b(String str) {
        glq glqVar;
        Iterator it = this.j.c().iterator();
        while (true) {
            if (it.hasNext()) {
                glqVar = (glq) it.next();
                if (glqVar.a.equals(str)) {
                    break;
                }
            } else {
                glqVar = null;
                break;
            }
        }
        this.u = glqVar;
    }

    @Override // defpackage.ghg
    public final void c(ggk ggkVar) {
        lhb lhbVar = ggkVar.n;
        if (lhbVar != null && lhbVar.a) {
            this.B = true;
        }
        List list = this.w;
        ljh k = lcb.g.k();
        String str = ggkVar.a;
        if (!k.b.y()) {
            k.t();
        }
        lcb lcbVar = (lcb) k.b;
        str.getClass();
        lcbVar.a = 1 | lcbVar.a;
        lcbVar.b = str;
        long longValue = ggkVar.b.longValue();
        if (!k.b.y()) {
            k.t();
        }
        lcb lcbVar2 = (lcb) k.b;
        lcbVar2.a |= 2;
        lcbVar2.c = longValue;
        long longValue2 = ggkVar.f.longValue();
        if (!k.b.y()) {
            k.t();
        }
        ljn ljnVar = k.b;
        lcb lcbVar3 = (lcb) ljnVar;
        lcbVar3.a |= 4;
        lcbVar3.d = longValue2;
        String str2 = ggkVar.j;
        if (!ljnVar.y()) {
            k.t();
        }
        lcb lcbVar4 = (lcb) k.b;
        str2.getClass();
        lcbVar4.a |= 8;
        lcbVar4.e = str2;
        lft lftVar = ggkVar.d.n;
        if (lftVar == null) {
            lftVar = lft.c;
        }
        String str3 = lftVar.b;
        if (!k.b.y()) {
            k.t();
        }
        lcb lcbVar5 = (lcb) k.b;
        str3.getClass();
        lcbVar5.a |= 16;
        lcbVar5.f = str3;
        list.add((lcb) k.q());
    }

    @Override // defpackage.ghg
    public final void d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c((ggk) it.next());
        }
    }

    @Override // defpackage.ghg
    public final void e(goa goaVar) {
        if (goaVar != null) {
            this.p = goaVar;
            gwf b2 = goaVar.b();
            if (b2 instanceof gwh) {
                this.q = goaVar.c;
                this.o = ((gwh) b2).a;
            } else if (b2 instanceof gwg) {
                this.o = goaVar.d;
                this.r = ((gwg) b2).a;
                this.s = goaVar.e;
            }
        }
    }

    @Override // defpackage.ghg
    public final void f(lgf lgfVar) {
        lga lgaVar;
        lga lgaVar2;
        if (lgfVar != null && !lgfVar.d.isEmpty()) {
            List list = this.w;
            ljh k = lcb.g.k();
            String str = lgfVar.d;
            if (!k.b.y()) {
                k.t();
            }
            ljn ljnVar = k.b;
            lcb lcbVar = (lcb) ljnVar;
            str.getClass();
            lcbVar.a |= 1;
            lcbVar.b = str;
            long j = lgfVar.j;
            if (!ljnVar.y()) {
                k.t();
            }
            ljn ljnVar2 = k.b;
            lcb lcbVar2 = (lcb) ljnVar2;
            lcbVar2.a |= 2;
            lcbVar2.c = j;
            long j2 = lgfVar.g;
            if (!ljnVar2.y()) {
                k.t();
            }
            lcb lcbVar3 = (lcb) k.b;
            lcbVar3.a |= 4;
            lcbVar3.d = j2;
            if (lgfVar.b == 12) {
                lgaVar = (lga) lgfVar.c;
            } else {
                lgaVar = lga.x;
            }
            String str2 = lgaVar.m;
            if (!k.b.y()) {
                k.t();
            }
            lcb lcbVar4 = (lcb) k.b;
            str2.getClass();
            lcbVar4.a |= 8;
            lcbVar4.e = str2;
            if (lgfVar.b == 12) {
                lgaVar2 = (lga) lgfVar.c;
            } else {
                lgaVar2 = lga.x;
            }
            lft lftVar = lgaVar2.n;
            if (lftVar == null) {
                lftVar = lft.c;
            }
            String str3 = lftVar.b;
            if (!k.b.y()) {
                k.t();
            }
            lcb lcbVar5 = (lcb) k.b;
            str3.getClass();
            lcbVar5.a |= 16;
            lcbVar5.f = str3;
            list.add((lcb) k.q());
            lhb lhbVar = lgfVar.r;
            if (lhbVar == null) {
                lhbVar = lhb.b;
            }
            if (lhbVar.a) {
                this.B = true;
            }
        }
    }

    @Override // defpackage.ghg
    public final void g(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f((lgf) it.next());
        }
    }

    @Override // defpackage.ghg
    public final void h(long j) {
        this.x = Long.valueOf(j);
    }

    @Override // defpackage.ghg
    public final void i(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            lfm lfmVar = (lfm) it.next();
            List list2 = this.w;
            ljh k = lcb.g.k();
            String str = lfmVar.b;
            if (!k.b.y()) {
                k.t();
            }
            ljn ljnVar = k.b;
            lcb lcbVar = (lcb) ljnVar;
            str.getClass();
            lcbVar.a |= 1;
            lcbVar.b = str;
            long j = lfmVar.c;
            if (!ljnVar.y()) {
                k.t();
            }
            ljn ljnVar2 = k.b;
            lcb lcbVar2 = (lcb) ljnVar2;
            lcbVar2.a |= 2;
            lcbVar2.c = j;
            long j2 = lfmVar.d;
            if (!ljnVar2.y()) {
                k.t();
            }
            lcb lcbVar3 = (lcb) k.b;
            lcbVar3.a |= 4;
            lcbVar3.d = j2;
            list2.add((lcb) k.q());
        }
    }
}
