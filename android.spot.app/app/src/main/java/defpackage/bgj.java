package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgj {
    public final bfs a;
    public final bgm b;
    public final List c;
    public final int d;
    public final boolean e;
    public final int f;
    public final ble g;
    public final bln h;
    public final long i;
    public final dkr j;

    public bgj(bfs bfsVar, bgm bgmVar, List list, int i, boolean z, int i2, ble bleVar, bln blnVar, dkr dkrVar, long j) {
        this.a = bfsVar;
        this.b = bgmVar;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = bleVar;
        this.h = blnVar;
        this.j = dkrVar;
        this.i = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bgj)) {
            return false;
        }
        bgj bgjVar = (bgj) obj;
        if (amr.i(this.a, bgjVar.a) && amr.i(this.b, bgjVar.b) && amr.i(this.c, bgjVar.c) && this.d == bgjVar.d && this.e == bgjVar.e && a.m(this.f, bgjVar.f) && amr.i(this.g, bgjVar.g) && this.h == bgjVar.h && amr.i(this.j, bgjVar.j) && a.n(this.i, bgjVar.i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + 1) * 31) + this.d) * 31) + a.i(this.e)) * 31) + this.f) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.j.hashCode()) * 31) + a.l(this.i);
    }

    public final String toString() {
        return "TextLayoutInput(text=" + ((Object) this.a) + ", style=" + this.b + ", placeholders=" + this.c + ", maxLines=" + this.d + ", softWrap=" + this.e + ", overflow=" + ((Object) blc.a(this.f)) + ", density=" + this.g + ", layoutDirection=" + this.h + ", fontFamilyResolver=" + this.j + ", constraints=" + ((Object) bld.e(this.i)) + ')';
    }
}
