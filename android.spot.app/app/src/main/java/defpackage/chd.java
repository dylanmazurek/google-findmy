package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class chd extends cgk {
    public static final cgn a = new chc(0);
    public final tb b = new tb();
    public boolean c = false;

    public final void a() {
        this.c = false;
    }

    public final cha b() {
        return (cha) tc.a(this.b, 54321);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cgk
    public final void c() {
        int c = this.b.c();
        for (int i = 0; i < c; i++) {
            ((cha) this.b.e(i)).o();
        }
        tb tbVar = this.b;
        int i2 = tbVar.d;
        Object[] objArr = tbVar.c;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        tbVar.d = 0;
        tbVar.a = false;
    }
}
