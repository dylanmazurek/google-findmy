package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qw extends qi {
    public final WeakReference a;

    public qw(qy qyVar) {
        this.a = new WeakReference(qyVar);
    }

    @Override // defpackage.qi
    public final void a(int i, CharSequence charSequence) {
        if (this.a.get() != null && !((qy) this.a.get()).h && ((qy) this.a.get()).g) {
            ((qy) this.a.get()).e(new qj(i, charSequence));
        }
    }

    @Override // defpackage.qi
    public final void b() {
        if (this.a.get() != null && ((qy) this.a.get()).g) {
            ((qy) this.a.get()).f(true);
        }
    }

    @Override // defpackage.qi
    public final void g(kvw kvwVar) {
        if (this.a.get() != null && ((qy) this.a.get()).g) {
            int i = -1;
            if (kvwVar.a == -1) {
                Object obj = kvwVar.b;
                int a = ((qy) this.a.get()).a();
                if ((a & 32767) != 0 && !ja.b(a)) {
                    i = 2;
                }
                kvwVar = new kvw(obj, i);
            }
            ((qy) this.a.get()).p(kvwVar);
        }
    }
}
