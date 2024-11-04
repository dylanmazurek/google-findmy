package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class grb {
    public final lde a;
    public final lcr b;
    public final gnv c;
    public final gri d;
    public final gur e;
    public final gvl f;
    public goa g;
    public String h;
    public String i;
    public String j;
    public lcj k;
    public final List l = new ArrayList();
    public long m = TimeUnit.MILLISECONDS.toMicros(fma.i().toEpochMilli());
    public String n;
    public String o;
    public String p;
    public final int q;
    public int r;

    public grb(lde ldeVar, lcr lcrVar, int i, gnv gnvVar, gri griVar, gur gurVar, gvl gvlVar) {
        this.a = ldeVar;
        this.b = lcrVar;
        this.q = i;
        this.c = gnvVar;
        this.d = griVar;
        this.e = gurVar;
        this.f = gvlVar;
    }

    public final /* bridge */ /* synthetic */ void a(lcj lcjVar) {
        lcjVar.getClass();
        this.k = lcjVar;
    }

    public final /* synthetic */ void b(goa goaVar) {
        if (goaVar != null) {
            this.g = goaVar;
            gwf b = goaVar.b();
            if (b instanceof gwh) {
                this.h = goaVar.c;
                this.p = ((gwh) b).a;
            } else if (b instanceof gwg) {
                this.p = goaVar.d;
                this.i = ((gwg) b).a;
                this.j = goaVar.e;
            }
        }
    }

    public final /* bridge */ /* synthetic */ void c(lgf lgfVar) {
        lga lgaVar;
        lga lgaVar2;
        lgfVar.getClass();
        String str = lgfVar.d;
        str.getClass();
        if (str.length() > 0) {
            List list = this.l;
            ljh k = lcb.g.k();
            k.getClass();
            String str2 = lgfVar.d;
            str2.getClass();
            if (!k.b.y()) {
                k.t();
            }
            ljn ljnVar = k.b;
            lcb lcbVar = (lcb) ljnVar;
            lcbVar.a |= 1;
            lcbVar.b = str2;
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
            String str3 = lgaVar.m;
            str3.getClass();
            if (!k.b.y()) {
                k.t();
            }
            lcb lcbVar4 = (lcb) k.b;
            lcbVar4.a |= 8;
            lcbVar4.e = str3;
            if (lgfVar.b == 12) {
                lgaVar2 = (lga) lgfVar.c;
            } else {
                lgaVar2 = lga.x;
            }
            lft lftVar = lgaVar2.n;
            if (lftVar == null) {
                lftVar = lft.c;
            }
            String str4 = lftVar.b;
            str4.getClass();
            if (!k.b.y()) {
                k.t();
            }
            lcb lcbVar5 = (lcb) k.b;
            lcbVar5.a |= 16;
            lcbVar5.f = str4;
            ljn q = k.q();
            q.getClass();
            list.add((lcb) q);
        }
    }
}
