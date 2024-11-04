package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hyb {
    public int a;
    public int b;
    public double c;
    public double d;
    public double e;
    public double f;
    public long g;
    public byte h;

    public final void a(int i) {
        this.b = i;
        this.h = (byte) (this.h | 2);
    }

    public final void b(double d) {
        this.f = d;
        this.h = (byte) (this.h | 32);
    }

    public final void c(double d) {
        this.e = d;
        this.h = (byte) (this.h | 16);
    }

    public final void d(double d) {
        this.d = d;
        this.h = (byte) (this.h | 8);
    }

    public final void e(double d) {
        this.c = d;
        this.h = (byte) (this.h | 4);
    }

    public final void f(long j) {
        this.g = j;
        this.h = (byte) (this.h | 64);
    }
}
