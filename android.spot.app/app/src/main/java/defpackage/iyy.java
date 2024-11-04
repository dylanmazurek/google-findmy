package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class iyy extends iyv {
    final /* synthetic */ izc a;

    public iyy(izc izcVar) {
        this.a = izcVar;
    }

    @Override // defpackage.iyv
    public final void a() {
        synchronized (this.a.e) {
            if (this.a.j.get() > 0 && this.a.j.decrementAndGet() > 0) {
                return;
            }
            izc izcVar = this.a;
            if (izcVar.l != null) {
                izcVar.a.unbindService(izcVar.k);
                this.a.f = false;
                izc izcVar2 = this.a;
                izcVar2.l = null;
                izcVar2.k = null;
            }
            this.a.b();
        }
    }
}
