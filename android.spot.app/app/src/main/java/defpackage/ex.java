package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ex implements ff {
    final ff a;
    int b = 0;
    int c = -1;
    int d = -1;

    public ex(ff ffVar) {
        this.a = ffVar;
    }

    @Override // defpackage.ff
    public final void a(int i, int i2) {
        throw null;
    }

    @Override // defpackage.ff
    public final void b(int i, int i2) {
        throw null;
    }

    public final void c() {
        int i = this.b;
        if (i == 0) {
            return;
        }
        if (i != 1) {
            if (i != 2) {
                ff ffVar = this.a;
                ((ew) ffVar).a.o(this.c, this.d);
            } else {
                this.a.b(this.c, this.d);
            }
        } else {
            this.a.a(this.c, this.d);
        }
        this.b = 0;
    }

    public final void d(int i, int i2) {
        c();
        ((ew) this.a).a.b.b(i, i2);
    }

    public final void e(int i) {
        int i2;
        int i3;
        int i4;
        if (this.b == 3 && i <= (i3 = this.d + (i2 = this.c)) && (i4 = i + 1) >= i2) {
            this.c = Math.min(i, i2);
            this.d = Math.max(i3, i4) - this.c;
        } else {
            c();
            this.c = i;
            this.d = 1;
            this.b = 3;
        }
    }
}
