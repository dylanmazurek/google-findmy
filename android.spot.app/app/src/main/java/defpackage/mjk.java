package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mjk extends mji {
    @Override // defpackage.mji
    public final boolean a(mjl mjlVar) {
        synchronized (mjlVar) {
            if (mjlVar.a == 0) {
                mjlVar.a = -1;
                return true;
            }
            return false;
        }
    }

    @Override // defpackage.mji
    public final void b(mjl mjlVar) {
        synchronized (mjlVar) {
            mjlVar.a = 0;
        }
    }
}
