package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adv implements aaw {
    private final aaw a;
    private final int b;
    private int c;

    public adv(aaw aawVar, int i) {
        this.a = aawVar;
        this.b = i;
    }

    @Override // defpackage.aaw
    public final Object a() {
        return this.a.a();
    }

    @Override // defpackage.aaw
    public final void b() {
        throw null;
    }

    @Override // defpackage.aaw
    public final void c(Object obj) {
        this.c++;
        this.a.c(obj);
    }

    @Override // defpackage.aaw
    public final void f() {
        if (this.c <= 0) {
            abr.i("OffsetApplier up called with no corresponding down");
        }
        this.c--;
        this.a.f();
    }

    @Override // defpackage.aaw
    public final void g(int i, Object obj) {
        int i2;
        if (this.c == 0) {
            i2 = this.b;
        } else {
            i2 = 0;
        }
        this.a.g(i + i2, obj);
    }

    @Override // defpackage.aaw
    public final void h(int i, Object obj) {
        int i2;
        if (this.c == 0) {
            i2 = this.b;
        } else {
            i2 = 0;
        }
        this.a.h(i + i2, obj);
    }

    @Override // defpackage.aaw
    public final void i(int i, int i2, int i3) {
        int i4;
        if (this.c == 0) {
            i4 = this.b;
        } else {
            i4 = 0;
        }
        this.a.i(i + i4, i2 + i4, i3);
    }

    @Override // defpackage.aaw
    public final void j(int i, int i2) {
        int i3;
        if (this.c == 0) {
            i3 = this.b;
        } else {
            i3 = 0;
        }
        this.a.j(i + i3, i2);
    }

    @Override // defpackage.aaw
    public final /* synthetic */ void e() {
    }
}
