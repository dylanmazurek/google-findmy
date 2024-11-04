package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bm {
    int a;
    ag b;
    boolean c;
    int d;
    int e;
    int f;
    int g;
    cew h;
    cew i;

    public bm() {
    }

    public bm(int i, ag agVar) {
        this.a = i;
        this.b = agVar;
        this.c = false;
        cew cewVar = cew.RESUMED;
        this.h = cewVar;
        this.i = cewVar;
    }

    public bm(int i, ag agVar, byte[] bArr) {
        this.a = i;
        this.b = agVar;
        this.c = true;
        cew cewVar = cew.RESUMED;
        this.h = cewVar;
        this.i = cewVar;
    }

    public bm(ag agVar, cew cewVar) {
        this.a = 10;
        this.b = agVar;
        this.c = false;
        this.h = agVar.X;
        this.i = cewVar;
    }
}
