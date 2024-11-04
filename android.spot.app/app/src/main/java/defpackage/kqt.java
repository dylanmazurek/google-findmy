package defpackage;

import com.google.firebase.iid.FirebaseInstanceId;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kqt implements kqy {
    final FirebaseInstanceId a;

    public kqt(FirebaseInstanceId firebaseInstanceId) {
        this.a = firebaseInstanceId;
    }

    @Override // defpackage.kqy
    public final fxs a() {
        String g = this.a.g();
        if (g != null) {
            return fma.o(g);
        }
        FirebaseInstanceId firebaseInstanceId = this.a;
        FirebaseInstanceId.j(firebaseInstanceId.c);
        return firebaseInstanceId.a(amr.n(firebaseInstanceId.c), "*").a(fxu.a, new fqx(4));
    }

    @Override // defpackage.kqy
    public final void b() {
        this.a.g();
    }

    @Override // defpackage.kqy
    public final void c(njz njzVar) {
        this.a.f.add(njzVar);
    }
}
