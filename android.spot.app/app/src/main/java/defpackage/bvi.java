package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bvi {
    private int a;
    private int b;

    public final int a() {
        return this.a | this.b;
    }

    public final void b(int i, int i2) {
        if (i2 == 1) {
            this.b = i;
        } else {
            this.a = i;
        }
    }

    public final void c(int i) {
        if (i == 1) {
            this.b = 0;
        } else {
            this.a = 0;
        }
    }

    public final void d(int i) {
        b(i, 0);
    }

    public final void e() {
        c(0);
    }
}
