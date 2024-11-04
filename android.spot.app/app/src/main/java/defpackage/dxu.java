package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dxu implements dxv {
    public boolean a;

    public final void a() {
        if (this.a) {
        } else {
            throw new IllegalStateException("controller not initialized: ".concat(toString()));
        }
    }

    @Override // defpackage.dxv
    public void b() {
        if (!this.a) {
            this.a = true;
            return;
        }
        throw new IllegalStateException("controller already initialized: ".concat(toString()));
    }

    @Override // defpackage.dxv
    public void c() {
        a();
        this.a = false;
    }
}
