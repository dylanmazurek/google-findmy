package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bid implements bio {
    public final bjp a;
    public final String b;
    public final bjn c;
    public final biz d;
    public final int e;
    private final boolean f;

    public bid(String str, bjn bjnVar, biz bizVar) {
        bjp bjpVar = bjp.a;
        new biy(new bix[0]);
        this.a = bjpVar;
        this.b = str;
        this.c = bjnVar;
        this.d = bizVar;
        this.e = 0;
        this.f = true;
    }

    @Override // defpackage.bio
    public final biz a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bid)) {
            return false;
        }
        bid bidVar = (bid) obj;
        if (!amr.i(this.b, bidVar.b) || !amr.i(this.c, bidVar.c) || !amr.i(this.d, bidVar.d)) {
            return false;
        }
        int i = bidVar.e;
        if (!a.m(0, 0)) {
            return false;
        }
        boolean z = bidVar.f;
        return true;
    }

    public final int hashCode() {
        return (((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.g) * 961) + 1231;
    }

    public final String toString() {
        return "Font(GoogleFont(\"" + this.b + "\", bestEffort=true), weight=" + this.d + ", style=" + ((Object) biv.a()) + ')';
    }

    @Override // defpackage.bio
    public final void b() {
    }

    @Override // defpackage.bio
    public final void c() {
    }
}
