package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class krg implements krj {
    final bym a;

    public krg(bym bymVar) {
        this.a = bymVar;
    }

    @Override // defpackage.krj
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // defpackage.krj
    public final boolean b(kro kroVar) {
        if (!kroVar.e() && !kroVar.d() && !kroVar.b()) {
            return false;
        }
        this.a.u(kroVar.a);
        return true;
    }
}
